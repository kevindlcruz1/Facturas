package com.qitcorp.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

//import com.qitcorp.model.CBParametrosModel;
import com.qitcorp.model.TcFacturasVantiveModel;

public class Tools {

	private static Logger logger = Logger.getLogger(Tools.class);

	public static final String obtenerFacturasVantive = "select TCFACTURASCABID, SERIE_FAC, NO_FAC, ACCOUNT_NO, TECUENTAID,"
			+ "  SWCUSTOMERID, FECHA_EMISION, USUARIO_EMISION, ESTADO, NIT, NOMBRE, DIRECCION, TIPO_FAC, TIPO_PAGO, EMISOR_PAGO,"
			+ "  ID_PAGO, REFERENCIA_PAGO, MONTO_PAGADO, MONTO_FACTURA, SWDATECREATED, SWCREATEDBY, TIMESTAMP, COD_ELEMENTOID,"
			+ "  TENUMSCONTRID, BILL_REF_NO, BILL_REF_RESETS, ID_RELACIONADO, TIPO_ID_RELACIONADO, INTENTOS, DEPARTAMENTO, MUNICIPIO,"
			+ "  FEC_VENCIMIENTO, TCGFACTURAID, TCCORTECAJAID, TESALMACENESINVID, DISTRIBUIDOR, PUNTO_VENTA, VENDEDOR, DES_ESTATUSTRIB,"
			+ "  CREDITO_FISCAL, GIRO, NUMERO_IVA, DESCUENTO, LIQUIDADO_COBROS, FECHA_LIQ_COBROS, MONTO_FINAL, TCRETENCIONID, VALOR_RETENCION,"
			+ "  ENVIO_RI, FACTURA_PROCESADA, CONTRIBUCION_SEG FROM tc_facturas_vantive_vw ";

	// Obtener parametro para WS
	/*
	 * public static String obtenerParametro(String parametro,
	 * List<TcFacturasVantiveModel> parametros) {
	 * 
	 * if (parametros != null && parametros.size() > 0) { for
	 * (TcFacturasVantiveModel item : parametros) { if
	 * (item.getObjeto().equals(parametro)) {
	 * logger.info("OBJETO => "+item.getObjeto()+" - VALOR OBJETO1 => "+item.
	 * getValorObjeto1()); return item.getValorObjeto1(); } } } else { return ""; }
	 * 
	 * return ""; }
	 */

	public static final String FACCURAS_VANTIVE_SP = "{CALL SWBAPPS.TCG_FNC_WS_PKG.WS_CREA_DOC1_PRO(?,?,?,?,?)}";

	public static String loadFile(String propertie) {
		Properties pp = new Properties();
		String propValue = null;
		logger.debug("loadFile() - obtener propertie : " + propertie);
		try {
			pp.load(new FileReader(Constants.facturasVantive));
			propValue = pp.getProperty(propertie);
		} catch (IOException e) {
			logger.debug("LoadFile() - Error ", e);
		}
		logger.debug("loadFile() - " + propertie + " : " + propValue);
		return propValue.trim();
	}

}
