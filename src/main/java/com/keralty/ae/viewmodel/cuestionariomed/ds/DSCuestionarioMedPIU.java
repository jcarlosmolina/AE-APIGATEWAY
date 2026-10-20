package com.keralty.ae.viewmodel.cuestionariomed.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSCuestionarioMedPIU {

    @JsonProperty("numero")
    private Long dSCuestionarioMedPIUNumero;

    @JsonProperty("nombre")
    private String dSCuestionarioMedPIUNombre;

    public DSCuestionarioMedPIU() {
    
    }

    @JsonIgnore
    public Long getDSCuestionarioMedPIUNumero() {
        return this.dSCuestionarioMedPIUNumero;
    }
    
    public void setDSCuestionarioMedPIUNumero(Long dSCuestionarioMedPIUNumero) {
        this.dSCuestionarioMedPIUNumero = dSCuestionarioMedPIUNumero;
    }

    @JsonIgnore
    public String getDSCuestionarioMedPIUNombre() {
        return this.dSCuestionarioMedPIUNombre;
    }
    
    public void setDSCuestionarioMedPIUNombre(String dSCuestionarioMedPIUNombre) {
        this.dSCuestionarioMedPIUNombre = dSCuestionarioMedPIUNombre;
    }
}
