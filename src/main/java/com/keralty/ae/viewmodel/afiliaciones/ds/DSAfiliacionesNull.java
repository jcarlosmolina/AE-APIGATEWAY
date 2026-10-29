package com.keralty.ae.viewmodel.afiliaciones.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSAfiliacionesNull {

    @JsonProperty("id")
    private Long dSAfiliacionesNullId;

    public DSAfiliacionesNull() {
    
    }

    @JsonIgnore
    public Long getDSAfiliacionesNullId() {
        return this.dSAfiliacionesNullId;
    }
    
    public void setDSAfiliacionesNullId(Long dSAfiliacionesNullId) {
        this.dSAfiliacionesNullId = dSAfiliacionesNullId;
    }
}
