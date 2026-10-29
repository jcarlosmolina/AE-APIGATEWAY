package com.keralty.ae.viewmodel.usuario.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSUsuarioNUll {

    @JsonProperty("identificador")
    private Long dSUsuarioNUllIdentificador;

    public DSUsuarioNUll() {
    
    }

    @JsonIgnore
    public Long getDSUsuarioNUllIdentificador() {
        return this.dSUsuarioNUllIdentificador;
    }
    
    public void setDSUsuarioNUllIdentificador(Long dSUsuarioNUllIdentificador) {
        this.dSUsuarioNUllIdentificador = dSUsuarioNUllIdentificador;
    }
}
