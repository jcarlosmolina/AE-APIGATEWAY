package com.keralty.ae.viewmodel.logusrsolnov.ds;

import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSLogUsrSolNov {

    @JsonProperty("fecha")
    private Timestamp dSLogUsrSolNovFecha;

    @JsonProperty("loginfuncionario")
    private String dSLogUsrSolNovLoginFuncionario;

    @JsonProperty("usuario")
    private String dSLogUsrSolNovUsuario;

    public DSLogUsrSolNov() {
    
    }

    @JsonIgnore
    public Timestamp getDSLogUsrSolNovFecha() {
        return this.dSLogUsrSolNovFecha;
    }
    
    public void setDSLogUsrSolNovFecha(Timestamp dSLogUsrSolNovFecha) {
        this.dSLogUsrSolNovFecha = dSLogUsrSolNovFecha;
    }

    @JsonIgnore
    public String getDSLogUsrSolNovLoginFuncionario() {
        return this.dSLogUsrSolNovLoginFuncionario;
    }
    
    public void setDSLogUsrSolNovLoginFuncionario(String dSLogUsrSolNovLoginFuncionario) {
        this.dSLogUsrSolNovLoginFuncionario = dSLogUsrSolNovLoginFuncionario;
    }

    @JsonIgnore
    public String getDSLogUsrSolNovUsuario() {
        return this.dSLogUsrSolNovUsuario;
    }
    
    public void setDSLogUsrSolNovUsuario(String dSLogUsrSolNovUsuario) {
        this.dSLogUsrSolNovUsuario = dSLogUsrSolNovUsuario;
    }
}
