package com.business.report;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

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
import java.io.FileOutputStream;



public class GenerateReport
{
	public static final String USERNAME = "ravir-mac-w8\\reportuser";
	public static final String PASSWORD = "cs442";

	public static boolean generate(String type, String ids, String field)
	{
		System.out.println(" type " +type+" id: "+ids+ " field : "+field);
		AuthPolicy.registerAuthScheme(AuthPolicy.NTLM, JCIFS_NTLMScheme.class);
		ReportExecutionServiceSoapStub service = getService();

		ParameterValue[] parameters = null;
		if (type=="Bar Graph") {
			parameters = new ParameterValue[2];
			parameters[1] = new ParameterValue();
			parameters[1].setName("fields");
			parameters[1].setValue(field);
		} else if (type=="Pie Chart") {
			parameters = new ParameterValue[2];
			parameters[1] = new ParameterValue();
			parameters[1].setName("field");
			parameters[1].setValue(field);
		} else if (type=="Scatter Plot") {
			parameters = new ParameterValue[3];
			parameters[1] = new ParameterValue();
			parameters[1].setName("field1");
			parameters[2] = new ParameterValue();
			parameters[2].setName("field2");
			String[] param=field.split(",");

			parameters[1].setValue(param[0]);
			parameters[2].setValue(param[1]);
		} else {
			return false;
		}
		parameters[0] = new ParameterValue();
		parameters[0].setName("ids");
		parameters[0].setValue(ids);


		String timeStamp=new SimpleDateFormat("yyyyMMddhhmmss'.pdf'").format(new Date());
		String fileName = "C:\\temp\\"+timeStamp;
		try
		{
			ExecutionInfo info=null;
			if (type=="Bar Graph") {
				info= service.loadReport("/School Ranking System/BarGraph", null); //Load report -- REPORTFOLDER/REPORTNAME
			} else if (type=="Pie Chart") {
				info= service.loadReport("/School Ranking System/PieChart", null); //Load report -- REPORTFOLDER/REPORTNAME
			} else if (type=="Scatter Plot") {
				info= service.loadReport("/School Ranking System/ScatterPlot", null); //Load report -- REPORTFOLDER/REPORTNAME
			} else {
				System.out.println("error- cannot render");
				return false;
			}
			setExecutionId(service, info.getExecutionID()); //You must set the session id before continuing
			service.setExecutionParameters(parameters, "en-us"); //Set report parameters

			String format = "PDF"; //Valid options are HTML4.0, MHTML, EXCEL, CSV, PDF, etc
			String deviceInfo = "<DeviceInfo><Toolbar>False</Toolbar></DeviceInfo>"; //Only generate an HTML fragment
			ByteArrayHolder result = new ByteArrayHolder();
			StringHolder extension = new StringHolder();
			StringHolder mimeType = new StringHolder();
			StringHolder encoding = new StringHolder();
			ArrayOfWarningHolder warnings = new ArrayOfWarningHolder();
			ArrayOfStringHolder streamIDs = new ArrayOfStringHolder();   
			service.render(format, deviceInfo, result, extension, mimeType, encoding, warnings, streamIDs); //Render report to HTML

			//System.out.println(new String(result.value)); //Prints the report HTML; this could be embedded in a JSP
			File file = new File(fileName);
			if (!file.exists()) {
				file.createNewFile();
			}

			FileOutputStream output = new FileOutputStream(file.getAbsoluteFile());

			output.write((result.value));

			output.close();
			return true;
			/*JEditorPane jep = new JEditorPane();
		     jep.setEditable(false);   

		     try {
		    	 File file1 = new File(fileName);
		    	 jep.setPage(file1.toURI().toURL());
		     }
		     catch (IOException e) {
		       jep.setContentType("text/html");
		       jep.setText("<html>Could not load Generated Report</html>");
		     } 

		     JScrollPane scrollPane = new JScrollPane(jep);     
		     JFrame f = new JFrame("Report");
		     // Next line requires Java 1.3
		     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		     f.getContentPane().add(scrollPane);
		     f.setSize(800, 600);
		     f.show();*/
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		} finally {

		}

	}

	public static void setExecutionId(ReportExecutionServiceSoapStub service, String id) throws SOAPException
	{
		SOAPHeaderElement sessionHeader = new SOAPHeaderElement("http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices", "ExecutionHeader");
		sessionHeader.addChildElement("ExecutionID").addTextNode(id);
		service.setHeader(sessionHeader);
	}

	public static EngineConfiguration getEngineConfiguration()
	{
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

	public static ReportExecutionServiceSoapStub getService()
	{
		try
		{
			String endpoint = "http://127.0.0.1:80/ReportServer_SQLEXPRESS/ReportExecution2005.asmx";   
			ReportExecutionServiceSoapStub service = (ReportExecutionServiceSoapStub)new ReportExecutionServiceLocator(getEngineConfiguration()).getReportExecutionServiceSoap(new URL(endpoint));

			service.setUsername(USERNAME);
			service.setPassword(PASSWORD);
			return service;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		return null;
	}
}
