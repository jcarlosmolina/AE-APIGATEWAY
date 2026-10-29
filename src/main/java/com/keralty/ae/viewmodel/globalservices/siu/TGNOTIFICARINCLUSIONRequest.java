package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.GlobalServiceConstants;

public class TGNOTIFICARINCLUSIONRequest {

    @JsonProperty("ptdatosinclusion")
    private String tGNOTIFICARINCLUSIONptDatosInclusion;

    public void checkArguments() throws NotNullArgumentException {
        checkTGNOTIFICARINCLUSIONptDatosInclusion();
    }

    @JsonIgnore
    public String getTGNOTIFICARINCLUSIONptDatosInclusion() {
        return this.tGNOTIFICARINCLUSIONptDatosInclusion;
    }
    
    public void setTGNOTIFICARINCLUSIONptDatosInclusion(String tGNOTIFICARINCLUSIONptDatosInclusion) {
        this.tGNOTIFICARINCLUSIONptDatosInclusion = tGNOTIFICARINCLUSIONptDatosInclusion;
    }

    private void checkTGNOTIFICARINCLUSIONptDatosInclusion() throws NotNullArgumentException {
        if(this.getTGNOTIFICARINCLUSIONptDatosInclusion() == null) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGNOTIFICARINCLUSION, GlobalServiceConstants.GS_ARG_ID_TGNOTIFICARINCLUSION_TGNOTIFICARINCLUSIONPTDATOSINCLUSION, GlobalServiceConstants.G_SERV_ALIAS_TGNOTIFICARINCLUSION, GlobalServiceConstants.GS_ARG_ALIAS_TGNOTIFICARINCLUSION_TGNOTIFICARINCLUSIONPTDATOSINCLUSION);
        }
    }
}
