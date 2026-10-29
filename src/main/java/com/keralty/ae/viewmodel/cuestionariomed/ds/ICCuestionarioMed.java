package com.keralty.ae.viewmodel.cuestionariomed.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICCuestionarioMed {

    @JsonProperty("nombre")
    private String iCCuestionarioMedNombre;

    public ICCuestionarioMed() {
    
    }

    @JsonIgnore
    public String getICCuestionarioMedNombre() {
        return this.iCCuestionarioMedNombre;
    }
    
    public void setICCuestionarioMedNombre(String iCCuestionarioMedNombre) {
        this.iCCuestionarioMedNombre = iCCuestionarioMedNombre;
    }
}
