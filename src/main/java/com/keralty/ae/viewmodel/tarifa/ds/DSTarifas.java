package com.keralty.ae.viewmodel.tarifa.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSTarifas {

    @JsonProperty("codigo")
    private String dSTarifasCodigo;

    @JsonProperty("productot_descripcion")
    private String dSTarifasProductoTDotDescripcion;

    @JsonProperty("plant_nombre")
    private String dSTarifasPlanTDotNombre;

    @JsonProperty("tipocontrato")
    private Long dSTarifasTipoContrato;

    public DSTarifas() {
    
    }

    @JsonIgnore
    public String getDSTarifasCodigo() {
        return this.dSTarifasCodigo;
    }
    
    public void setDSTarifasCodigo(String dSTarifasCodigo) {
        this.dSTarifasCodigo = dSTarifasCodigo;
    }

    @JsonIgnore
    public String getDSTarifasProductoTDotDescripcion() {
        return this.dSTarifasProductoTDotDescripcion;
    }
    
    public void setDSTarifasProductoTDotDescripcion(String dSTarifasProductoTDotDescripcion) {
        this.dSTarifasProductoTDotDescripcion = dSTarifasProductoTDotDescripcion;
    }

    @JsonIgnore
    public String getDSTarifasPlanTDotNombre() {
        return this.dSTarifasPlanTDotNombre;
    }
    
    public void setDSTarifasPlanTDotNombre(String dSTarifasPlanTDotNombre) {
        this.dSTarifasPlanTDotNombre = dSTarifasPlanTDotNombre;
    }

    @JsonIgnore
    public Long getDSTarifasTipoContrato() {
        return this.dSTarifasTipoContrato;
    }
    
    public void setDSTarifasTipoContrato(Long dSTarifasTipoContrato) {
        this.dSTarifasTipoContrato = dSTarifasTipoContrato;
    }
}
