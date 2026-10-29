package com.keralty.ae.viewmodel.loginformacionasesor.ds;

import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSLogInformacionAsesor {

    @JsonProperty("fechahora")
    private Timestamp dSLogInformacionAsesorFechaHora;

    @JsonProperty("loginfuncionario")
    private String dSLogInformacionAsesorLoginFuncionario;

    @JsonProperty("verdatospersona")
    private Boolean dSLogInformacionAsesorVerDatosPersona;

    @JsonProperty("verdocspersona")
    private Boolean dSLogInformacionAsesorVerDocsPersona;

    @JsonProperty("vercontratonovedad")
    private Boolean dSLogInformacionAsesorVerContratoNovedad;

    public DSLogInformacionAsesor() {
    
    }

    @JsonIgnore
    public Timestamp getDSLogInformacionAsesorFechaHora() {
        return this.dSLogInformacionAsesorFechaHora;
    }
    
    public void setDSLogInformacionAsesorFechaHora(Timestamp dSLogInformacionAsesorFechaHora) {
        this.dSLogInformacionAsesorFechaHora = dSLogInformacionAsesorFechaHora;
    }

    @JsonIgnore
    public String getDSLogInformacionAsesorLoginFuncionario() {
        return this.dSLogInformacionAsesorLoginFuncionario;
    }
    
    public void setDSLogInformacionAsesorLoginFuncionario(String dSLogInformacionAsesorLoginFuncionario) {
        this.dSLogInformacionAsesorLoginFuncionario = dSLogInformacionAsesorLoginFuncionario;
    }

    @JsonIgnore
    public Boolean getDSLogInformacionAsesorVerDatosPersona() {
        return this.dSLogInformacionAsesorVerDatosPersona;
    }
    
    public void setDSLogInformacionAsesorVerDatosPersona(Boolean dSLogInformacionAsesorVerDatosPersona) {
        this.dSLogInformacionAsesorVerDatosPersona = dSLogInformacionAsesorVerDatosPersona;
    }

    @JsonIgnore
    public Boolean getDSLogInformacionAsesorVerDocsPersona() {
        return this.dSLogInformacionAsesorVerDocsPersona;
    }
    
    public void setDSLogInformacionAsesorVerDocsPersona(Boolean dSLogInformacionAsesorVerDocsPersona) {
        this.dSLogInformacionAsesorVerDocsPersona = dSLogInformacionAsesorVerDocsPersona;
    }

    @JsonIgnore
    public Boolean getDSLogInformacionAsesorVerContratoNovedad() {
        return this.dSLogInformacionAsesorVerContratoNovedad;
    }
    
    public void setDSLogInformacionAsesorVerContratoNovedad(Boolean dSLogInformacionAsesorVerContratoNovedad) {
        this.dSLogInformacionAsesorVerContratoNovedad = dSLogInformacionAsesorVerContratoNovedad;
    }
}
