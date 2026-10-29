package com.keralty.integraciones.patient;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RespuestaCuestionario {

	private String pregunta;
	private Boolean respuestaBool;
	private String respuestaString;
	
    @JsonProperty("pregunta")
    public String getPregunta() { return pregunta; }
    @JsonProperty("pregunta")
    public void setPregunta(String pregunta) { this.pregunta = pregunta; }
	
    @JsonProperty("respuestaBool")
	public Boolean getRespuestaBool() { return respuestaBool; }
    @JsonProperty("respuestaBool")
	public void setRespuestaBool(Boolean respuestaBool) { this.respuestaBool = respuestaBool; }
	
    @JsonProperty("respuestaString")
	public String getRespuestaString() { return respuestaString; }
    @JsonProperty("respuestaString")
	public void setRespuestaString(String respuestaString) { this.respuestaString = respuestaString; }
}
