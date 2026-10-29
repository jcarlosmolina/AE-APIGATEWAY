package com.keralty.ae.viewmodel.logasignaciones.ds;

import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSLogAsignaciones {

    @JsonProperty("fechahora")
    private Timestamp dSLogAsignacionesFechaHora;

    @JsonProperty("quien")
    private String dSLogAsignacionesQuien;

    @JsonProperty("tipo")
    private String dSLogAsignacionesTipo;

    @JsonProperty("usuario")
    private String dSLogAsignacionesUsuario;

    public DSLogAsignaciones() {
    
    }

    @JsonIgnore
    public Timestamp getDSLogAsignacionesFechaHora() {
        return this.dSLogAsignacionesFechaHora;
    }
    
    public void setDSLogAsignacionesFechaHora(Timestamp dSLogAsignacionesFechaHora) {
        this.dSLogAsignacionesFechaHora = dSLogAsignacionesFechaHora;
    }

    @JsonIgnore
    public String getDSLogAsignacionesQuien() {
        return this.dSLogAsignacionesQuien;
    }
    
    public void setDSLogAsignacionesQuien(String dSLogAsignacionesQuien) {
        this.dSLogAsignacionesQuien = dSLogAsignacionesQuien;
    }

    @JsonIgnore
    public String getDSLogAsignacionesTipo() {
        return this.dSLogAsignacionesTipo;
    }
    
    public void setDSLogAsignacionesTipo(String dSLogAsignacionesTipo) {
        this.dSLogAsignacionesTipo = dSLogAsignacionesTipo;
    }

    @JsonIgnore
    public String getDSLogAsignacionesUsuario() {
        return this.dSLogAsignacionesUsuario;
    }
    
    public void setDSLogAsignacionesUsuario(String dSLogAsignacionesUsuario) {
        this.dSLogAsignacionesUsuario = dSLogAsignacionesUsuario;
    }
}
