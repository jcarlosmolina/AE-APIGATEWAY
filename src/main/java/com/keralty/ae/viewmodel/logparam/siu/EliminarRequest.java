package com.keralty.ae.viewmodel.logparam.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.LogParamConstants;
import com.keralty.ae.persistence.LogParam;
import com.keralty.ae.persistence.oid.LogParamOid;

public class EliminarRequest {

    @JsonProperty("p_thislogparam_oid")
    private LogParamOid logParameliminarpthisLogParam;
    
    @JsonIgnore
    private LogParam logParameliminarpthisLogParamInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkLogParameliminarpthisLogParam();
    }

    @JsonIgnore
    public LogParamOid getLogParameliminarpthisLogParam() {
        return this.logParameliminarpthisLogParam;
    }
    
    public void setLogParameliminarpthisLogParam(LogParamOid logParameliminarpthisLogParam) {
        this.logParameliminarpthisLogParam = logParameliminarpthisLogParam;
    }

    @JsonIgnore
    public LogParam getLogParameliminarpthisLogParamInstance() {
        return this.logParameliminarpthisLogParamInstance;
    }
    
    public void setLogParameliminarpthisLogParamInstance(LogParam logParameliminarpthisLogParam) {
        this.logParameliminarpthisLogParamInstance = logParameliminarpthisLogParam;
        this.logParameliminarpthisLogParam = logParameliminarpthisLogParam != null ? logParameliminarpthisLogParam.getOid() : null;
    }

    private void checkLogParameliminarpthisLogParam() throws NotNullArgumentException {
        if(this.getLogParameliminarpthisLogParamInstance() == null || this.getLogParameliminarpthisLogParamInstance().isNull()) {
            throw new NotNullArgumentException(LogParamConstants.SERV_ID_ELIMINAR, LogParamConstants.CLASS_ID, LogParamConstants.ARG_ID_ELIMINAR_LOGPARAMELIMINARPTHISLOGPARAM, LogParamConstants.SERV_ALIAS_ELIMINAR, LogParamConstants.CLASS_ALIAS, LogParamConstants.ARG_ALIAS_ELIMINAR_LOGPARAMELIMINARPTHISLOGPARAM);
        }
    }
}
