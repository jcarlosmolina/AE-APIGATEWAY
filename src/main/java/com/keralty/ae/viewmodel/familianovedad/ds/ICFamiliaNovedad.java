package com.keralty.ae.viewmodel.familianovedad.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICFamiliaNovedad {

    @JsonProperty("numfamilia")
    private Long iCFamiliaNovedadNumFamilia;

    public ICFamiliaNovedad() {
    
    }

    @JsonIgnore
    public Long getICFamiliaNovedadNumFamilia() {
        return this.iCFamiliaNovedadNumFamilia;
    }
    
    public void setICFamiliaNovedadNumFamilia(Long iCFamiliaNovedadNumFamilia) {
        this.iCFamiliaNovedadNumFamilia = iCFamiliaNovedadNumFamilia;
    }
}
