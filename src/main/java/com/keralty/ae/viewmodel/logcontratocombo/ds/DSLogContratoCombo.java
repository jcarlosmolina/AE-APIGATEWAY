package com.keralty.ae.viewmodel.logcontratocombo.ds;

import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSLogContratoCombo {

    @JsonProperty("fecha")
    private Timestamp dSLogContratoComboFecha;

    @JsonProperty("loginfuncionario")
    private String dSLogContratoComboLoginFuncionario;

    @JsonProperty("contratointegral")
    private String dSLogContratoComboContratoIntegral;

    @JsonProperty("contratoodontologico")
    private String dSLogContratoComboContratoOdontologico;

    @JsonProperty("accion")
    private String dSLogContratoComboAccion;

    public DSLogContratoCombo() {
    
    }

    @JsonIgnore
    public Timestamp getDSLogContratoComboFecha() {
        return this.dSLogContratoComboFecha;
    }
    
    public void setDSLogContratoComboFecha(Timestamp dSLogContratoComboFecha) {
        this.dSLogContratoComboFecha = dSLogContratoComboFecha;
    }

    @JsonIgnore
    public String getDSLogContratoComboLoginFuncionario() {
        return this.dSLogContratoComboLoginFuncionario;
    }
    
    public void setDSLogContratoComboLoginFuncionario(String dSLogContratoComboLoginFuncionario) {
        this.dSLogContratoComboLoginFuncionario = dSLogContratoComboLoginFuncionario;
    }

    @JsonIgnore
    public String getDSLogContratoComboContratoIntegral() {
        return this.dSLogContratoComboContratoIntegral;
    }
    
    public void setDSLogContratoComboContratoIntegral(String dSLogContratoComboContratoIntegral) {
        this.dSLogContratoComboContratoIntegral = dSLogContratoComboContratoIntegral;
    }

    @JsonIgnore
    public String getDSLogContratoComboContratoOdontologico() {
        return this.dSLogContratoComboContratoOdontologico;
    }
    
    public void setDSLogContratoComboContratoOdontologico(String dSLogContratoComboContratoOdontologico) {
        this.dSLogContratoComboContratoOdontologico = dSLogContratoComboContratoOdontologico;
    }

    @JsonIgnore
    public String getDSLogContratoComboAccion() {
        return this.dSLogContratoComboAccion;
    }
    
    public void setDSLogContratoComboAccion(String dSLogContratoComboAccion) {
        this.dSLogContratoComboAccion = dSLogContratoComboAccion;
    }
}
