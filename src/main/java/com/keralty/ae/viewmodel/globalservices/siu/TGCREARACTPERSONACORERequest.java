package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.GlobalServiceConstants;
import com.keralty.ae.persistence.oid.PersonaOid;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.persistence.Persona;
import com.keralty.ae.persistence.Solicitud;

public class TGCREARACTPERSONACORERequest {

    @JsonProperty("ptsolicitud_oid")
    private SolicitudOid tGCREARACTPERSONACOREptSolicitud;
    
    @JsonIgnore
    private Solicitud tGCREARACTPERSONACOREptSolicitudInstance;

    @JsonProperty("ptpersona_oid")
    private PersonaOid tGCREARACTPERSONACOREptPersona;
    
    @JsonIgnore
    private Persona tGCREARACTPERSONACOREptPersonaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTGCREARACTPERSONACOREptSolicitud();
        checkTGCREARACTPERSONACOREptPersona();
    }

    @JsonIgnore
    public SolicitudOid getTGCREARACTPERSONACOREptSolicitud() {
        return this.tGCREARACTPERSONACOREptSolicitud;
    }
    
    public void setTGCREARACTPERSONACOREptSolicitud(SolicitudOid tGCREARACTPERSONACOREptSolicitud) {
        this.tGCREARACTPERSONACOREptSolicitud = tGCREARACTPERSONACOREptSolicitud;
    }

    @JsonIgnore
    public Solicitud getTGCREARACTPERSONACOREptSolicitudInstance() {
        return this.tGCREARACTPERSONACOREptSolicitudInstance;
    }
    
    public void setTGCREARACTPERSONACOREptSolicitudInstance(Solicitud tGCREARACTPERSONACOREptSolicitud) {
        this.tGCREARACTPERSONACOREptSolicitudInstance = tGCREARACTPERSONACOREptSolicitud;
        this.tGCREARACTPERSONACOREptSolicitud = tGCREARACTPERSONACOREptSolicitud != null ? tGCREARACTPERSONACOREptSolicitud.getOid() : null;
    }

    private void checkTGCREARACTPERSONACOREptSolicitud() throws NotNullArgumentException {
        if(this.getTGCREARACTPERSONACOREptSolicitudInstance() == null || this.getTGCREARACTPERSONACOREptSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGCREARACTPERSONACORE, GlobalServiceConstants.GS_ARG_ID_TGCREARACTPERSONACORE_TGCREARACTPERSONACOREPTSOLICITUD, GlobalServiceConstants.G_SERV_ALIAS_TGCREARACTPERSONACORE, GlobalServiceConstants.GS_ARG_ALIAS_TGCREARACTPERSONACORE_TGCREARACTPERSONACOREPTSOLICITUD);
        }
    }

    @JsonIgnore
    public PersonaOid getTGCREARACTPERSONACOREptPersona() {
        return this.tGCREARACTPERSONACOREptPersona;
    }
    
    public void setTGCREARACTPERSONACOREptPersona(PersonaOid tGCREARACTPERSONACOREptPersona) {
        this.tGCREARACTPERSONACOREptPersona = tGCREARACTPERSONACOREptPersona;
    }

    @JsonIgnore
    public Persona getTGCREARACTPERSONACOREptPersonaInstance() {
        return this.tGCREARACTPERSONACOREptPersonaInstance;
    }
    
    public void setTGCREARACTPERSONACOREptPersonaInstance(Persona tGCREARACTPERSONACOREptPersona) {
        this.tGCREARACTPERSONACOREptPersonaInstance = tGCREARACTPERSONACOREptPersona;
        this.tGCREARACTPERSONACOREptPersona = tGCREARACTPERSONACOREptPersona != null ? tGCREARACTPERSONACOREptPersona.getOid() : null;
    }

    private void checkTGCREARACTPERSONACOREptPersona() throws NotNullArgumentException {
        if(this.getTGCREARACTPERSONACOREptPersonaInstance() == null || this.getTGCREARACTPERSONACOREptPersonaInstance().isNull()) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGCREARACTPERSONACORE, GlobalServiceConstants.GS_ARG_ID_TGCREARACTPERSONACORE_TGCREARACTPERSONACOREPTPERSONA, GlobalServiceConstants.G_SERV_ALIAS_TGCREARACTPERSONACORE, GlobalServiceConstants.GS_ARG_ALIAS_TGCREARACTPERSONACORE_TGCREARACTPERSONACOREPTPERSONA);
        }
    }
}
