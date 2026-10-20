package com.keralty.ae.viewmodel.asesor.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSAsesorIIU {

    @JsonProperty("drvnombrecompleto")
    private String dSAsesorIIUDrvNombreCompleto;

    public DSAsesorIIU() {
    
    }

    @JsonIgnore
    public String getDSAsesorIIUDrvNombreCompleto() {
        return this.dSAsesorIIUDrvNombreCompleto;
    }
    
    public void setDSAsesorIIUDrvNombreCompleto(String dSAsesorIIUDrvNombreCompleto) {
        this.dSAsesorIIUDrvNombreCompleto = dSAsesorIIUDrvNombreCompleto;
    }
}
