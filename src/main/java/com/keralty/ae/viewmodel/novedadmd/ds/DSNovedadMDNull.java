package com.keralty.ae.viewmodel.novedadmd.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSNovedadMDNull {

    @JsonProperty("idnovedadmd")
    private Long dSNovedadMDNullIdNovedadMD;

    public DSNovedadMDNull() {
    
    }

    @JsonIgnore
    public Long getDSNovedadMDNullIdNovedadMD() {
        return this.dSNovedadMDNullIdNovedadMD;
    }
    
    public void setDSNovedadMDNullIdNovedadMD(Long dSNovedadMDNullIdNovedadMD) {
        this.dSNovedadMDNullIdNovedadMD = dSNovedadMDNullIdNovedadMD;
    }
}
