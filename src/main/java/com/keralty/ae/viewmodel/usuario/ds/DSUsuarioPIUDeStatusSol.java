package com.keralty.ae.viewmodel.usuario.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSUsuarioPIUDeStatusSol {

    @JsonProperty("tipoidentificacion_nombrecorto")
    private String dSUsuarioPIUDeStatusSolTipoIdentificacionDotNombreCorto;

    @JsonProperty("numidentificacion")
    private String dSUsuarioPIUDeStatusSolNumIdentificacion;

    @JsonProperty("drvnombrecompleto")
    private String dSUsuarioPIUDeStatusSolDrvNombreCompleto;

    @JsonProperty("estadobeneficiario_descripcion")
    private String dSUsuarioPIUDeStatusSolEstadoBeneficiarioDotDescripcion;

    @JsonProperty("estadomedico")
    private Long dSUsuarioPIUDeStatusSolEstadoMedico;

    @JsonProperty("polizainternacional")
    private Boolean dSUsuarioPIUDeStatusSolPolizaInternacional;

    public DSUsuarioPIUDeStatusSol() {
    
    }

    @JsonIgnore
    public String getDSUsuarioPIUDeStatusSolTipoIdentificacionDotNombreCorto() {
        return this.dSUsuarioPIUDeStatusSolTipoIdentificacionDotNombreCorto;
    }
    
    public void setDSUsuarioPIUDeStatusSolTipoIdentificacionDotNombreCorto(String dSUsuarioPIUDeStatusSolTipoIdentificacionDotNombreCorto) {
        this.dSUsuarioPIUDeStatusSolTipoIdentificacionDotNombreCorto = dSUsuarioPIUDeStatusSolTipoIdentificacionDotNombreCorto;
    }

    @JsonIgnore
    public String getDSUsuarioPIUDeStatusSolNumIdentificacion() {
        return this.dSUsuarioPIUDeStatusSolNumIdentificacion;
    }
    
    public void setDSUsuarioPIUDeStatusSolNumIdentificacion(String dSUsuarioPIUDeStatusSolNumIdentificacion) {
        this.dSUsuarioPIUDeStatusSolNumIdentificacion = dSUsuarioPIUDeStatusSolNumIdentificacion;
    }

    @JsonIgnore
    public String getDSUsuarioPIUDeStatusSolDrvNombreCompleto() {
        return this.dSUsuarioPIUDeStatusSolDrvNombreCompleto;
    }
    
    public void setDSUsuarioPIUDeStatusSolDrvNombreCompleto(String dSUsuarioPIUDeStatusSolDrvNombreCompleto) {
        this.dSUsuarioPIUDeStatusSolDrvNombreCompleto = dSUsuarioPIUDeStatusSolDrvNombreCompleto;
    }

    @JsonIgnore
    public String getDSUsuarioPIUDeStatusSolEstadoBeneficiarioDotDescripcion() {
        return this.dSUsuarioPIUDeStatusSolEstadoBeneficiarioDotDescripcion;
    }
    
    public void setDSUsuarioPIUDeStatusSolEstadoBeneficiarioDotDescripcion(String dSUsuarioPIUDeStatusSolEstadoBeneficiarioDotDescripcion) {
        this.dSUsuarioPIUDeStatusSolEstadoBeneficiarioDotDescripcion = dSUsuarioPIUDeStatusSolEstadoBeneficiarioDotDescripcion;
    }

    @JsonIgnore
    public Long getDSUsuarioPIUDeStatusSolEstadoMedico() {
        return this.dSUsuarioPIUDeStatusSolEstadoMedico;
    }
    
    public void setDSUsuarioPIUDeStatusSolEstadoMedico(Long dSUsuarioPIUDeStatusSolEstadoMedico) {
        this.dSUsuarioPIUDeStatusSolEstadoMedico = dSUsuarioPIUDeStatusSolEstadoMedico;
    }

    @JsonIgnore
    public Boolean getDSUsuarioPIUDeStatusSolPolizaInternacional() {
        return this.dSUsuarioPIUDeStatusSolPolizaInternacional;
    }
    
    public void setDSUsuarioPIUDeStatusSolPolizaInternacional(Boolean dSUsuarioPIUDeStatusSolPolizaInternacional) {
        this.dSUsuarioPIUDeStatusSolPolizaInternacional = dSUsuarioPIUDeStatusSolPolizaInternacional;
    }
}
