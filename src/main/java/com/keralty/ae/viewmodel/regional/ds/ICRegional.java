package com.keralty.ae.viewmodel.regional.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICRegional {

    @JsonProperty("descripcion")
    private String iCRegionalDescripcion;

    public ICRegional() {
    
    }

    @JsonIgnore
    public String getICRegionalDescripcion() {
        return this.iCRegionalDescripcion;
    }
    
    public void setICRegionalDescripcion(String iCRegionalDescripcion) {
        this.iCRegionalDescripcion = iCRegionalDescripcion;
    }
}
