package com.keralty.ae.viewmodel.plantillaemail.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.PlantillaEmailConstants;
import com.keralty.ae.persistence.oid.PlantillaEmailOid;
import com.keralty.ae.persistence.PlantillaEmail;

public class DummyModificarRequest {

    @JsonProperty("p_thisplantillaemail_oid")
    private PlantillaEmailOid plantillaEmaildummyModificarpthisPlantillaEmail;
    
    @JsonIgnore
    private PlantillaEmail plantillaEmaildummyModificarpthisPlantillaEmailInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPlantillaEmaildummyModificarpthisPlantillaEmail();
    }

    @JsonIgnore
    public PlantillaEmailOid getPlantillaEmaildummyModificarpthisPlantillaEmail() {
        return this.plantillaEmaildummyModificarpthisPlantillaEmail;
    }
    
    public void setPlantillaEmaildummyModificarpthisPlantillaEmail(PlantillaEmailOid plantillaEmaildummyModificarpthisPlantillaEmail) {
        this.plantillaEmaildummyModificarpthisPlantillaEmail = plantillaEmaildummyModificarpthisPlantillaEmail;
    }

    @JsonIgnore
    public PlantillaEmail getPlantillaEmaildummyModificarpthisPlantillaEmailInstance() {
        return this.plantillaEmaildummyModificarpthisPlantillaEmailInstance;
    }
    
    public void setPlantillaEmaildummyModificarpthisPlantillaEmailInstance(PlantillaEmail plantillaEmaildummyModificarpthisPlantillaEmail) {
        this.plantillaEmaildummyModificarpthisPlantillaEmailInstance = plantillaEmaildummyModificarpthisPlantillaEmail;
        this.plantillaEmaildummyModificarpthisPlantillaEmail = plantillaEmaildummyModificarpthisPlantillaEmail != null ? plantillaEmaildummyModificarpthisPlantillaEmail.getOid() : null;
    }

    private void checkPlantillaEmaildummyModificarpthisPlantillaEmail() throws NotNullArgumentException {
        if(this.getPlantillaEmaildummyModificarpthisPlantillaEmailInstance() == null || this.getPlantillaEmaildummyModificarpthisPlantillaEmailInstance().isNull()) {
            throw new NotNullArgumentException(PlantillaEmailConstants.SERV_ID_DUMMYMODIFICAR, PlantillaEmailConstants.CLASS_ID, PlantillaEmailConstants.ARG_ID_DUMMYMODIFICAR_PLANTILLAEMAILDUMMYMODIFICARPTHISPLANTILLAEMAIL, PlantillaEmailConstants.SERV_ALIAS_DUMMYMODIFICAR, PlantillaEmailConstants.CLASS_ALIAS, PlantillaEmailConstants.ARG_ALIAS_DUMMYMODIFICAR_PLANTILLAEMAILDUMMYMODIFICARPTHISPLANTILLAEMAIL);
        }
    }
}
