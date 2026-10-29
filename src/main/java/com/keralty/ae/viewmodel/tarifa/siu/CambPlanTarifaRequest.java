package com.keralty.ae.viewmodel.tarifa.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.TarifaConstants;
import com.keralty.ae.persistence.oid.PlanesOid;
import com.keralty.ae.persistence.oid.TarifaOid;
import com.keralty.ae.persistence.Planes;
import com.keralty.ae.persistence.Tarifa;

public class CambPlanTarifaRequest {

    @JsonProperty("p_thistarifa_oid")
    private TarifaOid tarifaCambPlanTarifapthisTarifa;
    
    @JsonIgnore
    private Tarifa tarifaCambPlanTarifapthisTarifaInstance;

    @JsonProperty("p_evcplanes_oid")
    private PlanesOid tarifaCambPlanTarifapevcPlanes;
    
    @JsonIgnore
    private Planes tarifaCambPlanTarifapevcPlanesInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTarifaCambPlanTarifapthisTarifa();
        checkTarifaCambPlanTarifapevcPlanes();
    }

    @JsonIgnore
    public TarifaOid getTarifaCambPlanTarifapthisTarifa() {
        return this.tarifaCambPlanTarifapthisTarifa;
    }
    
    public void setTarifaCambPlanTarifapthisTarifa(TarifaOid tarifaCambPlanTarifapthisTarifa) {
        this.tarifaCambPlanTarifapthisTarifa = tarifaCambPlanTarifapthisTarifa;
    }

    @JsonIgnore
    public Tarifa getTarifaCambPlanTarifapthisTarifaInstance() {
        return this.tarifaCambPlanTarifapthisTarifaInstance;
    }
    
    public void setTarifaCambPlanTarifapthisTarifaInstance(Tarifa tarifaCambPlanTarifapthisTarifa) {
        this.tarifaCambPlanTarifapthisTarifaInstance = tarifaCambPlanTarifapthisTarifa;
        this.tarifaCambPlanTarifapthisTarifa = tarifaCambPlanTarifapthisTarifa != null ? tarifaCambPlanTarifapthisTarifa.getOid() : null;
    }

    private void checkTarifaCambPlanTarifapthisTarifa() throws NotNullArgumentException {
        if(this.getTarifaCambPlanTarifapthisTarifaInstance() == null || this.getTarifaCambPlanTarifapthisTarifaInstance().isNull()) {
            throw new NotNullArgumentException(TarifaConstants.SERV_ID_CAMBPLANTARIFA, TarifaConstants.CLASS_ID, TarifaConstants.ARG_ID_CAMBPLANTARIFA_TARIFACAMBPLANTARIFAPTHISTARIFA, TarifaConstants.SERV_ALIAS_CAMBPLANTARIFA, TarifaConstants.CLASS_ALIAS, TarifaConstants.ARG_ALIAS_CAMBPLANTARIFA_TARIFACAMBPLANTARIFAPTHISTARIFA);
        }
    }

    @JsonIgnore
    public PlanesOid getTarifaCambPlanTarifapevcPlanes() {
        return this.tarifaCambPlanTarifapevcPlanes;
    }
    
    public void setTarifaCambPlanTarifapevcPlanes(PlanesOid tarifaCambPlanTarifapevcPlanes) {
        this.tarifaCambPlanTarifapevcPlanes = tarifaCambPlanTarifapevcPlanes;
    }

    @JsonIgnore
    public Planes getTarifaCambPlanTarifapevcPlanesInstance() {
        return this.tarifaCambPlanTarifapevcPlanesInstance;
    }
    
    public void setTarifaCambPlanTarifapevcPlanesInstance(Planes tarifaCambPlanTarifapevcPlanes) {
        this.tarifaCambPlanTarifapevcPlanesInstance = tarifaCambPlanTarifapevcPlanes;
        this.tarifaCambPlanTarifapevcPlanes = tarifaCambPlanTarifapevcPlanes != null ? tarifaCambPlanTarifapevcPlanes.getOid() : null;
    }

    private void checkTarifaCambPlanTarifapevcPlanes() throws NotNullArgumentException {
        if(this.getTarifaCambPlanTarifapevcPlanesInstance() == null || this.getTarifaCambPlanTarifapevcPlanesInstance().isNull()) {
            throw new NotNullArgumentException(TarifaConstants.SERV_ID_CAMBPLANTARIFA, TarifaConstants.CLASS_ID, TarifaConstants.ARG_ID_CAMBPLANTARIFA_TARIFACAMBPLANTARIFAPEVCPLANES, TarifaConstants.SERV_ALIAS_CAMBPLANTARIFA, TarifaConstants.CLASS_ALIAS, TarifaConstants.ARG_ALIAS_CAMBPLANTARIFA_TARIFACAMBPLANTARIFAPEVCPLANES);
        }
    }
}
