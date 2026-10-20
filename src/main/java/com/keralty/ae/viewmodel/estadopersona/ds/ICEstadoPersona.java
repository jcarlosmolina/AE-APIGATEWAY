package com.keralty.ae.viewmodel.estadopersona.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICEstadoPersona {

    @JsonProperty("descripcion")
    private String iCEstadoPersonaDescripcion;

    public ICEstadoPersona() {
    
    }

    @JsonIgnore
    public String getICEstadoPersonaDescripcion() {
        return this.iCEstadoPersonaDescripcion;
    }
    
    public void setICEstadoPersonaDescripcion(String iCEstadoPersonaDescripcion) {
        this.iCEstadoPersonaDescripcion = iCEstadoPersonaDescripcion;
    }
}
