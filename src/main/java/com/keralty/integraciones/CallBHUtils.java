package com.keralty.integraciones;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.Set;

import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.LogManagement;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.UserFunctions;
import com.keralty.ae.global.UsuarioSistemaExternoConstants;
import com.keralty.ae.persistence.Funcionario;
import com.keralty.ae.persistence.oid.FuncionarioOid;
import com.keralty.ae.service.FuncionarioService;
import com.keralty.ae.service.LogLlamadasBHService;
import com.keralty.ae.viewmodel.logllamadasbh.siu.CreateinstanceRequest;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CallBHUtils {

	UserFunctions userFunctions;

    @RestClient
    LogLlamadasBHService serviceLogLlamadasBH;

    @RestClient
    FuncionarioService serviceFuncionario;

    JsonWebToken jwt;

	@Inject
	public CallBHUtils(UserFunctions userFunctions, JsonWebToken jwt){
		this.userFunctions = userFunctions;
		this.jwt = jwt;
	}
	
	public String getUsuario() {
		
		if (jwt != null && jwt.getName() != null) {
			Set<String> grupos = jwt.getGroups();
			if (grupos.contains(UsuarioSistemaExternoConstants.CLASS_NAME)) {
				int i = jwt.getName().indexOf(":");
				if (i >= 0) {
					String nombre = jwt.getName().substring(i+1);
					nombre = nombre.replaceAll("\"", "").replaceAll(" ", "").replaceAll("}", "");
					return nombre;
				} else {
					throw new SystemException("CallBHUtils getUsuario - GU020");
				}
			} else {
				try {
					Funcionario funcionario = serviceFuncionario.getByOID(new FuncionarioOid( Long.valueOf(jwt.getName())));
					return funcionario.getFuncionarioUsuario();
				} catch (Exception e) {
					LogManagement.error("CallBHUtils getUsuario - " + e.getMessage());
					throw new SystemException("CallBHUtils getUsuario - " + e.getMessage());
				}
			}
		}
		
		return "";
	}
	
	public String getRequestDate() {
		java.util.Date currentDate = new java.util.Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormat.format(currentDate); 
	}

	public String getRequestDateTime() {
		java.util.Date currentDate = new java.util.Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		return dateFormat.format(currentDate); 
	}

	public String formatFechaJson(java.sql.Date fecha) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormat.format(fecha); 
	}
	
	public String getPropertyValue(String propertyName, String defaultValue) {
		String propertyValue = null;
		try {
			String result = userFunctions.fugetValorParametroConfFun(propertyName);

			if (result == null || result.isEmpty())
				result = getPropertyValueFromPropertiesFile(propertyName);

			if (result != null && !result.isEmpty())
				propertyValue = result;
		} catch (Exception e) {
			propertyValue = defaultValue;
			LogManagement.error("No se pudo recuperar el valor de la propiedad '" + propertyName + "'. Contacte al administrador");
		}
		
		if (propertyValue == null) {
			LogManagement.error("No se pudo recuperar el valor de la propiedad '" + propertyName + "'. Contacte al administrador");
		}
		return propertyValue;
	}
	
	private static String getPropertyValueFromPropertiesFile(String propertyName) throws SystemException {
		return getApplicationPropertyByName(propertyName);
	}
	
    public static String getApplicationPropertyByName(String propertyName) {
    	Optional<String> propertyValue = ConfigProvider.getConfig().getOptionalValue(propertyName, String.class);
    	if (propertyValue.isPresent() && existsPropertyName(propertyValue.get())) {
        	propertyValue = Optional.of(getApplicationPropertyByName(propertyValue.get()));
    	}
    	return propertyValue.orElse("");
    }
    
    private static boolean existsPropertyName(String propertyName) {
    	for(String applicationPropertyName : ConfigProvider.getConfig().getPropertyNames()) {
    		if (applicationPropertyName.equals(propertyName))
    			return true;
    	}
    	return false;
    }
    
    public String fromJsonToString(Object objetoJson) {
    	String retorno = "";
		ObjectMapper mapper= new ObjectMapper();
		if (objetoJson != null) {
			try {
				retorno = mapper.writeValueAsString(objetoJson);
			} catch (JsonProcessingException e) {
				LogManagement.error(e);
			}
		}
		return retorno;
    }

    public byte[] fromJsonToByteArray(Object objetoJson) {
    	byte[] retorno = null;
		ObjectMapper mapper= new ObjectMapper();
		if (objetoJson != null) {
			try {
				retorno = mapper.writeValueAsBytes(objetoJson);
			} catch (JsonProcessingException e) {
				LogManagement.error(e);
			}
		}
		return retorno;
    }

	public void guardarLlamadaBH(Timestamp fechaHora, String usuario, 
			String capacidad, String servicio, String numSolicitud, Object peticion, Object respuesta,
			Double tiempoEjecucion, String textoError){
		if (servicio == null || servicio.isEmpty()) {
			servicio = capacidad;
		}
		
		boolean exito = textoError == null || textoError.isEmpty();
		
		LogManagement.infoLlamadaBH(servicio, capacidad, numSolicitud, exito, tiempoEjecucion);

		String peticionStr = fromJsonToString(peticion);
		String respuestaStr = fromJsonToString(respuesta);
		
		CreateinstanceRequest request = new CreateinstanceRequest();
		request.setLogLlamadasBHcreateinstancepatrCapacidad(capacidad != null ? capacidad.toUpperCase() : "");
		request.setLogLlamadasBHcreateinstancepatrFechaHora(fechaHora);
		request.setLogLlamadasBHcreateinstancepatrPeticion(peticionStr);
		request.setLogLlamadasBHcreateinstancepatrRespuesta(respuestaStr);
		request.setLogLlamadasBHcreateinstancepatrServicio(servicio);
		request.setLogLlamadasBHcreateinstancepatrSolicitud(numSolicitud);
		request.setLogLlamadasBHcreateinstancepatrTextoError(textoError);
		request.setLogLlamadasBHcreateinstancepatrTiempoEjecucion(tiempoEjecucion);
		request.setLogLlamadasBHcreateinstancepatrTipoServicio("REST Service");
		request.setLogLlamadasBHcreateinstancepatrUsuario(usuario);

		try {
			serviceLogLlamadasBH.createinstanceAsync(request );
		} catch(Exception e) {
			LogManagement.error(e);
		}
	}
	
	public static Timestamp systemDateTimeFun() {

		Date lDate = new Date();
		long lnMilisegundos = lDate.getTime();

		return new Timestamp(lnMilisegundos);
	}
}
