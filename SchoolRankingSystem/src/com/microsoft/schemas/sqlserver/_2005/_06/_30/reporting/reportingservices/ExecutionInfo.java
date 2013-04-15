/**
 * ExecutionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

public class ExecutionInfo implements java.io.Serializable {
	private boolean hasSnapshot;

	private boolean needsProcessing;

	private boolean allowQueryExecution;

	private boolean credentialsRequired;

	private boolean parametersRequired;

	private java.util.Calendar expirationDateTime;

	private java.util.Calendar executionDateTime;

	private int numPages;

	private com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportParameter[] parameters;

	private com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.DataSourcePrompt[] dataSourcePrompts;

	private boolean hasDocumentMap;

	private java.lang.String executionID;

	private java.lang.String reportPath;

	private java.lang.String historyID;

	private com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.PageSettings reportPageSettings;

	private int autoRefreshInterval;

	public ExecutionInfo() {
	}

	public ExecutionInfo(
			boolean hasSnapshot,
			boolean needsProcessing,
			boolean allowQueryExecution,
			boolean credentialsRequired,
			boolean parametersRequired,
			java.util.Calendar expirationDateTime,
			java.util.Calendar executionDateTime,
			int numPages,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportParameter[] parameters,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.DataSourcePrompt[] dataSourcePrompts,
			boolean hasDocumentMap,
			java.lang.String executionID,
			java.lang.String reportPath,
			java.lang.String historyID,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.PageSettings reportPageSettings,
			int autoRefreshInterval) {
		this.hasSnapshot = hasSnapshot;
		this.needsProcessing = needsProcessing;
		this.allowQueryExecution = allowQueryExecution;
		this.credentialsRequired = credentialsRequired;
		this.parametersRequired = parametersRequired;
		this.expirationDateTime = expirationDateTime;
		this.executionDateTime = executionDateTime;
		this.numPages = numPages;
		this.parameters = parameters;
		this.dataSourcePrompts = dataSourcePrompts;
		this.hasDocumentMap = hasDocumentMap;
		this.executionID = executionID;
		this.reportPath = reportPath;
		this.historyID = historyID;
		this.reportPageSettings = reportPageSettings;
		this.autoRefreshInterval = autoRefreshInterval;
	}

	/**
	 * Gets the hasSnapshot value for this ExecutionInfo.
	 * 
	 * @return hasSnapshot
	 */
	public boolean isHasSnapshot() {
		return hasSnapshot;
	}

	/**
	 * Sets the hasSnapshot value for this ExecutionInfo.
	 * 
	 * @param hasSnapshot
	 */
	public void setHasSnapshot(boolean hasSnapshot) {
		this.hasSnapshot = hasSnapshot;
	}

	/**
	 * Gets the needsProcessing value for this ExecutionInfo.
	 * 
	 * @return needsProcessing
	 */
	public boolean isNeedsProcessing() {
		return needsProcessing;
	}

	/**
	 * Sets the needsProcessing value for this ExecutionInfo.
	 * 
	 * @param needsProcessing
	 */
	public void setNeedsProcessing(boolean needsProcessing) {
		this.needsProcessing = needsProcessing;
	}

	/**
	 * Gets the allowQueryExecution value for this ExecutionInfo.
	 * 
	 * @return allowQueryExecution
	 */
	public boolean isAllowQueryExecution() {
		return allowQueryExecution;
	}

	/**
	 * Sets the allowQueryExecution value for this ExecutionInfo.
	 * 
	 * @param allowQueryExecution
	 */
	public void setAllowQueryExecution(boolean allowQueryExecution) {
		this.allowQueryExecution = allowQueryExecution;
	}

	/**
	 * Gets the credentialsRequired value for this ExecutionInfo.
	 * 
	 * @return credentialsRequired
	 */
	public boolean isCredentialsRequired() {
		return credentialsRequired;
	}

	/**
	 * Sets the credentialsRequired value for this ExecutionInfo.
	 * 
	 * @param credentialsRequired
	 */
	public void setCredentialsRequired(boolean credentialsRequired) {
		this.credentialsRequired = credentialsRequired;
	}

	/**
	 * Gets the parametersRequired value for this ExecutionInfo.
	 * 
	 * @return parametersRequired
	 */
	public boolean isParametersRequired() {
		return parametersRequired;
	}

	/**
	 * Sets the parametersRequired value for this ExecutionInfo.
	 * 
	 * @param parametersRequired
	 */
	public void setParametersRequired(boolean parametersRequired) {
		this.parametersRequired = parametersRequired;
	}

	/**
	 * Gets the expirationDateTime value for this ExecutionInfo.
	 * 
	 * @return expirationDateTime
	 */
	public java.util.Calendar getExpirationDateTime() {
		return expirationDateTime;
	}

	/**
	 * Sets the expirationDateTime value for this ExecutionInfo.
	 * 
	 * @param expirationDateTime
	 */
	public void setExpirationDateTime(java.util.Calendar expirationDateTime) {
		this.expirationDateTime = expirationDateTime;
	}

	/**
	 * Gets the executionDateTime value for this ExecutionInfo.
	 * 
	 * @return executionDateTime
	 */
	public java.util.Calendar getExecutionDateTime() {
		return executionDateTime;
	}

	/**
	 * Sets the executionDateTime value for this ExecutionInfo.
	 * 
	 * @param executionDateTime
	 */
	public void setExecutionDateTime(java.util.Calendar executionDateTime) {
		this.executionDateTime = executionDateTime;
	}

	/**
	 * Gets the numPages value for this ExecutionInfo.
	 * 
	 * @return numPages
	 */
	public int getNumPages() {
		return numPages;
	}

	/**
	 * Sets the numPages value for this ExecutionInfo.
	 * 
	 * @param numPages
	 */
	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	/**
	 * Gets the parameters value for this ExecutionInfo.
	 * 
	 * @return parameters
	 */
	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportParameter[] getParameters() {
		return parameters;
	}

	/**
	 * Sets the parameters value for this ExecutionInfo.
	 * 
	 * @param parameters
	 */
	public void setParameters(
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportParameter[] parameters) {
		this.parameters = parameters;
	}

	/**
	 * Gets the dataSourcePrompts value for this ExecutionInfo.
	 * 
	 * @return dataSourcePrompts
	 */
	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.DataSourcePrompt[] getDataSourcePrompts() {
		return dataSourcePrompts;
	}

	/**
	 * Sets the dataSourcePrompts value for this ExecutionInfo.
	 * 
	 * @param dataSourcePrompts
	 */
	public void setDataSourcePrompts(
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.DataSourcePrompt[] dataSourcePrompts) {
		this.dataSourcePrompts = dataSourcePrompts;
	}

	/**
	 * Gets the hasDocumentMap value for this ExecutionInfo.
	 * 
	 * @return hasDocumentMap
	 */
	public boolean isHasDocumentMap() {
		return hasDocumentMap;
	}

	/**
	 * Sets the hasDocumentMap value for this ExecutionInfo.
	 * 
	 * @param hasDocumentMap
	 */
	public void setHasDocumentMap(boolean hasDocumentMap) {
		this.hasDocumentMap = hasDocumentMap;
	}

	/**
	 * Gets the executionID value for this ExecutionInfo.
	 * 
	 * @return executionID
	 */
	public java.lang.String getExecutionID() {
		return executionID;
	}

	/**
	 * Sets the executionID value for this ExecutionInfo.
	 * 
	 * @param executionID
	 */
	public void setExecutionID(java.lang.String executionID) {
		this.executionID = executionID;
	}

	/**
	 * Gets the reportPath value for this ExecutionInfo.
	 * 
	 * @return reportPath
	 */
	public java.lang.String getReportPath() {
		return reportPath;
	}

	/**
	 * Sets the reportPath value for this ExecutionInfo.
	 * 
	 * @param reportPath
	 */
	public void setReportPath(java.lang.String reportPath) {
		this.reportPath = reportPath;
	}

	/**
	 * Gets the historyID value for this ExecutionInfo.
	 * 
	 * @return historyID
	 */
	public java.lang.String getHistoryID() {
		return historyID;
	}

	/**
	 * Sets the historyID value for this ExecutionInfo.
	 * 
	 * @param historyID
	 */
	public void setHistoryID(java.lang.String historyID) {
		this.historyID = historyID;
	}

	/**
	 * Gets the reportPageSettings value for this ExecutionInfo.
	 * 
	 * @return reportPageSettings
	 */
	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.PageSettings getReportPageSettings() {
		return reportPageSettings;
	}

	/**
	 * Sets the reportPageSettings value for this ExecutionInfo.
	 * 
	 * @param reportPageSettings
	 */
	public void setReportPageSettings(
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.PageSettings reportPageSettings) {
		this.reportPageSettings = reportPageSettings;
	}

	/**
	 * Gets the autoRefreshInterval value for this ExecutionInfo.
	 * 
	 * @return autoRefreshInterval
	 */
	public int getAutoRefreshInterval() {
		return autoRefreshInterval;
	}

	/**
	 * Sets the autoRefreshInterval value for this ExecutionInfo.
	 * 
	 * @param autoRefreshInterval
	 */
	public void setAutoRefreshInterval(int autoRefreshInterval) {
		this.autoRefreshInterval = autoRefreshInterval;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ExecutionInfo))
			return false;
		ExecutionInfo other = (ExecutionInfo) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& this.hasSnapshot == other.isHasSnapshot()
				&& this.needsProcessing == other.isNeedsProcessing()
				&& this.allowQueryExecution == other.isAllowQueryExecution()
				&& this.credentialsRequired == other.isCredentialsRequired()
				&& this.parametersRequired == other.isParametersRequired()
				&& ((this.expirationDateTime == null && other
						.getExpirationDateTime() == null) || (this.expirationDateTime != null && this.expirationDateTime
						.equals(other.getExpirationDateTime())))
				&& ((this.executionDateTime == null && other
						.getExecutionDateTime() == null) || (this.executionDateTime != null && this.executionDateTime
						.equals(other.getExecutionDateTime())))
				&& this.numPages == other.getNumPages()
				&& ((this.parameters == null && other.getParameters() == null) || (this.parameters != null && java.util.Arrays
						.equals(this.parameters, other.getParameters())))
				&& ((this.dataSourcePrompts == null && other
						.getDataSourcePrompts() == null) || (this.dataSourcePrompts != null && java.util.Arrays
						.equals(this.dataSourcePrompts,
								other.getDataSourcePrompts())))
				&& this.hasDocumentMap == other.isHasDocumentMap()
				&& ((this.executionID == null && other.getExecutionID() == null) || (this.executionID != null && this.executionID
						.equals(other.getExecutionID())))
				&& ((this.reportPath == null && other.getReportPath() == null) || (this.reportPath != null && this.reportPath
						.equals(other.getReportPath())))
				&& ((this.historyID == null && other.getHistoryID() == null) || (this.historyID != null && this.historyID
						.equals(other.getHistoryID())))
				&& ((this.reportPageSettings == null && other
						.getReportPageSettings() == null) || (this.reportPageSettings != null && this.reportPageSettings
						.equals(other.getReportPageSettings())))
				&& this.autoRefreshInterval == other.getAutoRefreshInterval();
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	public synchronized int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = 1;
		_hashCode += (isHasSnapshot() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		_hashCode += (isNeedsProcessing() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		_hashCode += (isAllowQueryExecution() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		_hashCode += (isCredentialsRequired() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		_hashCode += (isParametersRequired() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		if (getExpirationDateTime() != null) {
			_hashCode += getExpirationDateTime().hashCode();
		}
		if (getExecutionDateTime() != null) {
			_hashCode += getExecutionDateTime().hashCode();
		}
		_hashCode += getNumPages();
		if (getParameters() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getParameters()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getParameters(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getDataSourcePrompts() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDataSourcePrompts()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDataSourcePrompts(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		_hashCode += (isHasDocumentMap() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		if (getExecutionID() != null) {
			_hashCode += getExecutionID().hashCode();
		}
		if (getReportPath() != null) {
			_hashCode += getReportPath().hashCode();
		}
		if (getHistoryID() != null) {
			_hashCode += getHistoryID().hashCode();
		}
		if (getReportPageSettings() != null) {
			_hashCode += getReportPageSettings().hashCode();
		}
		_hashCode += getAutoRefreshInterval();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ExecutionInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
				"ExecutionInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hasSnapshot");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"HasSnapshot"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("needsProcessing");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"NeedsProcessing"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("allowQueryExecution");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"AllowQueryExecution"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("credentialsRequired");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"CredentialsRequired"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("parametersRequired");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"ParametersRequired"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("expirationDateTime");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"ExpirationDateTime"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("executionDateTime");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"ExecutionDateTime"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numPages");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"NumPages"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("parameters");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"Parameters"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"ReportParameter"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField
				.setItemQName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"ReportParameter"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dataSourcePrompts");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"DataSourcePrompts"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"DataSourcePrompt"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField
				.setItemQName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"DataSourcePrompt"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hasDocumentMap");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"HasDocumentMap"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("executionID");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"ExecutionID"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("reportPath");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"ReportPath"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("historyID");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"HistoryID"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("reportPageSettings");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"ReportPageSettings"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"PageSettings"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("autoRefreshInterval");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"AutoRefreshInterval"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

	/**
	 * Get Custom Serializer
	 */
	public static org.apache.axis.encoding.Serializer getSerializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType,
				_xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType,
				_xmlType, typeDesc);
	}

}
