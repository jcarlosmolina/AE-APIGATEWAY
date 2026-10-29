package com.keralty.ae.viewmodel.causaexclusion.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSCausaExclusion {

    @JsonProperty("aliascausa")
    private String dSCausaExclusionAliasCausa;

    @JsonProperty("descripcion")
    private String dSCausaExclusionDescripcion;

    public DSCausaExclusion() {
    
    }

    @JsonIgnore
    public String getDSCausaExclusionAliasCausa() {
        return this.dSCausaExclusionAliasCausa;
    }
    
    public void setDSCausaExclusionAliasCausa(String dSCausaExclusionAliasCausa) {
        this.dSCausaExclusionAliasCausa = dSCausaExclusionAliasCausa;
    }

    @JsonIgnore
    public String getDSCausaExclusionDescripcion() {
        return this.dSCausaExclusionDescripcion;
    }
    
    public void setDSCausaExclusionDescripcion(String dSCausaExclusionDescripcion) {
        this.dSCausaExclusionDescripcion = dSCausaExclusionDescripcion;
    }
}
