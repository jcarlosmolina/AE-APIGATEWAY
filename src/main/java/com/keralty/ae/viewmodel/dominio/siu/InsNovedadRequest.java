package com.keralty.ae.viewmodel.dominio.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.DominioConstants;
import com.keralty.ae.persistence.Dominio;
import com.keralty.ae.persistence.Novedad;
import com.keralty.ae.persistence.oid.DominioOid;
import com.keralty.ae.persistence.oid.NovedadOid;

public class InsNovedadRequest {

    @JsonProperty("p_thisdominio_oid")
    private DominioOid dominioInsNovedadpthisDominio;
    
    @JsonIgnore
    private Dominio dominioInsNovedadpthisDominioInstance;

    @JsonProperty("p_evcnovedad_oid")
    private NovedadOid dominioInsNovedadpevcNovedad;
    
    @JsonIgnore
    private Novedad dominioInsNovedadpevcNovedadInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDominioInsNovedadpthisDominio();
        checkDominioInsNovedadpevcNovedad();
    }

    @JsonIgnore
    public DominioOid getDominioInsNovedadpthisDominio() {
        return this.dominioInsNovedadpthisDominio;
    }
    
    public void setDominioInsNovedadpthisDominio(DominioOid dominioInsNovedadpthisDominio) {
        this.dominioInsNovedadpthisDominio = dominioInsNovedadpthisDominio;
    }

    @JsonIgnore
    public Dominio getDominioInsNovedadpthisDominioInstance() {
        return this.dominioInsNovedadpthisDominioInstance;
    }
    
    public void setDominioInsNovedadpthisDominioInstance(Dominio dominioInsNovedadpthisDominio) {
        this.dominioInsNovedadpthisDominioInstance = dominioInsNovedadpthisDominio;
        this.dominioInsNovedadpthisDominio = dominioInsNovedadpthisDominio != null ? dominioInsNovedadpthisDominio.getOid() : null;
    }

    private void checkDominioInsNovedadpthisDominio() throws NotNullArgumentException {
        if(this.getDominioInsNovedadpthisDominioInstance() == null || this.getDominioInsNovedadpthisDominioInstance().isNull()) {
            throw new NotNullArgumentException(DominioConstants.SERV_ID_INSNOVEDAD, DominioConstants.CLASS_ID, DominioConstants.ARG_ID_INSNOVEDAD_DOMINIOINSNOVEDADPTHISDOMINIO, DominioConstants.SERV_ALIAS_INSNOVEDAD, DominioConstants.CLASS_ALIAS, DominioConstants.ARG_ALIAS_INSNOVEDAD_DOMINIOINSNOVEDADPTHISDOMINIO);
        }
    }

    @JsonIgnore
    public NovedadOid getDominioInsNovedadpevcNovedad() {
        return this.dominioInsNovedadpevcNovedad;
    }
    
    public void setDominioInsNovedadpevcNovedad(NovedadOid dominioInsNovedadpevcNovedad) {
        this.dominioInsNovedadpevcNovedad = dominioInsNovedadpevcNovedad;
    }

    @JsonIgnore
    public Novedad getDominioInsNovedadpevcNovedadInstance() {
        return this.dominioInsNovedadpevcNovedadInstance;
    }
    
    public void setDominioInsNovedadpevcNovedadInstance(Novedad dominioInsNovedadpevcNovedad) {
        this.dominioInsNovedadpevcNovedadInstance = dominioInsNovedadpevcNovedad;
        this.dominioInsNovedadpevcNovedad = dominioInsNovedadpevcNovedad != null ? dominioInsNovedadpevcNovedad.getOid() : null;
    }

    private void checkDominioInsNovedadpevcNovedad() throws NotNullArgumentException {
        if(this.getDominioInsNovedadpevcNovedadInstance() == null || this.getDominioInsNovedadpevcNovedadInstance().isNull()) {
            throw new NotNullArgumentException(DominioConstants.SERV_ID_INSNOVEDAD, DominioConstants.CLASS_ID, DominioConstants.ARG_ID_INSNOVEDAD_DOMINIOINSNOVEDADPEVCNOVEDAD, DominioConstants.SERV_ALIAS_INSNOVEDAD, DominioConstants.CLASS_ALIAS, DominioConstants.ARG_ALIAS_INSNOVEDAD_DOMINIOINSNOVEDADPEVCNOVEDAD);
        }
    }
}
