package com.keralty.ae.viewmodel.estadobeneficiario.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICEstadoBeneficiario {

    @JsonProperty("descripcion")
    private String iCEstadoBeneficiarioDescripcion;

    public ICEstadoBeneficiario() {
    
    }

    @JsonIgnore
    public String getICEstadoBeneficiarioDescripcion() {
        return this.iCEstadoBeneficiarioDescripcion;
    }
    
    public void setICEstadoBeneficiarioDescripcion(String iCEstadoBeneficiarioDescripcion) {
        this.iCEstadoBeneficiarioDescripcion = iCEstadoBeneficiarioDescripcion;
    }
}
