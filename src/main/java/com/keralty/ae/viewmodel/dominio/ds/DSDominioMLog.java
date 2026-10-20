package com.keralty.ae.viewmodel.dominio.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSDominioMLog {

    @JsonProperty("productot_descripcion")
    private String dSDominioMLogProductoTDotDescripcion;

    @JsonProperty("plant_nombre")
    private String dSDominioMLogPlanTDotNombre;

    public DSDominioMLog() {
    
    }

    @JsonIgnore
    public String getDSDominioMLogProductoTDotDescripcion() {
        return this.dSDominioMLogProductoTDotDescripcion;
    }
    
    public void setDSDominioMLogProductoTDotDescripcion(String dSDominioMLogProductoTDotDescripcion) {
        this.dSDominioMLogProductoTDotDescripcion = dSDominioMLogProductoTDotDescripcion;
    }

    @JsonIgnore
    public String getDSDominioMLogPlanTDotNombre() {
        return this.dSDominioMLogPlanTDotNombre;
    }
    
    public void setDSDominioMLogPlanTDotNombre(String dSDominioMLogPlanTDotNombre) {
        this.dSDominioMLogPlanTDotNombre = dSDominioMLogPlanTDotNombre;
    }
}
