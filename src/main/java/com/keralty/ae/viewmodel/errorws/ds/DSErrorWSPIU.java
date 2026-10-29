package com.keralty.ae.viewmodel.errorws.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSErrorWSPIU {

    @JsonProperty("descripcion")
    private String dSErrorWSPIUDescripcion;

    public DSErrorWSPIU() {
    
    }

    @JsonIgnore
    public String getDSErrorWSPIUDescripcion() {
        return this.dSErrorWSPIUDescripcion;
    }
    
    public void setDSErrorWSPIUDescripcion(String dSErrorWSPIUDescripcion) {
        this.dSErrorWSPIUDescripcion = dSErrorWSPIUDescripcion;
    }
}
