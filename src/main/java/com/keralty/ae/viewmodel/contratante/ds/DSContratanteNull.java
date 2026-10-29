package com.keralty.ae.viewmodel.contratante.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSContratanteNull {

    @JsonProperty("codigo")
    private Long dSContratanteNullCodigo;

    public DSContratanteNull() {
    
    }

    @JsonIgnore
    public Long getDSContratanteNullCodigo() {
        return this.dSContratanteNullCodigo;
    }
    
    public void setDSContratanteNullCodigo(Long dSContratanteNullCodigo) {
        this.dSContratanteNullCodigo = dSContratanteNullCodigo;
    }
}
