package com.keralty.ae.viewmodel.beneficiarioc.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.BeneficiarioCConstants;
import com.keralty.ae.persistence.BeneficiarioC;
import com.keralty.ae.persistence.oid.BeneficiarioCOid;

public class EliminarRequest {

    @JsonProperty("p_thisbeneficiarioc_oid")
    private BeneficiarioCOid beneficiarioCeliminarpthisBeneficiarioC;
    
    @JsonIgnore
    private BeneficiarioC beneficiarioCeliminarpthisBeneficiarioCInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkBeneficiarioCeliminarpthisBeneficiarioC();
    }

    @JsonIgnore
    public BeneficiarioCOid getBeneficiarioCeliminarpthisBeneficiarioC() {
        return this.beneficiarioCeliminarpthisBeneficiarioC;
    }
    
    public void setBeneficiarioCeliminarpthisBeneficiarioC(BeneficiarioCOid beneficiarioCeliminarpthisBeneficiarioC) {
        this.beneficiarioCeliminarpthisBeneficiarioC = beneficiarioCeliminarpthisBeneficiarioC;
    }

    @JsonIgnore
    public BeneficiarioC getBeneficiarioCeliminarpthisBeneficiarioCInstance() {
        return this.beneficiarioCeliminarpthisBeneficiarioCInstance;
    }
    
    public void setBeneficiarioCeliminarpthisBeneficiarioCInstance(BeneficiarioC beneficiarioCeliminarpthisBeneficiarioC) {
        this.beneficiarioCeliminarpthisBeneficiarioCInstance = beneficiarioCeliminarpthisBeneficiarioC;
        this.beneficiarioCeliminarpthisBeneficiarioC = beneficiarioCeliminarpthisBeneficiarioC != null ? beneficiarioCeliminarpthisBeneficiarioC.getOid() : null;
    }

    private void checkBeneficiarioCeliminarpthisBeneficiarioC() throws NotNullArgumentException {
        if(this.getBeneficiarioCeliminarpthisBeneficiarioCInstance() == null || this.getBeneficiarioCeliminarpthisBeneficiarioCInstance().isNull()) {
            throw new NotNullArgumentException(BeneficiarioCConstants.SERV_ID_ELIMINAR, BeneficiarioCConstants.CLASS_ID, BeneficiarioCConstants.ARG_ID_ELIMINAR_BENEFICIARIOCELIMINARPTHISBENEFICIARIOC, BeneficiarioCConstants.SERV_ALIAS_ELIMINAR, BeneficiarioCConstants.CLASS_ALIAS, BeneficiarioCConstants.ARG_ALIAS_ELIMINAR_BENEFICIARIOCELIMINARPTHISBENEFICIARIOC);
        }
    }
}
