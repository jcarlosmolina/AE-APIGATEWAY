package com.keralty.ae.viewmodel.solicitud.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSSolicitudIIUInfoPago {

    @JsonProperty("numradicado")
    private Long dSSolicitudIIUInfoPagoNumRadicado;

    public DSSolicitudIIUInfoPago() {
    
    }

    @JsonIgnore
    public Long getDSSolicitudIIUInfoPagoNumRadicado() {
        return this.dSSolicitudIIUInfoPagoNumRadicado;
    }
    
    public void setDSSolicitudIIUInfoPagoNumRadicado(Long dSSolicitudIIUInfoPagoNumRadicado) {
        this.dSSolicitudIIUInfoPagoNumRadicado = dSSolicitudIIUInfoPagoNumRadicado;
    }
}
