package com.keralty.ae.viewmodel.entidadfinancierac.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.EntidadFinancieraCConstants;
import com.keralty.ae.persistence.EntidadFinancieraC;
import com.keralty.ae.persistence.oid.EntidadFinancieraCOid;

public class EliminarRequest {

    @JsonProperty("p_thisentidadfinanciera_oid")
    private EntidadFinancieraCOid entidadFinancieraCeliminarpthisEntidadFinanciera;
    
    @JsonIgnore
    private EntidadFinancieraC entidadFinancieraCeliminarpthisEntidadFinancieraInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkEntidadFinancieraCeliminarpthisEntidadFinanciera();
    }

    @JsonIgnore
    public EntidadFinancieraCOid getEntidadFinancieraCeliminarpthisEntidadFinanciera() {
        return this.entidadFinancieraCeliminarpthisEntidadFinanciera;
    }
    
    public void setEntidadFinancieraCeliminarpthisEntidadFinanciera(EntidadFinancieraCOid entidadFinancieraCeliminarpthisEntidadFinanciera) {
        this.entidadFinancieraCeliminarpthisEntidadFinanciera = entidadFinancieraCeliminarpthisEntidadFinanciera;
    }

    @JsonIgnore
    public EntidadFinancieraC getEntidadFinancieraCeliminarpthisEntidadFinancieraInstance() {
        return this.entidadFinancieraCeliminarpthisEntidadFinancieraInstance;
    }
    
    public void setEntidadFinancieraCeliminarpthisEntidadFinancieraInstance(EntidadFinancieraC entidadFinancieraCeliminarpthisEntidadFinanciera) {
        this.entidadFinancieraCeliminarpthisEntidadFinancieraInstance = entidadFinancieraCeliminarpthisEntidadFinanciera;
        this.entidadFinancieraCeliminarpthisEntidadFinanciera = entidadFinancieraCeliminarpthisEntidadFinanciera != null ? entidadFinancieraCeliminarpthisEntidadFinanciera.getOid() : null;
    }

    private void checkEntidadFinancieraCeliminarpthisEntidadFinanciera() throws NotNullArgumentException {
        if(this.getEntidadFinancieraCeliminarpthisEntidadFinancieraInstance() == null || this.getEntidadFinancieraCeliminarpthisEntidadFinancieraInstance().isNull()) {
            throw new NotNullArgumentException(EntidadFinancieraCConstants.SERV_ID_ELIMINAR, EntidadFinancieraCConstants.CLASS_ID, EntidadFinancieraCConstants.ARG_ID_ELIMINAR_ENTIDADFINANCIERACELIMINARPTHISENTIDADFINANCIERA, EntidadFinancieraCConstants.SERV_ALIAS_ELIMINAR, EntidadFinancieraCConstants.CLASS_ALIAS, EntidadFinancieraCConstants.ARG_ALIAS_ELIMINAR_ENTIDADFINANCIERACELIMINARPTHISENTIDADFINANCIERA);
        }
    }
}
