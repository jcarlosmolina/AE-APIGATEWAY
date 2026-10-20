package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.GlobalServiceConstants;

public class TGRPTACTRNEWRequest {

    @JsonProperty("argumentos")
    private String tGRPTACTRNEWargumentos;

    public void checkArguments() throws NotNullArgumentException {
        checkTGRPTACTRNEWargumentos();
    }

    @JsonIgnore
    public String getTGRPTACTRNEWargumentos() {
        return this.tGRPTACTRNEWargumentos;
    }
    
    public void setTGRPTACTRNEWargumentos(String tGRPTACTRNEWargumentos) {
        this.tGRPTACTRNEWargumentos = tGRPTACTRNEWargumentos;
    }

    private void checkTGRPTACTRNEWargumentos() throws NotNullArgumentException {
        if(this.getTGRPTACTRNEWargumentos() == null) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGRPTACTRNEW, GlobalServiceConstants.GS_ARG_ID_TGRPTACTRNEW_TGRPTACTRNEWARGUMENTOS, GlobalServiceConstants.G_SERV_ALIAS_TGRPTACTRNEW, GlobalServiceConstants.GS_ARG_ALIAS_TGRPTACTRNEW_TGRPTACTRNEWARGUMENTOS);
        }
    }
}
