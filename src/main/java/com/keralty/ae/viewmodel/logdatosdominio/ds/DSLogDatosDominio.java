package com.keralty.ae.viewmodel.logdatosdominio.ds;

import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSLogDatosDominio {

    @JsonProperty("fecha")
    private Timestamp dSLogDatosDominioFecha;

    @JsonProperty("loginfuncionario")
    private String dSLogDatosDominioLoginFuncionario;

    @JsonProperty("tramiteenlinea")
    private Boolean dSLogDatosDominioTramiteEnLinea;

    @JsonProperty("vigenciaradicacion")
    private Boolean dSLogDatosDominioVigenciaRadicacion;

    public DSLogDatosDominio() {
    
    }

    @JsonIgnore
    public Timestamp getDSLogDatosDominioFecha() {
        return this.dSLogDatosDominioFecha;
    }
    
    public void setDSLogDatosDominioFecha(Timestamp dSLogDatosDominioFecha) {
        this.dSLogDatosDominioFecha = dSLogDatosDominioFecha;
    }

    @JsonIgnore
    public String getDSLogDatosDominioLoginFuncionario() {
        return this.dSLogDatosDominioLoginFuncionario;
    }
    
    public void setDSLogDatosDominioLoginFuncionario(String dSLogDatosDominioLoginFuncionario) {
        this.dSLogDatosDominioLoginFuncionario = dSLogDatosDominioLoginFuncionario;
    }

    @JsonIgnore
    public Boolean getDSLogDatosDominioTramiteEnLinea() {
        return this.dSLogDatosDominioTramiteEnLinea;
    }
    
    public void setDSLogDatosDominioTramiteEnLinea(Boolean dSLogDatosDominioTramiteEnLinea) {
        this.dSLogDatosDominioTramiteEnLinea = dSLogDatosDominioTramiteEnLinea;
    }

    @JsonIgnore
    public Boolean getDSLogDatosDominioVigenciaRadicacion() {
        return this.dSLogDatosDominioVigenciaRadicacion;
    }
    
    public void setDSLogDatosDominioVigenciaRadicacion(Boolean dSLogDatosDominioVigenciaRadicacion) {
        this.dSLogDatosDominioVigenciaRadicacion = dSLogDatosDominioVigenciaRadicacion;
    }
}
