package com.keralty.ae.viewmodel.solicitudnovedad.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSSolNovObservaciones {

    @JsonProperty("observacions")
    private String dSSolNovObservacionesObservacions;

    public DSSolNovObservaciones() {
    
    }

    @JsonIgnore
    public String getDSSolNovObservacionesObservacions() {
        return this.dSSolNovObservacionesObservacions;
    }
    
    public void setDSSolNovObservacionesObservacions(String dSSolNovObservacionesObservacions) {
        this.dSSolNovObservacionesObservacions = dSSolNovObservacionesObservacions;
    }
}
