package com.keralty.ae.viewmodel.beneficiarioc.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.BeneficiarioCConstants;
import com.keralty.ae.persistence.BeneficiarioC;
import com.keralty.ae.persistence.Companyia;
import com.keralty.ae.persistence.oid.BeneficiarioCOid;
import com.keralty.ae.persistence.oid.CompanyiaOid;

public class DelCompanyiaMPCRequest {

    @JsonProperty("p_thisbeneficiarioc_oid")
    private BeneficiarioCOid beneficiarioCDelCompanyiaMPCpthisBeneficiarioC;
    
    @JsonIgnore
    private BeneficiarioC beneficiarioCDelCompanyiaMPCpthisBeneficiarioCInstance;

    @JsonProperty("p_evccompanyia_oid")
    private CompanyiaOid beneficiarioCDelCompanyiaMPCpevcCompanyia;
    
    @JsonIgnore
    private Companyia beneficiarioCDelCompanyiaMPCpevcCompanyiaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkBeneficiarioCDelCompanyiaMPCpthisBeneficiarioC();
        checkBeneficiarioCDelCompanyiaMPCpevcCompanyia();
    }

    @JsonIgnore
    public BeneficiarioCOid getBeneficiarioCDelCompanyiaMPCpthisBeneficiarioC() {
        return this.beneficiarioCDelCompanyiaMPCpthisBeneficiarioC;
    }
    
    public void setBeneficiarioCDelCompanyiaMPCpthisBeneficiarioC(BeneficiarioCOid beneficiarioCDelCompanyiaMPCpthisBeneficiarioC) {
        this.beneficiarioCDelCompanyiaMPCpthisBeneficiarioC = beneficiarioCDelCompanyiaMPCpthisBeneficiarioC;
    }

    @JsonIgnore
    public BeneficiarioC getBeneficiarioCDelCompanyiaMPCpthisBeneficiarioCInstance() {
        return this.beneficiarioCDelCompanyiaMPCpthisBeneficiarioCInstance;
    }
    
    public void setBeneficiarioCDelCompanyiaMPCpthisBeneficiarioCInstance(BeneficiarioC beneficiarioCDelCompanyiaMPCpthisBeneficiarioC) {
        this.beneficiarioCDelCompanyiaMPCpthisBeneficiarioCInstance = beneficiarioCDelCompanyiaMPCpthisBeneficiarioC;
        this.beneficiarioCDelCompanyiaMPCpthisBeneficiarioC = beneficiarioCDelCompanyiaMPCpthisBeneficiarioC != null ? beneficiarioCDelCompanyiaMPCpthisBeneficiarioC.getOid() : null;
    }

    private void checkBeneficiarioCDelCompanyiaMPCpthisBeneficiarioC() throws NotNullArgumentException {
        if(this.getBeneficiarioCDelCompanyiaMPCpthisBeneficiarioCInstance() == null || this.getBeneficiarioCDelCompanyiaMPCpthisBeneficiarioCInstance().isNull()) {
            throw new NotNullArgumentException(BeneficiarioCConstants.SERV_ID_DELCOMPANYIAMPC, BeneficiarioCConstants.CLASS_ID, BeneficiarioCConstants.ARG_ID_DELCOMPANYIAMPC_BENEFICIARIOCDELCOMPANYIAMPCPTHISBENEFICIARIOC, BeneficiarioCConstants.SERV_ALIAS_DELCOMPANYIAMPC, BeneficiarioCConstants.CLASS_ALIAS, BeneficiarioCConstants.ARG_ALIAS_DELCOMPANYIAMPC_BENEFICIARIOCDELCOMPANYIAMPCPTHISBENEFICIARIOC);
        }
    }

    @JsonIgnore
    public CompanyiaOid getBeneficiarioCDelCompanyiaMPCpevcCompanyia() {
        return this.beneficiarioCDelCompanyiaMPCpevcCompanyia;
    }
    
    public void setBeneficiarioCDelCompanyiaMPCpevcCompanyia(CompanyiaOid beneficiarioCDelCompanyiaMPCpevcCompanyia) {
        this.beneficiarioCDelCompanyiaMPCpevcCompanyia = beneficiarioCDelCompanyiaMPCpevcCompanyia;
    }

    @JsonIgnore
    public Companyia getBeneficiarioCDelCompanyiaMPCpevcCompanyiaInstance() {
        return this.beneficiarioCDelCompanyiaMPCpevcCompanyiaInstance;
    }
    
    public void setBeneficiarioCDelCompanyiaMPCpevcCompanyiaInstance(Companyia beneficiarioCDelCompanyiaMPCpevcCompanyia) {
        this.beneficiarioCDelCompanyiaMPCpevcCompanyiaInstance = beneficiarioCDelCompanyiaMPCpevcCompanyia;
        this.beneficiarioCDelCompanyiaMPCpevcCompanyia = beneficiarioCDelCompanyiaMPCpevcCompanyia != null ? beneficiarioCDelCompanyiaMPCpevcCompanyia.getOid() : null;
    }

    private void checkBeneficiarioCDelCompanyiaMPCpevcCompanyia() throws NotNullArgumentException {
        if(this.getBeneficiarioCDelCompanyiaMPCpevcCompanyiaInstance() == null || this.getBeneficiarioCDelCompanyiaMPCpevcCompanyiaInstance().isNull()) {
            throw new NotNullArgumentException(BeneficiarioCConstants.SERV_ID_DELCOMPANYIAMPC, BeneficiarioCConstants.CLASS_ID, BeneficiarioCConstants.ARG_ID_DELCOMPANYIAMPC_BENEFICIARIOCDELCOMPANYIAMPCPEVCCOMPANYIA, BeneficiarioCConstants.SERV_ALIAS_DELCOMPANYIAMPC, BeneficiarioCConstants.CLASS_ALIAS, BeneficiarioCConstants.ARG_ALIAS_DELCOMPANYIAMPC_BENEFICIARIOCDELCOMPANYIAMPCPEVCCOMPANYIA);
        }
    }
}
