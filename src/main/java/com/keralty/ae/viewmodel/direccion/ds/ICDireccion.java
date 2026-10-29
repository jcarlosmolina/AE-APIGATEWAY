package com.keralty.ae.viewmodel.direccion.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICDireccion {

    @JsonProperty("direccioncompleta")
    private String iCDireccionDireccionCompleta;

    @JsonProperty("tipodireccion_descripcion")
    private String iCDireccionTipoDireccionDotDescripcion;

    public ICDireccion() {
    
    }

    @JsonIgnore
    public String getICDireccionDireccionCompleta() {
        return this.iCDireccionDireccionCompleta;
    }
    
    public void setICDireccionDireccionCompleta(String iCDireccionDireccionCompleta) {
        this.iCDireccionDireccionCompleta = iCDireccionDireccionCompleta;
    }

    @JsonIgnore
    public String getICDireccionTipoDireccionDotDescripcion() {
        return this.iCDireccionTipoDireccionDotDescripcion;
    }
    
    public void setICDireccionTipoDireccionDotDescripcion(String iCDireccionTipoDireccionDotDescripcion) {
        this.iCDireccionTipoDireccionDotDescripcion = iCDireccionTipoDireccionDotDescripcion;
    }
}
