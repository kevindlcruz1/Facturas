/**
 * RetornaFacturaPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.consystec.cam.ws.soap;

public interface RetornaFacturaPortType extends java.rmi.Remote {
    public com.consystec.cam.ws.soap.ProcessLog generar(java.lang.String country_code, double id_doc, java.lang.String xml_data) throws java.rmi.RemoteException;
}
