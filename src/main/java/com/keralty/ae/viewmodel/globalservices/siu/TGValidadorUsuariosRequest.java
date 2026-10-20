package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.GlobalServiceConstants;
import com.keralty.ae.persistence.TipoIdentificacion;
import com.keralty.ae.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.ae.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class TGValidadorUsuariosRequest {

    @JsonProperty("ptfechainicio")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date tGValidadorUsuariosptFechaInicio;

    @JsonProperty("pttipodoc_json")
    private String tGValidadorUsuariosptTipoDoc;
    
    @JsonIgnore
    private TipoIdentificacion tGValidadorUsuariosptTipoDocInstance;

    @JsonProperty("ptnumid")
    private String tGValidadorUsuariosptNumId;

    public void checkArguments() throws NotNullArgumentException {
        checkTGValidadorUsuariosptFechaInicio();
        checkTGValidadorUsuariosptTipoDoc();
        checkTGValidadorUsuariosptNumId();
    }

    @JsonIgnore
    public Date getTGValidadorUsuariosptFechaInicio() {
        return this.tGValidadorUsuariosptFechaInicio;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setTGValidadorUsuariosptFechaInicio(Date tGValidadorUsuariosptFechaInicio) {
        this.tGValidadorUsuariosptFechaInicio = tGValidadorUsuariosptFechaInicio;
    }

    private void checkTGValidadorUsuariosptFechaInicio() throws NotNullArgumentException {
        if(this.getTGValidadorUsuariosptFechaInicio() == null) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGVALIDADORUSUARIOS, GlobalServiceConstants.GS_ARG_ID_TGVALIDADORUSUARIOS_TGVALIDADORUSUARIOSPTFECHAINICIO, GlobalServiceConstants.G_SERV_ALIAS_TGVALIDADORUSUARIOS, GlobalServiceConstants.GS_ARG_ALIAS_TGVALIDADORUSUARIOS_TGVALIDADORUSUARIOSPTFECHAINICIO);
        }
    }

    @JsonIgnore
    public String getTGValidadorUsuariosptTipoDoc() {
        return this.tGValidadorUsuariosptTipoDoc;
    }
    
    public void setTGValidadorUsuariosptTipoDoc(String tGValidadorUsuariosptTipoDoc) {
        this.tGValidadorUsuariosptTipoDoc = tGValidadorUsuariosptTipoDoc;
    }

    @JsonIgnore
    public TipoIdentificacion getTGValidadorUsuariosptTipoDocInstance() {
        return this.tGValidadorUsuariosptTipoDocInstance;
    }
    
    public void setTGValidadorUsuariosptTipoDocInstance(TipoIdentificacion tGValidadorUsuariosptTipoDoc) {
        this.tGValidadorUsuariosptTipoDocInstance = tGValidadorUsuariosptTipoDoc;
        this.tGValidadorUsuariosptTipoDoc = tGValidadorUsuariosptTipoDoc != null ? tGValidadorUsuariosptTipoDoc.getOid().toJson() : "";
    }

    private void checkTGValidadorUsuariosptTipoDoc() throws NotNullArgumentException {
        if(this.getTGValidadorUsuariosptTipoDocInstance() == null || this.getTGValidadorUsuariosptTipoDocInstance().isNull()) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGVALIDADORUSUARIOS, GlobalServiceConstants.GS_ARG_ID_TGVALIDADORUSUARIOS_TGVALIDADORUSUARIOSPTTIPODOC, GlobalServiceConstants.G_SERV_ALIAS_TGVALIDADORUSUARIOS, GlobalServiceConstants.GS_ARG_ALIAS_TGVALIDADORUSUARIOS_TGVALIDADORUSUARIOSPTTIPODOC);
        }
    }

    @JsonIgnore
    public String getTGValidadorUsuariosptNumId() {
        return this.tGValidadorUsuariosptNumId;
    }
    
    public void setTGValidadorUsuariosptNumId(String tGValidadorUsuariosptNumId) {
        this.tGValidadorUsuariosptNumId = tGValidadorUsuariosptNumId;
    }

    private void checkTGValidadorUsuariosptNumId() throws NotNullArgumentException {
        if(this.getTGValidadorUsuariosptNumId() == null) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGVALIDADORUSUARIOS, GlobalServiceConstants.GS_ARG_ID_TGVALIDADORUSUARIOS_TGVALIDADORUSUARIOSPTNUMID, GlobalServiceConstants.G_SERV_ALIAS_TGVALIDADORUSUARIOS, GlobalServiceConstants.GS_ARG_ALIAS_TGVALIDADORUSUARIOS_TGVALIDADORUSUARIOSPTNUMID);
        }
    }
}
