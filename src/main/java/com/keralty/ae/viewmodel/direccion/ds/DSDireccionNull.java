package com.keralty.ae.viewmodel.direccion.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSDireccionNull {

    @JsonProperty("codigo")
    private Long dSDireccionNullCodigo;

    public DSDireccionNull() {
    
    }

    @JsonIgnore
    public Long getDSDireccionNullCodigo() {
        return this.dSDireccionNullCodigo;
    }
    
    public void setDSDireccionNullCodigo(Long dSDireccionNullCodigo) {
        this.dSDireccionNullCodigo = dSDireccionNullCodigo;
    }
}
