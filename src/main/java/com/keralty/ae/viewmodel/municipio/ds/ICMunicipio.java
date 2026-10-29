package com.keralty.ae.viewmodel.municipio.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICMunicipio {

    @JsonProperty("descripcion")
    private String iCMunicipioDescripcion;

    public ICMunicipio() {
    
    }

    @JsonIgnore
    public String getICMunicipioDescripcion() {
        return this.iCMunicipioDescripcion;
    }
    
    public void setICMunicipioDescripcion(String iCMunicipioDescripcion) {
        this.iCMunicipioDescripcion = iCMunicipioDescripcion;
    }
}
