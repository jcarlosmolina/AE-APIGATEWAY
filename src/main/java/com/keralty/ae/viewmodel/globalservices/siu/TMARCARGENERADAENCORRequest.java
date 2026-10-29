package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.GlobalServiceConstants;
import com.keralty.ae.persistence.ContratoC;
import com.keralty.ae.persistence.oid.ContratoCOid;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.persistence.Solicitud;

public class TMARCARGENERADAENCORRequest {

    @JsonProperty("pt_p_solicitudae_oid")
    private SolicitudOid tMARCARGENERADAENCORptpSolicitudAE;
    
    @JsonIgnore
    private Solicitud tMARCARGENERADAENCORptpSolicitudAEInstance;

    @JsonProperty("pt_ps_numcontrato")
    private String tMARCARGENERADAENCORptpsNumContrato;

    @JsonProperty("pt_ps_contratoc_oid")
    private ContratoCOid tMARCARGENERADAENCORptpsContratoC;
    
    @JsonIgnore
    private ContratoC tMARCARGENERADAENCORptpsContratoCInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTMARCARGENERADAENCORptpSolicitudAE();
        checkTMARCARGENERADAENCORptpsContratoC();
    }

    @JsonIgnore
    public SolicitudOid getTMARCARGENERADAENCORptpSolicitudAE() {
        return this.tMARCARGENERADAENCORptpSolicitudAE;
    }
    
    public void setTMARCARGENERADAENCORptpSolicitudAE(SolicitudOid tMARCARGENERADAENCORptpSolicitudAE) {
        this.tMARCARGENERADAENCORptpSolicitudAE = tMARCARGENERADAENCORptpSolicitudAE;
    }

    @JsonIgnore
    public Solicitud getTMARCARGENERADAENCORptpSolicitudAEInstance() {
        return this.tMARCARGENERADAENCORptpSolicitudAEInstance;
    }
    
    public void setTMARCARGENERADAENCORptpSolicitudAEInstance(Solicitud tMARCARGENERADAENCORptpSolicitudAE) {
        this.tMARCARGENERADAENCORptpSolicitudAEInstance = tMARCARGENERADAENCORptpSolicitudAE;
        this.tMARCARGENERADAENCORptpSolicitudAE = tMARCARGENERADAENCORptpSolicitudAE != null ? tMARCARGENERADAENCORptpSolicitudAE.getOid() : null;
    }

    private void checkTMARCARGENERADAENCORptpSolicitudAE() throws NotNullArgumentException {
        if(this.getTMARCARGENERADAENCORptpSolicitudAEInstance() == null || this.getTMARCARGENERADAENCORptpSolicitudAEInstance().isNull()) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TMARCARGENERADAENCOR, GlobalServiceConstants.GS_ARG_ID_TMARCARGENERADAENCOR_TMARCARGENERADAENCORPTPSOLICITUDAE, GlobalServiceConstants.G_SERV_ALIAS_TMARCARGENERADAENCOR, GlobalServiceConstants.GS_ARG_ALIAS_TMARCARGENERADAENCOR_TMARCARGENERADAENCORPTPSOLICITUDAE);
        }
    }

    @JsonIgnore
    public String getTMARCARGENERADAENCORptpsNumContrato() {
        return this.tMARCARGENERADAENCORptpsNumContrato;
    }
    
    public void setTMARCARGENERADAENCORptpsNumContrato(String tMARCARGENERADAENCORptpsNumContrato) {
        this.tMARCARGENERADAENCORptpsNumContrato = tMARCARGENERADAENCORptpsNumContrato;
    }

    @JsonIgnore
    public ContratoCOid getTMARCARGENERADAENCORptpsContratoC() {
        return this.tMARCARGENERADAENCORptpsContratoC;
    }
    
    public void setTMARCARGENERADAENCORptpsContratoC(ContratoCOid tMARCARGENERADAENCORptpsContratoC) {
        this.tMARCARGENERADAENCORptpsContratoC = tMARCARGENERADAENCORptpsContratoC;
    }

    @JsonIgnore
    public ContratoC getTMARCARGENERADAENCORptpsContratoCInstance() {
        return this.tMARCARGENERADAENCORptpsContratoCInstance;
    }
    
    public void setTMARCARGENERADAENCORptpsContratoCInstance(ContratoC tMARCARGENERADAENCORptpsContratoC) {
        this.tMARCARGENERADAENCORptpsContratoCInstance = tMARCARGENERADAENCORptpsContratoC;
        this.tMARCARGENERADAENCORptpsContratoC = tMARCARGENERADAENCORptpsContratoC != null ? tMARCARGENERADAENCORptpsContratoC.getOid() : null;
    }

    private void checkTMARCARGENERADAENCORptpsContratoC() throws NotNullArgumentException {
        if(this.getTMARCARGENERADAENCORptpsContratoCInstance() == null || this.getTMARCARGENERADAENCORptpsContratoCInstance().isNull()) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TMARCARGENERADAENCOR, GlobalServiceConstants.GS_ARG_ID_TMARCARGENERADAENCOR_TMARCARGENERADAENCORPTPSCONTRATOC, GlobalServiceConstants.G_SERV_ALIAS_TMARCARGENERADAENCOR, GlobalServiceConstants.GS_ARG_ALIAS_TMARCARGENERADAENCOR_TMARCARGENERADAENCORPTPSCONTRATOC);
        }
    }
}
