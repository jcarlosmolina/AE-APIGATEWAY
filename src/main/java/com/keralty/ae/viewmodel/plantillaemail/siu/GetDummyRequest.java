package com.keralty.ae.viewmodel.plantillaemail.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.PlantillaEmailConstants;
import com.keralty.ae.persistence.oid.PlantillaEmailOid;
import com.keralty.ae.persistence.PlantillaEmail;

public class GetDummyRequest {

    @JsonProperty("p_thisplantillaemail_oid")
    private PlantillaEmailOid plantillaEmailgetDummypthisPlantillaEmail;
    
    @JsonIgnore
    private PlantillaEmail plantillaEmailgetDummypthisPlantillaEmailInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPlantillaEmailgetDummypthisPlantillaEmail();
    }

    @JsonIgnore
    public PlantillaEmailOid getPlantillaEmailgetDummypthisPlantillaEmail() {
        return this.plantillaEmailgetDummypthisPlantillaEmail;
    }
    
    public void setPlantillaEmailgetDummypthisPlantillaEmail(PlantillaEmailOid plantillaEmailgetDummypthisPlantillaEmail) {
        this.plantillaEmailgetDummypthisPlantillaEmail = plantillaEmailgetDummypthisPlantillaEmail;
    }

    @JsonIgnore
    public PlantillaEmail getPlantillaEmailgetDummypthisPlantillaEmailInstance() {
        return this.plantillaEmailgetDummypthisPlantillaEmailInstance;
    }
    
    public void setPlantillaEmailgetDummypthisPlantillaEmailInstance(PlantillaEmail plantillaEmailgetDummypthisPlantillaEmail) {
        this.plantillaEmailgetDummypthisPlantillaEmailInstance = plantillaEmailgetDummypthisPlantillaEmail;
        this.plantillaEmailgetDummypthisPlantillaEmail = plantillaEmailgetDummypthisPlantillaEmail != null ? plantillaEmailgetDummypthisPlantillaEmail.getOid() : null;
    }

    private void checkPlantillaEmailgetDummypthisPlantillaEmail() throws NotNullArgumentException {
        if(this.getPlantillaEmailgetDummypthisPlantillaEmailInstance() == null || this.getPlantillaEmailgetDummypthisPlantillaEmailInstance().isNull()) {
            throw new NotNullArgumentException(PlantillaEmailConstants.SERV_ID_GETDUMMY, PlantillaEmailConstants.CLASS_ID, PlantillaEmailConstants.ARG_ID_GETDUMMY_PLANTILLAEMAILGETDUMMYPTHISPLANTILLAEMAIL, PlantillaEmailConstants.SERV_ALIAS_GETDUMMY, PlantillaEmailConstants.CLASS_ALIAS, PlantillaEmailConstants.ARG_ALIAS_GETDUMMY_PLANTILLAEMAILGETDUMMYPTHISPLANTILLAEMAIL);
        }
    }
}
