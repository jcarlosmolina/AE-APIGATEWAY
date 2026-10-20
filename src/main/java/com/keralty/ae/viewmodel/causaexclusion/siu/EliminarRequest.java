package com.keralty.ae.viewmodel.causaexclusion.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.CausaExclusionConstants;
import com.keralty.ae.persistence.CausaExclusion;
import com.keralty.ae.persistence.oid.CausaExclusionOid;

public class EliminarRequest {

    @JsonProperty("p_thiscausaexclusion_oid")
    private CausaExclusionOid causaExclusioneliminarpthisCausaExclusion;
    
    @JsonIgnore
    private CausaExclusion causaExclusioneliminarpthisCausaExclusionInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkCausaExclusioneliminarpthisCausaExclusion();
    }

    @JsonIgnore
    public CausaExclusionOid getCausaExclusioneliminarpthisCausaExclusion() {
        return this.causaExclusioneliminarpthisCausaExclusion;
    }
    
    public void setCausaExclusioneliminarpthisCausaExclusion(CausaExclusionOid causaExclusioneliminarpthisCausaExclusion) {
        this.causaExclusioneliminarpthisCausaExclusion = causaExclusioneliminarpthisCausaExclusion;
    }

    @JsonIgnore
    public CausaExclusion getCausaExclusioneliminarpthisCausaExclusionInstance() {
        return this.causaExclusioneliminarpthisCausaExclusionInstance;
    }
    
    public void setCausaExclusioneliminarpthisCausaExclusionInstance(CausaExclusion causaExclusioneliminarpthisCausaExclusion) {
        this.causaExclusioneliminarpthisCausaExclusionInstance = causaExclusioneliminarpthisCausaExclusion;
        this.causaExclusioneliminarpthisCausaExclusion = causaExclusioneliminarpthisCausaExclusion != null ? causaExclusioneliminarpthisCausaExclusion.getOid() : null;
    }

    private void checkCausaExclusioneliminarpthisCausaExclusion() throws NotNullArgumentException {
        if(this.getCausaExclusioneliminarpthisCausaExclusionInstance() == null || this.getCausaExclusioneliminarpthisCausaExclusionInstance().isNull()) {
            throw new NotNullArgumentException(CausaExclusionConstants.SERV_ID_ELIMINAR, CausaExclusionConstants.CLASS_ID, CausaExclusionConstants.ARG_ID_ELIMINAR_CAUSAEXCLUSIONELIMINARPTHISCAUSAEXCLUSION, CausaExclusionConstants.SERV_ALIAS_ELIMINAR, CausaExclusionConstants.CLASS_ALIAS, CausaExclusionConstants.ARG_ALIAS_ELIMINAR_CAUSAEXCLUSIONELIMINARPTHISCAUSAEXCLUSION);
        }
    }
}
