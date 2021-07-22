/**
 * ProcessLog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.consystec.cam.ws.soap;

public class ProcessLog  implements java.io.Serializable {
    private java.lang.String cod_error;

    private java.lang.String des_error_tecnico;

    private java.lang.String des_error_usuario;

    private java.lang.String resultado;

    private java.lang.String ruta_pdf;

    public ProcessLog() {
    }

    public ProcessLog(
           java.lang.String cod_error,
           java.lang.String des_error_tecnico,
           java.lang.String des_error_usuario,
           java.lang.String resultado,
           java.lang.String ruta_pdf) {
           this.cod_error = cod_error;
           this.des_error_tecnico = des_error_tecnico;
           this.des_error_usuario = des_error_usuario;
           this.resultado = resultado;
           this.ruta_pdf = ruta_pdf;
    }


    /**
     * Gets the cod_error value for this ProcessLog.
     * 
     * @return cod_error
     */
    public java.lang.String getCod_error() {
        return cod_error;
    }


    /**
     * Sets the cod_error value for this ProcessLog.
     * 
     * @param cod_error
     */
    public void setCod_error(java.lang.String cod_error) {
        this.cod_error = cod_error;
    }


    /**
     * Gets the des_error_tecnico value for this ProcessLog.
     * 
     * @return des_error_tecnico
     */
    public java.lang.String getDes_error_tecnico() {
        return des_error_tecnico;
    }


    /**
     * Sets the des_error_tecnico value for this ProcessLog.
     * 
     * @param des_error_tecnico
     */
    public void setDes_error_tecnico(java.lang.String des_error_tecnico) {
        this.des_error_tecnico = des_error_tecnico;
    }


    /**
     * Gets the des_error_usuario value for this ProcessLog.
     * 
     * @return des_error_usuario
     */
    public java.lang.String getDes_error_usuario() {
        return des_error_usuario;
    }


    /**
     * Sets the des_error_usuario value for this ProcessLog.
     * 
     * @param des_error_usuario
     */
    public void setDes_error_usuario(java.lang.String des_error_usuario) {
        this.des_error_usuario = des_error_usuario;
    }


    /**
     * Gets the resultado value for this ProcessLog.
     * 
     * @return resultado
     */
    public java.lang.String getResultado() {
        return resultado;
    }


    /**
     * Sets the resultado value for this ProcessLog.
     * 
     * @param resultado
     */
    public void setResultado(java.lang.String resultado) {
        this.resultado = resultado;
    }


    /**
     * Gets the ruta_pdf value for this ProcessLog.
     * 
     * @return ruta_pdf
     */
    public java.lang.String getRuta_pdf() {
        return ruta_pdf;
    }


    /**
     * Sets the ruta_pdf value for this ProcessLog.
     * 
     * @param ruta_pdf
     */
    public void setRuta_pdf(java.lang.String ruta_pdf) {
        this.ruta_pdf = ruta_pdf;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessLog)) return false;
        ProcessLog other = (ProcessLog) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cod_error==null && other.getCod_error()==null) || 
             (this.cod_error!=null &&
              this.cod_error.equals(other.getCod_error()))) &&
            ((this.des_error_tecnico==null && other.getDes_error_tecnico()==null) || 
             (this.des_error_tecnico!=null &&
              this.des_error_tecnico.equals(other.getDes_error_tecnico()))) &&
            ((this.des_error_usuario==null && other.getDes_error_usuario()==null) || 
             (this.des_error_usuario!=null &&
              this.des_error_usuario.equals(other.getDes_error_usuario()))) &&
            ((this.resultado==null && other.getResultado()==null) || 
             (this.resultado!=null &&
              this.resultado.equals(other.getResultado()))) &&
            ((this.ruta_pdf==null && other.getRuta_pdf()==null) || 
             (this.ruta_pdf!=null &&
              this.ruta_pdf.equals(other.getRuta_pdf())));
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
        if (getCod_error() != null) {
            _hashCode += getCod_error().hashCode();
        }
        if (getDes_error_tecnico() != null) {
            _hashCode += getDes_error_tecnico().hashCode();
        }
        if (getDes_error_usuario() != null) {
            _hashCode += getDes_error_usuario().hashCode();
        }
        if (getResultado() != null) {
            _hashCode += getResultado().hashCode();
        }
        if (getRuta_pdf() != null) {
            _hashCode += getRuta_pdf().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessLog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.ws.cam.consystec.com/", "processLog"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cod_error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cod_error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("des_error_tecnico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "des_error_tecnico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("des_error_usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "des_error_usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruta_pdf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ruta_pdf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
