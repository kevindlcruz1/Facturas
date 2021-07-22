package com.qitcorp.controller;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

import org.apache.axis.AxisFault;
import org.apache.log4j.Logger;

import com.consystec.cam.ws.soap.RetornaFacturaLocator;
import com.consystec.cam.ws.soap.RetornaFacturaPortType;
import com.consystec.cam.ws.soap.RetornaFacturaPortTypePortBindingStub;
import com.qitcorp.dao.ProcesoFacturasDao;
import com.qitcorp.model.CBHistorialAccionModel;
import com.qitcorp.model.TcFacturasVantiveModel;
import com.qitcorp.util.Tools;




public class ProcesoFacturasController {
	private static final Logger logger = Logger.getLogger("log4j.properties");

	
	
	public String requestWsFacturasVantive(List<TcFacturasVantiveModel> parametros, TcFacturasVantiveModel historial) {
		RetornaFacturaLocator servicio = new RetornaFacturaLocator();
		RetornaFacturaPortType wsExec;

		try {
			wsExec = new RetornaFacturaPortTypePortBindingStub(new URL(servicio.getRetornaFacturaPortTypePortAddress()), servicio);
			
			//Se valida si los 3 campos telefono traen valor o vienen null
			int BILL_REF_NO =  obtieneBILL_REF_NO (historial);

			logger.info("Parametros request => TIPOLOGIAGACID: "+Tools.obtenerParametro("TIPOLOGIAGACID", parametros));
			
			String response = wsExec.crearCasoCerrado(	Tools.obtenerParametro("TIPOLOGIAGACID", parametros));	
			
			logger.info("Respuesta de WS CrearCasoCerrado: "+response);
			return response;
		} catch (AxisFault e) {
			logger.error("AxisError => ", e);
		} catch (MalformedURLException e) {
			logger.error("MalformedURLException => ", e);
		} catch (RemoteException e) {
			logger.error("RemoteException => ", e);
		} catch (Exception e) {
			logger.error("General error => ", e);
		}
		
		return null;
	}
	public void startProcessFactura() {
		ProcesoFacturasDao objDao = new ProcesoFacturasDao();
		List<TcFacturasVantiveModel> list = objDao.obtenerFacturasVantive();

		if (list != null && list.size() > 0) {
			List<TcFacturasVantiveModel> parametros = ProcesoFacturasDao.obtenerFacturasVantive();
			Iterator<TcFacturasVantiveModel> iterator = list.iterator();
			while (iterator.hasNext()) {
				TcFacturasVantiveModel facturas = iterator.next();
				String response = procesaWSPagosCreaCasos(parametros, facturas);
				logger.info("OBJETO FACTURAS: " + facturas.getBILL_REF_NO());
				logger.info("Resultado de consumo: "+response);

				//obtenerFacturasVantive(parametros);
			}
		} else {
			logger.warn("Lista de acciones vacia");
		}

	}
	 
		public String procesaWSPagosCreaCasos(List<TcFacturasVantiveModel> parametros,
				TcFacturasVantiveModel historial) {
			
			String result = ProcesoFacturasDao.ejecutaApldesRecargaSP(historial.getTCFACTURASCABID());
			logger.info("[ProcesoFacturas] Ejecuta SP para id => "
			+ historial.getTCFACTURASCABID() + " Resultado => " + result);	
			
			
			return result;
		}
		
		public int obtieneBILL_REF_NO(TcFacturasVantiveModel historial) {
			if(historial.getBILL_REF_NO() != null) {
				return historial.getTelefonoBanco();
			} else if(historial.getTelefonoTelca()!= null) {
				return historial.getTelefonoTelca();
			} else if(historial.getTelefono()!= null) {
				return historial.getTelefono();
			} else {
				return 0;
			}
		}

		

}
