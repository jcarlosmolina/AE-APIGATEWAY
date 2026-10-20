package com.keralty.ae.viewmodel.frecuenciaact.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICFrecuenciaAct {

    @JsonProperty("drvnombreparametrica")
    private String iCFrecuenciaActDrvNombreParametrica;

    public ICFrecuenciaAct() {
    
    }

    @JsonIgnore
    public String getICFrecuenciaActDrvNombreParametrica() {
        return this.iCFrecuenciaActDrvNombreParametrica;
    }
    
    public void setICFrecuenciaActDrvNombreParametrica(String iCFrecuenciaActDrvNombreParametrica) {
        this.iCFrecuenciaActDrvNombreParametrica = iCFrecuenciaActDrvNombreParametrica;
    }
}
