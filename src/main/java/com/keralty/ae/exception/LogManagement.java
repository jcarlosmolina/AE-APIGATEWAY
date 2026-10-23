package com.keralty.ae.exception;

import org.apache.commons.lang3.exception.ExceptionUtils;

public class LogManagement {
	static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LogManagement.class);

	public static void trace(String msg){
		logger.trace(msg);
	}
	public static void debug(String msg){
		logger.debug(msg);
	}
	public static void info(String msg){
		logger.info(msg);
	}
	/**
	 * Escribe en el log información sobre el resultado de una llamada a BH
	 * @param servicio Servicio
	 * @param capacidad Capacidad
	 * @param numSolicitud Número de solicitud
	 * @param exito Exito o fallo en la llamada
	 * @param tiempoEnSegundos Tiempo en segundos
	 */
	public static void infoLlamadaBH(String servicio, String capacidad, String numSolicitud, boolean exito, Double tiempoEnSegundos) {
		String texto = "Llamada a: " + servicio + " - " + capacidad;
		if (exito) {
			texto += " - Exito";
		} else {
			texto += " - Error";
		}
		if (numSolicitud != null && !numSolicitud.isEmpty()) {
			texto += " - Numero solicitud:" + numSolicitud;
		}
		if (tiempoEnSegundos != null) {
			texto += " - Tiempo (seg):" + String.valueOf( tiempoEnSegundos);
		}
		logger.info(texto);
	}
	public static void warning(String msg){
		logger.warn(msg);
	}
	public static void error(String msg){
		logger.error(msg);
	}
	public static void error(Exception exception){
		logger.error(exception.getMessage());
		String trace = ExceptionUtils.getStackTrace(exception);
		if (trace != null && ! trace.isEmpty()) {
			logger.error(trace);
		}
	}
}
