/**
 * Extension.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

public class Extension  implements java.io.Serializable {
    private com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExtensionTypeEnum extensionType;

    private java.lang.String name;

    private java.lang.String localizedName;

    private boolean visible;

    private boolean isModelGenerationSupported;

    public Extension() {
    }

    public Extension(
           com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExtensionTypeEnum extensionType,
           java.lang.String name,
           java.lang.String localizedName,
           boolean visible,
           boolean isModelGenerationSupported) {
           this.extensionType = extensionType;
           this.name = name;
           this.localizedName = localizedName;
           this.visible = visible;
           this.isModelGenerationSupported = isModelGenerationSupported;
    }


    /**
     * Gets the extensionType value for this Extension.
     * 
     * @return extensionType
     */
    public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExtensionTypeEnum getExtensionType() {
        return extensionType;
    }


    /**
     * Sets the extensionType value for this Extension.
     * 
     * @param extensionType
     */
    public void setExtensionType(com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ExtensionTypeEnum extensionType) {
        this.extensionType = extensionType;
    }


    /**
     * Gets the name value for this Extension.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Extension.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the localizedName value for this Extension.
     * 
     * @return localizedName
     */
    public java.lang.String getLocalizedName() {
        return localizedName;
    }


    /**
     * Sets the localizedName value for this Extension.
     * 
     * @param localizedName
     */
    public void setLocalizedName(java.lang.String localizedName) {
        this.localizedName = localizedName;
    }


    /**
     * Gets the visible value for this Extension.
     * 
     * @return visible
     */
    public boolean isVisible() {
        return visible;
    }


    /**
     * Sets the visible value for this Extension.
     * 
     * @param visible
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }


    /**
     * Gets the isModelGenerationSupported value for this Extension.
     * 
     * @return isModelGenerationSupported
     */
    public boolean isIsModelGenerationSupported() {
        return isModelGenerationSupported;
    }


    /**
     * Sets the isModelGenerationSupported value for this Extension.
     * 
     * @param isModelGenerationSupported
     */
    public void setIsModelGenerationSupported(boolean isModelGenerationSupported) {
        this.isModelGenerationSupported = isModelGenerationSupported;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Extension)) return false;
        Extension other = (Extension) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.extensionType==null && other.getExtensionType()==null) || 
             (this.extensionType!=null &&
              this.extensionType.equals(other.getExtensionType()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.localizedName==null && other.getLocalizedName()==null) || 
             (this.localizedName!=null &&
              this.localizedName.equals(other.getLocalizedName()))) &&
            this.visible == other.isVisible() &&
            this.isModelGenerationSupported == other.isIsModelGenerationSupported();
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
        if (getExtensionType() != null) {
            _hashCode += getExtensionType().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getLocalizedName() != null) {
            _hashCode += getLocalizedName().hashCode();
        }
        _hashCode += (isVisible() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsModelGenerationSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Extension.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices", "Extension"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices", "ExtensionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices", "ExtensionTypeEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizedName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices", "LocalizedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices", "Visible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isModelGenerationSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices", "IsModelGenerationSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
