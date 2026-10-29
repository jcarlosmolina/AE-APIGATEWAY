package com.keralty.ae.viewmodel.usuario.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSUsuarioPolizaInter {

    @JsonProperty("solicitud_aesolicitudes_productot_descripcion")
    private String dSUsuarioPolizaInterSolicitudDotAesolicitudesDotProductoTDotDescripcion;

    @JsonProperty("solicitud_aesolicitudes_plant_nombre")
    private String dSUsuarioPolizaInterSolicitudDotAesolicitudesDotPlanTDotNombre;

    @JsonProperty("solicitud_aesolicitudes_numerosolicitud")
    private String dSUsuarioPolizaInterSolicitudDotAesolicitudesDotNumerosolicitud;

    @JsonProperty("solicitud_contratoc_numcontrato")
    private String dSUsuarioPolizaInterSolicitudDotContratoCDotNumContrato;

    @JsonProperty("solicitud_estado")
    private Long dSUsuarioPolizaInterSolicitudDotEstado;

    @JsonProperty("drvidentificacion")
    private String dSUsuarioPolizaInterDrvIdentificacion;

    @JsonProperty("drvnombrecompleto")
    private String dSUsuarioPolizaInterDrvNombreCompleto;

    public DSUsuarioPolizaInter() {
    
    }

    @JsonIgnore
    public String getDSUsuarioPolizaInterSolicitudDotAesolicitudesDotProductoTDotDescripcion() {
        return this.dSUsuarioPolizaInterSolicitudDotAesolicitudesDotProductoTDotDescripcion;
    }
    
    public void setDSUsuarioPolizaInterSolicitudDotAesolicitudesDotProductoTDotDescripcion(String dSUsuarioPolizaInterSolicitudDotAesolicitudesDotProductoTDotDescripcion) {
        this.dSUsuarioPolizaInterSolicitudDotAesolicitudesDotProductoTDotDescripcion = dSUsuarioPolizaInterSolicitudDotAesolicitudesDotProductoTDotDescripcion;
    }

    @JsonIgnore
    public String getDSUsuarioPolizaInterSolicitudDotAesolicitudesDotPlanTDotNombre() {
        return this.dSUsuarioPolizaInterSolicitudDotAesolicitudesDotPlanTDotNombre;
    }
    
    public void setDSUsuarioPolizaInterSolicitudDotAesolicitudesDotPlanTDotNombre(String dSUsuarioPolizaInterSolicitudDotAesolicitudesDotPlanTDotNombre) {
        this.dSUsuarioPolizaInterSolicitudDotAesolicitudesDotPlanTDotNombre = dSUsuarioPolizaInterSolicitudDotAesolicitudesDotPlanTDotNombre;
    }

    @JsonIgnore
    public String getDSUsuarioPolizaInterSolicitudDotAesolicitudesDotNumerosolicitud() {
        return this.dSUsuarioPolizaInterSolicitudDotAesolicitudesDotNumerosolicitud;
    }
    
    public void setDSUsuarioPolizaInterSolicitudDotAesolicitudesDotNumerosolicitud(String dSUsuarioPolizaInterSolicitudDotAesolicitudesDotNumerosolicitud) {
        this.dSUsuarioPolizaInterSolicitudDotAesolicitudesDotNumerosolicitud = dSUsuarioPolizaInterSolicitudDotAesolicitudesDotNumerosolicitud;
    }

    @JsonIgnore
    public String getDSUsuarioPolizaInterSolicitudDotContratoCDotNumContrato() {
        return this.dSUsuarioPolizaInterSolicitudDotContratoCDotNumContrato;
    }
    
    public void setDSUsuarioPolizaInterSolicitudDotContratoCDotNumContrato(String dSUsuarioPolizaInterSolicitudDotContratoCDotNumContrato) {
        this.dSUsuarioPolizaInterSolicitudDotContratoCDotNumContrato = dSUsuarioPolizaInterSolicitudDotContratoCDotNumContrato;
    }

    @JsonIgnore
    public Long getDSUsuarioPolizaInterSolicitudDotEstado() {
        return this.dSUsuarioPolizaInterSolicitudDotEstado;
    }
    
    public void setDSUsuarioPolizaInterSolicitudDotEstado(Long dSUsuarioPolizaInterSolicitudDotEstado) {
        this.dSUsuarioPolizaInterSolicitudDotEstado = dSUsuarioPolizaInterSolicitudDotEstado;
    }

    @JsonIgnore
    public String getDSUsuarioPolizaInterDrvIdentificacion() {
        return this.dSUsuarioPolizaInterDrvIdentificacion;
    }
    
    public void setDSUsuarioPolizaInterDrvIdentificacion(String dSUsuarioPolizaInterDrvIdentificacion) {
        this.dSUsuarioPolizaInterDrvIdentificacion = dSUsuarioPolizaInterDrvIdentificacion;
    }

    @JsonIgnore
    public String getDSUsuarioPolizaInterDrvNombreCompleto() {
        return this.dSUsuarioPolizaInterDrvNombreCompleto;
    }
    
    public void setDSUsuarioPolizaInterDrvNombreCompleto(String dSUsuarioPolizaInterDrvNombreCompleto) {
        this.dSUsuarioPolizaInterDrvNombreCompleto = dSUsuarioPolizaInterDrvNombreCompleto;
    }
}
