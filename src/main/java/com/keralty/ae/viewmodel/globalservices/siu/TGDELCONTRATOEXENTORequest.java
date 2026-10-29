package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.GlobalServiceConstants;
import com.keralty.ae.persistence.ContratosExentosFIngreso;
import com.keralty.ae.persistence.oid.ContratosExentosFIngresoOid;

public class TGDELCONTRATOEXENTORequest {

    @JsonProperty("pt_p_thiscontratosexentosfingr_oid")
    private ContratosExentosFIngresoOid tGDELCONTRATOEXENTOptpthisContratosExentosFIngr;
    
    @JsonIgnore
    private ContratosExentosFIngreso tGDELCONTRATOEXENTOptpthisContratosExentosFIngrInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTGDELCONTRATOEXENTOptpthisContratosExentosFIngr();
    }

    @JsonIgnore
    public ContratosExentosFIngresoOid getTGDELCONTRATOEXENTOptpthisContratosExentosFIngr() {
        return this.tGDELCONTRATOEXENTOptpthisContratosExentosFIngr;
    }
    
    public void setTGDELCONTRATOEXENTOptpthisContratosExentosFIngr(ContratosExentosFIngresoOid tGDELCONTRATOEXENTOptpthisContratosExentosFIngr) {
        this.tGDELCONTRATOEXENTOptpthisContratosExentosFIngr = tGDELCONTRATOEXENTOptpthisContratosExentosFIngr;
    }

    @JsonIgnore
    public ContratosExentosFIngreso getTGDELCONTRATOEXENTOptpthisContratosExentosFIngrInstance() {
        return this.tGDELCONTRATOEXENTOptpthisContratosExentosFIngrInstance;
    }
    
    public void setTGDELCONTRATOEXENTOptpthisContratosExentosFIngrInstance(ContratosExentosFIngreso tGDELCONTRATOEXENTOptpthisContratosExentosFIngr) {
        this.tGDELCONTRATOEXENTOptpthisContratosExentosFIngrInstance = tGDELCONTRATOEXENTOptpthisContratosExentosFIngr;
        this.tGDELCONTRATOEXENTOptpthisContratosExentosFIngr = tGDELCONTRATOEXENTOptpthisContratosExentosFIngr != null ? tGDELCONTRATOEXENTOptpthisContratosExentosFIngr.getOid() : null;
    }

    private void checkTGDELCONTRATOEXENTOptpthisContratosExentosFIngr() throws NotNullArgumentException {
        if(this.getTGDELCONTRATOEXENTOptpthisContratosExentosFIngrInstance() == null || this.getTGDELCONTRATOEXENTOptpthisContratosExentosFIngrInstance().isNull()) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGDELCONTRATOEXENTO, GlobalServiceConstants.GS_ARG_ID_TGDELCONTRATOEXENTO_TGDELCONTRATOEXENTOPTPTHISCONTRATOSEXENTOSFINGR, GlobalServiceConstants.G_SERV_ALIAS_TGDELCONTRATOEXENTO, GlobalServiceConstants.GS_ARG_ALIAS_TGDELCONTRATOEXENTO_TGDELCONTRATOEXENTOPTPTHISCONTRATOSEXENTOSFINGR);
        }
    }
}
