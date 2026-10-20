package com.keralty.ae.viewmodel.causal.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSCausalNull {

    @JsonProperty("idcausal")
    private Long dSCausalNullIdCausal;

    public DSCausalNull() {
    
    }

    @JsonIgnore
    public Long getDSCausalNullIdCausal() {
        return this.dSCausalNullIdCausal;
    }
    
    public void setDSCausalNullIdCausal(Long dSCausalNullIdCausal) {
        this.dSCausalNullIdCausal = dSCausalNullIdCausal;
    }
}
