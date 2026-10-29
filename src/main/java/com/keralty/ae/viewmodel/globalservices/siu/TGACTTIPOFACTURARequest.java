package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.GlobalServiceConstants;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.persistence.Solicitud;

public class TGACTTIPOFACTURARequest {

    @JsonProperty("ptsolicitud_oid")
    private SolicitudOid tGACTTIPOFACTURAptSolicitud;
    
    @JsonIgnore
    private Solicitud tGACTTIPOFACTURAptSolicitudInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTGACTTIPOFACTURAptSolicitud();
    }

    @JsonIgnore
    public SolicitudOid getTGACTTIPOFACTURAptSolicitud() {
        return this.tGACTTIPOFACTURAptSolicitud;
    }
    
    public void setTGACTTIPOFACTURAptSolicitud(SolicitudOid tGACTTIPOFACTURAptSolicitud) {
        this.tGACTTIPOFACTURAptSolicitud = tGACTTIPOFACTURAptSolicitud;
    }

    @JsonIgnore
    public Solicitud getTGACTTIPOFACTURAptSolicitudInstance() {
        return this.tGACTTIPOFACTURAptSolicitudInstance;
    }
    
    public void setTGACTTIPOFACTURAptSolicitudInstance(Solicitud tGACTTIPOFACTURAptSolicitud) {
        this.tGACTTIPOFACTURAptSolicitudInstance = tGACTTIPOFACTURAptSolicitud;
        this.tGACTTIPOFACTURAptSolicitud = tGACTTIPOFACTURAptSolicitud != null ? tGACTTIPOFACTURAptSolicitud.getOid() : null;
    }

    private void checkTGACTTIPOFACTURAptSolicitud() throws NotNullArgumentException {
        if(this.getTGACTTIPOFACTURAptSolicitudInstance() == null || this.getTGACTTIPOFACTURAptSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGACTTIPOFACTURA, GlobalServiceConstants.GS_ARG_ID_TGACTTIPOFACTURA_TGACTTIPOFACTURAPTSOLICITUD, GlobalServiceConstants.G_SERV_ALIAS_TGACTTIPOFACTURA, GlobalServiceConstants.GS_ARG_ALIAS_TGACTTIPOFACTURA_TGACTTIPOFACTURAPTSOLICITUD);
        }
    }
}
