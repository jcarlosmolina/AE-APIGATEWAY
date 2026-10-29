package com.keralty.ae.viewmodel.solicitudnovedad.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSSolicitudNovedadNull {

    @JsonProperty("id")
    private Long dSSolicitudNovedadNullId;

    public DSSolicitudNovedadNull() {
    
    }

    @JsonIgnore
    public Long getDSSolicitudNovedadNullId() {
        return this.dSSolicitudNovedadNullId;
    }
    
    public void setDSSolicitudNovedadNullId(Long dSSolicitudNovedadNullId) {
        this.dSSolicitudNovedadNullId = dSSolicitudNovedadNullId;
    }
}
