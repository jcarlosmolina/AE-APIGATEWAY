package com.keralty.ae.viewmodel.usuarioreg.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.UsuarioRegConstants;
import com.keralty.ae.persistence.oid.UsuarioRegOid;
import com.keralty.ae.persistence.UsuarioReg;

public class EliminarRequest {

    @JsonProperty("p_thisusuarioreg_oid")
    private UsuarioRegOid usuarioRegeliminarpthisUsuarioReg;
    
    @JsonIgnore
    private UsuarioReg usuarioRegeliminarpthisUsuarioRegInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioRegeliminarpthisUsuarioReg();
    }

    @JsonIgnore
    public UsuarioRegOid getUsuarioRegeliminarpthisUsuarioReg() {
        return this.usuarioRegeliminarpthisUsuarioReg;
    }
    
    public void setUsuarioRegeliminarpthisUsuarioReg(UsuarioRegOid usuarioRegeliminarpthisUsuarioReg) {
        this.usuarioRegeliminarpthisUsuarioReg = usuarioRegeliminarpthisUsuarioReg;
    }

    @JsonIgnore
    public UsuarioReg getUsuarioRegeliminarpthisUsuarioRegInstance() {
        return this.usuarioRegeliminarpthisUsuarioRegInstance;
    }
    
    public void setUsuarioRegeliminarpthisUsuarioRegInstance(UsuarioReg usuarioRegeliminarpthisUsuarioReg) {
        this.usuarioRegeliminarpthisUsuarioRegInstance = usuarioRegeliminarpthisUsuarioReg;
        this.usuarioRegeliminarpthisUsuarioReg = usuarioRegeliminarpthisUsuarioReg != null ? usuarioRegeliminarpthisUsuarioReg.getOid() : null;
    }

    private void checkUsuarioRegeliminarpthisUsuarioReg() throws NotNullArgumentException {
        if(this.getUsuarioRegeliminarpthisUsuarioRegInstance() == null || this.getUsuarioRegeliminarpthisUsuarioRegInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioRegConstants.SERV_ID_ELIMINAR, UsuarioRegConstants.CLASS_ID, UsuarioRegConstants.ARG_ID_ELIMINAR_USUARIOREGELIMINARPTHISUSUARIOREG, UsuarioRegConstants.SERV_ALIAS_ELIMINAR, UsuarioRegConstants.CLASS_ALIAS, UsuarioRegConstants.ARG_ALIAS_ELIMINAR_USUARIOREGELIMINARPTHISUSUARIOREG);
        }
    }
}
