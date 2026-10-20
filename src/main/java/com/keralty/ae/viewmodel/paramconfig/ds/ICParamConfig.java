package com.keralty.ae.viewmodel.paramconfig.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICParamConfig {

    @JsonProperty("descripcion")
    private String iCParamConfigDescripcion;

    public ICParamConfig() {
    
    }

    @JsonIgnore
    public String getICParamConfigDescripcion() {
        return this.iCParamConfigDescripcion;
    }
    
    public void setICParamConfigDescripcion(String iCParamConfigDescripcion) {
        this.iCParamConfigDescripcion = iCParamConfigDescripcion;
    }
}
