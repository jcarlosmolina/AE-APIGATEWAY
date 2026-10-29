package com.keralty.ae.viewmodel.plantillaemail.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICPlantillaEmail {

    @JsonProperty("descripcion")
    private String iCPlantillaEmailDescripcion;

    public ICPlantillaEmail() {
    
    }

    @JsonIgnore
    public String getICPlantillaEmailDescripcion() {
        return this.iCPlantillaEmailDescripcion;
    }
    
    public void setICPlantillaEmailDescripcion(String iCPlantillaEmailDescripcion) {
        this.iCPlantillaEmailDescripcion = iCPlantillaEmailDescripcion;
    }
}
