package com.keralty.ae.viewmodel.contratosexentosfingreso.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICContratosExentosFIngreso {

    @JsonProperty("numcontrato")
    private String iCContratosExentosFIngresoNumContrato;

    public ICContratosExentosFIngreso() {
    
    }

    @JsonIgnore
    public String getICContratosExentosFIngresoNumContrato() {
        return this.iCContratosExentosFIngresoNumContrato;
    }
    
    public void setICContratosExentosFIngresoNumContrato(String iCContratosExentosFIngresoNumContrato) {
        this.iCContratosExentosFIngresoNumContrato = iCContratosExentosFIngresoNumContrato;
    }
}
