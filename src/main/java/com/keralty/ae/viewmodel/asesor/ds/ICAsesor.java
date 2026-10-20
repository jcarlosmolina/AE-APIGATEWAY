package com.keralty.ae.viewmodel.asesor.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICAsesor {

    @JsonProperty("primernombre")
    private String iCAsesorPrimerNombre;

    @JsonProperty("segundonombre")
    private String iCAsesorSegundoNombre;

    @JsonProperty("primerapellido")
    private String iCAsesorPrimerApellido;

    public ICAsesor() {
    
    }

    @JsonIgnore
    public String getICAsesorPrimerNombre() {
        return this.iCAsesorPrimerNombre;
    }
    
    public void setICAsesorPrimerNombre(String iCAsesorPrimerNombre) {
        this.iCAsesorPrimerNombre = iCAsesorPrimerNombre;
    }

    @JsonIgnore
    public String getICAsesorSegundoNombre() {
        return this.iCAsesorSegundoNombre;
    }
    
    public void setICAsesorSegundoNombre(String iCAsesorSegundoNombre) {
        this.iCAsesorSegundoNombre = iCAsesorSegundoNombre;
    }

    @JsonIgnore
    public String getICAsesorPrimerApellido() {
        return this.iCAsesorPrimerApellido;
    }
    
    public void setICAsesorPrimerApellido(String iCAsesorPrimerApellido) {
        this.iCAsesorPrimerApellido = iCAsesorPrimerApellido;
    }
}
