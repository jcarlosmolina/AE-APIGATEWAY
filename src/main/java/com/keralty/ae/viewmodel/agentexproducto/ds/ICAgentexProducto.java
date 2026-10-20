package com.keralty.ae.viewmodel.agentexproducto.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICAgentexProducto {

    @JsonProperty("asesor_drvnombrecompleto")
    private String iCAgentexProductoAsesorDotDrvNombreCompleto;

    @JsonProperty("productot_descripcion")
    private String iCAgentexProductoProductoTDotDescripcion;

    public ICAgentexProducto() {
    
    }

    @JsonIgnore
    public String getICAgentexProductoAsesorDotDrvNombreCompleto() {
        return this.iCAgentexProductoAsesorDotDrvNombreCompleto;
    }
    
    public void setICAgentexProductoAsesorDotDrvNombreCompleto(String iCAgentexProductoAsesorDotDrvNombreCompleto) {
        this.iCAgentexProductoAsesorDotDrvNombreCompleto = iCAgentexProductoAsesorDotDrvNombreCompleto;
    }

    @JsonIgnore
    public String getICAgentexProductoProductoTDotDescripcion() {
        return this.iCAgentexProductoProductoTDotDescripcion;
    }
    
    public void setICAgentexProductoProductoTDotDescripcion(String iCAgentexProductoProductoTDotDescripcion) {
        this.iCAgentexProductoProductoTDotDescripcion = iCAgentexProductoProductoTDotDescripcion;
    }
}
