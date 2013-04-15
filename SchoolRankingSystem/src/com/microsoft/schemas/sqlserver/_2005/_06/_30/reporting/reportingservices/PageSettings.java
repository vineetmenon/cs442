/**
 * PageSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

public class PageSettings implements java.io.Serializable {
	private com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportPaperSize paperSize;

	private com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportMargins margins;

	public PageSettings() {
	}

	public PageSettings(
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportPaperSize paperSize,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportMargins margins) {
		this.paperSize = paperSize;
		this.margins = margins;
	}

	/**
	 * Gets the paperSize value for this PageSettings.
	 * 
	 * @return paperSize
	 */
	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportPaperSize getPaperSize() {
		return paperSize;
	}

	/**
	 * Sets the paperSize value for this PageSettings.
	 * 
	 * @param paperSize
	 */
	public void setPaperSize(
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportPaperSize paperSize) {
		this.paperSize = paperSize;
	}

	/**
	 * Gets the margins value for this PageSettings.
	 * 
	 * @return margins
	 */
	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportMargins getMargins() {
		return margins;
	}

	/**
	 * Sets the margins value for this PageSettings.
	 * 
	 * @param margins
	 */
	public void setMargins(
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportMargins margins) {
		this.margins = margins;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof PageSettings))
			return false;
		PageSettings other = (PageSettings) obj;
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
				&& ((this.paperSize == null && other.getPaperSize() == null) || (this.paperSize != null && this.paperSize
						.equals(other.getPaperSize())))
				&& ((this.margins == null && other.getMargins() == null) || (this.margins != null && this.margins
						.equals(other.getMargins())));
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
		if (getPaperSize() != null) {
			_hashCode += getPaperSize().hashCode();
		}
		if (getMargins() != null) {
			_hashCode += getMargins().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			PageSettings.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
				"PageSettings"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("paperSize");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"PaperSize"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"ReportPaperSize"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("margins");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"Margins"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"ReportMargins"));
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
