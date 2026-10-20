package com.keralty.ae.viewmodel.motdevareamedica.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSMotDevAreaMedica {

    @JsonProperty("id")
    private Long dSMotDevAreaMedicaId;

    @JsonProperty("descripcion")
    private String dSMotDevAreaMedicaDescripcion;

    public DSMotDevAreaMedica() {
    
    }

    @JsonIgnore
    public Long getDSMotDevAreaMedicaId() {
        return this.dSMotDevAreaMedicaId;
    }
    
    public void setDSMotDevAreaMedicaId(Long dSMotDevAreaMedicaId) {
        this.dSMotDevAreaMedicaId = dSMotDevAreaMedicaId;
    }

    @JsonIgnore
    public String getDSMotDevAreaMedicaDescripcion() {
        return this.dSMotDevAreaMedicaDescripcion;
    }
    
    public void setDSMotDevAreaMedicaDescripcion(String dSMotDevAreaMedicaDescripcion) {
        this.dSMotDevAreaMedicaDescripcion = dSMotDevAreaMedicaDescripcion;
    }
}
