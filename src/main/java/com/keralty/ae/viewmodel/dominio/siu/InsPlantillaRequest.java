package com.keralty.ae.viewmodel.dominio.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.DominioConstants;
import com.keralty.ae.persistence.Dominio;
import com.keralty.ae.persistence.oid.DominioOid;
import com.keralty.ae.persistence.oid.PlantillaEmailOid;
import com.keralty.ae.persistence.PlantillaEmail;

public class InsPlantillaRequest {

    @JsonProperty("p_thisdominio_oid")
    private DominioOid dominioInsPlantillapthisDominio;
    
    @JsonIgnore
    private Dominio dominioInsPlantillapthisDominioInstance;

    @JsonProperty("p_evcplantillaemail_oid")
    private PlantillaEmailOid dominioInsPlantillapevcPlantillaEmail;
    
    @JsonIgnore
    private PlantillaEmail dominioInsPlantillapevcPlantillaEmailInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDominioInsPlantillapthisDominio();
        checkDominioInsPlantillapevcPlantillaEmail();
    }

    @JsonIgnore
    public DominioOid getDominioInsPlantillapthisDominio() {
        return this.dominioInsPlantillapthisDominio;
    }
    
    public void setDominioInsPlantillapthisDominio(DominioOid dominioInsPlantillapthisDominio) {
        this.dominioInsPlantillapthisDominio = dominioInsPlantillapthisDominio;
    }

    @JsonIgnore
    public Dominio getDominioInsPlantillapthisDominioInstance() {
        return this.dominioInsPlantillapthisDominioInstance;
    }
    
    public void setDominioInsPlantillapthisDominioInstance(Dominio dominioInsPlantillapthisDominio) {
        this.dominioInsPlantillapthisDominioInstance = dominioInsPlantillapthisDominio;
        this.dominioInsPlantillapthisDominio = dominioInsPlantillapthisDominio != null ? dominioInsPlantillapthisDominio.getOid() : null;
    }

    private void checkDominioInsPlantillapthisDominio() throws NotNullArgumentException {
        if(this.getDominioInsPlantillapthisDominioInstance() == null || this.getDominioInsPlantillapthisDominioInstance().isNull()) {
            throw new NotNullArgumentException(DominioConstants.SERV_ID_INSPLANTILLA, DominioConstants.CLASS_ID, DominioConstants.ARG_ID_INSPLANTILLA_DOMINIOINSPLANTILLAPTHISDOMINIO, DominioConstants.SERV_ALIAS_INSPLANTILLA, DominioConstants.CLASS_ALIAS, DominioConstants.ARG_ALIAS_INSPLANTILLA_DOMINIOINSPLANTILLAPTHISDOMINIO);
        }
    }

    @JsonIgnore
    public PlantillaEmailOid getDominioInsPlantillapevcPlantillaEmail() {
        return this.dominioInsPlantillapevcPlantillaEmail;
    }
    
    public void setDominioInsPlantillapevcPlantillaEmail(PlantillaEmailOid dominioInsPlantillapevcPlantillaEmail) {
        this.dominioInsPlantillapevcPlantillaEmail = dominioInsPlantillapevcPlantillaEmail;
    }

    @JsonIgnore
    public PlantillaEmail getDominioInsPlantillapevcPlantillaEmailInstance() {
        return this.dominioInsPlantillapevcPlantillaEmailInstance;
    }
    
    public void setDominioInsPlantillapevcPlantillaEmailInstance(PlantillaEmail dominioInsPlantillapevcPlantillaEmail) {
        this.dominioInsPlantillapevcPlantillaEmailInstance = dominioInsPlantillapevcPlantillaEmail;
        this.dominioInsPlantillapevcPlantillaEmail = dominioInsPlantillapevcPlantillaEmail != null ? dominioInsPlantillapevcPlantillaEmail.getOid() : null;
    }

    private void checkDominioInsPlantillapevcPlantillaEmail() throws NotNullArgumentException {
        if(this.getDominioInsPlantillapevcPlantillaEmailInstance() == null || this.getDominioInsPlantillapevcPlantillaEmailInstance().isNull()) {
            throw new NotNullArgumentException(DominioConstants.SERV_ID_INSPLANTILLA, DominioConstants.CLASS_ID, DominioConstants.ARG_ID_INSPLANTILLA_DOMINIOINSPLANTILLAPEVCPLANTILLAEMAIL, DominioConstants.SERV_ALIAS_INSPLANTILLA, DominioConstants.CLASS_ALIAS, DominioConstants.ARG_ALIAS_INSPLANTILLA_DOMINIOINSPLANTILLAPEVCPLANTILLAEMAIL);
        }
    }
}
