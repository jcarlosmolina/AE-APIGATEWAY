package com.keralty.ae.viewmodel.solicitud.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICSolicitud {

    @JsonProperty("aesolicitudes_numerosolicitud")
    private String iCSolicitudAesolicitudesDotNumerosolicitud;

    public ICSolicitud() {
    
    }

    @JsonIgnore
    public String getICSolicitudAesolicitudesDotNumerosolicitud() {
        return this.iCSolicitudAesolicitudesDotNumerosolicitud;
    }
    
    public void setICSolicitudAesolicitudesDotNumerosolicitud(String iCSolicitudAesolicitudesDotNumerosolicitud) {
        this.iCSolicitudAesolicitudesDotNumerosolicitud = iCSolicitudAesolicitudesDotNumerosolicitud;
    }
}
