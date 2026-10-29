package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.GlobalServiceConstants;

public class TGRPTACTRINCRequest {

    @JsonProperty("argumentos")
    private String tGRPTACTRINCargumentos;

    public void checkArguments() throws NotNullArgumentException {
        checkTGRPTACTRINCargumentos();
    }

    @JsonIgnore
    public String getTGRPTACTRINCargumentos() {
        return this.tGRPTACTRINCargumentos;
    }
    
    public void setTGRPTACTRINCargumentos(String tGRPTACTRINCargumentos) {
        this.tGRPTACTRINCargumentos = tGRPTACTRINCargumentos;
    }

    private void checkTGRPTACTRINCargumentos() throws NotNullArgumentException {
        if(this.getTGRPTACTRINCargumentos() == null) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGRPTACTRINC, GlobalServiceConstants.GS_ARG_ID_TGRPTACTRINC_TGRPTACTRINCARGUMENTOS, GlobalServiceConstants.G_SERV_ALIAS_TGRPTACTRINC, GlobalServiceConstants.GS_ARG_ALIAS_TGRPTACTRINC_TGRPTACTRINCARGUMENTOS);
        }
    }
}
