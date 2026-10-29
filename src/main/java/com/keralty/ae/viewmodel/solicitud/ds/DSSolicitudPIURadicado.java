package com.keralty.ae.viewmodel.solicitud.ds;

import java.sql.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSSolicitudPIURadicado {

    @JsonProperty("aesolicitudes_numerosolicitud")
    private String dSSolicitudPIURadicadoAesolicitudesDotNumerosolicitud;

    @JsonProperty("aesolicitudes_productot_descripcion")
    private String dSSolicitudPIURadicadoAesolicitudesDotProductoTDotDescripcion;

    @JsonProperty("aesolicitudes_plant_nombre")
    private String dSSolicitudPIURadicadoAesolicitudesDotPlanTDotNombre;

    @JsonProperty("tramite")
    private Long dSSolicitudPIURadicadoTramite;

    @JsonProperty("aesolicitudes_fechaasignacion")
    private Date dSSolicitudPIURadicadoAesolicitudesDotFechaasignacion;

    @JsonProperty("numradicado")
    private Long dSSolicitudPIURadicadoNumRadicado;

    @JsonProperty("contratantepersona_drvnombrecompleto")
    private String dSSolicitudPIURadicadoContratantePersonaDotDrvNombreCompleto;

    @JsonProperty("titularpersona_drvnombrecompleto")
    private String dSSolicitudPIURadicadoTitularPersonaDotDrvNombreCompleto;

    public DSSolicitudPIURadicado() {
    
    }

    @JsonIgnore
    public String getDSSolicitudPIURadicadoAesolicitudesDotNumerosolicitud() {
        return this.dSSolicitudPIURadicadoAesolicitudesDotNumerosolicitud;
    }
    
    public void setDSSolicitudPIURadicadoAesolicitudesDotNumerosolicitud(String dSSolicitudPIURadicadoAesolicitudesDotNumerosolicitud) {
        this.dSSolicitudPIURadicadoAesolicitudesDotNumerosolicitud = dSSolicitudPIURadicadoAesolicitudesDotNumerosolicitud;
    }

    @JsonIgnore
    public String getDSSolicitudPIURadicadoAesolicitudesDotProductoTDotDescripcion() {
        return this.dSSolicitudPIURadicadoAesolicitudesDotProductoTDotDescripcion;
    }
    
    public void setDSSolicitudPIURadicadoAesolicitudesDotProductoTDotDescripcion(String dSSolicitudPIURadicadoAesolicitudesDotProductoTDotDescripcion) {
        this.dSSolicitudPIURadicadoAesolicitudesDotProductoTDotDescripcion = dSSolicitudPIURadicadoAesolicitudesDotProductoTDotDescripcion;
    }

    @JsonIgnore
    public String getDSSolicitudPIURadicadoAesolicitudesDotPlanTDotNombre() {
        return this.dSSolicitudPIURadicadoAesolicitudesDotPlanTDotNombre;
    }
    
    public void setDSSolicitudPIURadicadoAesolicitudesDotPlanTDotNombre(String dSSolicitudPIURadicadoAesolicitudesDotPlanTDotNombre) {
        this.dSSolicitudPIURadicadoAesolicitudesDotPlanTDotNombre = dSSolicitudPIURadicadoAesolicitudesDotPlanTDotNombre;
    }

    @JsonIgnore
    public Long getDSSolicitudPIURadicadoTramite() {
        return this.dSSolicitudPIURadicadoTramite;
    }
    
    public void setDSSolicitudPIURadicadoTramite(Long dSSolicitudPIURadicadoTramite) {
        this.dSSolicitudPIURadicadoTramite = dSSolicitudPIURadicadoTramite;
    }

    @JsonIgnore
    public Date getDSSolicitudPIURadicadoAesolicitudesDotFechaasignacion() {
        return this.dSSolicitudPIURadicadoAesolicitudesDotFechaasignacion;
    }
    
    public void setDSSolicitudPIURadicadoAesolicitudesDotFechaasignacion(Date dSSolicitudPIURadicadoAesolicitudesDotFechaasignacion) {
        this.dSSolicitudPIURadicadoAesolicitudesDotFechaasignacion = dSSolicitudPIURadicadoAesolicitudesDotFechaasignacion;
    }

    @JsonIgnore
    public Long getDSSolicitudPIURadicadoNumRadicado() {
        return this.dSSolicitudPIURadicadoNumRadicado;
    }
    
    public void setDSSolicitudPIURadicadoNumRadicado(Long dSSolicitudPIURadicadoNumRadicado) {
        this.dSSolicitudPIURadicadoNumRadicado = dSSolicitudPIURadicadoNumRadicado;
    }

    @JsonIgnore
    public String getDSSolicitudPIURadicadoContratantePersonaDotDrvNombreCompleto() {
        return this.dSSolicitudPIURadicadoContratantePersonaDotDrvNombreCompleto;
    }
    
    public void setDSSolicitudPIURadicadoContratantePersonaDotDrvNombreCompleto(String dSSolicitudPIURadicadoContratantePersonaDotDrvNombreCompleto) {
        this.dSSolicitudPIURadicadoContratantePersonaDotDrvNombreCompleto = dSSolicitudPIURadicadoContratantePersonaDotDrvNombreCompleto;
    }

    @JsonIgnore
    public String getDSSolicitudPIURadicadoTitularPersonaDotDrvNombreCompleto() {
        return this.dSSolicitudPIURadicadoTitularPersonaDotDrvNombreCompleto;
    }
    
    public void setDSSolicitudPIURadicadoTitularPersonaDotDrvNombreCompleto(String dSSolicitudPIURadicadoTitularPersonaDotDrvNombreCompleto) {
        this.dSSolicitudPIURadicadoTitularPersonaDotDrvNombreCompleto = dSSolicitudPIURadicadoTitularPersonaDotDrvNombreCompleto;
    }
}
