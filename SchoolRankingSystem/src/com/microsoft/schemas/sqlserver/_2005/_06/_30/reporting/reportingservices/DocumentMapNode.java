/**
 * DocumentMapNode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

public class DocumentMapNode implements java.io.Serializable {
	private java.lang.String label;

	private java.lang.String uniqueName;

	private com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.DocumentMapNode[] children;

	public DocumentMapNode() {
	}

	public DocumentMapNode(
			java.lang.String label,
			java.lang.String uniqueName,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.DocumentMapNode[] children) {
		this.label = label;
		this.uniqueName = uniqueName;
		this.children = children;
	}

	/**
	 * Gets the label value for this DocumentMapNode.
	 * 
	 * @return label
	 */
	public java.lang.String getLabel() {
		return label;
	}

	/**
	 * Sets the label value for this DocumentMapNode.
	 * 
	 * @param label
	 */
	public void setLabel(java.lang.String label) {
		this.label = label;
	}

	/**
	 * Gets the uniqueName value for this DocumentMapNode.
	 * 
	 * @return uniqueName
	 */
	public java.lang.String getUniqueName() {
		return uniqueName;
	}

	/**
	 * Sets the uniqueName value for this DocumentMapNode.
	 * 
	 * @param uniqueName
	 */
	public void setUniqueName(java.lang.String uniqueName) {
		this.uniqueName = uniqueName;
	}

	/**
	 * Gets the children value for this DocumentMapNode.
	 * 
	 * @return children
	 */
	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.DocumentMapNode[] getChildren() {
		return children;
	}

	/**
	 * Sets the children value for this DocumentMapNode.
	 * 
	 * @param children
	 */
	public void setChildren(
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.DocumentMapNode[] children) {
		this.children = children;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DocumentMapNode))
			return false;
		DocumentMapNode other = (DocumentMapNode) obj;
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
				&& ((this.label == null && other.getLabel() == null) || (this.label != null && this.label
						.equals(other.getLabel())))
				&& ((this.uniqueName == null && other.getUniqueName() == null) || (this.uniqueName != null && this.uniqueName
						.equals(other.getUniqueName())))
				&& ((this.children == null && other.getChildren() == null) || (this.children != null && java.util.Arrays
						.equals(this.children, other.getChildren())));
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
		if (getLabel() != null) {
			_hashCode += getLabel().hashCode();
		}
		if (getUniqueName() != null) {
			_hashCode += getUniqueName().hashCode();
		}
		if (getChildren() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getChildren()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getChildren(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			DocumentMapNode.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
				"DocumentMapNode"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("uniqueName");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"UniqueName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("children");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"Children"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"DocumentMapNode"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField
				.setItemQName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"DocumentMapNode"));
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
