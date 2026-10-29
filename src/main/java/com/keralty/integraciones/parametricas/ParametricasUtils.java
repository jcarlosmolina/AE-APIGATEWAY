// Utility para el MS aeconfiguraciones
package com.keralty.integraciones.parametricas;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.keralty.ae.global.STDFunctions;
import com.keralty.integraciones.CallBHUtils;
import com.keralty.integraciones.IntegracionesUtils;
import com.keralty.integraciones.token.TokenUtils;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ParametricasUtils {

	TokenUtils tokenUtils;
	
	CallBHUtils callBHUtils;

	@RestClient
	ParametricasProxy parametricas;
	
	@ConfigProperty(name="com.keralty.integraciones.token.usr")
	String username;
	
	@ConfigProperty(name="com.keralty.integraciones.token.pwd")
	String password;

	@ConfigProperty(name="com.keralty.integraciones.parametricas.producto.cod_table")
	String codTableProducto;

	@ConfigProperty(name="com.keralty.integraciones.parametricas.plan.cod_table")
	String codTablePlan;
	
	@ConfigProperty(name="com.keralty.integraciones.parametricas.productos.validosreactivacioncontratos", defaultValue = "")
	String codProductoValidosReactivacionContratos;
	
	public ParametricasUtils(CallBHUtils callBHUtils, TokenUtils tokenUtils) {
		this.tokenUtils = tokenUtils;
		this.callBHUtils = callBHUtils;
	}


	private List<DatoParametrica> consultarPorCodigo(String codigo) {
		GetParametricRequest request = new GetParametricRequest();
		request.setCodTable(codigo);
		String textoError = null;
		long startTime = System.currentTimeMillis();
		long endTime = startTime;
		Double tiempoEjecucion = 0.0;
		Timestamp fechaHora = STDFunctions.systemDateTimeFun();	
		List<DatoParametrica> respuesta = new ArrayList<DatoParametrica>();
		try {
			respuesta = parametricas.getParametric(tokenUtils.getTokenValue(), "ID", IntegracionesUtils.getRequestDate(), request);
			endTime = System.currentTimeMillis();
		} catch (Exception e) {
			endTime = System.currentTimeMillis();
			org.slf4j.LoggerFactory.getLogger(this.getClass().getName()).error("INT-0020. " + e.getMessage());
			textoError = e.getMessage();
		}
		tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
		
		callBHUtils.guardarLlamadaBH(fechaHora, callBHUtils.getUsuario(), "getParametric", "Parametric", null, request, respuesta, tiempoEjecucion, textoError);
		
		return respuesta;
	}

	
	public List<DatoParametrica> consultarCompanyasReactivacionContratos() {
		if (codProductoValidosReactivacionContratos == null || codProductoValidosReactivacionContratos.isEmpty()) {
			org.slf4j.LoggerFactory.getLogger(this.getClass().getName()).error("INT-0030. Clave de configuracion 'com.keralty.integraciones.parametricas.productos.validosreactivacioncontratos' no encntrada");
			return null;
		}
		List<DatoParametrica> lista = consultarPorCodigo(codTableProducto);
		List<String> listaValidos = Arrays.asList(codProductoValidosReactivacionContratos.split(","));
		List<DatoParametrica> listaDefinitiva = new ArrayList<DatoParametrica>();
		// Tan solo devolvemos aquellos cuyos códigos aparezcan en la configuracion
		for (DatoParametrica dato : lista) {
			if (dato.getLegalCode() != null && listaValidos.contains(dato.getLegalCode())) {
				listaDefinitiva.add(dato);
			}
		}
		
		return listaDefinitiva;
	}
}
