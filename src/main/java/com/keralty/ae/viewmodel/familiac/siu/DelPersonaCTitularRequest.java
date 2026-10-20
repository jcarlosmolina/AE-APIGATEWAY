package com.keralty.ae.viewmodel.familiac.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.FamiliaCConstants;
import com.keralty.ae.persistence.FamiliaC;
import com.keralty.ae.persistence.oid.FamiliaCOid;
import com.keralty.ae.persistence.oid.PersonaCOid;
import com.keralty.ae.persistence.PersonaC;

public class DelPersonaCTitularRequest {

    @JsonProperty("p_thisfamiliac_oid")
    private FamiliaCOid familiaCDelPersonaCTitularpthisFamiliaC;
    
    @JsonIgnore
    private FamiliaC familiaCDelPersonaCTitularpthisFamiliaCInstance;

    @JsonProperty("p_evcpersonac_oid")
    private PersonaCOid familiaCDelPersonaCTitularpevcPersonaC;
    
    @JsonIgnore
    private PersonaC familiaCDelPersonaCTitularpevcPersonaCInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkFamiliaCDelPersonaCTitularpthisFamiliaC();
        checkFamiliaCDelPersonaCTitularpevcPersonaC();
    }

    @JsonIgnore
    public FamiliaCOid getFamiliaCDelPersonaCTitularpthisFamiliaC() {
        return this.familiaCDelPersonaCTitularpthisFamiliaC;
    }
    
    public void setFamiliaCDelPersonaCTitularpthisFamiliaC(FamiliaCOid familiaCDelPersonaCTitularpthisFamiliaC) {
        this.familiaCDelPersonaCTitularpthisFamiliaC = familiaCDelPersonaCTitularpthisFamiliaC;
    }

    @JsonIgnore
    public FamiliaC getFamiliaCDelPersonaCTitularpthisFamiliaCInstance() {
        return this.familiaCDelPersonaCTitularpthisFamiliaCInstance;
    }
    
    public void setFamiliaCDelPersonaCTitularpthisFamiliaCInstance(FamiliaC familiaCDelPersonaCTitularpthisFamiliaC) {
        this.familiaCDelPersonaCTitularpthisFamiliaCInstance = familiaCDelPersonaCTitularpthisFamiliaC;
        this.familiaCDelPersonaCTitularpthisFamiliaC = familiaCDelPersonaCTitularpthisFamiliaC != null ? familiaCDelPersonaCTitularpthisFamiliaC.getOid() : null;
    }

    private void checkFamiliaCDelPersonaCTitularpthisFamiliaC() throws NotNullArgumentException {
        if(this.getFamiliaCDelPersonaCTitularpthisFamiliaCInstance() == null || this.getFamiliaCDelPersonaCTitularpthisFamiliaCInstance().isNull()) {
            throw new NotNullArgumentException(FamiliaCConstants.SERV_ID_DELPERSONACTITULAR, FamiliaCConstants.CLASS_ID, FamiliaCConstants.ARG_ID_DELPERSONACTITULAR_FAMILIACDELPERSONACTITULARPTHISFAMILIAC, FamiliaCConstants.SERV_ALIAS_DELPERSONACTITULAR, FamiliaCConstants.CLASS_ALIAS, FamiliaCConstants.ARG_ALIAS_DELPERSONACTITULAR_FAMILIACDELPERSONACTITULARPTHISFAMILIAC);
        }
    }

    @JsonIgnore
    public PersonaCOid getFamiliaCDelPersonaCTitularpevcPersonaC() {
        return this.familiaCDelPersonaCTitularpevcPersonaC;
    }
    
    public void setFamiliaCDelPersonaCTitularpevcPersonaC(PersonaCOid familiaCDelPersonaCTitularpevcPersonaC) {
        this.familiaCDelPersonaCTitularpevcPersonaC = familiaCDelPersonaCTitularpevcPersonaC;
    }

    @JsonIgnore
    public PersonaC getFamiliaCDelPersonaCTitularpevcPersonaCInstance() {
        return this.familiaCDelPersonaCTitularpevcPersonaCInstance;
    }
    
    public void setFamiliaCDelPersonaCTitularpevcPersonaCInstance(PersonaC familiaCDelPersonaCTitularpevcPersonaC) {
        this.familiaCDelPersonaCTitularpevcPersonaCInstance = familiaCDelPersonaCTitularpevcPersonaC;
        this.familiaCDelPersonaCTitularpevcPersonaC = familiaCDelPersonaCTitularpevcPersonaC != null ? familiaCDelPersonaCTitularpevcPersonaC.getOid() : null;
    }

    private void checkFamiliaCDelPersonaCTitularpevcPersonaC() throws NotNullArgumentException {
        if(this.getFamiliaCDelPersonaCTitularpevcPersonaCInstance() == null || this.getFamiliaCDelPersonaCTitularpevcPersonaCInstance().isNull()) {
            throw new NotNullArgumentException(FamiliaCConstants.SERV_ID_DELPERSONACTITULAR, FamiliaCConstants.CLASS_ID, FamiliaCConstants.ARG_ID_DELPERSONACTITULAR_FAMILIACDELPERSONACTITULARPEVCPERSONAC, FamiliaCConstants.SERV_ALIAS_DELPERSONACTITULAR, FamiliaCConstants.CLASS_ALIAS, FamiliaCConstants.ARG_ALIAS_DELPERSONACTITULAR_FAMILIACDELPERSONACTITULARPEVCPERSONAC);
        }
    }
}
