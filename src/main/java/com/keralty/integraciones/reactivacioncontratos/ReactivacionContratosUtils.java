// Utility 
package com.keralty.integraciones.reactivacioncontratos;

import java.sql.Timestamp;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.keralty.ae.exception.LogManagement;
import com.keralty.ae.global.STDFunctions;
import com.keralty.integraciones.CallBHUtils;
import com.keralty.integraciones.reactivacioncontratos.consulta.RequestConsultaContrato;
import com.keralty.integraciones.reactivacioncontratos.response.SolicitudReactivacionContrato;
import com.keralty.integraciones.token.TokenUtils;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;

@ApplicationScoped
public class ReactivacionContratosUtils {

	TokenUtils tokenUtils;
	
	CallBHUtils callBHUtils;

	@RestClient
	ReactivacionContratosProxy reactivacionContratosProxy;
	
	@ConfigProperty(name="com.keralty.integraciones.token.usr")
	String username;
	
	@ConfigProperty(name="com.keralty.integraciones.token.pwd")
	String password;

	@ConfigProperty(name="com.keralty.integraciones.maxintentosllamada", defaultValue = "0" )
	private int maxIntentosLlamada;

	private int maxReintentos401 = 2;

	public ReactivacionContratosUtils(CallBHUtils callBHUtils, TokenUtils tokenUtils) {
		this.tokenUtils = tokenUtils;
		this.callBHUtils = callBHUtils;
	}


	public ResponseConsultaReactivacionContratos consultarContratos(RequestConsultaContrato request) {

		ResponseConsultaReactivacionContratos respuesta = new ResponseConsultaReactivacionContratos();
		// Datos de headers
		long startTime = System.currentTimeMillis();
		Timestamp fechaHora = STDFunctions.systemDateTimeFun();	
		String mensajeError = "";
		long endTime = startTime;
		Double tiempoEjecucion = 0.0;
		String idPeticion = "AE";
		String idTerminal = "1";
		String usuario = "";
		try {
			usuario = callBHUtils.getUsuario();
		} catch (Exception e) {
			LogManagement.error("REC-0005. Error recuperando usuario. " + e.getMessage());
			respuesta.setExito(false);
			respuesta.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("REC-0005"));
			return respuesta;
		}

		// Obtenemos el Token
		String token = "";
		try {
			token = tokenUtils.getTokenValue();
		} catch (Exception e) {
			LogManagement.error("REC-0010. Error obteniendo token. " + e.getMessage());
			return null;
		}

		int numIntentos = 1;
		int numReintentos401 = 0;

