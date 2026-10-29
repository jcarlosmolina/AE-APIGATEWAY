package com.keralty.ae.viewmodel.solicitud.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSSolicitudIIUPreexistencias {

    @JsonProperty("aesolicitudes_numerosolicitud")
    private String dSSolicitudIIUPreexistenciasAesolicitudesDotNumerosolicitud;

    @JsonProperty("numcontrato")
    private String dSSolicitudIIUPreexistenciasNumContrato;

    public DSSolicitudIIUPreexistencias() {
    
    }

    @JsonIgnore
    public String getDSSolicitudIIUPreexistenciasAesolicitudesDotNumerosolicitud() {
        return this.dSSolicitudIIUPreexistenciasAesolicitudesDotNumerosolicitud;
    }
    
    public void setDSSolicitudIIUPreexistenciasAesolicitudesDotNumerosolicitud(String dSSolicitudIIUPreexistenciasAesolicitudesDotNumerosolicitud) {
        this.dSSolicitudIIUPreexistenciasAesolicitudesDotNumerosolicitud = dSSolicitudIIUPreexistenciasAesolicitudesDotNumerosolicitud;
    }

    @JsonIgnore
    public String getDSSolicitudIIUPreexistenciasNumContrato() {
        return this.dSSolicitudIIUPreexistenciasNumContrato;
    }
    
    public void setDSSolicitudIIUPreexistenciasNumContrato(String dSSolicitudIIUPreexistenciasNumContrato) {
        this.dSSolicitudIIUPreexistenciasNumContrato = dSSolicitudIIUPreexistenciasNumContrato;
    }
}
