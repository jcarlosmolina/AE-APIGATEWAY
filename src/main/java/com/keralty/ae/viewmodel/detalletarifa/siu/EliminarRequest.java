package com.keralty.ae.viewmodel.detalletarifa.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.DetalleTarifaConstants;
import com.keralty.ae.persistence.DetalleTarifa;
import com.keralty.ae.persistence.oid.DetalleTarifaOid;

public class EliminarRequest {

    @JsonProperty("p_thisdetalletarifa_oid")
    private DetalleTarifaOid detalleTarifaeliminarpthisDetalleTarifa;
    
    @JsonIgnore
    private DetalleTarifa detalleTarifaeliminarpthisDetalleTarifaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDetalleTarifaeliminarpthisDetalleTarifa();
    }

    @JsonIgnore
    public DetalleTarifaOid getDetalleTarifaeliminarpthisDetalleTarifa() {
        return this.detalleTarifaeliminarpthisDetalleTarifa;
    }
    
    public void setDetalleTarifaeliminarpthisDetalleTarifa(DetalleTarifaOid detalleTarifaeliminarpthisDetalleTarifa) {
        this.detalleTarifaeliminarpthisDetalleTarifa = detalleTarifaeliminarpthisDetalleTarifa;
    }

    @JsonIgnore
    public DetalleTarifa getDetalleTarifaeliminarpthisDetalleTarifaInstance() {
        return this.detalleTarifaeliminarpthisDetalleTarifaInstance;
    }
    
    public void setDetalleTarifaeliminarpthisDetalleTarifaInstance(DetalleTarifa detalleTarifaeliminarpthisDetalleTarifa) {
        this.detalleTarifaeliminarpthisDetalleTarifaInstance = detalleTarifaeliminarpthisDetalleTarifa;
        this.detalleTarifaeliminarpthisDetalleTarifa = detalleTarifaeliminarpthisDetalleTarifa != null ? detalleTarifaeliminarpthisDetalleTarifa.getOid() : null;
    }

    private void checkDetalleTarifaeliminarpthisDetalleTarifa() throws NotNullArgumentException {
        if(this.getDetalleTarifaeliminarpthisDetalleTarifaInstance() == null || this.getDetalleTarifaeliminarpthisDetalleTarifaInstance().isNull()) {
            throw new NotNullArgumentException(DetalleTarifaConstants.SERV_ID_ELIMINAR, DetalleTarifaConstants.CLASS_ID, DetalleTarifaConstants.ARG_ID_ELIMINAR_DETALLETARIFAELIMINARPTHISDETALLETARIFA, DetalleTarifaConstants.SERV_ALIAS_ELIMINAR, DetalleTarifaConstants.CLASS_ALIAS, DetalleTarifaConstants.ARG_ALIAS_ELIMINAR_DETALLETARIFAELIMINARPTHISDETALLETARIFA);
        }
    }
}
