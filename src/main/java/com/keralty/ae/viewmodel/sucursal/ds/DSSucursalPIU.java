package com.keralty.ae.viewmodel.sucursal.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSSucursalPIU {

    @JsonProperty("regional_descripcion")
    private String dSSucursalPIURegionalDotDescripcion;

    @JsonProperty("codigo")
    private Long dSSucursalPIUCodigo;

    @JsonProperty("descripcion")
    private String dSSucursalPIUDescripcion;

    public DSSucursalPIU() {
    
    }

    @JsonIgnore
    public String getDSSucursalPIURegionalDotDescripcion() {
        return this.dSSucursalPIURegionalDotDescripcion;
    }
    
    public void setDSSucursalPIURegionalDotDescripcion(String dSSucursalPIURegionalDotDescripcion) {
        this.dSSucursalPIURegionalDotDescripcion = dSSucursalPIURegionalDotDescripcion;
    }

    @JsonIgnore
    public Long getDSSucursalPIUCodigo() {
        return this.dSSucursalPIUCodigo;
    }
    
    public void setDSSucursalPIUCodigo(Long dSSucursalPIUCodigo) {
        this.dSSucursalPIUCodigo = dSSucursalPIUCodigo;
    }

    @JsonIgnore
    public String getDSSucursalPIUDescripcion() {
        return this.dSSucursalPIUDescripcion;
    }
    
    public void setDSSucursalPIUDescripcion(String dSSucursalPIUDescripcion) {
        this.dSSucursalPIUDescripcion = dSSucursalPIUDescripcion;
    }
}
