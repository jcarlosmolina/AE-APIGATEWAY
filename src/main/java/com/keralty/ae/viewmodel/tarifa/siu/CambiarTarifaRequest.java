package com.keralty.ae.viewmodel.tarifa.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.TarifaConstants;
import com.keralty.ae.persistence.InstitucionMatNeo;
import com.keralty.ae.persistence.oid.InstitucionMatNeoOid;
import com.keralty.ae.persistence.oid.TarifaOid;
import com.keralty.ae.persistence.Tarifa;

public class CambiarTarifaRequest {

    @JsonProperty("p_thistarifa_oid")
    private TarifaOid tarifaCambiarTarifapthisTarifa;
    
    @JsonIgnore
    private Tarifa tarifaCambiarTarifapthisTarifaInstance;

    @JsonProperty("p_evcinstitucionmatneo_oid")
    private InstitucionMatNeoOid tarifaCambiarTarifapevcInstitucionMatNeo;
    
    @JsonIgnore
    private InstitucionMatNeo tarifaCambiarTarifapevcInstitucionMatNeoInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTarifaCambiarTarifapthisTarifa();
        checkTarifaCambiarTarifapevcInstitucionMatNeo();
    }

    @JsonIgnore
    public TarifaOid getTarifaCambiarTarifapthisTarifa() {
        return this.tarifaCambiarTarifapthisTarifa;
    }
    
    public void setTarifaCambiarTarifapthisTarifa(TarifaOid tarifaCambiarTarifapthisTarifa) {
        this.tarifaCambiarTarifapthisTarifa = tarifaCambiarTarifapthisTarifa;
    }

    @JsonIgnore
    public Tarifa getTarifaCambiarTarifapthisTarifaInstance() {
        return this.tarifaCambiarTarifapthisTarifaInstance;
    }
    
    public void setTarifaCambiarTarifapthisTarifaInstance(Tarifa tarifaCambiarTarifapthisTarifa) {
        this.tarifaCambiarTarifapthisTarifaInstance = tarifaCambiarTarifapthisTarifa;
        this.tarifaCambiarTarifapthisTarifa = tarifaCambiarTarifapthisTarifa != null ? tarifaCambiarTarifapthisTarifa.getOid() : null;
    }

    private void checkTarifaCambiarTarifapthisTarifa() throws NotNullArgumentException {
        if(this.getTarifaCambiarTarifapthisTarifaInstance() == null || this.getTarifaCambiarTarifapthisTarifaInstance().isNull()) {
            throw new NotNullArgumentException(TarifaConstants.SERV_ID_CAMBIARTARIFA, TarifaConstants.CLASS_ID, TarifaConstants.ARG_ID_CAMBIARTARIFA_TARIFACAMBIARTARIFAPTHISTARIFA, TarifaConstants.SERV_ALIAS_CAMBIARTARIFA, TarifaConstants.CLASS_ALIAS, TarifaConstants.ARG_ALIAS_CAMBIARTARIFA_TARIFACAMBIARTARIFAPTHISTARIFA);
        }
    }

    @JsonIgnore
    public InstitucionMatNeoOid getTarifaCambiarTarifapevcInstitucionMatNeo() {
        return this.tarifaCambiarTarifapevcInstitucionMatNeo;
    }
    
    public void setTarifaCambiarTarifapevcInstitucionMatNeo(InstitucionMatNeoOid tarifaCambiarTarifapevcInstitucionMatNeo) {
        this.tarifaCambiarTarifapevcInstitucionMatNeo = tarifaCambiarTarifapevcInstitucionMatNeo;
    }

    @JsonIgnore
    public InstitucionMatNeo getTarifaCambiarTarifapevcInstitucionMatNeoInstance() {
        return this.tarifaCambiarTarifapevcInstitucionMatNeoInstance;
    }
    
    public void setTarifaCambiarTarifapevcInstitucionMatNeoInstance(InstitucionMatNeo tarifaCambiarTarifapevcInstitucionMatNeo) {
        this.tarifaCambiarTarifapevcInstitucionMatNeoInstance = tarifaCambiarTarifapevcInstitucionMatNeo;
        this.tarifaCambiarTarifapevcInstitucionMatNeo = tarifaCambiarTarifapevcInstitucionMatNeo != null ? tarifaCambiarTarifapevcInstitucionMatNeo.getOid() : null;
    }

    private void checkTarifaCambiarTarifapevcInstitucionMatNeo() throws NotNullArgumentException {
        if(this.getTarifaCambiarTarifapevcInstitucionMatNeoInstance() == null || this.getTarifaCambiarTarifapevcInstitucionMatNeoInstance().isNull()) {
            throw new NotNullArgumentException(TarifaConstants.SERV_ID_CAMBIARTARIFA, TarifaConstants.CLASS_ID, TarifaConstants.ARG_ID_CAMBIARTARIFA_TARIFACAMBIARTARIFAPEVCINSTITUCIONMATNEO, TarifaConstants.SERV_ALIAS_CAMBIARTARIFA, TarifaConstants.CLASS_ALIAS, TarifaConstants.ARG_ALIAS_CAMBIARTARIFA_TARIFACAMBIARTARIFAPEVCINSTITUCIONMATNEO);
        }
    }
}
