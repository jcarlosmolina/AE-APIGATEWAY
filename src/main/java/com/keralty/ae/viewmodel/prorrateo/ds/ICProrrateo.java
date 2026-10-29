package com.keralty.ae.viewmodel.prorrateo.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICProrrateo {

    @JsonProperty("porcentaje")
    private Double iCProrrateoPorcentaje;

    public ICProrrateo() {
    
    }

    @JsonIgnore
    public Double getICProrrateoPorcentaje() {
        return this.iCProrrateoPorcentaje;
    }
    
    public void setICProrrateoPorcentaje(Double iCProrrateoPorcentaje) {
        this.iCProrrateoPorcentaje = iCProrrateoPorcentaje;
    }
}
