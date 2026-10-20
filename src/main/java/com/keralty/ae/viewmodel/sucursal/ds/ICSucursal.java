package com.keralty.ae.viewmodel.sucursal.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICSucursal {

    @JsonProperty("descripcion")
    private String iCSucursalDescripcion;

    public ICSucursal() {
    
    }

    @JsonIgnore
    public String getICSucursalDescripcion() {
        return this.iCSucursalDescripcion;
    }
    
    public void setICSucursalDescripcion(String iCSucursalDescripcion) {
        this.iCSucursalDescripcion = iCSucursalDescripcion;
    }
}
