package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.GlobalServiceConstants;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.persistence.Solicitud;

public class TGCREARCONTRATOCORERequest {

    @JsonProperty("ptsolicitud_oid")
    private SolicitudOid tGCREARCONTRATOCOREptSolicitud;
    
    @JsonIgnore
    private Solicitud tGCREARCONTRATOCOREptSolicitudInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTGCREARCONTRATOCOREptSolicitud();
    }

    @JsonIgnore
    public SolicitudOid getTGCREARCONTRATOCOREptSolicitud() {
        return this.tGCREARCONTRATOCOREptSolicitud;
    }
    
    public void setTGCREARCONTRATOCOREptSolicitud(SolicitudOid tGCREARCONTRATOCOREptSolicitud) {
        this.tGCREARCONTRATOCOREptSolicitud = tGCREARCONTRATOCOREptSolicitud;
    }

    @JsonIgnore
    public Solicitud getTGCREARCONTRATOCOREptSolicitudInstance() {
        return this.tGCREARCONTRATOCOREptSolicitudInstance;
    }
    
    public void setTGCREARCONTRATOCOREptSolicitudInstance(Solicitud tGCREARCONTRATOCOREptSolicitud) {
        this.tGCREARCONTRATOCOREptSolicitudInstance = tGCREARCONTRATOCOREptSolicitud;
        this.tGCREARCONTRATOCOREptSolicitud = tGCREARCONTRATOCOREptSolicitud != null ? tGCREARCONTRATOCOREptSolicitud.getOid() : null;
    }

    private void checkTGCREARCONTRATOCOREptSolicitud() throws NotNullArgumentException {
        if(this.getTGCREARCONTRATOCOREptSolicitudInstance() == null || this.getTGCREARCONTRATOCOREptSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGCREARCONTRATOCORE, GlobalServiceConstants.GS_ARG_ID_TGCREARCONTRATOCORE_TGCREARCONTRATOCOREPTSOLICITUD, GlobalServiceConstants.G_SERV_ALIAS_TGCREARCONTRATOCORE, GlobalServiceConstants.GS_ARG_ALIAS_TGCREARCONTRATOCORE_TGCREARCONTRATOCOREPTSOLICITUD);
        }
    }
}
