/**
 * ReportExecutionServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

public interface ReportExecutionServiceSoap extends java.rmi.Remote {
	public java.lang.String[] listSecureMethods()
			throws java.rmi.RemoteException;

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo loadReport(
			java.lang.String report, java.lang.String historyID)
			throws java.rmi.RemoteException;

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo2 loadReport2(
			java.lang.String report, java.lang.String historyID)
			throws java.rmi.RemoteException;

	public void loadReportDefinition(
			byte[] definition,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.holders.ExecutionInfoHolder executionInfo,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.holders.ArrayOfWarningHolder warnings)
			throws java.rmi.RemoteException;

	public void loadReportDefinition2(
			byte[] definition,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.holders.ExecutionInfo2Holder executionInfo,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.holders.ArrayOfWarningHolder warnings)
			throws java.rmi.RemoteException;

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo setExecutionCredentials(
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.DataSourceCredentials[] credentials)
			throws java.rmi.RemoteException;

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo2 setExecutionCredentials2(
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.DataSourceCredentials[] credentials)
			throws java.rmi.RemoteException;

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo setExecutionParameters(
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ParameterValue[] parameters,
			java.lang.String parameterLanguage) throws java.rmi.RemoteException;

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo2 setExecutionParameters2(
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ParameterValue[] parameters,
			java.lang.String parameterLanguage) throws java.rmi.RemoteException;

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo resetExecution()
			throws java.rmi.RemoteException;

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo2 resetExecution2()
			throws java.rmi.RemoteException;

	public void render(
			java.lang.String format,
			java.lang.String deviceInfo,
			javax.xml.rpc.holders.ByteArrayHolder result,
			javax.xml.rpc.holders.StringHolder extension,
			javax.xml.rpc.holders.StringHolder mimeType,
			javax.xml.rpc.holders.StringHolder encoding,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.holders.ArrayOfWarningHolder warnings,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.holders.ArrayOfStringHolder streamIds)
			throws java.rmi.RemoteException;

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
			throws java.rmi.RemoteException;

	public void renderStream(java.lang.String format,
			java.lang.String streamID, java.lang.String deviceInfo,
			javax.xml.rpc.holders.ByteArrayHolder result,
			javax.xml.rpc.holders.StringHolder encoding,
			javax.xml.rpc.holders.StringHolder mimeType)
			throws java.rmi.RemoteException;

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo getExecutionInfo()
			throws java.rmi.RemoteException;

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo2 getExecutionInfo2()
			throws java.rmi.RemoteException;

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.DocumentMapNode getDocumentMap()
			throws java.rmi.RemoteException;

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo loadDrillthroughTarget(
			java.lang.String drillthroughID) throws java.rmi.RemoteException;

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo2 loadDrillthroughTarget2(
			java.lang.String drillthroughID) throws java.rmi.RemoteException;

	public boolean toggleItem(java.lang.String toggleID)
			throws java.rmi.RemoteException;

	public int navigateDocumentMap(java.lang.String docMapID)
			throws java.rmi.RemoteException;

	public void navigateBookmark(java.lang.String bookmarkID,
			javax.xml.rpc.holders.IntHolder pageNumber,
			javax.xml.rpc.holders.StringHolder uniqueName)
			throws java.rmi.RemoteException;

	public int findString(int startPage, int endPage, java.lang.String findValue)
			throws java.rmi.RemoteException;

	public void sort(
			java.lang.String sortItem,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.SortDirectionEnum direction,
			boolean clear, javax.xml.rpc.holders.IntHolder pageNumber,
			javax.xml.rpc.holders.StringHolder reportItem,
			javax.xml.rpc.holders.IntHolder numPages)
			throws java.rmi.RemoteException;

	public void sort2(
			java.lang.String sortItem,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.SortDirectionEnum direction,
			boolean clear,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.PageCountMode paginationMode,
			javax.xml.rpc.holders.IntHolder pageNumber,
			javax.xml.rpc.holders.StringHolder reportItem,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.holders.ExecutionInfo2Holder executionInfo)
			throws java.rmi.RemoteException;

	public void getRenderResource(java.lang.String format,
			java.lang.String deviceInfo,
			javax.xml.rpc.holders.ByteArrayHolder result,
			javax.xml.rpc.holders.StringHolder mimeType)
			throws java.rmi.RemoteException;

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.Extension[] listRenderingExtensions()
			throws java.rmi.RemoteException;

	public void logonUser(java.lang.String userName, java.lang.String password,
			java.lang.String authority) throws java.rmi.RemoteException;

	public void logoff() throws java.rmi.RemoteException;
}
