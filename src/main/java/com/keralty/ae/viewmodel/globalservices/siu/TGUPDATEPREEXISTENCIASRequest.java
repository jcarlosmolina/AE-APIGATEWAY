package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.GlobalServiceConstants;
import com.keralty.ae.persistence.BeneficiarioC;
import com.keralty.ae.persistence.oid.BeneficiarioCOid;
import com.keralty.ae.persistence.oid.UsuarioOid;
import com.keralty.ae.persistence.Usuario;

public class TGUPDATEPREEXISTENCIASRequest {

    @JsonProperty("p_usuario_oid")
    private UsuarioOid tGUPDATEPREEXISTENCIASpUsuario;
    
    @JsonIgnore
    private Usuario tGUPDATEPREEXISTENCIASpUsuarioInstance;

    @JsonProperty("p_beneficiarioc_oid")
    private BeneficiarioCOid tGUPDATEPREEXISTENCIASpBeneficiarioC;
    
    @JsonIgnore
    private BeneficiarioC tGUPDATEPREEXISTENCIASpBeneficiarioCInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTGUPDATEPREEXISTENCIASpUsuario();
        checkTGUPDATEPREEXISTENCIASpBeneficiarioC();
    }

    @JsonIgnore
    public UsuarioOid getTGUPDATEPREEXISTENCIASpUsuario() {
        return this.tGUPDATEPREEXISTENCIASpUsuario;
    }
    
    public void setTGUPDATEPREEXISTENCIASpUsuario(UsuarioOid tGUPDATEPREEXISTENCIASpUsuario) {
        this.tGUPDATEPREEXISTENCIASpUsuario = tGUPDATEPREEXISTENCIASpUsuario;
    }

    @JsonIgnore
    public Usuario getTGUPDATEPREEXISTENCIASpUsuarioInstance() {
        return this.tGUPDATEPREEXISTENCIASpUsuarioInstance;
    }
    
    public void setTGUPDATEPREEXISTENCIASpUsuarioInstance(Usuario tGUPDATEPREEXISTENCIASpUsuario) {
        this.tGUPDATEPREEXISTENCIASpUsuarioInstance = tGUPDATEPREEXISTENCIASpUsuario;
        this.tGUPDATEPREEXISTENCIASpUsuario = tGUPDATEPREEXISTENCIASpUsuario != null ? tGUPDATEPREEXISTENCIASpUsuario.getOid() : null;
    }

    private void checkTGUPDATEPREEXISTENCIASpUsuario() throws NotNullArgumentException {
        if(this.getTGUPDATEPREEXISTENCIASpUsuarioInstance() == null || this.getTGUPDATEPREEXISTENCIASpUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGUPDATEPREEXISTENCIAS, GlobalServiceConstants.GS_ARG_ID_TGUPDATEPREEXISTENCIAS_TGUPDATEPREEXISTENCIASPUSUARIO, GlobalServiceConstants.G_SERV_ALIAS_TGUPDATEPREEXISTENCIAS, GlobalServiceConstants.GS_ARG_ALIAS_TGUPDATEPREEXISTENCIAS_TGUPDATEPREEXISTENCIASPUSUARIO);
        }
    }

    @JsonIgnore
    public BeneficiarioCOid getTGUPDATEPREEXISTENCIASpBeneficiarioC() {
        return this.tGUPDATEPREEXISTENCIASpBeneficiarioC;
    }
    
    public void setTGUPDATEPREEXISTENCIASpBeneficiarioC(BeneficiarioCOid tGUPDATEPREEXISTENCIASpBeneficiarioC) {
        this.tGUPDATEPREEXISTENCIASpBeneficiarioC = tGUPDATEPREEXISTENCIASpBeneficiarioC;
    }

    @JsonIgnore
    public BeneficiarioC getTGUPDATEPREEXISTENCIASpBeneficiarioCInstance() {
        return this.tGUPDATEPREEXISTENCIASpBeneficiarioCInstance;
    }
    
    public void setTGUPDATEPREEXISTENCIASpBeneficiarioCInstance(BeneficiarioC tGUPDATEPREEXISTENCIASpBeneficiarioC) {
        this.tGUPDATEPREEXISTENCIASpBeneficiarioCInstance = tGUPDATEPREEXISTENCIASpBeneficiarioC;
        this.tGUPDATEPREEXISTENCIASpBeneficiarioC = tGUPDATEPREEXISTENCIASpBeneficiarioC != null ? tGUPDATEPREEXISTENCIASpBeneficiarioC.getOid() : null;
    }

    private void checkTGUPDATEPREEXISTENCIASpBeneficiarioC() throws NotNullArgumentException {
        if(this.getTGUPDATEPREEXISTENCIASpBeneficiarioCInstance() == null || this.getTGUPDATEPREEXISTENCIASpBeneficiarioCInstance().isNull()) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGUPDATEPREEXISTENCIAS, GlobalServiceConstants.GS_ARG_ID_TGUPDATEPREEXISTENCIAS_TGUPDATEPREEXISTENCIASPBENEFICIARIOC, GlobalServiceConstants.G_SERV_ALIAS_TGUPDATEPREEXISTENCIAS, GlobalServiceConstants.GS_ARG_ALIAS_TGUPDATEPREEXISTENCIAS_TGUPDATEPREEXISTENCIASPBENEFICIARIOC);
        }
    }
}
