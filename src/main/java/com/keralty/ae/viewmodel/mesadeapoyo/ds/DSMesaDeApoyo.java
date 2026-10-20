package com.keralty.ae.viewmodel.mesadeapoyo.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSMesaDeApoyo {

    @JsonProperty("usuarioldap")
    private String dSMesaDeApoyoUsuarioLDAP;

    @JsonProperty("drvnombrecompleto")
    private String dSMesaDeApoyoDrvNombreCompleto;

    @JsonProperty("email")
    private String dSMesaDeApoyoEmail;

    public DSMesaDeApoyo() {
    
    }

    @JsonIgnore
    public String getDSMesaDeApoyoUsuarioLDAP() {
        return this.dSMesaDeApoyoUsuarioLDAP;
    }
    
    public void setDSMesaDeApoyoUsuarioLDAP(String dSMesaDeApoyoUsuarioLDAP) {
        this.dSMesaDeApoyoUsuarioLDAP = dSMesaDeApoyoUsuarioLDAP;
    }

    @JsonIgnore
    public String getDSMesaDeApoyoDrvNombreCompleto() {
        return this.dSMesaDeApoyoDrvNombreCompleto;
    }
    
    public void setDSMesaDeApoyoDrvNombreCompleto(String dSMesaDeApoyoDrvNombreCompleto) {
        this.dSMesaDeApoyoDrvNombreCompleto = dSMesaDeApoyoDrvNombreCompleto;
    }

    @JsonIgnore
    public String getDSMesaDeApoyoEmail() {
        return this.dSMesaDeApoyoEmail;
    }
    
    public void setDSMesaDeApoyoEmail(String dSMesaDeApoyoEmail) {
        this.dSMesaDeApoyoEmail = dSMesaDeApoyoEmail;
    }
}
