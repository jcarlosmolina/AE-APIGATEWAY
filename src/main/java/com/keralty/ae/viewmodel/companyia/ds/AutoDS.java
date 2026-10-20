package com.keralty.ae.viewmodel.companyia.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class AutoDS {

    @JsonProperty("codigo")
    private Long autoDSCodigo;

    @JsonProperty("nombre")
    private String autoDSNombre;

    @JsonProperty("esdemp")
    private Boolean autoDSEsDeMP;

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
    public String getAutoDSNombre() {
        return this.autoDSNombre;
    }
    
    public void setAutoDSNombre(String autoDSNombre) {
        this.autoDSNombre = autoDSNombre;
    }

    @JsonIgnore
    public Boolean getAutoDSEsDeMP() {
        return this.autoDSEsDeMP;
    }
    
    public void setAutoDSEsDeMP(Boolean autoDSEsDeMP) {
        this.autoDSEsDeMP = autoDSEsDeMP;
    }
}
