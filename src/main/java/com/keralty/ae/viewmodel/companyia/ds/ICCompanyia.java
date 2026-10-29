package com.keralty.ae.viewmodel.companyia.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICCompanyia {

    @JsonProperty("nombre")
    private String iCCompanyiaNombre;

    public ICCompanyia() {
    
    }

    @JsonIgnore
    public String getICCompanyiaNombre() {
        return this.iCCompanyiaNombre;
    }
    
    public void setICCompanyiaNombre(String iCCompanyiaNombre) {
        this.iCCompanyiaNombre = iCCompanyiaNombre;
    }
}
