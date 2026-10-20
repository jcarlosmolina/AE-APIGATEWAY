package com.keralty.ae.viewmodel.tipoinstitucionc.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICTipoInstitucion {

    @JsonProperty("nombre")
    private String iCTipoInstitucionNombre;

    public ICTipoInstitucion() {
    
    }

    @JsonIgnore
    public String getICTipoInstitucionNombre() {
        return this.iCTipoInstitucionNombre;
    }
    
    public void setICTipoInstitucionNombre(String iCTipoInstitucionNombre) {
        this.iCTipoInstitucionNombre = iCTipoInstitucionNombre;
    }
}
