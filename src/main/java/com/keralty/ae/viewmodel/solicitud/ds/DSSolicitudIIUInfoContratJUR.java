package com.keralty.ae.viewmodel.solicitud.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSSolicitudIIUInfoContratJUR {

    @JsonProperty("contratante_razonsocial")
    private String dSSolicitudIIUInfoContratJURContratanteDotRazonSocial;

    public DSSolicitudIIUInfoContratJUR() {
    
    }

    @JsonIgnore
    public String getDSSolicitudIIUInfoContratJURContratanteDotRazonSocial() {
        return this.dSSolicitudIIUInfoContratJURContratanteDotRazonSocial;
    }
    
    public void setDSSolicitudIIUInfoContratJURContratanteDotRazonSocial(String dSSolicitudIIUInfoContratJURContratanteDotRazonSocial) {
        this.dSSolicitudIIUInfoContratJURContratanteDotRazonSocial = dSSolicitudIIUInfoContratJURContratanteDotRazonSocial;
    }
}
