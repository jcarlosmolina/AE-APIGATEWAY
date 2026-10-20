package com.keralty.ae.viewmodel.logllamadasae.ds;

import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSLogLlamadasAE {

    @JsonProperty("tiposervicio")
    private String dSLogLlamadasAETipoServicio;

    @JsonProperty("servicio")
    private String dSLogLlamadasAEServicio;

    @JsonProperty("capacidad")
    private String dSLogLlamadasAECapacidad;

    @JsonProperty("fechahora")
    private Timestamp dSLogLlamadasAEFechaHora;

    @JsonProperty("textoerror")
    private String dSLogLlamadasAETextoError;

    public DSLogLlamadasAE() {
    
    }

    @JsonIgnore
    public String getDSLogLlamadasAETipoServicio() {
        return this.dSLogLlamadasAETipoServicio;
    }
    
    public void setDSLogLlamadasAETipoServicio(String dSLogLlamadasAETipoServicio) {
        this.dSLogLlamadasAETipoServicio = dSLogLlamadasAETipoServicio;
    }

    @JsonIgnore
    public String getDSLogLlamadasAEServicio() {
        return this.dSLogLlamadasAEServicio;
    }
    
    public void setDSLogLlamadasAEServicio(String dSLogLlamadasAEServicio) {
        this.dSLogLlamadasAEServicio = dSLogLlamadasAEServicio;
    }

    @JsonIgnore
    public String getDSLogLlamadasAECapacidad() {
        return this.dSLogLlamadasAECapacidad;
    }
    
    public void setDSLogLlamadasAECapacidad(String dSLogLlamadasAECapacidad) {
        this.dSLogLlamadasAECapacidad = dSLogLlamadasAECapacidad;
    }

    @JsonIgnore
    public Timestamp getDSLogLlamadasAEFechaHora() {
        return this.dSLogLlamadasAEFechaHora;
    }
    
    public void setDSLogLlamadasAEFechaHora(Timestamp dSLogLlamadasAEFechaHora) {
        this.dSLogLlamadasAEFechaHora = dSLogLlamadasAEFechaHora;
    }

    @JsonIgnore
    public String getDSLogLlamadasAETextoError() {
        return this.dSLogLlamadasAETextoError;
    }
    
    public void setDSLogLlamadasAETextoError(String dSLogLlamadasAETextoError) {
        this.dSLogLlamadasAETextoError = dSLogLlamadasAETextoError;
    }
}
