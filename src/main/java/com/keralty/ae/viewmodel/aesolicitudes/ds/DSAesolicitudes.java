package com.keralty.ae.viewmodel.aesolicitudes.ds;

import java.sql.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSAesolicitudes {

    @JsonProperty("fechaasignacion")
    private Date dSAesolicitudesFechaasignacion;

    @JsonProperty("numerosolicitud")
    private String dSAesolicitudesNumerosolicitud;

    @JsonProperty("swestado")
    private String dSAesolicitudesSwestado;

    public DSAesolicitudes() {
    
    }

    @JsonIgnore
    public Date getDSAesolicitudesFechaasignacion() {
        return this.dSAesolicitudesFechaasignacion;
    }
    
    public void setDSAesolicitudesFechaasignacion(Date dSAesolicitudesFechaasignacion) {
        this.dSAesolicitudesFechaasignacion = dSAesolicitudesFechaasignacion;
    }

    @JsonIgnore
    public String getDSAesolicitudesNumerosolicitud() {
        return this.dSAesolicitudesNumerosolicitud;
    }
    
    public void setDSAesolicitudesNumerosolicitud(String dSAesolicitudesNumerosolicitud) {
        this.dSAesolicitudesNumerosolicitud = dSAesolicitudesNumerosolicitud;
    }

    @JsonIgnore
    public String getDSAesolicitudesSwestado() {
        return this.dSAesolicitudesSwestado;
    }
    
    public void setDSAesolicitudesSwestado(String dSAesolicitudesSwestado) {
        this.dSAesolicitudesSwestado = dSAesolicitudesSwestado;
    }
}
