package com.keralty.integraciones.tipossolicitud.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TiposSolicitud {
    private String idTipoSolicitud;
    private String idPago;
    private String nombreTipoSolicitud;
    private String idProducto;

    @JsonProperty("idTipoSolicitud")
    public String getIDTipoSolicitud() { return idTipoSolicitud; }
    @JsonProperty("idTipoSolicitud")
    public void setIDTipoSolicitud(String value) { this.idTipoSolicitud = value; }

    @JsonProperty("idPago")
    public String getIDPago() { return idPago; }
    @JsonProperty("idPago")
    public void setIDPago(String value) { this.idPago = value; }

    @JsonProperty("nombreTipoSolicitud")
    public String getNombreTipoSolicitud() { return nombreTipoSolicitud; }
    @JsonProperty("nombreTipoSolicitud")
    public void setNombreTipoSolicitud(String value) { this.nombreTipoSolicitud = value; }

    @JsonProperty("idProducto")
    public String getIDProducto() { return idProducto; }
    @JsonProperty("idProducto")
    public void setIDProducto(String value) { this.idProducto = value; }
}
