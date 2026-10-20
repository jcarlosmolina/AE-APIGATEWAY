package com.keralty.ae.viewmodel.tipoentidadc.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICTipoEntidad {

    @JsonProperty("descripcion")
    private String iCTipoEntidadDescripcion;

    public ICTipoEntidad() {
    
    }

    @JsonIgnore
    public String getICTipoEntidadDescripcion() {
        return this.iCTipoEntidadDescripcion;
    }
    
    public void setICTipoEntidadDescripcion(String iCTipoEntidadDescripcion) {
        this.iCTipoEntidadDescripcion = iCTipoEntidadDescripcion;
    }
}
