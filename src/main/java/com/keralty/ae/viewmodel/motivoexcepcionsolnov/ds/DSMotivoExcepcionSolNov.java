package com.keralty.ae.viewmodel.motivoexcepcionsolnov.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSMotivoExcepcionSolNov {

    @JsonProperty("descripcion")
    private String dSMotivoExcepcionSolNovDescripcion;

    public DSMotivoExcepcionSolNov() {
    
    }

    @JsonIgnore
    public String getDSMotivoExcepcionSolNovDescripcion() {
        return this.dSMotivoExcepcionSolNovDescripcion;
    }
    
    public void setDSMotivoExcepcionSolNovDescripcion(String dSMotivoExcepcionSolNovDescripcion) {
        this.dSMotivoExcepcionSolNovDescripcion = dSMotivoExcepcionSolNovDescripcion;
    }
}
