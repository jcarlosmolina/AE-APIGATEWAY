package com.keralty.ae.viewmodel.logpriorizacionsol.ds;

import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSLogPriorizacionSol {

    @JsonProperty("fecha")
    private Timestamp dSLogPriorizacionSolFecha;

    @JsonProperty("loginfuncionario")
    private String dSLogPriorizacionSolLoginFuncionario;

    @JsonProperty("estadosolicitud")
    private Long dSLogPriorizacionSolEstadoSolicitud;

    @JsonProperty("estadodoc")
    private Long dSLogPriorizacionSolEstadoDoc;

    @JsonProperty("prioridad")
    private Long dSLogPriorizacionSolPrioridad;

    public DSLogPriorizacionSol() {
    
    }

    @JsonIgnore
    public Timestamp getDSLogPriorizacionSolFecha() {
        return this.dSLogPriorizacionSolFecha;
    }
    
    public void setDSLogPriorizacionSolFecha(Timestamp dSLogPriorizacionSolFecha) {
        this.dSLogPriorizacionSolFecha = dSLogPriorizacionSolFecha;
    }

    @JsonIgnore
    public String getDSLogPriorizacionSolLoginFuncionario() {
        return this.dSLogPriorizacionSolLoginFuncionario;
    }
    
    public void setDSLogPriorizacionSolLoginFuncionario(String dSLogPriorizacionSolLoginFuncionario) {
        this.dSLogPriorizacionSolLoginFuncionario = dSLogPriorizacionSolLoginFuncionario;
    }

    @JsonIgnore
    public Long getDSLogPriorizacionSolEstadoSolicitud() {
        return this.dSLogPriorizacionSolEstadoSolicitud;
    }
    
    public void setDSLogPriorizacionSolEstadoSolicitud(Long dSLogPriorizacionSolEstadoSolicitud) {
        this.dSLogPriorizacionSolEstadoSolicitud = dSLogPriorizacionSolEstadoSolicitud;
    }

    @JsonIgnore
    public Long getDSLogPriorizacionSolEstadoDoc() {
        return this.dSLogPriorizacionSolEstadoDoc;
    }
    
    public void setDSLogPriorizacionSolEstadoDoc(Long dSLogPriorizacionSolEstadoDoc) {
        this.dSLogPriorizacionSolEstadoDoc = dSLogPriorizacionSolEstadoDoc;
    }

    @JsonIgnore
    public Long getDSLogPriorizacionSolPrioridad() {
        return this.dSLogPriorizacionSolPrioridad;
    }
    
    public void setDSLogPriorizacionSolPrioridad(Long dSLogPriorizacionSolPrioridad) {
        this.dSLogPriorizacionSolPrioridad = dSLogPriorizacionSolPrioridad;
    }
}
