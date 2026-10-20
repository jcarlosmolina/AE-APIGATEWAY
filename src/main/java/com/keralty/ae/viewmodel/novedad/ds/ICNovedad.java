package com.keralty.ae.viewmodel.novedad.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICNovedad {

    @JsonProperty("nombre")
    private String iCNovedadNombre;

    public ICNovedad() {
    
    }

    @JsonIgnore
    public String getICNovedadNombre() {
        return this.iCNovedadNombre;
    }
    
    public void setICNovedadNombre(String iCNovedadNombre) {
        this.iCNovedadNombre = iCNovedadNombre;
    }
}
