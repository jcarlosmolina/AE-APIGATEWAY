package com.keralty.ae.viewmodel.contratocombo.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSContratoCombo {

    @JsonProperty("contratointegral")
    private String dSContratoComboContratoIntegral;

    @JsonProperty("contratoodontologico")
    private String dSContratoComboContratoOdontologico;

    public DSContratoCombo() {
    
    }

    @JsonIgnore
    public String getDSContratoComboContratoIntegral() {
        return this.dSContratoComboContratoIntegral;
    }
    
    public void setDSContratoComboContratoIntegral(String dSContratoComboContratoIntegral) {
        this.dSContratoComboContratoIntegral = dSContratoComboContratoIntegral;
    }

    @JsonIgnore
    public String getDSContratoComboContratoOdontologico() {
        return this.dSContratoComboContratoOdontologico;
    }
    
    public void setDSContratoComboContratoOdontologico(String dSContratoComboContratoOdontologico) {
        this.dSContratoComboContratoOdontologico = dSContratoComboContratoOdontologico;
    }
}
