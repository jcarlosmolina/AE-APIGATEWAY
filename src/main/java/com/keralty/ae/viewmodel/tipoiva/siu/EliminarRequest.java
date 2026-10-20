package com.keralty.ae.viewmodel.tipoiva.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.TipoIVAConstants;
import com.keralty.ae.persistence.oid.TipoIVAOid;
import com.keralty.ae.persistence.TipoIVA;

public class EliminarRequest {

    @JsonProperty("p_thistipoiva_oid")
    private TipoIVAOid tipoIVAeliminarpthisTipoIVA;
    
    @JsonIgnore
    private TipoIVA tipoIVAeliminarpthisTipoIVAInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTipoIVAeliminarpthisTipoIVA();
    }

    @JsonIgnore
    public TipoIVAOid getTipoIVAeliminarpthisTipoIVA() {
        return this.tipoIVAeliminarpthisTipoIVA;
    }
    
    public void setTipoIVAeliminarpthisTipoIVA(TipoIVAOid tipoIVAeliminarpthisTipoIVA) {
        this.tipoIVAeliminarpthisTipoIVA = tipoIVAeliminarpthisTipoIVA;
    }

    @JsonIgnore
    public TipoIVA getTipoIVAeliminarpthisTipoIVAInstance() {
        return this.tipoIVAeliminarpthisTipoIVAInstance;
    }
    
    public void setTipoIVAeliminarpthisTipoIVAInstance(TipoIVA tipoIVAeliminarpthisTipoIVA) {
        this.tipoIVAeliminarpthisTipoIVAInstance = tipoIVAeliminarpthisTipoIVA;
        this.tipoIVAeliminarpthisTipoIVA = tipoIVAeliminarpthisTipoIVA != null ? tipoIVAeliminarpthisTipoIVA.getOid() : null;
    }

    private void checkTipoIVAeliminarpthisTipoIVA() throws NotNullArgumentException {
        if(this.getTipoIVAeliminarpthisTipoIVAInstance() == null || this.getTipoIVAeliminarpthisTipoIVAInstance().isNull()) {
            throw new NotNullArgumentException(TipoIVAConstants.SERV_ID_ELIMINAR, TipoIVAConstants.CLASS_ID, TipoIVAConstants.ARG_ID_ELIMINAR_TIPOIVAELIMINARPTHISTIPOIVA, TipoIVAConstants.SERV_ALIAS_ELIMINAR, TipoIVAConstants.CLASS_ALIAS, TipoIVAConstants.ARG_ALIAS_ELIMINAR_TIPOIVAELIMINARPTHISTIPOIVA);
        }
    }
}
