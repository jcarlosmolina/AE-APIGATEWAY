// Utility para el MS aeconfiguraciones
package com.keralty.integraciones.tipossolicitud;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.keralty.ae.global.STDFunctions;
import com.keralty.integraciones.CallBHUtils;
import com.keralty.integraciones.IntegracionesUtils;
import com.keralty.integraciones.tipossolicitud.response.ResponseTiposSolicitud;
import com.keralty.integraciones.token.TokenUtils;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TiposSolicitudUtils {

	TokenUtils tokenUtils;
	
	CallBHUtils callBHUtils;

	@RestClient
	TiposSolicitudProxy tiposSolicitudProxy;
	
	@ConfigProperty(name="com.keralty.integraciones.token.usr")
	String username;
	
	@ConfigProperty(name="com.keralty.integraciones.token.pwd")
	String password;
	
	public TiposSolicitudUtils(CallBHUtils callBHUtils, TokenUtils tokenUtils) {
		this.tokenUtils = tokenUtils;
		this.callBHUtils = callBHUtils;
	}


	public ResponseTiposSolicitud consultarPlanesReactivacionContratos() {
		String textoError = null;
		long startTime = System.currentTimeMillis();
		long endTime = startTime;
		Double tiempoEjecucion = 0.0;
		Timestamp fechaHora = STDFunctions.systemDateTimeFun();	
		ResponseTiposSolicitud respuesta = new ResponseTiposSolicitud();
		try {
			respuesta = tiposSolicitudProxy.TiposSolicitud(tokenUtils.getTokenValue());
			endTime = System.currentTimeMillis();
		} catch (Exception e) {
			endTime = System.currentTimeMillis();
			org.slf4j.LoggerFactory.getLogger(this.getClass().getName()).error("TSOL-0020. " + e.getMessage());
			textoError = e.getMessage();
		}
		tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
		
		callBHUtils.guardarLlamadaBH(fechaHora, callBHUtils.getUsuario(), "TiposSolicitud", "TiposSolicitud", null, null, respuesta, tiempoEjecucion, textoError);
		
		return respuesta;
	}

	
}
