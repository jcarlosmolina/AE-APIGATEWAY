package com.keralty.ae.viewmodel.usuarionovedad.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSUsuarioNovedadNull {

    @JsonProperty("idusuarionovedad")
    private Long dSUsuarioNovedadNullIdUsuarioNovedad;

    public DSUsuarioNovedadNull() {
    
    }

    @JsonIgnore
    public Long getDSUsuarioNovedadNullIdUsuarioNovedad() {
        return this.dSUsuarioNovedadNullIdUsuarioNovedad;
    }
    
    public void setDSUsuarioNovedadNullIdUsuarioNovedad(Long dSUsuarioNovedadNullIdUsuarioNovedad) {
        this.dSUsuarioNovedadNullIdUsuarioNovedad = dSUsuarioNovedadNullIdUsuarioNovedad;
    }
}
