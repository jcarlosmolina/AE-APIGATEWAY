package com.keralty.ae.viewmodel.rol.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICRol {

    @JsonProperty("nombre")
    private String iCRolNombre;

    public ICRol() {
    
    }

    @JsonIgnore
    public String getICRolNombre() {
        return this.iCRolNombre;
    }
    
    public void setICRolNombre(String iCRolNombre) {
        this.iCRolNombre = iCRolNombre;
    }
}
