package com.keralty.ae.viewmodel.solicitud.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSSolicitudIIUInfoObservacion {

    @JsonProperty("numradicado")
    private Long dSSolicitudIIUInfoObservacionNumRadicado;

    public DSSolicitudIIUInfoObservacion() {
    
    }

    @JsonIgnore
    public Long getDSSolicitudIIUInfoObservacionNumRadicado() {
        return this.dSSolicitudIIUInfoObservacionNumRadicado;
    }
    
    public void setDSSolicitudIIUInfoObservacionNumRadicado(Long dSSolicitudIIUInfoObservacionNumRadicado) {
        this.dSSolicitudIIUInfoObservacionNumRadicado = dSSolicitudIIUInfoObservacionNumRadicado;
    }
}
