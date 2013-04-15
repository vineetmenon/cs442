package com.business.report;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.xml.rpc.holders.ByteArrayHolder;
import javax.xml.rpc.holders.StringHolder;
import javax.xml.soap.SOAPException;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.configuration.XMLStringProvider;
import org.apache.axis.message.SOAPHeaderElement;
import com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.*;
import com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.holders.*;
import org.apache.commons.httpclient.auth.AuthPolicy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ResourceBundle;

public class GenerateReport {

	public static String USERNAME;
	public static String PASSWORD;
	public static String DOMAIN;
	public static String DEPLOYMENT_FOLDER;
	public static String REPORT_SERVER_URL;
	public static String REPORT_SERVER_PORT;
	public static String REPORT_SERVER_NAME;
	public static String REPORT_SERVER_OUTPUT_FORMAT;

	public static void setReportServerVariables() {
		// for properties file inside the jar structure
		/*
		 * ResourceBundle bundle =
		 * ResourceBundle.getBundle("SchoolRankingSystem"); USERNAME =
		 * mainProperties.getProperty("username"); DOMAIN =
		 * mainProperties.getProperty("domain"); PASSWORD =
		 * mainProperties.getProperty("password"); DEPLOYMENT_FOLDER =
		 * mainProperties.getProperty("report_deployment_folder");
		 * REPORT_SERVER_URL= mainProperties.getProperty("report_server_url");
		 * REPORT_SERVER_PORT= mainProperties.getProperty("report_server_port");
		 * REPORT_SERVER_NAME= mainProperties.getProperty("report_server_name");
		 * REPORT_SERVER_OUTPUT_FORMAT=
		 * mainProperties.getProperty("report_output_format");
		 */

		try {
			// to have properties file in same folder as jar file
			// no need to recompile properties jar to chnage properties
			Properties mainProperties = new Properties();

			FileInputStream file;

			// the base folder is ./, the root of the main.properties file
			String path = "./SchoolRankingSystem.properties";

			// load the file handle for main.properties
			file = new FileInputStream(path);

			// load all the properties from this file
			mainProperties.load(file);

			// we have loaded the properties, so close the file handle
			file.close();

			// retrieve the property we are intrested, the app.version
			USERNAME = mainProperties.getProperty("username");
			DOMAIN = mainProperties.getProperty("domain");
			PASSWORD = mainProperties.getProperty("password");
			DEPLOYMENT_FOLDER = mainProperties
					.getProperty("report.deployment.folder");
			REPORT_SERVER_URL = mainProperties.getProperty("report.server.url");
			REPORT_SERVER_PORT = mainProperties
					.getProperty("report.server.port");
			REPORT_SERVER_NAME = mainProperties
					.getProperty("report.server.name");
			REPORT_SERVER_OUTPUT_FORMAT = mainProperties
					.getProperty("report.output.format");

		} catch (FileNotFoundException e) {
			// for properties file inside the jar structure

			ResourceBundle bundle = ResourceBundle
					.getBundle("SchoolRankingSystem");
			USERNAME = bundle.getString("username");
			DOMAIN = bundle.getString("domain");
			PASSWORD = bundle.getString("password");
			DEPLOYMENT_FOLDER = bundle.getString("report.deployment.folder");
			REPORT_SERVER_URL = bundle.getString("report.server.url");
			REPORT_SERVER_PORT = bundle.getString("report.server.port");
			REPORT_SERVER_NAME = bundle.getString("report.server.name");
			REPORT_SERVER_OUTPUT_FORMAT = bundle
					.getString("report.output.format");

		} catch (Exception e) {
			System.err.println("Report Server Credentials not set");
		}

	}

