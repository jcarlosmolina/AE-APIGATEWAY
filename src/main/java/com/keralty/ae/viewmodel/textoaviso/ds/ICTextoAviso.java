package com.keralty.ae.viewmodel.textoaviso.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICTextoAviso {

    @JsonProperty("identificador")
    private String iCTextoAvisoIdentificador;

    public ICTextoAviso() {
    
    }

    @JsonIgnore
    public String getICTextoAvisoIdentificador() {
        return this.iCTextoAvisoIdentificador;
    }
    
    public void setICTextoAvisoIdentificador(String iCTextoAvisoIdentificador) {
        this.iCTextoAvisoIdentificador = iCTextoAvisoIdentificador;
    }
}
