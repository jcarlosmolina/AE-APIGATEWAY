package com.keralty.ae.viewmodel.usuarionovedad.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICUsuarioNovedad {

    @JsonProperty("drvnombrecompleto")
    private String iCUsuarioNovedadDrvNombreCompleto;

    public ICUsuarioNovedad() {
    
    }

    @JsonIgnore
    public String getICUsuarioNovedadDrvNombreCompleto() {
        return this.iCUsuarioNovedadDrvNombreCompleto;
    }
    
    public void setICUsuarioNovedadDrvNombreCompleto(String iCUsuarioNovedadDrvNombreCompleto) {
        this.iCUsuarioNovedadDrvNombreCompleto = iCUsuarioNovedadDrvNombreCompleto;
    }
}
