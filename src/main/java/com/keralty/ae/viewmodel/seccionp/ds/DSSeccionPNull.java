package com.keralty.ae.viewmodel.seccionp.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSSeccionPNull {

    @JsonProperty("identificador")
    private Long dSSeccionPNullIdentificador;

    public DSSeccionPNull() {
    
    }

    @JsonIgnore
    public Long getDSSeccionPNullIdentificador() {
        return this.dSSeccionPNullIdentificador;
    }
    
    public void setDSSeccionPNullIdentificador(Long dSSeccionPNullIdentificador) {
        this.dSSeccionPNullIdentificador = dSSeccionPNullIdentificador;
    }
}
