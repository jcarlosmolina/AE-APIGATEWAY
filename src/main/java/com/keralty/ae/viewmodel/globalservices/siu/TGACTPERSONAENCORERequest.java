package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.GlobalServiceConstants;
import com.keralty.ae.persistence.oid.PersonaOid;
import com.keralty.ae.persistence.oid.ProteccionDatosOid;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.persistence.Persona;
import com.keralty.ae.persistence.ProteccionDatos;
import com.keralty.ae.persistence.Solicitud;

public class TGACTPERSONAENCORERequest {

    @JsonProperty("ptpersona_oid")
    private PersonaOid tGACTPERSONAENCOREptPersona;
    
    @JsonIgnore
    private Persona tGACTPERSONAENCOREptPersonaInstance;

    @JsonProperty("ptprtodatos_oid")
    private ProteccionDatosOid tGACTPERSONAENCOREptPrtoDatos;
    
    @JsonIgnore
    private ProteccionDatos tGACTPERSONAENCOREptPrtoDatosInstance;

    @JsonProperty("ptsolicitud_oid")
    private SolicitudOid tGACTPERSONAENCOREptSolicitud;
    
    @JsonIgnore
    private Solicitud tGACTPERSONAENCOREptSolicitudInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTGACTPERSONAENCOREptPersona();
    }

    @JsonIgnore
    public PersonaOid getTGACTPERSONAENCOREptPersona() {
        return this.tGACTPERSONAENCOREptPersona;
    }
    
    public void setTGACTPERSONAENCOREptPersona(PersonaOid tGACTPERSONAENCOREptPersona) {
        this.tGACTPERSONAENCOREptPersona = tGACTPERSONAENCOREptPersona;
    }

    @JsonIgnore
    public Persona getTGACTPERSONAENCOREptPersonaInstance() {
        return this.tGACTPERSONAENCOREptPersonaInstance;
    }
    
    public void setTGACTPERSONAENCOREptPersonaInstance(Persona tGACTPERSONAENCOREptPersona) {
        this.tGACTPERSONAENCOREptPersonaInstance = tGACTPERSONAENCOREptPersona;
        this.tGACTPERSONAENCOREptPersona = tGACTPERSONAENCOREptPersona != null ? tGACTPERSONAENCOREptPersona.getOid() : null;
    }

    private void checkTGACTPERSONAENCOREptPersona() throws NotNullArgumentException {
        if(this.getTGACTPERSONAENCOREptPersonaInstance() == null || this.getTGACTPERSONAENCOREptPersonaInstance().isNull()) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGACTPERSONAENCORE, GlobalServiceConstants.GS_ARG_ID_TGACTPERSONAENCORE_TGACTPERSONAENCOREPTPERSONA, GlobalServiceConstants.G_SERV_ALIAS_TGACTPERSONAENCORE, GlobalServiceConstants.GS_ARG_ALIAS_TGACTPERSONAENCORE_TGACTPERSONAENCOREPTPERSONA);
        }
    }

    @JsonIgnore
    public ProteccionDatosOid getTGACTPERSONAENCOREptPrtoDatos() {
        return this.tGACTPERSONAENCOREptPrtoDatos;
    }
    
    public void setTGACTPERSONAENCOREptPrtoDatos(ProteccionDatosOid tGACTPERSONAENCOREptPrtoDatos) {
        this.tGACTPERSONAENCOREptPrtoDatos = tGACTPERSONAENCOREptPrtoDatos;
    }

    @JsonIgnore
    public ProteccionDatos getTGACTPERSONAENCOREptPrtoDatosInstance() {
        return this.tGACTPERSONAENCOREptPrtoDatosInstance;
    }
    
    public void setTGACTPERSONAENCOREptPrtoDatosInstance(ProteccionDatos tGACTPERSONAENCOREptPrtoDatos) {
        this.tGACTPERSONAENCOREptPrtoDatosInstance = tGACTPERSONAENCOREptPrtoDatos;
        this.tGACTPERSONAENCOREptPrtoDatos = tGACTPERSONAENCOREptPrtoDatos != null ? tGACTPERSONAENCOREptPrtoDatos.getOid() : null;
    }

    @JsonIgnore
    public SolicitudOid getTGACTPERSONAENCOREptSolicitud() {
        return this.tGACTPERSONAENCOREptSolicitud;
    }
    
    public void setTGACTPERSONAENCOREptSolicitud(SolicitudOid tGACTPERSONAENCOREptSolicitud) {
        this.tGACTPERSONAENCOREptSolicitud = tGACTPERSONAENCOREptSolicitud;
    }

    @JsonIgnore
    public Solicitud getTGACTPERSONAENCOREptSolicitudInstance() {
        return this.tGACTPERSONAENCOREptSolicitudInstance;
    }
    
    public void setTGACTPERSONAENCOREptSolicitudInstance(Solicitud tGACTPERSONAENCOREptSolicitud) {
        this.tGACTPERSONAENCOREptSolicitudInstance = tGACTPERSONAENCOREptSolicitud;
        this.tGACTPERSONAENCOREptSolicitud = tGACTPERSONAENCOREptSolicitud != null ? tGACTPERSONAENCOREptSolicitud.getOid() : null;
    }
}
