package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.GlobalServiceConstants;

public class TGNOTIFICARANULARRequest {

    @JsonProperty("ptdatoanulacion")
    private String tGNOTIFICARANULARptDatoAnulacion;

    public void checkArguments() throws NotNullArgumentException {
        checkTGNOTIFICARANULARptDatoAnulacion();
    }

    @JsonIgnore
    public String getTGNOTIFICARANULARptDatoAnulacion() {
        return this.tGNOTIFICARANULARptDatoAnulacion;
    }
    
    public void setTGNOTIFICARANULARptDatoAnulacion(String tGNOTIFICARANULARptDatoAnulacion) {
        this.tGNOTIFICARANULARptDatoAnulacion = tGNOTIFICARANULARptDatoAnulacion;
    }

    private void checkTGNOTIFICARANULARptDatoAnulacion() throws NotNullArgumentException {
        if(this.getTGNOTIFICARANULARptDatoAnulacion() == null) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGNOTIFICARANULAR, GlobalServiceConstants.GS_ARG_ID_TGNOTIFICARANULAR_TGNOTIFICARANULARPTDATOANULACION, GlobalServiceConstants.G_SERV_ALIAS_TGNOTIFICARANULAR, GlobalServiceConstants.GS_ARG_ALIAS_TGNOTIFICARANULAR_TGNOTIFICARANULARPTDATOANULACION);
        }
    }
}
