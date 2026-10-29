package com.keralty.ae.viewmodel.formapago.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class AutoDS {

    @JsonProperty("codigo")
    private Long autoDSCodigo;

    @JsonProperty("descripcion")
    private String autoDSDescripcion;

    @JsonProperty("abrirurl")
    private Boolean autoDSAbrirURL;

    @JsonProperty("esvisible")
    private Boolean autoDSEsVisible;

    public AutoDS() {
    
    }

    @JsonIgnore
    public Long getAutoDSCodigo() {
        return this.autoDSCodigo;
    }
    
    public void setAutoDSCodigo(Long autoDSCodigo) {
        this.autoDSCodigo = autoDSCodigo;
    }

    @JsonIgnore
    public String getAutoDSDescripcion() {
        return this.autoDSDescripcion;
    }
    
    public void setAutoDSDescripcion(String autoDSDescripcion) {
        this.autoDSDescripcion = autoDSDescripcion;
    }

    @JsonIgnore
    public Boolean getAutoDSAbrirURL() {
        return this.autoDSAbrirURL;
    }
    
    public void setAutoDSAbrirURL(Boolean autoDSAbrirURL) {
        this.autoDSAbrirURL = autoDSAbrirURL;
    }

    @JsonIgnore
    public Boolean getAutoDSEsVisible() {
        return this.autoDSEsVisible;
    }
    
    public void setAutoDSEsVisible(Boolean autoDSEsVisible) {
        this.autoDSEsVisible = autoDSEsVisible;
    }
}
