package com.keralty.ae.viewmodel.usuarionovedad.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.UsuarioNovedadConstants;
import com.keralty.ae.persistence.oid.UsuarioNovedadOid;
import com.keralty.ae.persistence.UsuarioNovedad;

public class EliminarRequest {

    @JsonProperty("p_thisusuarionovedad_oid")
    private UsuarioNovedadOid usuarioNovedadeliminarpthisUsuarioNovedad;
    
    @JsonIgnore
    private UsuarioNovedad usuarioNovedadeliminarpthisUsuarioNovedadInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioNovedadeliminarpthisUsuarioNovedad();
    }

    @JsonIgnore
    public UsuarioNovedadOid getUsuarioNovedadeliminarpthisUsuarioNovedad() {
        return this.usuarioNovedadeliminarpthisUsuarioNovedad;
    }
    
    public void setUsuarioNovedadeliminarpthisUsuarioNovedad(UsuarioNovedadOid usuarioNovedadeliminarpthisUsuarioNovedad) {
        this.usuarioNovedadeliminarpthisUsuarioNovedad = usuarioNovedadeliminarpthisUsuarioNovedad;
    }

    @JsonIgnore
    public UsuarioNovedad getUsuarioNovedadeliminarpthisUsuarioNovedadInstance() {
        return this.usuarioNovedadeliminarpthisUsuarioNovedadInstance;
    }
    
    public void setUsuarioNovedadeliminarpthisUsuarioNovedadInstance(UsuarioNovedad usuarioNovedadeliminarpthisUsuarioNovedad) {
        this.usuarioNovedadeliminarpthisUsuarioNovedadInstance = usuarioNovedadeliminarpthisUsuarioNovedad;
        this.usuarioNovedadeliminarpthisUsuarioNovedad = usuarioNovedadeliminarpthisUsuarioNovedad != null ? usuarioNovedadeliminarpthisUsuarioNovedad.getOid() : null;
    }

    private void checkUsuarioNovedadeliminarpthisUsuarioNovedad() throws NotNullArgumentException {
        if(this.getUsuarioNovedadeliminarpthisUsuarioNovedadInstance() == null || this.getUsuarioNovedadeliminarpthisUsuarioNovedadInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioNovedadConstants.SERV_ID_ELIMINAR, UsuarioNovedadConstants.CLASS_ID, UsuarioNovedadConstants.ARG_ID_ELIMINAR_USUARIONOVEDADELIMINARPTHISUSUARIONOVEDAD, UsuarioNovedadConstants.SERV_ALIAS_ELIMINAR, UsuarioNovedadConstants.CLASS_ALIAS, UsuarioNovedadConstants.ARG_ALIAS_ELIMINAR_USUARIONOVEDADELIMINARPTHISUSUARIONOVEDAD);
        }
    }
}
