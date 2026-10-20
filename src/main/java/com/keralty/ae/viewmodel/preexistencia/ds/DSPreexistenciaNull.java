package com.keralty.ae.viewmodel.preexistencia.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSPreexistenciaNull {

    @JsonProperty("identificador")
    private Long dSPreexistenciaNullIdentificador;

    public DSPreexistenciaNull() {
    
    }

    @JsonIgnore
    public Long getDSPreexistenciaNullIdentificador() {
        return this.dSPreexistenciaNullIdentificador;
    }
    
    public void setDSPreexistenciaNullIdentificador(Long dSPreexistenciaNullIdentificador) {
        this.dSPreexistenciaNullIdentificador = dSPreexistenciaNullIdentificador;
    }
}
