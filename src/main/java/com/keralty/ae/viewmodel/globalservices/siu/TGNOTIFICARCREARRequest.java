package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.GlobalServiceConstants;

public class TGNOTIFICARCREARRequest {

    @JsonProperty("ptdatoscontrato")
    private String tGNOTIFICARCREARptDatosContrato;

    public void checkArguments() throws NotNullArgumentException {
        checkTGNOTIFICARCREARptDatosContrato();
    }

    @JsonIgnore
    public String getTGNOTIFICARCREARptDatosContrato() {
        return this.tGNOTIFICARCREARptDatosContrato;
    }
    
    public void setTGNOTIFICARCREARptDatosContrato(String tGNOTIFICARCREARptDatosContrato) {
        this.tGNOTIFICARCREARptDatosContrato = tGNOTIFICARCREARptDatosContrato;
    }

    private void checkTGNOTIFICARCREARptDatosContrato() throws NotNullArgumentException {
        if(this.getTGNOTIFICARCREARptDatosContrato() == null) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGNOTIFICARCREAR, GlobalServiceConstants.GS_ARG_ID_TGNOTIFICARCREAR_TGNOTIFICARCREARPTDATOSCONTRATO, GlobalServiceConstants.G_SERV_ALIAS_TGNOTIFICARCREAR, GlobalServiceConstants.GS_ARG_ALIAS_TGNOTIFICARCREAR_TGNOTIFICARCREARPTDATOSCONTRATO);
        }
    }
}
