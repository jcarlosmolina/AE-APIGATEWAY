package com.keralty.ae.viewmodel.tipoidentificacion.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICTipoIdentificacion {

    @JsonProperty("nombrecorto")
    private String iCTipoIdentificacionNombreCorto;

    @JsonProperty("descripcion")
    private String iCTipoIdentificacionDescripcion;

    public ICTipoIdentificacion() {
    
    }

    @JsonIgnore
    public String getICTipoIdentificacionNombreCorto() {
        return this.iCTipoIdentificacionNombreCorto;
    }
    
    public void setICTipoIdentificacionNombreCorto(String iCTipoIdentificacionNombreCorto) {
        this.iCTipoIdentificacionNombreCorto = iCTipoIdentificacionNombreCorto;
    }

    @JsonIgnore
    public String getICTipoIdentificacionDescripcion() {
        return this.iCTipoIdentificacionDescripcion;
    }
    
    public void setICTipoIdentificacionDescripcion(String iCTipoIdentificacionDescripcion) {
        this.iCTipoIdentificacionDescripcion = iCTipoIdentificacionDescripcion;
    }
}
