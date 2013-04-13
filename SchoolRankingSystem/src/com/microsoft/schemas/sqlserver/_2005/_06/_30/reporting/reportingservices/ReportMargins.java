/**
 * ReportMargins.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

public class ReportMargins  implements java.io.Serializable {
    private double top;

    private double bottom;

    private double left;

    private double right;

    public ReportMargins() {
    }

    public ReportMargins(
           double top,
           double bottom,
           double left,
           double right) {
           this.top = top;
           this.bottom = bottom;
           this.left = left;
           this.right = right;
    }


    /**
     * Gets the top value for this ReportMargins.
     * 
     * @return top
     */
    public double getTop() {
        return top;
    }


    /**
     * Sets the top value for this ReportMargins.
     * 
     * @param top
     */
    public void setTop(double top) {
        this.top = top;
    }


    /**
     * Gets the bottom value for this ReportMargins.
     * 
     * @return bottom
     */
    public double getBottom() {
        return bottom;
    }


    /**
     * Sets the bottom value for this ReportMargins.
     * 
     * @param bottom
     */
    public void setBottom(double bottom) {
        this.bottom = bottom;
    }


    /**
     * Gets the left value for this ReportMargins.
     * 
     * @return left
     */
    public double getLeft() {
        return left;
    }


    /**
     * Sets the left value for this ReportMargins.
     * 
     * @param left
     */
    public void setLeft(double left) {
        this.left = left;
    }


    /**
     * Gets the right value for this ReportMargins.
     * 
     * @return right
     */
    public double getRight() {
        return right;
    }


    /**
     * Sets the right value for this ReportMargins.
     * 
     * @param right
     */
    public void setRight(double right) {
        this.right = right;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportMargins)) return false;
        ReportMargins other = (ReportMargins) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.top == other.getTop() &&
            this.bottom == other.getBottom() &&
            this.left == other.getLeft() &&
            this.right == other.getRight();
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
        _hashCode += new Double(getTop()).hashCode();
        _hashCode += new Double(getBottom()).hashCode();
        _hashCode += new Double(getLeft()).hashCode();
        _hashCode += new Double(getRight()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportMargins.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices", "ReportMargins"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("top");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices", "Top"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bottom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices", "Bottom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("left");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices", "Left"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("right");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices", "Right"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
