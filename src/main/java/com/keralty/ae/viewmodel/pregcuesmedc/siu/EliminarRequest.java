package com.keralty.ae.viewmodel.pregcuesmedc.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.PregCuesMedCConstants;
import com.keralty.ae.persistence.oid.PregCuesMedCOid;
import com.keralty.ae.persistence.PregCuesMedC;

public class EliminarRequest {

    @JsonProperty("p_thispregcuesmedc_oid")
    private PregCuesMedCOid pregCuesMedCeliminarpthisPregCuesMedC;
    
    @JsonIgnore
    private PregCuesMedC pregCuesMedCeliminarpthisPregCuesMedCInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPregCuesMedCeliminarpthisPregCuesMedC();
    }

    @JsonIgnore
    public PregCuesMedCOid getPregCuesMedCeliminarpthisPregCuesMedC() {
        return this.pregCuesMedCeliminarpthisPregCuesMedC;
    }
    
    public void setPregCuesMedCeliminarpthisPregCuesMedC(PregCuesMedCOid pregCuesMedCeliminarpthisPregCuesMedC) {
        this.pregCuesMedCeliminarpthisPregCuesMedC = pregCuesMedCeliminarpthisPregCuesMedC;
    }

    @JsonIgnore
    public PregCuesMedC getPregCuesMedCeliminarpthisPregCuesMedCInstance() {
        return this.pregCuesMedCeliminarpthisPregCuesMedCInstance;
    }
    
    public void setPregCuesMedCeliminarpthisPregCuesMedCInstance(PregCuesMedC pregCuesMedCeliminarpthisPregCuesMedC) {
        this.pregCuesMedCeliminarpthisPregCuesMedCInstance = pregCuesMedCeliminarpthisPregCuesMedC;
        this.pregCuesMedCeliminarpthisPregCuesMedC = pregCuesMedCeliminarpthisPregCuesMedC != null ? pregCuesMedCeliminarpthisPregCuesMedC.getOid() : null;
    }

    private void checkPregCuesMedCeliminarpthisPregCuesMedC() throws NotNullArgumentException {
        if(this.getPregCuesMedCeliminarpthisPregCuesMedCInstance() == null || this.getPregCuesMedCeliminarpthisPregCuesMedCInstance().isNull()) {
            throw new NotNullArgumentException(PregCuesMedCConstants.SERV_ID_ELIMINAR, PregCuesMedCConstants.CLASS_ID, PregCuesMedCConstants.ARG_ID_ELIMINAR_PREGCUESMEDCELIMINARPTHISPREGCUESMEDC, PregCuesMedCConstants.SERV_ALIAS_ELIMINAR, PregCuesMedCConstants.CLASS_ALIAS, PregCuesMedCConstants.ARG_ALIAS_ELIMINAR_PREGCUESMEDCELIMINARPTHISPREGCUESMEDC);
        }
    }
}
