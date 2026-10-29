package com.keralty.ae.viewmodel.solicitudnovedad.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICSolicitudNovedad {

    @JsonProperty("drvnumradicadostr")
    private String iCSolicitudNovedadDrvNumRadicadoStr;

    public ICSolicitudNovedad() {
    
    }

    @JsonIgnore
    public String getICSolicitudNovedadDrvNumRadicadoStr() {
        return this.iCSolicitudNovedadDrvNumRadicadoStr;
    }
    
    public void setICSolicitudNovedadDrvNumRadicadoStr(String iCSolicitudNovedadDrvNumRadicadoStr) {
        this.iCSolicitudNovedadDrvNumRadicadoStr = iCSolicitudNovedadDrvNumRadicadoStr;
    }
}
