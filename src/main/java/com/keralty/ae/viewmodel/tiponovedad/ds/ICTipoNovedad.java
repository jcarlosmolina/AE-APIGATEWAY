package com.keralty.ae.viewmodel.tiponovedad.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICTipoNovedad {

    @JsonProperty("nombre")
    private String iCTipoNovedadNombre;

    public ICTipoNovedad() {
    
    }

    @JsonIgnore
    public String getICTipoNovedadNombre() {
        return this.iCTipoNovedadNombre;
    }
    
    public void setICTipoNovedadNombre(String iCTipoNovedadNombre) {
        this.iCTipoNovedadNombre = iCTipoNovedadNombre;
    }
}
