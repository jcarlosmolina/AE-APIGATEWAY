package com.keralty.ae.viewmodel.parentesco.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICParentesco {

    @JsonProperty("descripcion")
    private String iCParentescoDescripcion;

    public ICParentesco() {
    
    }

    @JsonIgnore
    public String getICParentescoDescripcion() {
        return this.iCParentescoDescripcion;
    }
    
    public void setICParentescoDescripcion(String iCParentescoDescripcion) {
        this.iCParentescoDescripcion = iCParentescoDescripcion;
    }
}
