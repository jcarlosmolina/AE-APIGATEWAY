package com.keralty.ae.viewmodel.logpriorizacionsol.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.LogPriorizacionSolConstants;
import com.keralty.ae.persistence.LogPriorizacionSol;
import com.keralty.ae.persistence.oid.LogPriorizacionSolOid;

public class EliminarRequest {

    @JsonProperty("p_thislogpriorizacionsol_oid")
    private LogPriorizacionSolOid logPriorizacionSoleliminarpthisLogPriorizacionSol;
    
    @JsonIgnore
    private LogPriorizacionSol logPriorizacionSoleliminarpthisLogPriorizacionSolInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkLogPriorizacionSoleliminarpthisLogPriorizacionSol();
    }

    @JsonIgnore
    public LogPriorizacionSolOid getLogPriorizacionSoleliminarpthisLogPriorizacionSol() {
        return this.logPriorizacionSoleliminarpthisLogPriorizacionSol;
    }
    
    public void setLogPriorizacionSoleliminarpthisLogPriorizacionSol(LogPriorizacionSolOid logPriorizacionSoleliminarpthisLogPriorizacionSol) {
        this.logPriorizacionSoleliminarpthisLogPriorizacionSol = logPriorizacionSoleliminarpthisLogPriorizacionSol;
    }

    @JsonIgnore
    public LogPriorizacionSol getLogPriorizacionSoleliminarpthisLogPriorizacionSolInstance() {
        return this.logPriorizacionSoleliminarpthisLogPriorizacionSolInstance;
    }
    
    public void setLogPriorizacionSoleliminarpthisLogPriorizacionSolInstance(LogPriorizacionSol logPriorizacionSoleliminarpthisLogPriorizacionSol) {
        this.logPriorizacionSoleliminarpthisLogPriorizacionSolInstance = logPriorizacionSoleliminarpthisLogPriorizacionSol;
        this.logPriorizacionSoleliminarpthisLogPriorizacionSol = logPriorizacionSoleliminarpthisLogPriorizacionSol != null ? logPriorizacionSoleliminarpthisLogPriorizacionSol.getOid() : null;
    }

    private void checkLogPriorizacionSoleliminarpthisLogPriorizacionSol() throws NotNullArgumentException {
        if(this.getLogPriorizacionSoleliminarpthisLogPriorizacionSolInstance() == null || this.getLogPriorizacionSoleliminarpthisLogPriorizacionSolInstance().isNull()) {
            throw new NotNullArgumentException(LogPriorizacionSolConstants.SERV_ID_ELIMINAR, LogPriorizacionSolConstants.CLASS_ID, LogPriorizacionSolConstants.ARG_ID_ELIMINAR_LOGPRIORIZACIONSOLELIMINARPTHISLOGPRIORIZACIONSOL, LogPriorizacionSolConstants.SERV_ALIAS_ELIMINAR, LogPriorizacionSolConstants.CLASS_ALIAS, LogPriorizacionSolConstants.ARG_ALIAS_ELIMINAR_LOGPRIORIZACIONSOLELIMINARPTHISLOGPRIORIZACIONSOL);
        }
    }
}
