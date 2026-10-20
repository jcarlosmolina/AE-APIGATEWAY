package com.keralty.ae.viewmodel.contratosexentosfingreso.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSContratosExentosFIngreso {

    @JsonProperty("numcontrato")
    private String dSContratosExentosFIngresoNumContrato;

    public DSContratosExentosFIngreso() {
    
    }

    @JsonIgnore
    public String getDSContratosExentosFIngresoNumContrato() {
        return this.dSContratosExentosFIngresoNumContrato;
    }
    
    public void setDSContratosExentosFIngresoNumContrato(String dSContratosExentosFIngresoNumContrato) {
        this.dSContratosExentosFIngresoNumContrato = dSContratosExentosFIngresoNumContrato;
    }
}
