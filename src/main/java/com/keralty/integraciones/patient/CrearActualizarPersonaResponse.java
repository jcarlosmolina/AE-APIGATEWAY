package com.keralty.integraciones.patient;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CrearActualizarPersonaResponse {
    private boolean exito = true;
    private String textoError = null;

    private Long codigoPersona = 0L;

	@JsonProperty("exito")
    public boolean isExito() { return exito; }
    @JsonProperty("exito")
	public void setExito(boolean exito) { this.exito = exito; }
	
    @JsonProperty("textoError")
    public String getTextoError() { return textoError; }
    @JsonProperty("textoError")
	public void setTextoError(String textoError) { this.textoError = textoError; }
	
    @JsonProperty("codigoPersona")
    public Long getCodigoPersona() { return codigoPersona; }
    @JsonProperty("codigoPersona")
	public void setCodigoPersona(Long codigoPersona) { this.codigoPersona = codigoPersona; }

}
