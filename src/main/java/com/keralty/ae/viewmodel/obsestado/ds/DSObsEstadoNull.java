package com.keralty.ae.viewmodel.obsestado.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSObsEstadoNull {

    @JsonProperty("id")
    private Long dSObsEstadoNullId;

    public DSObsEstadoNull() {
    
    }

    @JsonIgnore
    public Long getDSObsEstadoNullId() {
        return this.dSObsEstadoNullId;
    }
    
    public void setDSObsEstadoNullId(Long dSObsEstadoNullId) {
        this.dSObsEstadoNullId = dSObsEstadoNullId;
    }
}
