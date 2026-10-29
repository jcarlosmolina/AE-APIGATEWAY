package com.keralty.ae.viewmodel.tarifa.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICTarifa {

    @JsonProperty("productot_descripcion")
    private String iCTarifaProductoTDotDescripcion;

    @JsonProperty("plant_nombre")
    private String iCTarifaPlanTDotNombre;

    @JsonProperty("codigo")
    private String iCTarifaCodigo;

    public ICTarifa() {
    
    }

    @JsonIgnore
    public String getICTarifaProductoTDotDescripcion() {
        return this.iCTarifaProductoTDotDescripcion;
    }
    
    public void setICTarifaProductoTDotDescripcion(String iCTarifaProductoTDotDescripcion) {
        this.iCTarifaProductoTDotDescripcion = iCTarifaProductoTDotDescripcion;
    }

    @JsonIgnore
    public String getICTarifaPlanTDotNombre() {
        return this.iCTarifaPlanTDotNombre;
    }
    
    public void setICTarifaPlanTDotNombre(String iCTarifaPlanTDotNombre) {
        this.iCTarifaPlanTDotNombre = iCTarifaPlanTDotNombre;
    }

    @JsonIgnore
    public String getICTarifaCodigo() {
        return this.iCTarifaCodigo;
    }
    
    public void setICTarifaCodigo(String iCTarifaCodigo) {
        this.iCTarifaCodigo = iCTarifaCodigo;
    }
}
