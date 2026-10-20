package com.keralty.ae.viewmodel.periodicidad.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICPeriodicidad {

    @JsonProperty("descripcion")
    private String iCPeriodicidadDescripcion;

    public ICPeriodicidad() {
    
    }

    @JsonIgnore
    public String getICPeriodicidadDescripcion() {
        return this.iCPeriodicidadDescripcion;
    }
    
    public void setICPeriodicidadDescripcion(String iCPeriodicidadDescripcion) {
        this.iCPeriodicidadDescripcion = iCPeriodicidadDescripcion;
    }
}
