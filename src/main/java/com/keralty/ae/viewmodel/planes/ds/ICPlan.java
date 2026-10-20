package com.keralty.ae.viewmodel.planes.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICPlan {

    @JsonProperty("nombre")
    private String iCPlanNombre;

    public ICPlan() {
    
    }

    @JsonIgnore
    public String getICPlanNombre() {
        return this.iCPlanNombre;
    }
    
    public void setICPlanNombre(String iCPlanNombre) {
        this.iCPlanNombre = iCPlanNombre;
    }
}
