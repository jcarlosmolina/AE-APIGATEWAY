package com.keralty.ae.viewmodel.documentonovedad.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICDocumentoNovedad {

    @JsonProperty("nombre")
    private String iCDocumentoNovedadNombre;

    public ICDocumentoNovedad() {
    
    }

    @JsonIgnore
    public String getICDocumentoNovedadNombre() {
        return this.iCDocumentoNovedadNombre;
    }
    
    public void setICDocumentoNovedadNombre(String iCDocumentoNovedadNombre) {
        this.iCDocumentoNovedadNombre = iCDocumentoNovedadNombre;
    }
}
