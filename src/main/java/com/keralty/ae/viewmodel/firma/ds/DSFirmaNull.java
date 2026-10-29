package com.keralty.ae.viewmodel.firma.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSFirmaNull {

    @JsonProperty("identificador")
    private Long dSFirmaNullIdentificador;

    public DSFirmaNull() {
    
    }

    @JsonIgnore
    public Long getDSFirmaNullIdentificador() {
        return this.dSFirmaNullIdentificador;
    }
    
    public void setDSFirmaNullIdentificador(Long dSFirmaNullIdentificador) {
        this.dSFirmaNullIdentificador = dSFirmaNullIdentificador;
    }
}
