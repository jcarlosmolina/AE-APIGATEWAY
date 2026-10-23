package com.keralty.integraciones.patient;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CrearActualizarCuestionarioRequest {
    private String numSolicitud;
    private String tipoIdentificacion;
    private String numeroIdentificacion;

    private List<RespuestaCuestionario> respuestas;
    
    @JsonProperty("numSolicitud")
    public String getNumSolicitud() { return numSolicitud; }
    @JsonProperty("numSolicitud")
    public void setNumSolicitud(String value) { this.numSolicitud = value; }
       
	
	@JsonProperty("tipoIdentificacion")
    public String getTipoIdentificacion() { return tipoIdentificacion; }
    @JsonProperty("tipoIdentificacion")
    public void setTipoIdentificacion(String value) { this.tipoIdentificacion = value; }

    @JsonProperty("numeroIdentificacion")
    public String getNumeroIdentificacion() { return numeroIdentificacion; }
    @JsonProperty("numeroIdentificacion")
    public void setNumeroIdentificacion(String value) { this.numeroIdentificacion = value; }
	
    @JsonProperty("respuestas")
    public List<RespuestaCuestionario> getRespuestas() { return respuestas; }
    @JsonProperty("respuestas")
	public void setRespuestas(List<RespuestaCuestionario> respuestas) { this.respuestas = respuestas; }

    
}
