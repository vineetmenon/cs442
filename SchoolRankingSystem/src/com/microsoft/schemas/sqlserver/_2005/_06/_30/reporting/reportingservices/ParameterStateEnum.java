/**
 * ParameterStateEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

public class ParameterStateEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ParameterStateEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _HasValidValue = "HasValidValue";
    public static final java.lang.String _MissingValidValue = "MissingValidValue";
    public static final java.lang.String _HasOutstandingDependencies = "HasOutstandingDependencies";
    public static final java.lang.String _DynamicValuesUnavailable = "DynamicValuesUnavailable";
    public static final ParameterStateEnum HasValidValue = new ParameterStateEnum(_HasValidValue);
    public static final ParameterStateEnum MissingValidValue = new ParameterStateEnum(_MissingValidValue);
    public static final ParameterStateEnum HasOutstandingDependencies = new ParameterStateEnum(_HasOutstandingDependencies);
    public static final ParameterStateEnum DynamicValuesUnavailable = new ParameterStateEnum(_DynamicValuesUnavailable);
    public java.lang.String getValue() { return _value_;}
    public static ParameterStateEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ParameterStateEnum enumeration = (ParameterStateEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ParameterStateEnum fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParameterStateEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices", "ParameterStateEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
