package com.keralty.ae.viewmodel.preguntap.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSPreguntaPNull {

    @JsonProperty("identificador")
    private Long dSPreguntaPNullIdentificador;

    public DSPreguntaPNull() {
    
    }

    @JsonIgnore
    public Long getDSPreguntaPNullIdentificador() {
        return this.dSPreguntaPNullIdentificador;
    }
    
    public void setDSPreguntaPNullIdentificador(Long dSPreguntaPNullIdentificador) {
        this.dSPreguntaPNullIdentificador = dSPreguntaPNullIdentificador;
    }
}
