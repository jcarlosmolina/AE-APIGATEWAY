package com.keralty.ae.viewmodel.pais.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICPais {

    @JsonProperty("descripcion")
    private String iCPaisDescripcion;

    public ICPais() {
    
    }

    @JsonIgnore
    public String getICPaisDescripcion() {
        return this.iCPaisDescripcion;
    }
    
    public void setICPaisDescripcion(String iCPaisDescripcion) {
        this.iCPaisDescripcion = iCPaisDescripcion;
    }
}
