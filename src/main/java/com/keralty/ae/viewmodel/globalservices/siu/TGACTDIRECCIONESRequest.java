package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.GlobalServiceConstants;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.persistence.Solicitud;

public class TGACTDIRECCIONESRequest {

    @JsonProperty("ptsolicitud_oid")
    private SolicitudOid tGACTDIRECCIONESptSolicitud;
    
    @JsonIgnore
    private Solicitud tGACTDIRECCIONESptSolicitudInstance;

    @JsonProperty("pttipo")
    private Long tGACTDIRECCIONESptTipo;

    public void checkArguments() throws NotNullArgumentException {
        checkTGACTDIRECCIONESptSolicitud();
        checkTGACTDIRECCIONESptTipo();
    }

    @JsonIgnore
    public SolicitudOid getTGACTDIRECCIONESptSolicitud() {
        return this.tGACTDIRECCIONESptSolicitud;
    }
    
    public void setTGACTDIRECCIONESptSolicitud(SolicitudOid tGACTDIRECCIONESptSolicitud) {
        this.tGACTDIRECCIONESptSolicitud = tGACTDIRECCIONESptSolicitud;
    }

    @JsonIgnore
    public Solicitud getTGACTDIRECCIONESptSolicitudInstance() {
        return this.tGACTDIRECCIONESptSolicitudInstance;
    }
    
    public void setTGACTDIRECCIONESptSolicitudInstance(Solicitud tGACTDIRECCIONESptSolicitud) {
        this.tGACTDIRECCIONESptSolicitudInstance = tGACTDIRECCIONESptSolicitud;
        this.tGACTDIRECCIONESptSolicitud = tGACTDIRECCIONESptSolicitud != null ? tGACTDIRECCIONESptSolicitud.getOid() : null;
    }

    private void checkTGACTDIRECCIONESptSolicitud() throws NotNullArgumentException {
        if(this.getTGACTDIRECCIONESptSolicitudInstance() == null || this.getTGACTDIRECCIONESptSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGACTDIRECCIONES, GlobalServiceConstants.GS_ARG_ID_TGACTDIRECCIONES_TGACTDIRECCIONESPTSOLICITUD, GlobalServiceConstants.G_SERV_ALIAS_TGACTDIRECCIONES, GlobalServiceConstants.GS_ARG_ALIAS_TGACTDIRECCIONES_TGACTDIRECCIONESPTSOLICITUD);
        }
    }

    @JsonIgnore
    public Long getTGACTDIRECCIONESptTipo() {
        return this.tGACTDIRECCIONESptTipo;
    }
    
    public void setTGACTDIRECCIONESptTipo(Long tGACTDIRECCIONESptTipo) {
        this.tGACTDIRECCIONESptTipo = tGACTDIRECCIONESptTipo;
    }

    private void checkTGACTDIRECCIONESptTipo() throws NotNullArgumentException {
        if(this.getTGACTDIRECCIONESptTipo() == null) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGACTDIRECCIONES, GlobalServiceConstants.GS_ARG_ID_TGACTDIRECCIONES_TGACTDIRECCIONESPTTIPO, GlobalServiceConstants.G_SERV_ALIAS_TGACTDIRECCIONES, GlobalServiceConstants.GS_ARG_ALIAS_TGACTDIRECCIONES_TGACTDIRECCIONESPTTIPO);
        }
    }
}
