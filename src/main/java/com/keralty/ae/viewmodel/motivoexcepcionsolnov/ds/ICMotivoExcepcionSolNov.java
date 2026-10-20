package com.keralty.ae.viewmodel.motivoexcepcionsolnov.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICMotivoExcepcionSolNov {

    @JsonProperty("descripcion")
    private String iCMotivoExcepcionSolNovDescripcion;

    public ICMotivoExcepcionSolNov() {
    
    }

    @JsonIgnore
    public String getICMotivoExcepcionSolNovDescripcion() {
        return this.iCMotivoExcepcionSolNovDescripcion;
    }
    
    public void setICMotivoExcepcionSolNovDescripcion(String iCMotivoExcepcionSolNovDescripcion) {
        this.iCMotivoExcepcionSolNovDescripcion = iCMotivoExcepcionSolNovDescripcion;
    }
}
