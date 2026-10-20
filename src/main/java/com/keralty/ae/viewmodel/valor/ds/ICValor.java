package com.keralty.ae.viewmodel.valor.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICValor {

    @JsonProperty("valorposible")
    private String iCValorValorPosible;

    public ICValor() {
    
    }

    @JsonIgnore
    public String getICValorValorPosible() {
        return this.iCValorValorPosible;
    }
    
    public void setICValorValorPosible(String iCValorValorPosible) {
        this.iCValorValorPosible = iCValorValorPosible;
    }
}
