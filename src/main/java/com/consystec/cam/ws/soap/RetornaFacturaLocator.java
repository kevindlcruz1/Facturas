/**
 * RetornaFacturaLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.consystec.cam.ws.soap;

public class RetornaFacturaLocator extends org.apache.axis.client.Service implements com.consystec.cam.ws.soap.RetornaFactura {

    public RetornaFacturaLocator() {
    }


    public RetornaFacturaLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RetornaFacturaLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RetornaFacturaPortTypePort
    private java.lang.String RetornaFacturaPortTypePort_address = "http://10.231.128.139:7003/DOC1RetornaFactura/RetornaFactura";

    public java.lang.String getRetornaFacturaPortTypePortAddress() {
        return RetornaFacturaPortTypePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RetornaFacturaPortTypePortWSDDServiceName = "RetornaFacturaPortTypePort";

    public java.lang.String getRetornaFacturaPortTypePortWSDDServiceName() {
        return RetornaFacturaPortTypePortWSDDServiceName;
    }

    public void setRetornaFacturaPortTypePortWSDDServiceName(java.lang.String name) {
        RetornaFacturaPortTypePortWSDDServiceName = name;
    }

    public com.consystec.cam.ws.soap.RetornaFacturaPortType getRetornaFacturaPortTypePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RetornaFacturaPortTypePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRetornaFacturaPortTypePort(endpoint);
    }

    public com.consystec.cam.ws.soap.RetornaFacturaPortType getRetornaFacturaPortTypePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.consystec.cam.ws.soap.RetornaFacturaPortTypePortBindingStub _stub = new com.consystec.cam.ws.soap.RetornaFacturaPortTypePortBindingStub(portAddress, this);
            _stub.setPortName(getRetornaFacturaPortTypePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRetornaFacturaPortTypePortEndpointAddress(java.lang.String address) {
        RetornaFacturaPortTypePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.consystec.cam.ws.soap.RetornaFacturaPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.consystec.cam.ws.soap.RetornaFacturaPortTypePortBindingStub _stub = new com.consystec.cam.ws.soap.RetornaFacturaPortTypePortBindingStub(new java.net.URL(RetornaFacturaPortTypePort_address), this);
                _stub.setPortName(getRetornaFacturaPortTypePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("RetornaFacturaPortTypePort".equals(inputPortName)) {
            return getRetornaFacturaPortTypePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.ws.cam.consystec.com/", "RetornaFactura");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.ws.cam.consystec.com/", "RetornaFacturaPortTypePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RetornaFacturaPortTypePort".equals(portName)) {
            setRetornaFacturaPortTypePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
