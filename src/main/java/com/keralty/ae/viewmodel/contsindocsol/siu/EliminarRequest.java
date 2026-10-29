package com.keralty.ae.viewmodel.contsindocsol.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.ContSinDocSolConstants;
import com.keralty.ae.persistence.ContSinDocSol;
import com.keralty.ae.persistence.oid.ContSinDocSolOid;

public class EliminarRequest {

    @JsonProperty("p_thiscontsindocsol_oid")
    private ContSinDocSolOid contSinDocSoleliminarpthisContSinDocSol;
    
    @JsonIgnore
    private ContSinDocSol contSinDocSoleliminarpthisContSinDocSolInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkContSinDocSoleliminarpthisContSinDocSol();
    }

    @JsonIgnore
    public ContSinDocSolOid getContSinDocSoleliminarpthisContSinDocSol() {
        return this.contSinDocSoleliminarpthisContSinDocSol;
    }
    
    public void setContSinDocSoleliminarpthisContSinDocSol(ContSinDocSolOid contSinDocSoleliminarpthisContSinDocSol) {
        this.contSinDocSoleliminarpthisContSinDocSol = contSinDocSoleliminarpthisContSinDocSol;
    }

    @JsonIgnore
    public ContSinDocSol getContSinDocSoleliminarpthisContSinDocSolInstance() {
        return this.contSinDocSoleliminarpthisContSinDocSolInstance;
    }
    
    public void setContSinDocSoleliminarpthisContSinDocSolInstance(ContSinDocSol contSinDocSoleliminarpthisContSinDocSol) {
        this.contSinDocSoleliminarpthisContSinDocSolInstance = contSinDocSoleliminarpthisContSinDocSol;
        this.contSinDocSoleliminarpthisContSinDocSol = contSinDocSoleliminarpthisContSinDocSol != null ? contSinDocSoleliminarpthisContSinDocSol.getOid() : null;
    }

    private void checkContSinDocSoleliminarpthisContSinDocSol() throws NotNullArgumentException {
        if(this.getContSinDocSoleliminarpthisContSinDocSolInstance() == null || this.getContSinDocSoleliminarpthisContSinDocSolInstance().isNull()) {
            throw new NotNullArgumentException(ContSinDocSolConstants.SERV_ID_ELIMINAR, ContSinDocSolConstants.CLASS_ID, ContSinDocSolConstants.ARG_ID_ELIMINAR_CONTSINDOCSOLELIMINARPTHISCONTSINDOCSOL, ContSinDocSolConstants.SERV_ALIAS_ELIMINAR, ContSinDocSolConstants.CLASS_ALIAS, ContSinDocSolConstants.ARG_ALIAS_ELIMINAR_CONTSINDOCSOLELIMINARPTHISCONTSINDOCSOL);
        }
    }
}
