package com.keralty.ae.viewmodel.eps.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICEPS {

    @JsonProperty("descripcion")
    private String iCEPSDescripcion;

    public ICEPS() {
    
    }

    @JsonIgnore
    public String getICEPSDescripcion() {
        return this.iCEPSDescripcion;
    }
    
    public void setICEPSDescripcion(String iCEPSDescripcion) {
        this.iCEPSDescripcion = iCEPSDescripcion;
    }
}
