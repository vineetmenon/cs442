/**
 * ExecutionInfo2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

public class ExecutionInfo2
		extends
		com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExecutionInfo
		implements java.io.Serializable {
	private com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.PageCountMode pageCountMode;

	public ExecutionInfo2() {
	}

	public ExecutionInfo2(
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
			int autoRefreshInterval,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.PageCountMode pageCountMode) {
		super(hasSnapshot, needsProcessing, allowQueryExecution,
				credentialsRequired, parametersRequired, expirationDateTime,
				executionDateTime, numPages, parameters, dataSourcePrompts,
				hasDocumentMap, executionID, reportPath, historyID,
				reportPageSettings, autoRefreshInterval);
		this.pageCountMode = pageCountMode;
	}

	/**
	 * Gets the pageCountMode value for this ExecutionInfo2.
	 * 
	 * @return pageCountMode
	 */
	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.PageCountMode getPageCountMode() {
		return pageCountMode;
	}

	/**
	 * Sets the pageCountMode value for this ExecutionInfo2.
	 * 
	 * @param pageCountMode
	 */
	public void setPageCountMode(
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.PageCountMode pageCountMode) {
		this.pageCountMode = pageCountMode;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ExecutionInfo2))
			return false;
		ExecutionInfo2 other = (ExecutionInfo2) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = super.equals(obj)
				&& ((this.pageCountMode == null && other.getPageCountMode() == null) || (this.pageCountMode != null && this.pageCountMode
						.equals(other.getPageCountMode())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	public synchronized int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = super.hashCode();
		if (getPageCountMode() != null) {
			_hashCode += getPageCountMode().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ExecutionInfo2.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
				"ExecutionInfo2"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pageCountMode");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"PageCountMode"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"PageCountMode"));
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
