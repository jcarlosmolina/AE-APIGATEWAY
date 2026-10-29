package com.keralty.ae.viewmodel.direccionc.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.DireccionCConstants;
import com.keralty.ae.persistence.DireccionC;
import com.keralty.ae.persistence.oid.DireccionCOid;

public class TELIMINARRequest {

    @JsonProperty("p_thisdireccionc_oid")
    private DireccionCOid direccionCTELIMINARpthisDireccionC;
    
    @JsonIgnore
    private DireccionC direccionCTELIMINARpthisDireccionCInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDireccionCTELIMINARpthisDireccionC();
    }

    @JsonIgnore
    public DireccionCOid getDireccionCTELIMINARpthisDireccionC() {
        return this.direccionCTELIMINARpthisDireccionC;
    }
    
    public void setDireccionCTELIMINARpthisDireccionC(DireccionCOid direccionCTELIMINARpthisDireccionC) {
        this.direccionCTELIMINARpthisDireccionC = direccionCTELIMINARpthisDireccionC;
    }

    @JsonIgnore
    public DireccionC getDireccionCTELIMINARpthisDireccionCInstance() {
        return this.direccionCTELIMINARpthisDireccionCInstance;
    }
    
    public void setDireccionCTELIMINARpthisDireccionCInstance(DireccionC direccionCTELIMINARpthisDireccionC) {
        this.direccionCTELIMINARpthisDireccionCInstance = direccionCTELIMINARpthisDireccionC;
        this.direccionCTELIMINARpthisDireccionC = direccionCTELIMINARpthisDireccionC != null ? direccionCTELIMINARpthisDireccionC.getOid() : null;
    }

    private void checkDireccionCTELIMINARpthisDireccionC() throws NotNullArgumentException {
        if(this.getDireccionCTELIMINARpthisDireccionCInstance() == null || this.getDireccionCTELIMINARpthisDireccionCInstance().isNull()) {
            throw new NotNullArgumentException(DireccionCConstants.SERV_ID_TELIMINAR, DireccionCConstants.CLASS_ID, DireccionCConstants.ARG_ID_TELIMINAR_DIRECCIONCTELIMINARPTHISDIRECCIONC, DireccionCConstants.SERV_ALIAS_TELIMINAR, DireccionCConstants.CLASS_ALIAS, DireccionCConstants.ARG_ALIAS_TELIMINAR_DIRECCIONCTELIMINARPTHISDIRECCIONC);
        }
    }
}
