package com.keralty.ae.viewmodel.seccion.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICSeccion {

    @JsonProperty("nombre")
    private String iCSeccionNombre;

    public ICSeccion() {
    
    }

    @JsonIgnore
    public String getICSeccionNombre() {
        return this.iCSeccionNombre;
    }
    
    public void setICSeccionNombre(String iCSeccionNombre) {
        this.iCSeccionNombre = iCSeccionNombre;
    }
}
