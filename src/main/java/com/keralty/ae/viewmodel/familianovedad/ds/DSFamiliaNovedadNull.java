package com.keralty.ae.viewmodel.familianovedad.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSFamiliaNovedadNull {

    @JsonProperty("idfamilianovedad")
    private Long dSFamiliaNovedadNullIdFamiliaNovedad;

    public DSFamiliaNovedadNull() {
    
    }

    @JsonIgnore
    public Long getDSFamiliaNovedadNullIdFamiliaNovedad() {
        return this.dSFamiliaNovedadNullIdFamiliaNovedad;
    }
    
    public void setDSFamiliaNovedadNullIdFamiliaNovedad(Long dSFamiliaNovedadNullIdFamiliaNovedad) {
        this.dSFamiliaNovedadNullIdFamiliaNovedad = dSFamiliaNovedadNullIdFamiliaNovedad;
    }
}
