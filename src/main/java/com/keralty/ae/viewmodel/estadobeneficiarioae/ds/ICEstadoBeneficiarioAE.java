package com.keralty.ae.viewmodel.estadobeneficiarioae.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICEstadoBeneficiarioAE {

    @JsonProperty("descripcion")
    private String iCEstadoBeneficiarioAEDescripcion;

    public ICEstadoBeneficiarioAE() {
    
    }

    @JsonIgnore
    public String getICEstadoBeneficiarioAEDescripcion() {
        return this.iCEstadoBeneficiarioAEDescripcion;
    }
    
    public void setICEstadoBeneficiarioAEDescripcion(String iCEstadoBeneficiarioAEDescripcion) {
        this.iCEstadoBeneficiarioAEDescripcion = iCEstadoBeneficiarioAEDescripcion;
    }
}
