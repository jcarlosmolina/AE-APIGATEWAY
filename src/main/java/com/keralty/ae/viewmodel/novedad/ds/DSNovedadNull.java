package com.keralty.ae.viewmodel.novedad.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSNovedadNull {

    @JsonProperty("idnovedad")
    private Long dSNovedadNullIdNovedad;

    public DSNovedadNull() {
    
    }

    @JsonIgnore
    public Long getDSNovedadNullIdNovedad() {
        return this.dSNovedadNullIdNovedad;
    }
    
    public void setDSNovedadNullIdNovedad(Long dSNovedadNullIdNovedad) {
        this.dSNovedadNullIdNovedad = dSNovedadNullIdNovedad;
    }
}
