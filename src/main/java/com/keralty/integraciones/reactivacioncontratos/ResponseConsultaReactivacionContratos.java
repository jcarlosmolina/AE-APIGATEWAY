package com.keralty.integraciones.reactivacioncontratos;

import com.fasterxml.jackson.annotation.*;
import com.keralty.integraciones.reactivacioncontratos.response.SolicitudReactivacionContrato;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseConsultaReactivacionContratos {
    private boolean exito = true;
    private String textoError = null;

    private SolicitudReactivacionContrato solicitudReactivacionContrato;

	@JsonProperty("exito")
    public boolean isExito() { return exito; }
    @JsonProperty("exito")
	public void setExito(boolean exito) { this.exito = exito; }
	
    @JsonProperty("textoError")
    public String getTextoError() { return textoError; }
    @JsonProperty("textoError")
	public void setTextoError(String textoError) { this.textoError = textoError; }
	
    @JsonProperty("solicitudReactivacionContrato")
    public SolicitudReactivacionContrato getSolicitudReactivacionContrato() { return solicitudReactivacionContrato; }
    @JsonProperty("solicitudReactivacionContrato")
	public void setSolicitudReactivacionContrato(SolicitudReactivacionContrato solicitudReactivacionContrato) { this.solicitudReactivacionContrato = solicitudReactivacionContrato; }
    
    
}
