/**
 * ReportExecutionServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

public class ReportExecutionServiceLocator extends
		org.apache.axis.client.Service
		implements
		com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportExecutionService {

	/**
	 * The Reporting Services Execution Service enables report execution
	 */

	public ReportExecutionServiceLocator() {
	}

	public ReportExecutionServiceLocator(
			org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public ReportExecutionServiceLocator(java.lang.String wsdlLoc,
			javax.xml.namespace.QName sName)
			throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for ReportExecutionServiceSoap
	private java.lang.String ReportExecutionServiceSoap_address = "http://ravir-mac-w8:80/ReportServer_SQLEXPRESS/ReportExecution2005.asmx";

	public java.lang.String getReportExecutionServiceSoapAddress() {
		return ReportExecutionServiceSoap_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String ReportExecutionServiceSoapWSDDServiceName = "ReportExecutionServiceSoap";

	public java.lang.String getReportExecutionServiceSoapWSDDServiceName() {
		return ReportExecutionServiceSoapWSDDServiceName;
	}

	public void setReportExecutionServiceSoapWSDDServiceName(
			java.lang.String name) {
		ReportExecutionServiceSoapWSDDServiceName = name;
	}

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportExecutionServiceSoap getReportExecutionServiceSoap()
			throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(ReportExecutionServiceSoap_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getReportExecutionServiceSoap(endpoint);
	}

	public com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportExecutionServiceSoap getReportExecutionServiceSoap(
			java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
		try {
			com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportExecutionServiceSoapStub _stub = new com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportExecutionServiceSoapStub(
					portAddress, this);
			_stub.setPortName(getReportExecutionServiceSoapWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setReportExecutionServiceSoapEndpointAddress(
			java.lang.String address) {
		ReportExecutionServiceSoap_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		try {
			if (com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportExecutionServiceSoap.class
					.isAssignableFrom(serviceEndpointInterface)) {
				com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportExecutionServiceSoapStub _stub = new com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices.ReportExecutionServiceSoapStub(
						new java.net.URL(ReportExecutionServiceSoap_address),
						this);
				_stub.setPortName(getReportExecutionServiceSoapWSDDServiceName());
				return _stub;
			}
		} catch (java.lang.Throwable t) {
			throw new javax.xml.rpc.ServiceException(t);
		}
		throw new javax.xml.rpc.ServiceException(
				"There is no stub implementation for the interface:  "
						+ (serviceEndpointInterface == null ? "null"
								: serviceEndpointInterface.getName()));
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(javax.xml.namespace.QName portName,
			Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		if (portName == null) {
			return getPort(serviceEndpointInterface);
		}
		java.lang.String inputPortName = portName.getLocalPart();
		if ("ReportExecutionServiceSoap".equals(inputPortName)) {
			return getReportExecutionServiceSoap();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName(
				"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
				"ReportExecutionService");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName(
					"http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices",
					"ReportExecutionServiceSoap"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName,
			java.lang.String address) throws javax.xml.rpc.ServiceException {

		if ("ReportExecutionServiceSoap".equals(portName)) {
			setReportExecutionServiceSoapEndpointAddress(address);
		} else { // Unknown Port Name
			throw new javax.xml.rpc.ServiceException(
					" Cannot set Endpoint Address for Unknown Port" + portName);
		}
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(javax.xml.namespace.QName portName,
			java.lang.String address) throws javax.xml.rpc.ServiceException {
		setEndpointAddress(portName.getLocalPart(), address);
	}

}
