package com.keralty.ae.viewmodel.tipoiva.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICTipoIVA {

    @JsonProperty("descripcion")
    private String iCTipoIVADescripcion;

    public ICTipoIVA() {
    
    }

    @JsonIgnore
    public String getICTipoIVADescripcion() {
        return this.iCTipoIVADescripcion;
    }
    
    public void setICTipoIVADescripcion(String iCTipoIVADescripcion) {
        this.iCTipoIVADescripcion = iCTipoIVADescripcion;
    }
}
