package com.keralty.ae.viewmodel.gestor.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSGestor {

    @JsonProperty("usuarioldap")
    private String dSGestorUsuarioLDAP;

    @JsonProperty("drvnombrecompleto")
    private String dSGestorDrvNombreCompleto;

    @JsonProperty("email")
    private String dSGestorEmail;

    public DSGestor() {
    
    }

    @JsonIgnore
    public String getDSGestorUsuarioLDAP() {
        return this.dSGestorUsuarioLDAP;
    }
    
    public void setDSGestorUsuarioLDAP(String dSGestorUsuarioLDAP) {
        this.dSGestorUsuarioLDAP = dSGestorUsuarioLDAP;
    }

    @JsonIgnore
    public String getDSGestorDrvNombreCompleto() {
        return this.dSGestorDrvNombreCompleto;
    }
    
    public void setDSGestorDrvNombreCompleto(String dSGestorDrvNombreCompleto) {
        this.dSGestorDrvNombreCompleto = dSGestorDrvNombreCompleto;
    }

    @JsonIgnore
    public String getDSGestorEmail() {
        return this.dSGestorEmail;
    }
    
    public void setDSGestorEmail(String dSGestorEmail) {
        this.dSGestorEmail = dSGestorEmail;
    }
}
