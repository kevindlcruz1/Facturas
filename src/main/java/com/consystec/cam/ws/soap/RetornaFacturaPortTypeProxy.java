package com.consystec.cam.ws.soap;

public class RetornaFacturaPortTypeProxy implements com.consystec.cam.ws.soap.RetornaFacturaPortType {
  private String _endpoint = null;
  private com.consystec.cam.ws.soap.RetornaFacturaPortType retornaFacturaPortType = null;
  
  public RetornaFacturaPortTypeProxy() {
    _initRetornaFacturaPortTypeProxy();
  }
  
  public RetornaFacturaPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initRetornaFacturaPortTypeProxy();
  }
  
  private void _initRetornaFacturaPortTypeProxy() {
    try {
      retornaFacturaPortType = (new com.consystec.cam.ws.soap.RetornaFacturaLocator()).getRetornaFacturaPortTypePort();
      if (retornaFacturaPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)retornaFacturaPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)retornaFacturaPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (retornaFacturaPortType != null)
      ((javax.xml.rpc.Stub)retornaFacturaPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.consystec.cam.ws.soap.RetornaFacturaPortType getRetornaFacturaPortType() {
    if (retornaFacturaPortType == null)
      _initRetornaFacturaPortTypeProxy();
    return retornaFacturaPortType;
  }
  
  public com.consystec.cam.ws.soap.ProcessLog generar(java.lang.String country_code, double id_doc, java.lang.String xml_data) throws java.rmi.RemoteException{
    if (retornaFacturaPortType == null)
      _initRetornaFacturaPortTypeProxy();
    return retornaFacturaPortType.generar(country_code, id_doc, xml_data);
  }
  
  
}