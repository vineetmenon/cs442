/**
 * ServerInfoHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

public class ServerInfoHeader implements java.io.Serializable {
	private java.lang.String reportServerVersionNumber;

	private java.lang.String reportServerEdition;

	private java.lang.String reportServerVersion;

	private java.lang.String reportServerDateTime;

	public ServerInfoHeader() {
	}

	public ServerInfoHeader(java.lang.String reportServerVersionNumber,
			java.lang.String reportServerEdition,
			java.lang.String reportServerVersion,
			java.lang.String reportServerDateTime) {
		this.reportServerVersionNumber = reportServerVersionNumber;
		this.reportServerEdition = reportServerEdition;
		this.reportServerVersion = reportServerVersion;
		this.reportServerDateTime = reportServerDateTime;
	}

	/**
	 * Gets the reportServerVersionNumber value for this ServerInfoHeader.
	 * 
	 * @return reportServerVersionNumber
	 */
	public java.lang.String getReportServerVersionNumber() {
		return reportServerVersionNumber;
	}

	/**
	 * Sets the reportServerVersionNumber value for this ServerInfoHeader.
	 * 
	 * @param reportServerVersionNumber
	 */
	public void setReportServerVersionNumber(
			java.lang.String reportServerVersionNumber) {
		this.reportServerVersionNumber = reportServerVersionNumber;
	}

	/**
	 * Gets the reportServerEdition value for this ServerInfoHeader.
	 * 
	 * @return reportServerEdition
	 */
	public java.lang.String getReportServerEdition() {
		return reportServerEdition;
	}

	/**
	 * Sets the reportServerEdition value for this ServerInfoHeader.
	 * 
	 * @param reportServerEdition
	 */
	public void setReportServerEdition(java.lang.String reportServerEdition) {
		this.reportServerEdition = reportServerEdition;
	}

	/**
	 * Gets the reportServerVersion value for this ServerInfoHeader.
	 * 
	 * @return reportServerVersion
	 */
	public java.lang.String getReportServerVersion() {
		return reportServerVersion;
	}

	/**
	 * Sets the reportServerVersion value for this ServerInfoHeader.
	 * 
	 * @param reportServerVersion
	 */
	public void setReportServerVersion(java.lang.String reportServerVersion) {
		this.reportServerVersion = reportServerVersion;
	}

	/**
	 * Gets the reportServerDateTime value for this ServerInfoHeader.
	 * 
	 * @return reportServerDateTime
	 */
	public java.lang.String getReportServerDateTime() {
		return reportServerDateTime;
	}

	/**
	 * Sets the reportServerDateTime value for this ServerInfoHeader.
	 * 
	 * @param reportServerDateTime
	 */
	public void setReportServerDateTime(java.lang.String reportServerDateTime) {
		this.reportServerDateTime = reportServerDateTime;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ServerInfoHeader))
			return false;
		ServerInfoHeader other = (ServerInfoHeader) obj;
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
				&& ((this.reportServerVersionNumber == null && other
						.getReportServerVersionNumber() == null) || (this.reportServerVersionNumber != null && this.reportServerVersionNumber
						.equals(other.getReportServerVersionNumber())))
				&& ((this.reportServerEdition == null && other
						.getReportServerEdition() == null) || (this.reportServerEdition != null && this.reportServerEdition
						.equals(other.getReportServerEdition())))
				&& ((this.reportServerVersion == null && other
						.getReportServerVersion() == null) || (this.reportServerVersion != null && this.reportServerVersion
						.equals(other.getReportServerVersion())))
				&& ((this.reportServerDateTime == null && other
						.getReportServerDateTime() == null) || (this.reportServerDateTime != null && this.reportServerDateTime
						.equals(other.getReportServerDateTime())));
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
		if (getReportServerVersionNumber() != null) {
			_hashCode += getReportServerVersionNumber().hashCode();
		}
		if (getReportServerEdition() != null) {
			_hashCode += getReportServerEdition().hashCode();
		}
		if (getReportServerVersion() != null) {
			_hashCode += getReportServerVersion().hashCode();
		}
		if (getReportServerDateTime() != null) {
			_hashCode += getReportServerDateTime().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ServerInfoHeader.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
				"ServerInfoHeader"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("reportServerVersionNumber");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"ReportServerVersionNumber"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("reportServerEdition");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"ReportServerEdition"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("reportServerVersion");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"ReportServerVersion"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("reportServerDateTime");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"ReportServerDateTime"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
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
