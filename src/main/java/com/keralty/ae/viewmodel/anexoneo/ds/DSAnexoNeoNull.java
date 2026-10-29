package com.keralty.ae.viewmodel.anexoneo.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSAnexoNeoNull {

    @JsonProperty("identificador")
    private Long dSAnexoNeoNullIdentificador;

    public DSAnexoNeoNull() {
    
    }

    @JsonIgnore
    public Long getDSAnexoNeoNullIdentificador() {
        return this.dSAnexoNeoNullIdentificador;
    }
    
    public void setDSAnexoNeoNullIdentificador(Long dSAnexoNeoNullIdentificador) {
        this.dSAnexoNeoNullIdentificador = dSAnexoNeoNullIdentificador;
    }
}
