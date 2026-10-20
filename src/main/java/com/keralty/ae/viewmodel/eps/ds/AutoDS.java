package com.keralty.ae.viewmodel.eps.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class AutoDS {

    @JsonProperty("codigo")
    private Long autoDSCodigo;

    @JsonProperty("descripcion")
    private String autoDSDescripcion;

    @JsonProperty("epssanitas")
    private Boolean autoDSEpsSanitas;

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
    public Boolean getAutoDSEpsSanitas() {
        return this.autoDSEpsSanitas;
    }
    
    public void setAutoDSEpsSanitas(Boolean autoDSEpsSanitas) {
        this.autoDSEpsSanitas = autoDSEpsSanitas;
    }
}
