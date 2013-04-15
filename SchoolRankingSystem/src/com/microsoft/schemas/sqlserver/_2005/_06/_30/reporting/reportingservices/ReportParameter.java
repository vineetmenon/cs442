/**
 * ReportParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

public class ReportParameter implements java.io.Serializable {
	private java.lang.String name;

	private com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ParameterTypeEnum type;

	private java.lang.Boolean nullable;

	private java.lang.Boolean allowBlank;

	private java.lang.Boolean multiValue;

	private java.lang.Boolean queryParameter;

	private java.lang.String prompt;

	private java.lang.Boolean promptUser;

	private java.lang.String[] dependencies;

	private java.lang.Boolean validValuesQueryBased;

	private com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ValidValue[] validValues;

	private java.lang.Boolean defaultValuesQueryBased;

	private java.lang.String[] defaultValues;

	private com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ParameterStateEnum state;

	private java.lang.String errorMessage;

	public ReportParameter() {
	}

	public ReportParameter(
			java.lang.String name,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ParameterTypeEnum type,
			java.lang.Boolean nullable,
			java.lang.Boolean allowBlank,
			java.lang.Boolean multiValue,
			java.lang.Boolean queryParameter,
			java.lang.String prompt,
			java.lang.Boolean promptUser,
			java.lang.String[] dependencies,
			java.lang.Boolean validValuesQueryBased,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ValidValue[] validValues,
			java.lang.Boolean defaultValuesQueryBased,
			java.lang.String[] defaultValues,
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ParameterStateEnum state,
			java.lang.String errorMessage) {
		this.name = name;
		this.type = type;
		this.nullable = nullable;
		this.allowBlank = allowBlank;
		this.multiValue = multiValue;
		this.queryParameter = queryParameter;
		this.prompt = prompt;
		this.promptUser = promptUser;
		this.dependencies = dependencies;
		this.validValuesQueryBased = validValuesQueryBased;
		this.validValues = validValues;
		this.defaultValuesQueryBased = defaultValuesQueryBased;
		this.defaultValues = defaultValues;
		this.state = state;
		this.errorMessage = errorMessage;
	}

	/**
	 * Gets the name value for this ReportParameter.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this ReportParameter.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the type value for this ReportParameter.
	 * 
	 * @return type
	 */
	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ParameterTypeEnum getType() {
		return type;
	}

	/**
	 * Sets the type value for this ReportParameter.
	 * 
	 * @param type
	 */
	public void setType(
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ParameterTypeEnum type) {
		this.type = type;
	}

	/**
	 * Gets the nullable value for this ReportParameter.
	 * 
	 * @return nullable
	 */
	public java.lang.Boolean getNullable() {
		return nullable;
	}

	/**
	 * Sets the nullable value for this ReportParameter.
	 * 
	 * @param nullable
	 */
	public void setNullable(java.lang.Boolean nullable) {
		this.nullable = nullable;
	}

	/**
	 * Gets the allowBlank value for this ReportParameter.
	 * 
	 * @return allowBlank
	 */
	public java.lang.Boolean getAllowBlank() {
		return allowBlank;
	}

	/**
	 * Sets the allowBlank value for this ReportParameter.
	 * 
	 * @param allowBlank
	 */
	public void setAllowBlank(java.lang.Boolean allowBlank) {
		this.allowBlank = allowBlank;
	}

	/**
	 * Gets the multiValue value for this ReportParameter.
	 * 
	 * @return multiValue
	 */
	public java.lang.Boolean getMultiValue() {
		return multiValue;
	}

	/**
	 * Sets the multiValue value for this ReportParameter.
	 * 
	 * @param multiValue
	 */
	public void setMultiValue(java.lang.Boolean multiValue) {
		this.multiValue = multiValue;
	}

	/**
	 * Gets the queryParameter value for this ReportParameter.
	 * 
	 * @return queryParameter
	 */
	public java.lang.Boolean getQueryParameter() {
		return queryParameter;
	}

	/**
	 * Sets the queryParameter value for this ReportParameter.
	 * 
	 * @param queryParameter
	 */
	public void setQueryParameter(java.lang.Boolean queryParameter) {
		this.queryParameter = queryParameter;
	}

	/**
	 * Gets the prompt value for this ReportParameter.
	 * 
	 * @return prompt
	 */
	public java.lang.String getPrompt() {
		return prompt;
	}

	/**
	 * Sets the prompt value for this ReportParameter.
	 * 
	 * @param prompt
	 */
	public void setPrompt(java.lang.String prompt) {
		this.prompt = prompt;
	}

	/**
	 * Gets the promptUser value for this ReportParameter.
	 * 
	 * @return promptUser
	 */
	public java.lang.Boolean getPromptUser() {
		return promptUser;
	}

	/**
	 * Sets the promptUser value for this ReportParameter.
	 * 
	 * @param promptUser
	 */
	public void setPromptUser(java.lang.Boolean promptUser) {
		this.promptUser = promptUser;
	}

	/**
	 * Gets the dependencies value for this ReportParameter.
	 * 
	 * @return dependencies
	 */
	public java.lang.String[] getDependencies() {
		return dependencies;
	}

	/**
	 * Sets the dependencies value for this ReportParameter.
	 * 
	 * @param dependencies
	 */
	public void setDependencies(java.lang.String[] dependencies) {
		this.dependencies = dependencies;
	}

	/**
	 * Gets the validValuesQueryBased value for this ReportParameter.
	 * 
	 * @return validValuesQueryBased
	 */
	public java.lang.Boolean getValidValuesQueryBased() {
		return validValuesQueryBased;
	}

	/**
	 * Sets the validValuesQueryBased value for this ReportParameter.
	 * 
	 * @param validValuesQueryBased
	 */
	public void setValidValuesQueryBased(java.lang.Boolean validValuesQueryBased) {
		this.validValuesQueryBased = validValuesQueryBased;
	}

	/**
	 * Gets the validValues value for this ReportParameter.
	 * 
	 * @return validValues
	 */
	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ValidValue[] getValidValues() {
		return validValues;
	}

	/**
	 * Sets the validValues value for this ReportParameter.
	 * 
	 * @param validValues
	 */
	public void setValidValues(
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ValidValue[] validValues) {
		this.validValues = validValues;
	}

	/**
	 * Gets the defaultValuesQueryBased value for this ReportParameter.
	 * 
	 * @return defaultValuesQueryBased
	 */
	public java.lang.Boolean getDefaultValuesQueryBased() {
		return defaultValuesQueryBased;
	}

	/**
	 * Sets the defaultValuesQueryBased value for this ReportParameter.
	 * 
	 * @param defaultValuesQueryBased
	 */
	public void setDefaultValuesQueryBased(
			java.lang.Boolean defaultValuesQueryBased) {
		this.defaultValuesQueryBased = defaultValuesQueryBased;
	}

	/**
	 * Gets the defaultValues value for this ReportParameter.
	 * 
	 * @return defaultValues
	 */
	public java.lang.String[] getDefaultValues() {
		return defaultValues;
	}

	/**
	 * Sets the defaultValues value for this ReportParameter.
	 * 
	 * @param defaultValues
	 */
	public void setDefaultValues(java.lang.String[] defaultValues) {
		this.defaultValues = defaultValues;
	}

	/**
	 * Gets the state value for this ReportParameter.
	 * 
	 * @return state
	 */
	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ParameterStateEnum getState() {
		return state;
	}

	/**
	 * Sets the state value for this ReportParameter.
	 * 
	 * @param state
	 */
	public void setState(
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ParameterStateEnum state) {
		this.state = state;
	}

	/**
	 * Gets the errorMessage value for this ReportParameter.
	 * 
	 * @return errorMessage
	 */
	public java.lang.String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * Sets the errorMessage value for this ReportParameter.
	 * 
	 * @param errorMessage
	 */
	public void setErrorMessage(java.lang.String errorMessage) {
		this.errorMessage = errorMessage;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ReportParameter))
			return false;
		ReportParameter other = (ReportParameter) obj;
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
				&& ((this.type == null && other.getType() == null) || (this.type != null && this.type
						.equals(other.getType())))
				&& ((this.nullable == null && other.getNullable() == null) || (this.nullable != null && this.nullable
						.equals(other.getNullable())))
				&& ((this.allowBlank == null && other.getAllowBlank() == null) || (this.allowBlank != null && this.allowBlank
						.equals(other.getAllowBlank())))
				&& ((this.multiValue == null && other.getMultiValue() == null) || (this.multiValue != null && this.multiValue
						.equals(other.getMultiValue())))
				&& ((this.queryParameter == null && other.getQueryParameter() == null) || (this.queryParameter != null && this.queryParameter
						.equals(other.getQueryParameter())))
				&& ((this.prompt == null && other.getPrompt() == null) || (this.prompt != null && this.prompt
						.equals(other.getPrompt())))
				&& ((this.promptUser == null && other.getPromptUser() == null) || (this.promptUser != null && this.promptUser
						.equals(other.getPromptUser())))
				&& ((this.dependencies == null && other.getDependencies() == null) || (this.dependencies != null && java.util.Arrays
						.equals(this.dependencies, other.getDependencies())))
				&& ((this.validValuesQueryBased == null && other
						.getValidValuesQueryBased() == null) || (this.validValuesQueryBased != null && this.validValuesQueryBased
						.equals(other.getValidValuesQueryBased())))
				&& ((this.validValues == null && other.getValidValues() == null) || (this.validValues != null && java.util.Arrays
						.equals(this.validValues, other.getValidValues())))
				&& ((this.defaultValuesQueryBased == null && other
						.getDefaultValuesQueryBased() == null) || (this.defaultValuesQueryBased != null && this.defaultValuesQueryBased
						.equals(other.getDefaultValuesQueryBased())))
				&& ((this.defaultValues == null && other.getDefaultValues() == null) || (this.defaultValues != null && java.util.Arrays
						.equals(this.defaultValues, other.getDefaultValues())))
				&& ((this.state == null && other.getState() == null) || (this.state != null && this.state
						.equals(other.getState())))
				&& ((this.errorMessage == null && other.getErrorMessage() == null) || (this.errorMessage != null && this.errorMessage
						.equals(other.getErrorMessage())));
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
		if (getType() != null) {
			_hashCode += getType().hashCode();
		}
		if (getNullable() != null) {
			_hashCode += getNullable().hashCode();
		}
		if (getAllowBlank() != null) {
			_hashCode += getAllowBlank().hashCode();
		}
		if (getMultiValue() != null) {
			_hashCode += getMultiValue().hashCode();
		}
		if (getQueryParameter() != null) {
			_hashCode += getQueryParameter().hashCode();
		}
		if (getPrompt() != null) {
			_hashCode += getPrompt().hashCode();
		}
		if (getPromptUser() != null) {
			_hashCode += getPromptUser().hashCode();
		}
		if (getDependencies() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDependencies()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDependencies(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getValidValuesQueryBased() != null) {
			_hashCode += getValidValuesQueryBased().hashCode();
		}
		if (getValidValues() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getValidValues()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getValidValues(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getDefaultValuesQueryBased() != null) {
			_hashCode += getDefaultValuesQueryBased().hashCode();
		}
		if (getDefaultValues() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDefaultValues()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDefaultValues(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getState() != null) {
			_hashCode += getState().hashCode();
		}
		if (getErrorMessage() != null) {
			_hashCode += getErrorMessage().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ReportParameter.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
				"ReportParameter"));
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
		elemField.setFieldName("type");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"Type"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"ParameterTypeEnum"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nullable");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"Nullable"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("allowBlank");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"AllowBlank"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("multiValue");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"MultiValue"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("queryParameter");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"QueryParameter"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("promptUser");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"PromptUser"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dependencies");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"Dependencies"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField
				.setItemQName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"Dependency"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("validValuesQueryBased");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"ValidValuesQueryBased"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("validValues");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"ValidValues"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"ValidValue"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField
				.setItemQName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"ValidValue"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("defaultValuesQueryBased");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"DefaultValuesQueryBased"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("defaultValues");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"DefaultValues"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField
				.setItemQName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"Value"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("state");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"State"));
		elemField
				.setXmlType(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"ParameterStateEnum"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("errorMessage");
		elemField
				.setXmlName(new javax.xml.namespace.QName(
						"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
						"ErrorMessage"));
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
