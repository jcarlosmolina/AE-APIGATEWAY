package com.keralty.ae.viewmodel.asesor.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSAsesorNull {

    @JsonProperty("id")
    private Long dSAsesorNullId;

    public DSAsesorNull() {
    
    }

    @JsonIgnore
    public Long getDSAsesorNullId() {
        return this.dSAsesorNullId;
    }
    
    public void setDSAsesorNullId(Long dSAsesorNullId) {
        this.dSAsesorNullId = dSAsesorNullId;
    }
}
