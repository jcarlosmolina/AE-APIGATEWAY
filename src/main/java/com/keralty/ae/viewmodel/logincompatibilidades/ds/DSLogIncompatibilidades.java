package com.keralty.ae.viewmodel.logincompatibilidades.ds;

import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSLogIncompatibilidades {

    @JsonProperty("fecha")
    private Timestamp dSLogIncompatibilidadesFecha;

    @JsonProperty("loginfuncionario")
    private String dSLogIncompatibilidadesLoginFuncionario;

    @JsonProperty("accion")
    private String dSLogIncompatibilidadesAccion;

    @JsonProperty("nomdominio")
    private String dSLogIncompatibilidadesNomDominio;

    public DSLogIncompatibilidades() {
    
    }

    @JsonIgnore
    public Timestamp getDSLogIncompatibilidadesFecha() {
        return this.dSLogIncompatibilidadesFecha;
    }
    
    public void setDSLogIncompatibilidadesFecha(Timestamp dSLogIncompatibilidadesFecha) {
        this.dSLogIncompatibilidadesFecha = dSLogIncompatibilidadesFecha;
    }

    @JsonIgnore
    public String getDSLogIncompatibilidadesLoginFuncionario() {
        return this.dSLogIncompatibilidadesLoginFuncionario;
    }
    
    public void setDSLogIncompatibilidadesLoginFuncionario(String dSLogIncompatibilidadesLoginFuncionario) {
        this.dSLogIncompatibilidadesLoginFuncionario = dSLogIncompatibilidadesLoginFuncionario;
    }

    @JsonIgnore
    public String getDSLogIncompatibilidadesAccion() {
        return this.dSLogIncompatibilidadesAccion;
    }
    
    public void setDSLogIncompatibilidadesAccion(String dSLogIncompatibilidadesAccion) {
        this.dSLogIncompatibilidadesAccion = dSLogIncompatibilidadesAccion;
    }

    @JsonIgnore
    public String getDSLogIncompatibilidadesNomDominio() {
        return this.dSLogIncompatibilidadesNomDominio;
    }
    
    public void setDSLogIncompatibilidadesNomDominio(String dSLogIncompatibilidadesNomDominio) {
        this.dSLogIncompatibilidadesNomDominio = dSLogIncompatibilidadesNomDominio;
    }
}
