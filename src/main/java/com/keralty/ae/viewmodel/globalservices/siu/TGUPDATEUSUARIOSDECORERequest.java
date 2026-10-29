package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.GlobalServiceConstants;
import com.keralty.ae.persistence.ContratoC;
import com.keralty.ae.persistence.oid.ContratoCOid;
import com.keralty.ae.persistence.oid.UsuarioOid;
import com.keralty.ae.persistence.Usuario;

public class TGUPDATEUSUARIOSDECORERequest {

    @JsonProperty("p_usuario_oid")
    private UsuarioOid tGUPDATEUSUARIOSDECOREpUsuario;
    
    @JsonIgnore
    private Usuario tGUPDATEUSUARIOSDECOREpUsuarioInstance;

    @JsonProperty("p_contratoc_oid")
    private ContratoCOid tGUPDATEUSUARIOSDECOREpContratoC;
    
    @JsonIgnore
    private ContratoC tGUPDATEUSUARIOSDECOREpContratoCInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTGUPDATEUSUARIOSDECOREpUsuario();
        checkTGUPDATEUSUARIOSDECOREpContratoC();
    }

    @JsonIgnore
    public UsuarioOid getTGUPDATEUSUARIOSDECOREpUsuario() {
        return this.tGUPDATEUSUARIOSDECOREpUsuario;
    }
    
    public void setTGUPDATEUSUARIOSDECOREpUsuario(UsuarioOid tGUPDATEUSUARIOSDECOREpUsuario) {
        this.tGUPDATEUSUARIOSDECOREpUsuario = tGUPDATEUSUARIOSDECOREpUsuario;
    }

    @JsonIgnore
    public Usuario getTGUPDATEUSUARIOSDECOREpUsuarioInstance() {
        return this.tGUPDATEUSUARIOSDECOREpUsuarioInstance;
    }
    
    public void setTGUPDATEUSUARIOSDECOREpUsuarioInstance(Usuario tGUPDATEUSUARIOSDECOREpUsuario) {
        this.tGUPDATEUSUARIOSDECOREpUsuarioInstance = tGUPDATEUSUARIOSDECOREpUsuario;
        this.tGUPDATEUSUARIOSDECOREpUsuario = tGUPDATEUSUARIOSDECOREpUsuario != null ? tGUPDATEUSUARIOSDECOREpUsuario.getOid() : null;
    }

    private void checkTGUPDATEUSUARIOSDECOREpUsuario() throws NotNullArgumentException {
        if(this.getTGUPDATEUSUARIOSDECOREpUsuarioInstance() == null || this.getTGUPDATEUSUARIOSDECOREpUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGUPDATEUSUARIOSDECORE, GlobalServiceConstants.GS_ARG_ID_TGUPDATEUSUARIOSDECORE_TGUPDATEUSUARIOSDECOREPUSUARIO, GlobalServiceConstants.G_SERV_ALIAS_TGUPDATEUSUARIOSDECORE, GlobalServiceConstants.GS_ARG_ALIAS_TGUPDATEUSUARIOSDECORE_TGUPDATEUSUARIOSDECOREPUSUARIO);
        }
    }

    @JsonIgnore
    public ContratoCOid getTGUPDATEUSUARIOSDECOREpContratoC() {
        return this.tGUPDATEUSUARIOSDECOREpContratoC;
    }
    
    public void setTGUPDATEUSUARIOSDECOREpContratoC(ContratoCOid tGUPDATEUSUARIOSDECOREpContratoC) {
        this.tGUPDATEUSUARIOSDECOREpContratoC = tGUPDATEUSUARIOSDECOREpContratoC;
    }

    @JsonIgnore
    public ContratoC getTGUPDATEUSUARIOSDECOREpContratoCInstance() {
        return this.tGUPDATEUSUARIOSDECOREpContratoCInstance;
    }
    
    public void setTGUPDATEUSUARIOSDECOREpContratoCInstance(ContratoC tGUPDATEUSUARIOSDECOREpContratoC) {
        this.tGUPDATEUSUARIOSDECOREpContratoCInstance = tGUPDATEUSUARIOSDECOREpContratoC;
        this.tGUPDATEUSUARIOSDECOREpContratoC = tGUPDATEUSUARIOSDECOREpContratoC != null ? tGUPDATEUSUARIOSDECOREpContratoC.getOid() : null;
    }

    private void checkTGUPDATEUSUARIOSDECOREpContratoC() throws NotNullArgumentException {
        if(this.getTGUPDATEUSUARIOSDECOREpContratoCInstance() == null || this.getTGUPDATEUSUARIOSDECOREpContratoCInstance().isNull()) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGUPDATEUSUARIOSDECORE, GlobalServiceConstants.GS_ARG_ID_TGUPDATEUSUARIOSDECORE_TGUPDATEUSUARIOSDECOREPCONTRATOC, GlobalServiceConstants.G_SERV_ALIAS_TGUPDATEUSUARIOSDECORE, GlobalServiceConstants.GS_ARG_ALIAS_TGUPDATEUSUARIOSDECORE_TGUPDATEUSUARIOSDECOREPCONTRATOC);
        }
    }
}
