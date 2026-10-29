package com.keralty.ae.viewmodel.cuestionariop.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSCuestionarioPIIU {

    @JsonProperty("usuario_drvnombrecompleto")
    private String dSCuestionarioPIIUUsuarioDotDrvNombreCompleto;

    @JsonProperty("yadiligenciado")
    private Boolean dSCuestionarioPIIUYaDiligenciado;

    public DSCuestionarioPIIU() {
    
    }

    @JsonIgnore
    public String getDSCuestionarioPIIUUsuarioDotDrvNombreCompleto() {
        return this.dSCuestionarioPIIUUsuarioDotDrvNombreCompleto;
    }
    
    public void setDSCuestionarioPIIUUsuarioDotDrvNombreCompleto(String dSCuestionarioPIIUUsuarioDotDrvNombreCompleto) {
        this.dSCuestionarioPIIUUsuarioDotDrvNombreCompleto = dSCuestionarioPIIUUsuarioDotDrvNombreCompleto;
    }

    @JsonIgnore
    public Boolean getDSCuestionarioPIIUYaDiligenciado() {
        return this.dSCuestionarioPIIUYaDiligenciado;
    }
    
    public void setDSCuestionarioPIIUYaDiligenciado(Boolean dSCuestionarioPIIUYaDiligenciado) {
        this.dSCuestionarioPIIUYaDiligenciado = dSCuestionarioPIIUYaDiligenciado;
    }
}
