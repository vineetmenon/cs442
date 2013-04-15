/**
 * DataSourcePrompt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

public class DataSourcePrompt implements java.io.Serializable {
	private java.lang.String name;

	private java.lang.String dataSourceID;

	private java.lang.String prompt;

	public DataSourcePrompt() {
	}

	public DataSourcePrompt(java.lang.String name,
			java.lang.String dataSourceID, java.lang.String prompt) {
		this.name = name;
		this.dataSourceID = dataSourceID;
		this.prompt = prompt;
	}

	/**
	 * Gets the name value for this DataSourcePrompt.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this DataSourcePrompt.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the dataSourceID value for this DataSourcePrompt.
	 * 
	 * @return dataSourceID
	 */
	public java.lang.String getDataSourceID() {
		return dataSourceID;
	}

	/**
	 * Sets the dataSourceID value for this DataSourcePrompt.
	 * 
	 * @param dataSourceID
	 */
	public void setDataSourceID(java.lang.String dataSourceID) {
		this.dataSourceID = dataSourceID;
	}

	/**
	 * Gets the prompt value for this DataSourcePrompt.
	 * 
	 * @return prompt
	 */
	public java.lang.String getPrompt() {
		return prompt;
	}

	/**
	 * Sets the prompt value for this DataSourcePrompt.
	 * 
	 * @param prompt
	 */
	public void setPrompt(java.lang.String prompt) {
		this.prompt = prompt;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DataSourcePrompt))
			return false;
		DataSourcePrompt other = (DataSourcePrompt) obj;
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
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.dataSourceID == null && other.getDataSourceID() == null) || (this.dataSourceID != null && this.dataSourceID
						.equals(other.getDataSourceID())))
				&& ((this.prompt == null && other.getPrompt() == null) || (this.prompt != null && this.prompt
						.equals(other.getPrompt())));
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
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getDataSourceID() != null) {
			_hashCode += getDataSourceID().hashCode();
		}
		if (getPrompt() != null) {
			_hashCode += getPrompt().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			DataSourcePrompt.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
				"DataSourcePrompt"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"Name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dataSourceID");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"DataSourceID"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("prompt");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"Prompt"));
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
