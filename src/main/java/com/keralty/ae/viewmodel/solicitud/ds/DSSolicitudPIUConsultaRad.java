package com.keralty.ae.viewmodel.solicitud.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSSolicitudPIUConsultaRad {

    @JsonProperty("aesolicitudes_numerosolicitud")
    private String dSSolicitudPIUConsultaRadAesolicitudesDotNumerosolicitud;

    @JsonProperty("aesolicitudes_productot_descripcion")
    private String dSSolicitudPIUConsultaRadAesolicitudesDotProductoTDotDescripcion;

    @JsonProperty("aesolicitudes_plant_nombre")
    private String dSSolicitudPIUConsultaRadAesolicitudesDotPlanTDotNombre;

    @JsonProperty("tramite")
    private Long dSSolicitudPIUConsultaRadTramite;

    public DSSolicitudPIUConsultaRad() {
    
    }

    @JsonIgnore
    public String getDSSolicitudPIUConsultaRadAesolicitudesDotNumerosolicitud() {
        return this.dSSolicitudPIUConsultaRadAesolicitudesDotNumerosolicitud;
    }
    
    public void setDSSolicitudPIUConsultaRadAesolicitudesDotNumerosolicitud(String dSSolicitudPIUConsultaRadAesolicitudesDotNumerosolicitud) {
        this.dSSolicitudPIUConsultaRadAesolicitudesDotNumerosolicitud = dSSolicitudPIUConsultaRadAesolicitudesDotNumerosolicitud;
    }

    @JsonIgnore
    public String getDSSolicitudPIUConsultaRadAesolicitudesDotProductoTDotDescripcion() {
        return this.dSSolicitudPIUConsultaRadAesolicitudesDotProductoTDotDescripcion;
    }
    
    public void setDSSolicitudPIUConsultaRadAesolicitudesDotProductoTDotDescripcion(String dSSolicitudPIUConsultaRadAesolicitudesDotProductoTDotDescripcion) {
        this.dSSolicitudPIUConsultaRadAesolicitudesDotProductoTDotDescripcion = dSSolicitudPIUConsultaRadAesolicitudesDotProductoTDotDescripcion;
    }

    @JsonIgnore
    public String getDSSolicitudPIUConsultaRadAesolicitudesDotPlanTDotNombre() {
        return this.dSSolicitudPIUConsultaRadAesolicitudesDotPlanTDotNombre;
    }
    
    public void setDSSolicitudPIUConsultaRadAesolicitudesDotPlanTDotNombre(String dSSolicitudPIUConsultaRadAesolicitudesDotPlanTDotNombre) {
        this.dSSolicitudPIUConsultaRadAesolicitudesDotPlanTDotNombre = dSSolicitudPIUConsultaRadAesolicitudesDotPlanTDotNombre;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUConsultaRadTramite() {
        return this.dSSolicitudPIUConsultaRadTramite;
    }
    
    public void setDSSolicitudPIUConsultaRadTramite(Long dSSolicitudPIUConsultaRadTramite) {
        this.dSSolicitudPIUConsultaRadTramite = dSSolicitudPIUConsultaRadTramite;
    }
}
