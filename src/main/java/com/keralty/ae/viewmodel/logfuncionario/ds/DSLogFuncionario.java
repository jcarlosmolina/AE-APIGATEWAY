package com.keralty.ae.viewmodel.logfuncionario.ds;

import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSLogFuncionario {

    @JsonProperty("fecha")
    private Timestamp dSLogFuncionarioFecha;

    @JsonProperty("loginfuncionario")
    private String dSLogFuncionarioLoginFuncionario;

    @JsonProperty("disponible")
    private Boolean dSLogFuncionarioDisponible;

    public DSLogFuncionario() {
    
    }

    @JsonIgnore
    public Timestamp getDSLogFuncionarioFecha() {
        return this.dSLogFuncionarioFecha;
    }
    
    public void setDSLogFuncionarioFecha(Timestamp dSLogFuncionarioFecha) {
        this.dSLogFuncionarioFecha = dSLogFuncionarioFecha;
    }

    @JsonIgnore
    public String getDSLogFuncionarioLoginFuncionario() {
        return this.dSLogFuncionarioLoginFuncionario;
    }
    
    public void setDSLogFuncionarioLoginFuncionario(String dSLogFuncionarioLoginFuncionario) {
        this.dSLogFuncionarioLoginFuncionario = dSLogFuncionarioLoginFuncionario;
    }

    @JsonIgnore
    public Boolean getDSLogFuncionarioDisponible() {
        return this.dSLogFuncionarioDisponible;
    }
    
    public void setDSLogFuncionarioDisponible(Boolean dSLogFuncionarioDisponible) {
        this.dSLogFuncionarioDisponible = dSLogFuncionarioDisponible;
    }
}
