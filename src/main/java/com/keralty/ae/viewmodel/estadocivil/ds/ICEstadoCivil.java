package com.keralty.ae.viewmodel.estadocivil.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICEstadoCivil {

    @JsonProperty("descripcion")
    private String iCEstadoCivilDescripcion;

    public ICEstadoCivil() {
    
    }

    @JsonIgnore
    public String getICEstadoCivilDescripcion() {
        return this.iCEstadoCivilDescripcion;
    }
    
    public void setICEstadoCivilDescripcion(String iCEstadoCivilDescripcion) {
        this.iCEstadoCivilDescripcion = iCEstadoCivilDescripcion;
    }
}
