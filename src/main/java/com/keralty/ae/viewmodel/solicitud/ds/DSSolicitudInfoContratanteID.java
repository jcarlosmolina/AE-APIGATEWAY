package com.keralty.ae.viewmodel.solicitud.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSSolicitudInfoContratanteID {

    @JsonProperty("contratante_drvidentificacion")
    private String dSSolicitudInfoContratanteIDContratanteDotDrvIdentificacion;

    @JsonProperty("contratante_tipoidentificacion_nit")
    private Boolean dSSolicitudInfoContratanteIDContratanteDotTipoIdentificacionDotNIT;

    public DSSolicitudInfoContratanteID() {
    
    }

    @JsonIgnore
    public String getDSSolicitudInfoContratanteIDContratanteDotDrvIdentificacion() {
        return this.dSSolicitudInfoContratanteIDContratanteDotDrvIdentificacion;
    }
    
    public void setDSSolicitudInfoContratanteIDContratanteDotDrvIdentificacion(String dSSolicitudInfoContratanteIDContratanteDotDrvIdentificacion) {
        this.dSSolicitudInfoContratanteIDContratanteDotDrvIdentificacion = dSSolicitudInfoContratanteIDContratanteDotDrvIdentificacion;
    }

    @JsonIgnore
    public Boolean getDSSolicitudInfoContratanteIDContratanteDotTipoIdentificacionDotNIT() {
        return this.dSSolicitudInfoContratanteIDContratanteDotTipoIdentificacionDotNIT;
    }
    
    public void setDSSolicitudInfoContratanteIDContratanteDotTipoIdentificacionDotNIT(Boolean dSSolicitudInfoContratanteIDContratanteDotTipoIdentificacionDotNIT) {
        this.dSSolicitudInfoContratanteIDContratanteDotTipoIdentificacionDotNIT = dSSolicitudInfoContratanteIDContratanteDotTipoIdentificacionDotNIT;
    }
}
