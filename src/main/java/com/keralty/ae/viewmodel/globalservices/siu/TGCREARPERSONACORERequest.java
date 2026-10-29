package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.GlobalServiceConstants;
import com.keralty.ae.persistence.oid.PersonaOid;
import com.keralty.ae.persistence.oid.ProteccionDatosOid;
import com.keralty.ae.persistence.Persona;
import com.keralty.ae.persistence.ProteccionDatos;

public class TGCREARPERSONACORERequest {

    @JsonProperty("ptpersona_oid")
    private PersonaOid tGCREARPERSONACOREptPersona;
    
    @JsonIgnore
    private Persona tGCREARPERSONACOREptPersonaInstance;

    @JsonProperty("ptprotdatos_oid")
    private ProteccionDatosOid tGCREARPERSONACOREptProtDatos;
    
    @JsonIgnore
    private ProteccionDatos tGCREARPERSONACOREptProtDatosInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTGCREARPERSONACOREptPersona();
    }

    @JsonIgnore
    public PersonaOid getTGCREARPERSONACOREptPersona() {
        return this.tGCREARPERSONACOREptPersona;
    }
    
    public void setTGCREARPERSONACOREptPersona(PersonaOid tGCREARPERSONACOREptPersona) {
        this.tGCREARPERSONACOREptPersona = tGCREARPERSONACOREptPersona;
    }

    @JsonIgnore
    public Persona getTGCREARPERSONACOREptPersonaInstance() {
        return this.tGCREARPERSONACOREptPersonaInstance;
    }
    
    public void setTGCREARPERSONACOREptPersonaInstance(Persona tGCREARPERSONACOREptPersona) {
        this.tGCREARPERSONACOREptPersonaInstance = tGCREARPERSONACOREptPersona;
        this.tGCREARPERSONACOREptPersona = tGCREARPERSONACOREptPersona != null ? tGCREARPERSONACOREptPersona.getOid() : null;
    }

    private void checkTGCREARPERSONACOREptPersona() throws NotNullArgumentException {
        if(this.getTGCREARPERSONACOREptPersonaInstance() == null || this.getTGCREARPERSONACOREptPersonaInstance().isNull()) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGCREARPERSONACORE, GlobalServiceConstants.GS_ARG_ID_TGCREARPERSONACORE_TGCREARPERSONACOREPTPERSONA, GlobalServiceConstants.G_SERV_ALIAS_TGCREARPERSONACORE, GlobalServiceConstants.GS_ARG_ALIAS_TGCREARPERSONACORE_TGCREARPERSONACOREPTPERSONA);
        }
    }

    @JsonIgnore
    public ProteccionDatosOid getTGCREARPERSONACOREptProtDatos() {
        return this.tGCREARPERSONACOREptProtDatos;
    }
    
    public void setTGCREARPERSONACOREptProtDatos(ProteccionDatosOid tGCREARPERSONACOREptProtDatos) {
        this.tGCREARPERSONACOREptProtDatos = tGCREARPERSONACOREptProtDatos;
    }

    @JsonIgnore
    public ProteccionDatos getTGCREARPERSONACOREptProtDatosInstance() {
        return this.tGCREARPERSONACOREptProtDatosInstance;
    }
    
    public void setTGCREARPERSONACOREptProtDatosInstance(ProteccionDatos tGCREARPERSONACOREptProtDatos) {
        this.tGCREARPERSONACOREptProtDatosInstance = tGCREARPERSONACOREptProtDatos;
        this.tGCREARPERSONACOREptProtDatos = tGCREARPERSONACOREptProtDatos != null ? tGCREARPERSONACOREptProtDatos.getOid() : null;
    }
}
