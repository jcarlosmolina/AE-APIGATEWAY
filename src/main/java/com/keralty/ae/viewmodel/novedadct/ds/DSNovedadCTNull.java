package com.keralty.ae.viewmodel.novedadct.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSNovedadCTNull {

    @JsonProperty("idnovedadct")
    private Long dSNovedadCTNullIdNovedadCT;

    public DSNovedadCTNull() {
    
    }

    @JsonIgnore
    public Long getDSNovedadCTNullIdNovedadCT() {
        return this.dSNovedadCTNullIdNovedadCT;
    }
    
    public void setDSNovedadCTNullIdNovedadCT(Long dSNovedadCTNullIdNovedadCT) {
        this.dSNovedadCTNullIdNovedadCT = dSNovedadCTNullIdNovedadCT;
    }
}
