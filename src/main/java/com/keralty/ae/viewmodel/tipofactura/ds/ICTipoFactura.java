package com.keralty.ae.viewmodel.tipofactura.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICTipoFactura {

    @JsonProperty("descripcion")
    private String iCTipoFacturaDescripcion;

    public ICTipoFactura() {
    
    }

    @JsonIgnore
    public String getICTipoFacturaDescripcion() {
        return this.iCTipoFacturaDescripcion;
    }
    
    public void setICTipoFacturaDescripcion(String iCTipoFacturaDescripcion) {
        this.iCTipoFacturaDescripcion = iCTipoFacturaDescripcion;
    }
}
