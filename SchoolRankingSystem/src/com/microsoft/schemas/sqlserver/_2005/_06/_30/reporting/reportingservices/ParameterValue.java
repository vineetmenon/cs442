/**
 * ParameterValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

public class ParameterValue
		extends
		com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ParameterValueOrFieldReference
		implements java.io.Serializable {
	private java.lang.String name;

	private java.lang.String value;

	private java.lang.String label;

	public ParameterValue() {
	}

	public ParameterValue(java.lang.String name, java.lang.String value,
			java.lang.String label) {
		this.name = name;
		this.value = value;
		this.label = label;
	}

	/**
	 * Gets the name value for this ParameterValue.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this ParameterValue.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the value value for this ParameterValue.
	 * 
	 * @return value
	 */
	public java.lang.String getValue() {
		return value;
	}

	/**
	 * Sets the value value for this ParameterValue.
	 * 
	 * @param value
	 */
	public void setValue(java.lang.String value) {
		this.value = value;
	}

	/**
	 * Gets the label value for this ParameterValue.
	 * 
	 * @return label
	 */
	public java.lang.String getLabel() {
		return label;
	}

	/**
	 * Sets the label value for this ParameterValue.
	 * 
	 * @param label
	 */
	public void setLabel(java.lang.String label) {
		this.label = label;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ParameterValue))
			return false;
		ParameterValue other = (ParameterValue) obj;
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
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.value == null && other.getValue() == null) || (this.value != null && this.value
						.equals(other.getValue())))
				&& ((this.label == null && other.getLabel() == null) || (this.label != null && this.label
						.equals(other.getLabel())));
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
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getValue() != null) {
			_hashCode += getValue().hashCode();
		}
		if (getLabel() != null) {
			_hashCode += getLabel().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ParameterValue.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
				"ParameterValue"));
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
		elemField.setFieldName("value");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"Value"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("label");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"Label"));
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
