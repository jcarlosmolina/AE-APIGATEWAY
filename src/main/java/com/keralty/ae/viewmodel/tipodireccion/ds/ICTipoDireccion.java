package com.keralty.ae.viewmodel.tipodireccion.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICTipoDireccion {

    @JsonProperty("descripcion")
    private String iCTipoDireccionDescripcion;

    public ICTipoDireccion() {
    
    }

    @JsonIgnore
    public String getICTipoDireccionDescripcion() {
        return this.iCTipoDireccionDescripcion;
    }
    
    public void setICTipoDireccionDescripcion(String iCTipoDireccionDescripcion) {
        this.iCTipoDireccionDescripcion = iCTipoDireccionDescripcion;
    }
}
