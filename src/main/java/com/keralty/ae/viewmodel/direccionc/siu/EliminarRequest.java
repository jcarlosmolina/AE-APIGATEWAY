package com.keralty.ae.viewmodel.direccionc.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.DireccionCConstants;
import com.keralty.ae.persistence.DireccionC;
import com.keralty.ae.persistence.oid.DireccionCOid;

public class EliminarRequest {

    @JsonProperty("p_thisdireccionc_oid")
    private DireccionCOid direccionCeliminarpthisDireccionC;
    
    @JsonIgnore
    private DireccionC direccionCeliminarpthisDireccionCInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDireccionCeliminarpthisDireccionC();
    }

    @JsonIgnore
    public DireccionCOid getDireccionCeliminarpthisDireccionC() {
        return this.direccionCeliminarpthisDireccionC;
    }
    
    public void setDireccionCeliminarpthisDireccionC(DireccionCOid direccionCeliminarpthisDireccionC) {
        this.direccionCeliminarpthisDireccionC = direccionCeliminarpthisDireccionC;
    }

    @JsonIgnore
    public DireccionC getDireccionCeliminarpthisDireccionCInstance() {
        return this.direccionCeliminarpthisDireccionCInstance;
    }
    
    public void setDireccionCeliminarpthisDireccionCInstance(DireccionC direccionCeliminarpthisDireccionC) {
        this.direccionCeliminarpthisDireccionCInstance = direccionCeliminarpthisDireccionC;
        this.direccionCeliminarpthisDireccionC = direccionCeliminarpthisDireccionC != null ? direccionCeliminarpthisDireccionC.getOid() : null;
    }

    private void checkDireccionCeliminarpthisDireccionC() throws NotNullArgumentException {
        if(this.getDireccionCeliminarpthisDireccionCInstance() == null || this.getDireccionCeliminarpthisDireccionCInstance().isNull()) {
            throw new NotNullArgumentException(DireccionCConstants.SERV_ID_ELIMINAR, DireccionCConstants.CLASS_ID, DireccionCConstants.ARG_ID_ELIMINAR_DIRECCIONCELIMINARPTHISDIRECCIONC, DireccionCConstants.SERV_ALIAS_ELIMINAR, DireccionCConstants.CLASS_ALIAS, DireccionCConstants.ARG_ALIAS_ELIMINAR_DIRECCIONCELIMINARPTHISDIRECCIONC);
        }
    }
}
