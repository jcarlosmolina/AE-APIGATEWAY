package com.keralty.ae.viewmodel.protecciondatos.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSProteccionDatosNull {

    @JsonProperty("identificador")
    private Long dSProteccionDatosNullIdentificador;

    public DSProteccionDatosNull() {
    
    }

    @JsonIgnore
    public Long getDSProteccionDatosNullIdentificador() {
        return this.dSProteccionDatosNullIdentificador;
    }
    
    public void setDSProteccionDatosNullIdentificador(Long dSProteccionDatosNullIdentificador) {
        this.dSProteccionDatosNullIdentificador = dSProteccionDatosNullIdentificador;
    }
}
