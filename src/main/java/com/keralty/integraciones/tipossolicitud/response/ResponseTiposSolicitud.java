package com.keralty.integraciones.tipossolicitud.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseTiposSolicitud {
    private List<TiposSolicitud> tiposSolicitud;

    @JsonProperty("TiposSolicitud")
    public List<TiposSolicitud> getTiposSolicitud() { return tiposSolicitud; }
    @JsonProperty("TiposSolicitud")
    public void setTiposSolicitud(List<TiposSolicitud> value) { this.tiposSolicitud = value; }
}
