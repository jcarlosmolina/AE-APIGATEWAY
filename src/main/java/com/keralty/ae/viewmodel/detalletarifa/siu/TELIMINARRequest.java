package com.keralty.ae.viewmodel.detalletarifa.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.DetalleTarifaConstants;
import com.keralty.ae.persistence.DetalleTarifa;
import com.keralty.ae.persistence.oid.DetalleTarifaOid;

public class TELIMINARRequest {

    @JsonProperty("p_thisdetalletarifa_oid")
    private DetalleTarifaOid detalleTarifaTELIMINARpthisDetalleTarifa;
    
    @JsonIgnore
    private DetalleTarifa detalleTarifaTELIMINARpthisDetalleTarifaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDetalleTarifaTELIMINARpthisDetalleTarifa();
    }

    @JsonIgnore
    public DetalleTarifaOid getDetalleTarifaTELIMINARpthisDetalleTarifa() {
        return this.detalleTarifaTELIMINARpthisDetalleTarifa;
    }
    
    public void setDetalleTarifaTELIMINARpthisDetalleTarifa(DetalleTarifaOid detalleTarifaTELIMINARpthisDetalleTarifa) {
        this.detalleTarifaTELIMINARpthisDetalleTarifa = detalleTarifaTELIMINARpthisDetalleTarifa;
    }

    @JsonIgnore
    public DetalleTarifa getDetalleTarifaTELIMINARpthisDetalleTarifaInstance() {
        return this.detalleTarifaTELIMINARpthisDetalleTarifaInstance;
    }
    
    public void setDetalleTarifaTELIMINARpthisDetalleTarifaInstance(DetalleTarifa detalleTarifaTELIMINARpthisDetalleTarifa) {
        this.detalleTarifaTELIMINARpthisDetalleTarifaInstance = detalleTarifaTELIMINARpthisDetalleTarifa;
        this.detalleTarifaTELIMINARpthisDetalleTarifa = detalleTarifaTELIMINARpthisDetalleTarifa != null ? detalleTarifaTELIMINARpthisDetalleTarifa.getOid() : null;
    }

    private void checkDetalleTarifaTELIMINARpthisDetalleTarifa() throws NotNullArgumentException {
        if(this.getDetalleTarifaTELIMINARpthisDetalleTarifaInstance() == null || this.getDetalleTarifaTELIMINARpthisDetalleTarifaInstance().isNull()) {
            throw new NotNullArgumentException(DetalleTarifaConstants.SERV_ID_TELIMINAR, DetalleTarifaConstants.CLASS_ID, DetalleTarifaConstants.ARG_ID_TELIMINAR_DETALLETARIFATELIMINARPTHISDETALLETARIFA, DetalleTarifaConstants.SERV_ALIAS_TELIMINAR, DetalleTarifaConstants.CLASS_ALIAS, DetalleTarifaConstants.ARG_ALIAS_TELIMINAR_DETALLETARIFATELIMINARPTHISDETALLETARIFA);
        }
    }
}
