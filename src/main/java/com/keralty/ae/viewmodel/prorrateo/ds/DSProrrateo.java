package com.keralty.ae.viewmodel.prorrateo.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSProrrateo {

    @JsonProperty("dia")
    private Long dSProrrateoDia;

    @JsonProperty("porcentaje")
    private Double dSProrrateoPorcentaje;

    public DSProrrateo() {
    
    }

    @JsonIgnore
    public Long getDSProrrateoDia() {
        return this.dSProrrateoDia;
    }
    
    public void setDSProrrateoDia(Long dSProrrateoDia) {
        this.dSProrrateoDia = dSProrrateoDia;
    }

    @JsonIgnore
    public Double getDSProrrateoPorcentaje() {
        return this.dSProrrateoPorcentaje;
    }
    
    public void setDSProrrateoPorcentaje(Double dSProrrateoPorcentaje) {
        this.dSProrrateoPorcentaje = dSProrrateoPorcentaje;
    }
}
