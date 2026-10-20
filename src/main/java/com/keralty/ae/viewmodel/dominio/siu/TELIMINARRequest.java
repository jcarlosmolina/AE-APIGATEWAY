package com.keralty.ae.viewmodel.dominio.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.DominioConstants;
import com.keralty.ae.persistence.Dominio;
import com.keralty.ae.persistence.oid.DominioOid;

public class TELIMINARRequest {

    @JsonProperty("p_thisdominio_oid")
    private DominioOid dominioTELIMINARpthisDominio;
    
    @JsonIgnore
    private Dominio dominioTELIMINARpthisDominioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDominioTELIMINARpthisDominio();
    }

    @JsonIgnore
    public DominioOid getDominioTELIMINARpthisDominio() {
        return this.dominioTELIMINARpthisDominio;
    }
    
    public void setDominioTELIMINARpthisDominio(DominioOid dominioTELIMINARpthisDominio) {
        this.dominioTELIMINARpthisDominio = dominioTELIMINARpthisDominio;
    }

    @JsonIgnore
    public Dominio getDominioTELIMINARpthisDominioInstance() {
        return this.dominioTELIMINARpthisDominioInstance;
    }
    
    public void setDominioTELIMINARpthisDominioInstance(Dominio dominioTELIMINARpthisDominio) {
        this.dominioTELIMINARpthisDominioInstance = dominioTELIMINARpthisDominio;
        this.dominioTELIMINARpthisDominio = dominioTELIMINARpthisDominio != null ? dominioTELIMINARpthisDominio.getOid() : null;
    }

    private void checkDominioTELIMINARpthisDominio() throws NotNullArgumentException {
        if(this.getDominioTELIMINARpthisDominioInstance() == null || this.getDominioTELIMINARpthisDominioInstance().isNull()) {
            throw new NotNullArgumentException(DominioConstants.SERV_ID_TELIMINAR, DominioConstants.CLASS_ID, DominioConstants.ARG_ID_TELIMINAR_DOMINIOTELIMINARPTHISDOMINIO, DominioConstants.SERV_ALIAS_TELIMINAR, DominioConstants.CLASS_ALIAS, DominioConstants.ARG_ALIAS_TELIMINAR_DOMINIOTELIMINARPTHISDOMINIO);
        }
    }
}
