package com.keralty.ae.viewmodel.contratante.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.ContratanteConstants;
import com.keralty.ae.persistence.Contratante;
import com.keralty.ae.persistence.oid.ContratanteOid;

public class EliminarRequest {

    @JsonProperty("p_thiscontratante_oid")
    private ContratanteOid contratanteeliminarpthisContratante;
    
    @JsonIgnore
    private Contratante contratanteeliminarpthisContratanteInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkContratanteeliminarpthisContratante();
    }

    @JsonIgnore
    public ContratanteOid getContratanteeliminarpthisContratante() {
        return this.contratanteeliminarpthisContratante;
    }
    
    public void setContratanteeliminarpthisContratante(ContratanteOid contratanteeliminarpthisContratante) {
        this.contratanteeliminarpthisContratante = contratanteeliminarpthisContratante;
    }

    @JsonIgnore
    public Contratante getContratanteeliminarpthisContratanteInstance() {
        return this.contratanteeliminarpthisContratanteInstance;
    }
    
    public void setContratanteeliminarpthisContratanteInstance(Contratante contratanteeliminarpthisContratante) {
        this.contratanteeliminarpthisContratanteInstance = contratanteeliminarpthisContratante;
        this.contratanteeliminarpthisContratante = contratanteeliminarpthisContratante != null ? contratanteeliminarpthisContratante.getOid() : null;
    }

    private void checkContratanteeliminarpthisContratante() throws NotNullArgumentException {
        if(this.getContratanteeliminarpthisContratanteInstance() == null || this.getContratanteeliminarpthisContratanteInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_ELIMINAR, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_ELIMINAR_CONTRATANTEELIMINARPTHISCONTRATANTE, ContratanteConstants.SERV_ALIAS_ELIMINAR, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_ELIMINAR_CONTRATANTEELIMINARPTHISCONTRATANTE);
        }
    }
}
