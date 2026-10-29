package com.keralty.ae.viewmodel.persona.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICPersona {

    @JsonProperty("tipoidentificacion_nombrecorto")
    private String iCPersonaTipoIdentificacionDotNombreCorto;

    @JsonProperty("numidentificacion")
    private String iCPersonaNumIdentificacion;

    public ICPersona() {
    
    }

    @JsonIgnore
    public String getICPersonaTipoIdentificacionDotNombreCorto() {
        return this.iCPersonaTipoIdentificacionDotNombreCorto;
    }
    
    public void setICPersonaTipoIdentificacionDotNombreCorto(String iCPersonaTipoIdentificacionDotNombreCorto) {
        this.iCPersonaTipoIdentificacionDotNombreCorto = iCPersonaTipoIdentificacionDotNombreCorto;
    }

    @JsonIgnore
    public String getICPersonaNumIdentificacion() {
        return this.iCPersonaNumIdentificacion;
    }
    
    public void setICPersonaNumIdentificacion(String iCPersonaNumIdentificacion) {
        this.iCPersonaNumIdentificacion = iCPersonaNumIdentificacion;
    }
}
