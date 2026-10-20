package com.keralty.ae.viewmodel.dominio.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICDominio {

    @JsonProperty("productot_descripcion")
    private String iCDominioProductoTDotDescripcion;

    @JsonProperty("plant_nombre")
    private String iCDominioPlanTDotNombre;

    public ICDominio() {
    
    }

    @JsonIgnore
    public String getICDominioProductoTDotDescripcion() {
        return this.iCDominioProductoTDotDescripcion;
    }
    
    public void setICDominioProductoTDotDescripcion(String iCDominioProductoTDotDescripcion) {
        this.iCDominioProductoTDotDescripcion = iCDominioProductoTDotDescripcion;
    }

    @JsonIgnore
    public String getICDominioPlanTDotNombre() {
        return this.iCDominioPlanTDotNombre;
    }
    
    public void setICDominioPlanTDotNombre(String iCDominioPlanTDotNombre) {
        this.iCDominioPlanTDotNombre = iCDominioPlanTDotNombre;
    }
}
