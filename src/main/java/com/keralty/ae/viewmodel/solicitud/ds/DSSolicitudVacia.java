package com.keralty.ae.viewmodel.solicitud.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSSolicitudVacia {

    @JsonProperty("numfamilia")
    private String dSSolicitudVaciaNumFamilia;

    public DSSolicitudVacia() {
    
    }

    @JsonIgnore
    public String getDSSolicitudVaciaNumFamilia() {
        return this.dSSolicitudVaciaNumFamilia;
    }
    
    public void setDSSolicitudVaciaNumFamilia(String dSSolicitudVaciaNumFamilia) {
        this.dSSolicitudVaciaNumFamilia = dSSolicitudVaciaNumFamilia;
    }
}