		while (numIntentos <= maxIntentosLlamada && numReintentos401 < maxReintentos401) {

			startTime = System.currentTimeMillis();
			fechaHora = STDFunctions.systemDateTimeFun();	
			try {
				SolicitudReactivacionContrato resp = reactivacionContratosProxy.consulta(token, 
						idPeticion, 
						idTerminal, 
						usuario, 
						callBHUtils.getRequestDate(), 
						request.getCodProducto(), 
						request.getCodPlan(), 
						request.getNumContrato()); 
				respuesta.setSolicitudReactivacionContrato(resp);
				endTime = System.currentTimeMillis();
				mensajeError = "";
				break;
			} catch (Exception e) {
				endTime = System.currentTimeMillis();
				mensajeError = e.getMessage();
				if (mensajeError != null && mensajeError.indexOf("401") >= 0) {
					LogManagement.info("Cartera SolicitudReactivacionContrato. Reintento por 401");
					// Guardamos la llamada al WS
					tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
					callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
							"SolicitudReactivacionContrato GET",
							"CarteraMP", 
							null,
							request.getCodProducto() + " " + request.getCodPlan() + " " + request.getNumContrato(),
							respuesta.getSolicitudReactivacionContrato(),
							tiempoEjecucion, mensajeError);
					// Esperamos 2 segundos
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e1) {
						LogManagement.error(e1);
						Thread.currentThread().interrupt();
					}
					try {
						token = tokenUtils.getTokenValue();					
					} catch (Exception e2) {
						LogManagement.error("REC-0020. Error obteniendo token. " + e.getMessage());
						respuesta.setExito(false);
						respuesta.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("REC-0020"));
						return respuesta;
					}
					numReintentos401++;			
				} else {
					numIntentos++;
				}
			}
		}

		tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
		// Guardamos la llamada al WS
		callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
				"SolicitudReactivacionContrato GET",
				"CarteraMP", 
				null,
				request.getCodProducto() + " " + request.getCodPlan() + " " + request.getNumContrato(),
				respuesta.getSolicitudReactivacionContrato(),
				tiempoEjecucion, mensajeError);		

		return respuesta;
	}

	public ResponseReactivacionContrato crearSolicitudReactivacionContrato(RequestCrearSolicitudReactivacionContrato request) {

		ResponseReactivacionContrato respuesta = new ResponseReactivacionContrato();
		// Datos de headers
		long startTime = System.currentTimeMillis();
		Timestamp fechaHora = STDFunctions.systemDateTimeFun();	
		String mensajeError = "";
		long endTime = startTime;
		Double tiempoEjecucion = 0.0;
		String idPeticion = "AE";
		String idTerminal = "1";
		String usuario = "";
		try {
			usuario = callBHUtils.getUsuario();
		} catch (Exception e) {
			LogManagement.error("REC-0105. Error recuperando usuario. " + e.getMessage());
			respuesta.setCodRespuesta("REC-0105");
			respuesta.setDesRespuesta(STDFunctions.getTextoErrorUsuarioFinal("REC-0105"));
			return respuesta;
		}

		// Obtenemos el Token
		String token = "";
		try {
			token = tokenUtils.getTokenValue();
		} catch (Exception e) {
			LogManagement.error("REC-0110. Error obteniendo token. " + e.getMessage());
			respuesta.setCodRespuesta("REC-0110");
			respuesta.setDesRespuesta(STDFunctions.getTextoErrorUsuarioFinal("REC-0110"));
			return null;
		}

		int numIntentos = 1;
		int numReintentos401 = 0;

		while (numIntentos <= maxIntentosLlamada && numReintentos401 < maxReintentos401) {

			startTime = System.currentTimeMillis();
			fechaHora = STDFunctions.systemDateTimeFun();	
			try {
				respuesta = reactivacionContratosProxy.crear(token, 
						idPeticion, 
						idTerminal, 
						usuario, 
						callBHUtils.getRequestDate(), 
						request); 
				endTime = System.currentTimeMillis();
				mensajeError = "";
				break;
			} catch (Exception e) {
				endTime = System.currentTimeMillis();
				mensajeError = e.getMessage();
				if (mensajeError != null && mensajeError.indexOf("401") >= 0) {
					LogManagement.info("Cartera SolicitudReactivacionContrato. Reintento por 401");
					// Guardamos la llamada al WS
					tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
					callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
							"SolicitudReactivacionContrato POST",
							"CarteraMP", 
							null,
							request,
							respuesta,
							tiempoEjecucion, mensajeError);
					// Esperamos 2 segundos
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e1) {
						LogManagement.error(e1);
						Thread.currentThread().interrupt();
					}
					try {
						token = tokenUtils.getTokenValue();					
					} catch (Exception e2) {
						LogManagement.error("REC-0020. Error obteniendo token. " + e.getMessage());
						respuesta.setCodRespuesta("REC-0020");
						respuesta.setDesRespuesta(STDFunctions.getTextoErrorUsuarioFinal("REC-0020"));
						return respuesta;
					}
					numReintentos401++;			
				} else {
					numIntentos++;
				}
			}
		}

		tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
		// Guardamos la llamada al WS
		callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
				"SolicitudReactivacionContrato POST",
				"CarteraMP", 
				null,
				request,
				respuesta,
				tiempoEjecucion, mensajeError);		

		return respuesta;
	}

	public ResponseReactivacionContrato modificarSolicitudReactivacionContrato(RequestCrearSolicitudReactivacionContrato request) {

		ResponseReactivacionContrato respuesta = new ResponseReactivacionContrato();
		// Datos de headers
		long startTime = System.currentTimeMillis();
		Timestamp fechaHora = STDFunctions.systemDateTimeFun();	
		String mensajeError = "";
		long endTime = startTime;
		Double tiempoEjecucion = 0.0;
		String idPeticion = "AE";
		String idTerminal = "1";
		String usuario = "";
		try {
			usuario = callBHUtils.getUsuario();
		} catch (Exception e) {
			LogManagement.error("REC-0105. Error recuperando usuario. " + e.getMessage());
			respuesta.setCodRespuesta("REC-0105");
			respuesta.setDesRespuesta(STDFunctions.getTextoErrorUsuarioFinal("REC-0105"));
			return respuesta;
		}

		// Obtenemos el Token
		String token = "";
		try {
			token = tokenUtils.getTokenValue();
		} catch (Exception e) {
			LogManagement.error("REC-0110. Error obteniendo token. " + e.getMessage());
			respuesta.setCodRespuesta("REC-0110");
			respuesta.setDesRespuesta(STDFunctions.getTextoErrorUsuarioFinal("REC-0110"));
			return null;
		}

		int numIntentos = 1;
		int numReintentos401 = 0;

		while (numIntentos <= maxIntentosLlamada && numReintentos401 < maxReintentos401) {

			startTime = System.currentTimeMillis();
			fechaHora = STDFunctions.systemDateTimeFun();	
			try {
				respuesta = reactivacionContratosProxy.modificar(token, 
						idPeticion, 
						idTerminal, 
						usuario, 
						callBHUtils.getRequestDate(), 
						request); 
				endTime = System.currentTimeMillis();
				mensajeError = "";
				break;
			} catch (Exception e) {
				endTime = System.currentTimeMillis();
				mensajeError = e.getMessage();
				if (mensajeError != null && mensajeError.indexOf("401") >= 0) {
					LogManagement.info("Cartera SolicitudReactivacionContrato. Reintento por 401");
					// Guardamos la llamada al WS
					tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
					callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
							"SolicitudReactivacionContrato PUT",
							"CarteraMP", 
							null,
							request,
							respuesta,
							tiempoEjecucion, mensajeError);
					// Esperamos 2 segundos
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e1) {
						LogManagement.error(e1);
						Thread.currentThread().interrupt();
					}
					try {
						token = tokenUtils.getTokenValue();					
					} catch (Exception e2) {
						LogManagement.error("REC-0020. Error obteniendo token. " + e.getMessage());
						respuesta.setCodRespuesta("REC-0020");
						respuesta.setDesRespuesta(STDFunctions.getTextoErrorUsuarioFinal("REC-0020"));
						return respuesta;
					}
					numReintentos401++;			
				} else {
					numIntentos++;
				}
			}
		}

		tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
		// Guardamos la llamada al WS
		callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
				"SolicitudReactivacionContrato PUT",
				"CarteraMP", 
				null,
				request,
				respuesta,
				tiempoEjecucion, mensajeError);		

		return respuesta;
	}
	
	public ResponseReactivacionContrato eliminarSolicitudReactivacionContrato(RequestEliminarSolicitudReactivacionContrato request) {

		ResponseReactivacionContrato respuesta = new ResponseReactivacionContrato();
		// Datos de headers
		long startTime = System.currentTimeMillis();
		Timestamp fechaHora = STDFunctions.systemDateTimeFun();	
		String mensajeError = "";
		long endTime = startTime;
		Double tiempoEjecucion = 0.0;
		String idPeticion = "AE";
		String idTerminal = "1";
		String usuario = "";
		try {
			usuario = callBHUtils.getUsuario();
		} catch (Exception e) {
			LogManagement.error("REC-0105. Error recuperando usuario. " + e.getMessage());
			respuesta.setCodRespuesta("REC-0105");
			respuesta.setDesRespuesta(STDFunctions.getTextoErrorUsuarioFinal("REC-0105"));
			return respuesta;
		}

		// Obtenemos el Token
		String token = "";
		try {
			token = tokenUtils.getTokenValue();
		} catch (Exception e) {
			LogManagement.error("REC-0110. Error obteniendo token. " + e.getMessage());
			respuesta.setCodRespuesta("REC-0110");
			respuesta.setDesRespuesta(STDFunctions.getTextoErrorUsuarioFinal("REC-0110"));
			return null;
		}

		int numIntentos = 1;
		int numReintentos401 = 0;

		while (numIntentos <= maxIntentosLlamada && numReintentos401 < maxReintentos401) {

			startTime = System.currentTimeMillis();
			fechaHora = STDFunctions.systemDateTimeFun();	
			try {
				respuesta = reactivacionContratosProxy.eliminar(token, 
						idPeticion, 
						idTerminal, 
						usuario, 
						callBHUtils.getRequestDate(), 
						request); 
				endTime = System.currentTimeMillis();
				mensajeError = "";
				break;
			} catch (Exception e) {
				endTime = System.currentTimeMillis();
				mensajeError = e.getMessage();
				if (mensajeError != null && mensajeError.indexOf("401") >= 0) {
					LogManagement.info("Cartera SolicitudReactivacionContrato. Reintento por 401");
					// Guardamos la llamada al WS
					tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
					callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
							"SolicitudReactivacionContrato PUT",
							"CarteraMP", 
							null,
							request,
							respuesta,
							tiempoEjecucion, mensajeError);
					// Esperamos 2 segundos
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e1) {
						LogManagement.error(e1);
						Thread.currentThread().interrupt();
					}
					try {
						token = tokenUtils.getTokenValue();					
					} catch (Exception e2) {
						LogManagement.error("REC-0020. Error obteniendo token. " + e.getMessage());
						respuesta.setCodRespuesta("REC-0020");
						respuesta.setDesRespuesta(STDFunctions.getTextoErrorUsuarioFinal("REC-0020"));
						return respuesta;
					}
					numReintentos401++;			
				} else {
					numIntentos++;
				}
			}
		}

		tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
		// Guardamos la llamada al WS
		callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
				"SolicitudReactivacionContrato PUT",
				"CarteraMP", 
				null,
				request,
				respuesta,
				tiempoEjecucion, mensajeError);		

		return respuesta;
	}
}
