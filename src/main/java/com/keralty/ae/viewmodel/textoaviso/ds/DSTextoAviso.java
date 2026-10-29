package com.keralty.ae.viewmodel.textoaviso.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSTextoAviso {

    @JsonProperty("identificador")
    private String dSTextoAvisoIdentificador;

    @JsonProperty("descripcion")
    private String dSTextoAvisoDescripcion;

    public DSTextoAviso() {
    
    }

    @JsonIgnore
    public String getDSTextoAvisoIdentificador() {
        return this.dSTextoAvisoIdentificador;
    }
    
    public void setDSTextoAvisoIdentificador(String dSTextoAvisoIdentificador) {
        this.dSTextoAvisoIdentificador = dSTextoAvisoIdentificador;
    }

    @JsonIgnore
    public String getDSTextoAvisoDescripcion() {
        return this.dSTextoAvisoDescripcion;
    }
    
    public void setDSTextoAvisoDescripcion(String dSTextoAvisoDescripcion) {
        this.dSTextoAvisoDescripcion = dSTextoAvisoDescripcion;
    }
}
