package com.keralty.ae.viewmodel.causaexclusion.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICCausaExclusion {

    @JsonProperty("descripcion")
    private String iCCausaExclusionDescripcion;

    public ICCausaExclusion() {
    
    }

    @JsonIgnore
    public String getICCausaExclusionDescripcion() {
        return this.iCCausaExclusionDescripcion;
    }
    
    public void setICCausaExclusionDescripcion(String iCCausaExclusionDescripcion) {
        this.iCCausaExclusionDescripcion = iCCausaExclusionDescripcion;
    }
}
