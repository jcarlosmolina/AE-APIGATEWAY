package com.keralty.ae.viewmodel.paramconfig.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.ParamConfigConstants;
import com.keralty.ae.persistence.oid.ParamConfigOid;
import com.keralty.ae.persistence.ParamConfig;

public class EliminarRequest {

    @JsonProperty("p_thisparamconfig_oid")
    private ParamConfigOid paramConfigeliminarpthisParamConfig;
    
    @JsonIgnore
    private ParamConfig paramConfigeliminarpthisParamConfigInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkParamConfigeliminarpthisParamConfig();
    }

    @JsonIgnore
    public ParamConfigOid getParamConfigeliminarpthisParamConfig() {
        return this.paramConfigeliminarpthisParamConfig;
    }
    
    public void setParamConfigeliminarpthisParamConfig(ParamConfigOid paramConfigeliminarpthisParamConfig) {
        this.paramConfigeliminarpthisParamConfig = paramConfigeliminarpthisParamConfig;
    }

    @JsonIgnore
    public ParamConfig getParamConfigeliminarpthisParamConfigInstance() {
        return this.paramConfigeliminarpthisParamConfigInstance;
    }
    
    public void setParamConfigeliminarpthisParamConfigInstance(ParamConfig paramConfigeliminarpthisParamConfig) {
        this.paramConfigeliminarpthisParamConfigInstance = paramConfigeliminarpthisParamConfig;
        this.paramConfigeliminarpthisParamConfig = paramConfigeliminarpthisParamConfig != null ? paramConfigeliminarpthisParamConfig.getOid() : null;
    }

    private void checkParamConfigeliminarpthisParamConfig() throws NotNullArgumentException {
        if(this.getParamConfigeliminarpthisParamConfigInstance() == null || this.getParamConfigeliminarpthisParamConfigInstance().isNull()) {
            throw new NotNullArgumentException(ParamConfigConstants.SERV_ID_ELIMINAR, ParamConfigConstants.CLASS_ID, ParamConfigConstants.ARG_ID_ELIMINAR_PARAMCONFIGELIMINARPTHISPARAMCONFIG, ParamConfigConstants.SERV_ALIAS_ELIMINAR, ParamConfigConstants.CLASS_ALIAS, ParamConfigConstants.ARG_ALIAS_ELIMINAR_PARAMCONFIGELIMINARPTHISPARAMCONFIG);
        }
    }
}
