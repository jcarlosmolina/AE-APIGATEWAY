package com.keralty.ae.viewmodel.rol.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class AutoDS {

    @JsonProperty("identificador")
    private Long autoDSIdentificador;

    @JsonProperty("nombre")
    private String autoDSNombre;

    public AutoDS() {
    
    }

    @JsonIgnore
    public Long getAutoDSIdentificador() {
        return this.autoDSIdentificador;
    }
    
    public void setAutoDSIdentificador(Long autoDSIdentificador) {
        this.autoDSIdentificador = autoDSIdentificador;
    }

    @JsonIgnore
    public String getAutoDSNombre() {
        return this.autoDSNombre;
    }
    
    public void setAutoDSNombre(String autoDSNombre) {
        this.autoDSNombre = autoDSNombre;
    }
}
