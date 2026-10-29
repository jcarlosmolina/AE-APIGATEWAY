package com.keralty.ae.viewmodel.productos.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICProducto {

    @JsonProperty("descripcion")
    private String iCProductoDescripcion;

    public ICProducto() {
    
    }

    @JsonIgnore
    public String getICProductoDescripcion() {
        return this.iCProductoDescripcion;
    }
    
    public void setICProductoDescripcion(String iCProductoDescripcion) {
        this.iCProductoDescripcion = iCProductoDescripcion;
    }
}