	public static boolean generate(String type, String ids, String field) {
		AuthPolicy.registerAuthScheme(AuthPolicy.NTLM, JCIFS_NTLMScheme.class);
		ReportExecutionServiceSoapStub service = getService();

		ParameterValue[] parameters = null;
		if (type == "Bar Graph") {
			parameters = new ParameterValue[2];
			parameters[1] = new ParameterValue();
			parameters[1].setName("fields");
			parameters[1].setValue(field);
		} else if (type == "Pie Chart") {
			parameters = new ParameterValue[2];
			parameters[1] = new ParameterValue();
			parameters[1].setName("field");
			parameters[1].setValue(field);
		} else if (type == "Scatter Plot") {
			parameters = new ParameterValue[3];
			parameters[1] = new ParameterValue();
			parameters[1].setName("field1");
			parameters[2] = new ParameterValue();
			parameters[2].setName("field2");
			String[] param = field.split(",");

			parameters[1].setValue(param[0]);
			parameters[2].setValue(param[1]);
		} else {
			return false;
		}
		parameters[0] = new ParameterValue();
		parameters[0].setName("ids");
		parameters[0].setValue(ids);

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss'.pdf'")
				.format(new Date());
		String fileName = "C:\\temp\\" + timeStamp;
		try {
			ExecutionInfo info = null;
			if (type == "Bar Graph") {
				info = service.loadReport(
						"/" + DEPLOYMENT_FOLDER + "/BarGraph", null); // Load
																		// report
																		// --
																		// REPORTFOLDER/REPORTNAME
			} else if (type == "Pie Chart") {
				info = service.loadReport(
						"/" + DEPLOYMENT_FOLDER + "/PieChart", null); // Load
																		// report
																		// --
																		// REPORTFOLDER/REPORTNAME
			} else if (type == "Scatter Plot") {
				info = service.loadReport("/" + DEPLOYMENT_FOLDER
						+ "/ScatterPlot", null); // Load report --
													// REPORTFOLDER/REPORTNAME
			} else {
				System.out.println("error- cannot render");
				return false;
			}
			setExecutionId(service, info.getExecutionID()); // You must set the
															// session id before
															// continuing
			service.setExecutionParameters(parameters, "en-us"); // Set report
																	// parameters

			String format = REPORT_SERVER_OUTPUT_FORMAT; // Valid options are
															// HTML4.0, MHTML,
															// EXCEL, CSV, PDF,
															// etc
			String deviceInfo = "<DeviceInfo><Toolbar>False</Toolbar></DeviceInfo>"; // Only
																						// generate
																						// an
																						// HTML
																						// fragment
			ByteArrayHolder result = new ByteArrayHolder();
			StringHolder extension = new StringHolder();
			StringHolder mimeType = new StringHolder();
			StringHolder encoding = new StringHolder();
			ArrayOfWarningHolder warnings = new ArrayOfWarningHolder();
			ArrayOfStringHolder streamIDs = new ArrayOfStringHolder();
			service.render(format, deviceInfo, result, extension, mimeType,
					encoding, warnings, streamIDs); // Render report to HTML

			// System.out.println(new String(result.value)); //Prints the report
			// HTML; this could be embedded in a JSP
			File file = new File(fileName);
			if (!file.exists()) {
				file.createNewFile();
			}

			FileOutputStream output = new FileOutputStream(
					file.getAbsoluteFile());

			output.write((result.value));

			output.close();
			return true;
			/*
			 * JEditorPane jep = new JEditorPane(); jep.setEditable(false);
			 * 
			 * try { File file1 = new File(fileName);
			 * jep.setPage(file1.toURI().toURL()); } catch (IOException e) {
			 * jep.setContentType("text/html");
			 * jep.setText("<html>Could not load Generated Report</html>"); }
			 * 
			 * JScrollPane scrollPane = new JScrollPane(jep); JFrame f = new
			 * JFrame("Report"); // Next line requires Java 1.3
			 * f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 * f.getContentPane().add(scrollPane); f.setSize(800, 600);
			 * f.show();
			 */
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {

		}

	}

	public static void setExecutionId(ReportExecutionServiceSoapStub service,
			String id) throws SOAPException {
		SOAPHeaderElement sessionHeader = new SOAPHeaderElement(
				"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
				"ExecutionHeader");
		sessionHeader.addChildElement("ExecutionID").addTextNode(id);
		service.setHeader(sessionHeader);
	}

	public static EngineConfiguration getEngineConfiguration() {
		java.lang.StringBuffer sb = new java.lang.StringBuffer();

		sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n");
		sb.append("<deployment name=\"defaultClientConfig\"\r\n");
		sb.append("xmlns=\"http://xml.apache.org/axis/wsdd/\"\r\n");
		sb.append("xmlns:java=\"http://xml.apache.org/axis/wsdd/providers/java\">\r\n");
		sb.append("<globalConfiguration>\r\n");
		sb.append("<parameter name=\"disablePrettyXML\" value=\"true\"/>\r\n");
		sb.append("<parameter name=\"enableNamespacePrefixOptimization\" value=\"true\"/>\r\n");
		sb.append("</globalConfiguration>\r\n");
		sb.append("<transport name=\"http\" pivot=\"java:org.apache.axis.transport.http.CommonsHTTPSender\"/>\r\n");
		sb.append("<transport name=\"local\" pivot=\"java:org.apache.axis.transport.local.LocalSender\"/>\r\n");
		sb.append("<transport name=\"java\" pivot=\"java:org.apache.axis.transport.java.JavaSender\"/>\r\n");
		sb.append("</deployment>\r\n");

		return new XMLStringProvider(sb.toString());
	}

	public static ReportExecutionServiceSoapStub getService() {
		try {
			String endpoint = "http://" + REPORT_SERVER_URL + ":"
					+ REPORT_SERVER_PORT + "/" + REPORT_SERVER_NAME
					+ "/ReportExecution2005.asmx";
			ReportExecutionServiceSoapStub service = (ReportExecutionServiceSoapStub) new ReportExecutionServiceLocator(
					getEngineConfiguration())
					.getReportExecutionServiceSoap(new URL(endpoint));

			service.setUsername(DOMAIN + "\\" + USERNAME);
			service.setPassword(PASSWORD);
			return service;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}
