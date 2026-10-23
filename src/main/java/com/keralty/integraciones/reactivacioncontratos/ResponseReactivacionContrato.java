package com.keralty.integraciones.reactivacioncontratos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseReactivacionContrato {

	private String codRespuesta;
	private String desRespuesta;
	
	@JsonProperty("codRespuesta")
	public String getCodRespuesta() { return codRespuesta; }
	@JsonProperty("codRespuesta")
	public void setCodRespuesta(String codRespuesta) { this.codRespuesta = codRespuesta; }
	
	@JsonProperty("desRespuesta")
	public String getDesRespuesta() { return desRespuesta; }
	@JsonProperty("desRespuesta")
	public void setDesRespuesta(String desRespuesta) { this.desRespuesta = desRespuesta; }
}
