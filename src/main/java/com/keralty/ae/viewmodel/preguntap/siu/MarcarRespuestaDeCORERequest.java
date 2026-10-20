package com.keralty.ae.viewmodel.preguntap.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.PreguntaPConstants;
import com.keralty.ae.persistence.oid.PreguntaPOid;
import com.keralty.ae.persistence.PreguntaP;

public class MarcarRespuestaDeCORERequest {

    @JsonProperty("p_thispreguntap_oid")
    private PreguntaPOid preguntaPmarcarRespuestaDeCOREpthisPreguntaP;
    
    @JsonIgnore
    private PreguntaP preguntaPmarcarRespuestaDeCOREpthisPreguntaPInstance;

    @JsonProperty("p_respuestasino")
    private Boolean preguntaPmarcarRespuestaDeCOREpRespuestaSiNo;

    public void checkArguments() throws NotNullArgumentException {
        checkPreguntaPmarcarRespuestaDeCOREpthisPreguntaP();
        checkPreguntaPmarcarRespuestaDeCOREpRespuestaSiNo();
    }

    @JsonIgnore
    public PreguntaPOid getPreguntaPmarcarRespuestaDeCOREpthisPreguntaP() {
        return this.preguntaPmarcarRespuestaDeCOREpthisPreguntaP;
    }
    
    public void setPreguntaPmarcarRespuestaDeCOREpthisPreguntaP(PreguntaPOid preguntaPmarcarRespuestaDeCOREpthisPreguntaP) {
        this.preguntaPmarcarRespuestaDeCOREpthisPreguntaP = preguntaPmarcarRespuestaDeCOREpthisPreguntaP;
    }

    @JsonIgnore
    public PreguntaP getPreguntaPmarcarRespuestaDeCOREpthisPreguntaPInstance() {
        return this.preguntaPmarcarRespuestaDeCOREpthisPreguntaPInstance;
    }
    
    public void setPreguntaPmarcarRespuestaDeCOREpthisPreguntaPInstance(PreguntaP preguntaPmarcarRespuestaDeCOREpthisPreguntaP) {
        this.preguntaPmarcarRespuestaDeCOREpthisPreguntaPInstance = preguntaPmarcarRespuestaDeCOREpthisPreguntaP;
        this.preguntaPmarcarRespuestaDeCOREpthisPreguntaP = preguntaPmarcarRespuestaDeCOREpthisPreguntaP != null ? preguntaPmarcarRespuestaDeCOREpthisPreguntaP.getOid() : null;
    }

    private void checkPreguntaPmarcarRespuestaDeCOREpthisPreguntaP() throws NotNullArgumentException {
        if(this.getPreguntaPmarcarRespuestaDeCOREpthisPreguntaPInstance() == null || this.getPreguntaPmarcarRespuestaDeCOREpthisPreguntaPInstance().isNull()) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_MARCARRESPUESTADECORE, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_MARCARRESPUESTADECORE_PREGUNTAPMARCARRESPUESTADECOREPTHISPREGUNTAP, PreguntaPConstants.SERV_ALIAS_MARCARRESPUESTADECORE, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_MARCARRESPUESTADECORE_PREGUNTAPMARCARRESPUESTADECOREPTHISPREGUNTAP);
        }
    }

    @JsonIgnore
    public Boolean getPreguntaPmarcarRespuestaDeCOREpRespuestaSiNo() {
        return this.preguntaPmarcarRespuestaDeCOREpRespuestaSiNo;
    }
    
    public void setPreguntaPmarcarRespuestaDeCOREpRespuestaSiNo(Boolean preguntaPmarcarRespuestaDeCOREpRespuestaSiNo) {
        this.preguntaPmarcarRespuestaDeCOREpRespuestaSiNo = preguntaPmarcarRespuestaDeCOREpRespuestaSiNo;
    }

    private void checkPreguntaPmarcarRespuestaDeCOREpRespuestaSiNo() throws NotNullArgumentException {
        if(this.getPreguntaPmarcarRespuestaDeCOREpRespuestaSiNo() == null) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_MARCARRESPUESTADECORE, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_MARCARRESPUESTADECORE_PREGUNTAPMARCARRESPUESTADECOREPRESPUESTASINO, PreguntaPConstants.SERV_ALIAS_MARCARRESPUESTADECORE, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_MARCARRESPUESTADECORE_PREGUNTAPMARCARRESPUESTADECOREPRESPUESTASINO);
        }
    }
}
