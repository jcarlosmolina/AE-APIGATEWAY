package com.keralty.ae.viewmodel.cuestionariop.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSCuestionarioPNull {

    @JsonProperty("numero")
    private Long dSCuestionarioPNullNumero;

    public DSCuestionarioPNull() {
    
    }

    @JsonIgnore
    public Long getDSCuestionarioPNullNumero() {
        return this.dSCuestionarioPNullNumero;
    }
    
    public void setDSCuestionarioPNullNumero(Long dSCuestionarioPNullNumero) {
        this.dSCuestionarioPNullNumero = dSCuestionarioPNullNumero;
    }
}
