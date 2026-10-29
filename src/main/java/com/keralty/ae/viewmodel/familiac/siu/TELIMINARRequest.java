package com.keralty.ae.viewmodel.familiac.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.FamiliaCConstants;
import com.keralty.ae.persistence.FamiliaC;
import com.keralty.ae.persistence.oid.FamiliaCOid;

public class TELIMINARRequest {

    @JsonProperty("p_thisfamiliac_oid")
    private FamiliaCOid familiaCTELIMINARpthisFamiliaC;
    
    @JsonIgnore
    private FamiliaC familiaCTELIMINARpthisFamiliaCInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkFamiliaCTELIMINARpthisFamiliaC();
    }

    @JsonIgnore
    public FamiliaCOid getFamiliaCTELIMINARpthisFamiliaC() {
        return this.familiaCTELIMINARpthisFamiliaC;
    }
    
    public void setFamiliaCTELIMINARpthisFamiliaC(FamiliaCOid familiaCTELIMINARpthisFamiliaC) {
        this.familiaCTELIMINARpthisFamiliaC = familiaCTELIMINARpthisFamiliaC;
    }

    @JsonIgnore
    public FamiliaC getFamiliaCTELIMINARpthisFamiliaCInstance() {
        return this.familiaCTELIMINARpthisFamiliaCInstance;
    }
    
    public void setFamiliaCTELIMINARpthisFamiliaCInstance(FamiliaC familiaCTELIMINARpthisFamiliaC) {
        this.familiaCTELIMINARpthisFamiliaCInstance = familiaCTELIMINARpthisFamiliaC;
        this.familiaCTELIMINARpthisFamiliaC = familiaCTELIMINARpthisFamiliaC != null ? familiaCTELIMINARpthisFamiliaC.getOid() : null;
    }

    private void checkFamiliaCTELIMINARpthisFamiliaC() throws NotNullArgumentException {
        if(this.getFamiliaCTELIMINARpthisFamiliaCInstance() == null || this.getFamiliaCTELIMINARpthisFamiliaCInstance().isNull()) {
            throw new NotNullArgumentException(FamiliaCConstants.SERV_ID_TELIMINAR, FamiliaCConstants.CLASS_ID, FamiliaCConstants.ARG_ID_TELIMINAR_FAMILIACTELIMINARPTHISFAMILIAC, FamiliaCConstants.SERV_ALIAS_TELIMINAR, FamiliaCConstants.CLASS_ALIAS, FamiliaCConstants.ARG_ALIAS_TELIMINAR_FAMILIACTELIMINARPTHISFAMILIAC);
        }
    }
}
