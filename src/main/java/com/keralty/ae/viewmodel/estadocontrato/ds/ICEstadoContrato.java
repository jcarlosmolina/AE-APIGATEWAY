package com.keralty.ae.viewmodel.estadocontrato.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICEstadoContrato {

    @JsonProperty("descripcion")
    private String iCEstadoContratoDescripcion;

    public ICEstadoContrato() {
    
    }

    @JsonIgnore
    public String getICEstadoContratoDescripcion() {
        return this.iCEstadoContratoDescripcion;
    }
    
    public void setICEstadoContratoDescripcion(String iCEstadoContratoDescripcion) {
        this.iCEstadoContratoDescripcion = iCEstadoContratoDescripcion;
    }
}
