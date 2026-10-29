package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class REACTIVACIONCONTRATOSRequest {

    @JsonProperty("ptcompanyia")
    private String rEACTIVACIONCONTRATOSptCompanyia;

    @JsonProperty("ptplan")
    private String rEACTIVACIONCONTRATOSptPlan;

    @JsonProperty("ptcontrato")
    private String rEACTIVACIONCONTRATOSptContrato;

    @JsonProperty("pttitular")
    private String rEACTIVACIONCONTRATOSptTitular;

    @JsonProperty("ptvalor")
    private Long rEACTIVACIONCONTRATOSptValor;

    @JsonIgnore
    public String getREACTIVACIONCONTRATOSptCompanyia() {
        return this.rEACTIVACIONCONTRATOSptCompanyia;
    }
    
    public void setREACTIVACIONCONTRATOSptCompanyia(String rEACTIVACIONCONTRATOSptCompanyia) {
        this.rEACTIVACIONCONTRATOSptCompanyia = rEACTIVACIONCONTRATOSptCompanyia;
    }

    @JsonIgnore
    public String getREACTIVACIONCONTRATOSptPlan() {
        return this.rEACTIVACIONCONTRATOSptPlan;
    }
    
    public void setREACTIVACIONCONTRATOSptPlan(String rEACTIVACIONCONTRATOSptPlan) {
        this.rEACTIVACIONCONTRATOSptPlan = rEACTIVACIONCONTRATOSptPlan;
    }

    @JsonIgnore
    public String getREACTIVACIONCONTRATOSptContrato() {
        return this.rEACTIVACIONCONTRATOSptContrato;
    }
    
    public void setREACTIVACIONCONTRATOSptContrato(String rEACTIVACIONCONTRATOSptContrato) {
        this.rEACTIVACIONCONTRATOSptContrato = rEACTIVACIONCONTRATOSptContrato;
    }

    @JsonIgnore
    public String getREACTIVACIONCONTRATOSptTitular() {
        return this.rEACTIVACIONCONTRATOSptTitular;
    }
    
    public void setREACTIVACIONCONTRATOSptTitular(String rEACTIVACIONCONTRATOSptTitular) {
        this.rEACTIVACIONCONTRATOSptTitular = rEACTIVACIONCONTRATOSptTitular;
    }

    @JsonIgnore
    public Long getREACTIVACIONCONTRATOSptValor() {
        return this.rEACTIVACIONCONTRATOSptValor;
    }
    
    public void setREACTIVACIONCONTRATOSptValor(Long rEACTIVACIONCONTRATOSptValor) {
        this.rEACTIVACIONCONTRATOSptValor = rEACTIVACIONCONTRATOSptValor;
    }
}
