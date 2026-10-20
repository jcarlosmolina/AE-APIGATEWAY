package com.keralty.ae.viewmodel.cuestionariomed.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSCuestionarioMedIIU {

    @JsonProperty("nombre")
    private String dSCuestionarioMedIIUNombre;

    public DSCuestionarioMedIIU() {
    
    }

    @JsonIgnore
    public String getDSCuestionarioMedIIUNombre() {
        return this.dSCuestionarioMedIIUNombre;
    }
    
    public void setDSCuestionarioMedIIUNombre(String dSCuestionarioMedIIUNombre) {
        this.dSCuestionarioMedIIUNombre = dSCuestionarioMedIIUNombre;
    }
}
