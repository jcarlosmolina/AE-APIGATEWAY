package com.keralty.ae.viewmodel.usuario.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICUsuario {

    @JsonProperty("tipoidentificacion_nombrecorto")
    private String iCUsuarioTipoIdentificacionDotNombreCorto;

    @JsonProperty("numidentificacion")
    private String iCUsuarioNumIdentificacion;

    public ICUsuario() {
    
    }

    @JsonIgnore
    public String getICUsuarioTipoIdentificacionDotNombreCorto() {
        return this.iCUsuarioTipoIdentificacionDotNombreCorto;
    }
    
    public void setICUsuarioTipoIdentificacionDotNombreCorto(String iCUsuarioTipoIdentificacionDotNombreCorto) {
        this.iCUsuarioTipoIdentificacionDotNombreCorto = iCUsuarioTipoIdentificacionDotNombreCorto;
    }

    @JsonIgnore
    public String getICUsuarioNumIdentificacion() {
        return this.iCUsuarioNumIdentificacion;
    }
    
    public void setICUsuarioNumIdentificacion(String iCUsuarioNumIdentificacion) {
        this.iCUsuarioNumIdentificacion = iCUsuarioNumIdentificacion;
    }
}
