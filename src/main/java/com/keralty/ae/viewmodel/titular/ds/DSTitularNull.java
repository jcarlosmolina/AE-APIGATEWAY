package com.keralty.ae.viewmodel.titular.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSTitularNull {

    @JsonProperty("codigo")
    private Long dSTitularNullCodigo;

    public DSTitularNull() {
    
    }

    @JsonIgnore
    public Long getDSTitularNullCodigo() {
        return this.dSTitularNullCodigo;
    }
    
    public void setDSTitularNullCodigo(Long dSTitularNullCodigo) {
        this.dSTitularNullCodigo = dSTitularNullCodigo;
    }
}
