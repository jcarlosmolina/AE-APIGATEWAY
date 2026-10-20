package com.keralty.ae.viewmodel.dominio.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSDominiosPorAsesor {

    @JsonProperty("plant_codigolegal")
    private String dSDominiosPorAsesorPlanTDotCodigoLegal;

    @JsonProperty("plant_nombre")
    private String dSDominiosPorAsesorPlanTDotNombre;

    public DSDominiosPorAsesor() {
    
    }

    @JsonIgnore
    public String getDSDominiosPorAsesorPlanTDotCodigoLegal() {
        return this.dSDominiosPorAsesorPlanTDotCodigoLegal;
    }
    
    public void setDSDominiosPorAsesorPlanTDotCodigoLegal(String dSDominiosPorAsesorPlanTDotCodigoLegal) {
        this.dSDominiosPorAsesorPlanTDotCodigoLegal = dSDominiosPorAsesorPlanTDotCodigoLegal;
    }

    @JsonIgnore
    public String getDSDominiosPorAsesorPlanTDotNombre() {
        return this.dSDominiosPorAsesorPlanTDotNombre;
    }
    
    public void setDSDominiosPorAsesorPlanTDotNombre(String dSDominiosPorAsesorPlanTDotNombre) {
        this.dSDominiosPorAsesorPlanTDotNombre = dSDominiosPorAsesorPlanTDotNombre;
    }
}
