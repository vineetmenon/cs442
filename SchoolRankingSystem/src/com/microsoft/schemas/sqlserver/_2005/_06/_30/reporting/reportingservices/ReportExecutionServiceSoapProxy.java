package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

public class ReportExecutionServiceSoapProxy
		implements
		com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportExecutionServiceSoap {
	private String _endpoint = null;
	private com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportExecutionServiceSoap reportExecutionServiceSoap = null;

	public ReportExecutionServiceSoapProxy() {
		_initReportExecutionServiceSoapProxy();
	}

	public ReportExecutionServiceSoapProxy(String endpoint) {
		_endpoint = endpoint;
		_initReportExecutionServiceSoapProxy();
	}

	private void _initReportExecutionServiceSoapProxy() {
		try {
			reportExecutionServiceSoap = (new com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportExecutionServiceLocator())
					.getReportExecutionServiceSoap();
			if (reportExecutionServiceSoap != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub) reportExecutionServiceSoap)
							._setProperty(
									"javax.xml.rpc.service.endpoint.address",
									_endpoint);
				else
					_endpoint = (String) ((javax.xml.rpc.Stub) reportExecutionServiceSoap)
							._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		} catch (javax.xml.rpc.ServiceException serviceException) {
		}
	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (reportExecutionServiceSoap != null)
			((javax.xml.rpc.Stub) reportExecutionServiceSoap)._setProperty(
					"javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportExecutionServiceSoap getReportExecutionServiceSoap() {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		return reportExecutionServiceSoap;
	}

	public java.lang.String[] listSecureMethods()
			throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		return reportExecutionServiceSoap.listSecureMethods();
	}

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo loadReport(
			java.lang.String report, java.lang.String historyID)
			throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		return reportExecutionServiceSoap.loadReport(report, historyID);
	}

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo2 loadReport2(
			java.lang.String report, java.lang.String historyID)
			throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		return reportExecutionServiceSoap.loadReport2(report, historyID);
	}

	public void loadReportDefinition(
			byte[] definition,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.holders.ExecutionInfoHolder executionInfo,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.holders.ArrayOfWarningHolder warnings)
			throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		reportExecutionServiceSoap.loadReportDefinition(definition,
				executionInfo, warnings);
	}

	public void loadReportDefinition2(
			byte[] definition,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.holders.ExecutionInfo2Holder executionInfo,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.holders.ArrayOfWarningHolder warnings)
			throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		reportExecutionServiceSoap.loadReportDefinition2(definition,
				executionInfo, warnings);
	}

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo setExecutionCredentials(
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.DataSourceCredentials[] credentials)
			throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		return reportExecutionServiceSoap.setExecutionCredentials(credentials);
	}

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo2 setExecutionCredentials2(
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.DataSourceCredentials[] credentials)
			throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		return reportExecutionServiceSoap.setExecutionCredentials2(credentials);
	}

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo setExecutionParameters(
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ParameterValue[] parameters,
			java.lang.String parameterLanguage) throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		return reportExecutionServiceSoap.setExecutionParameters(parameters,
				parameterLanguage);
	}

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo2 setExecutionParameters2(
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ParameterValue[] parameters,
			java.lang.String parameterLanguage) throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		return reportExecutionServiceSoap.setExecutionParameters2(parameters,
				parameterLanguage);
	}

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo resetExecution()
			throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		return reportExecutionServiceSoap.resetExecution();
	}

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo2 resetExecution2()
			throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		return reportExecutionServiceSoap.resetExecution2();
	}

	public void render(
			java.lang.String format,
			java.lang.String deviceInfo,
			javax.xml.rpc.holders.ByteArrayHolder result,
			javax.xml.rpc.holders.StringHolder extension,
			javax.xml.rpc.holders.StringHolder mimeType,
			javax.xml.rpc.holders.StringHolder encoding,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.holders.ArrayOfWarningHolder warnings,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.holders.ArrayOfStringHolder streamIds)
			throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		reportExecutionServiceSoap.render(format, deviceInfo, result,
				extension, mimeType, encoding, warnings, streamIds);
	}

	public void render2(
			java.lang.String format,
			java.lang.String deviceInfo,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.PageCountMode paginationMode,
			javax.xml.rpc.holders.ByteArrayHolder result,
			javax.xml.rpc.holders.StringHolder extension,
			javax.xml.rpc.holders.StringHolder mimeType,
			javax.xml.rpc.holders.StringHolder encoding,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.holders.ArrayOfWarningHolder warnings,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.holders.ArrayOfStringHolder streamIds)
			throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		reportExecutionServiceSoap.render2(format, deviceInfo, paginationMode,
				result, extension, mimeType, encoding, warnings, streamIds);
	}

	public void renderStream(java.lang.String format,
			java.lang.String streamID, java.lang.String deviceInfo,
			javax.xml.rpc.holders.ByteArrayHolder result,
			javax.xml.rpc.holders.StringHolder encoding,
			javax.xml.rpc.holders.StringHolder mimeType)
			throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		reportExecutionServiceSoap.renderStream(format, streamID, deviceInfo,
				result, encoding, mimeType);
	}

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo getExecutionInfo()
			throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		return reportExecutionServiceSoap.getExecutionInfo();
	}

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo2 getExecutionInfo2()
			throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		return reportExecutionServiceSoap.getExecutionInfo2();
	}

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.DocumentMapNode getDocumentMap()
			throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		return reportExecutionServiceSoap.getDocumentMap();
	}

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo loadDrillthroughTarget(
			java.lang.String drillthroughID) throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		return reportExecutionServiceSoap
				.loadDrillthroughTarget(drillthroughID);
	}

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo2 loadDrillthroughTarget2(
			java.lang.String drillthroughID) throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		return reportExecutionServiceSoap
				.loadDrillthroughTarget2(drillthroughID);
	}

	public boolean toggleItem(java.lang.String toggleID)
			throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		return reportExecutionServiceSoap.toggleItem(toggleID);
	}

	public int navigateDocumentMap(java.lang.String docMapID)
			throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		return reportExecutionServiceSoap.navigateDocumentMap(docMapID);
	}

	public void navigateBookmark(java.lang.String bookmarkID,
			javax.xml.rpc.holders.IntHolder pageNumber,
			javax.xml.rpc.holders.StringHolder uniqueName)
			throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		reportExecutionServiceSoap.navigateBookmark(bookmarkID, pageNumber,
				uniqueName);
	}

	public int findString(int startPage, int endPage, java.lang.String findValue)
			throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		return reportExecutionServiceSoap.findString(startPage, endPage,
				findValue);
	}

	public void sort(
			java.lang.String sortItem,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.SortDirectionEnum direction,
			boolean clear, javax.xml.rpc.holders.IntHolder pageNumber,
			javax.xml.rpc.holders.StringHolder reportItem,
			javax.xml.rpc.holders.IntHolder numPages)
			throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		reportExecutionServiceSoap.sort(sortItem, direction, clear, pageNumber,
				reportItem, numPages);
	}

	public void sort2(
			java.lang.String sortItem,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.SortDirectionEnum direction,
			boolean clear,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.PageCountMode paginationMode,
			javax.xml.rpc.holders.IntHolder pageNumber,
			javax.xml.rpc.holders.StringHolder reportItem,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.holders.ExecutionInfo2Holder executionInfo)
			throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		reportExecutionServiceSoap.sort2(sortItem, direction, clear,
				paginationMode, pageNumber, reportItem, executionInfo);
	}

	public void getRenderResource(java.lang.String format,
			java.lang.String deviceInfo,
			javax.xml.rpc.holders.ByteArrayHolder result,
			javax.xml.rpc.holders.StringHolder mimeType)
			throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		reportExecutionServiceSoap.getRenderResource(format, deviceInfo,
				result, mimeType);
	}

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.Extension[] listRenderingExtensions()
			throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		return reportExecutionServiceSoap.listRenderingExtensions();
	}

	public void logonUser(java.lang.String userName, java.lang.String password,
			java.lang.String authority) throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		reportExecutionServiceSoap.logonUser(userName, password, authority);
	}

	public void logoff() throws java.rmi.RemoteException {
		if (reportExecutionServiceSoap == null)
			_initReportExecutionServiceSoapProxy();
		reportExecutionServiceSoap.logoff();
	}

}