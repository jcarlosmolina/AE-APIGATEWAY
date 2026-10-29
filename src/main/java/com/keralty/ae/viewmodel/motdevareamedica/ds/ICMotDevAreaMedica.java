package com.keralty.ae.viewmodel.motdevareamedica.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICMotDevAreaMedica {

    @JsonProperty("descripcion")
    private String iCMotDevAreaMedicaDescripcion;

    public ICMotDevAreaMedica() {
    
    }

    @JsonIgnore
    public String getICMotDevAreaMedicaDescripcion() {
        return this.iCMotDevAreaMedicaDescripcion;
    }
    
    public void setICMotDevAreaMedicaDescripcion(String iCMotDevAreaMedicaDescripcion) {
        this.iCMotDevAreaMedicaDescripcion = iCMotDevAreaMedicaDescripcion;
    }
}
