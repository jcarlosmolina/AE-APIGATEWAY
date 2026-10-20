package com.keralty.ae.viewmodel.causal.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICCausal {

    @JsonProperty("nombre")
    private String iCCausalNombre;

    public ICCausal() {
    
    }

    @JsonIgnore
    public String getICCausalNombre() {
        return this.iCCausalNombre;
    }
    
    public void setICCausalNombre(String iCCausalNombre) {
        this.iCCausalNombre = iCCausalNombre;
    }
}
