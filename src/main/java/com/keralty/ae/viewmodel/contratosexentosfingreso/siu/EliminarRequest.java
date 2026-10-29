package com.keralty.ae.viewmodel.contratosexentosfingreso.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.ContratosExentosFIngresoConstants;
import com.keralty.ae.persistence.ContratosExentosFIngreso;
import com.keralty.ae.persistence.oid.ContratosExentosFIngresoOid;

public class EliminarRequest {

    @JsonProperty("p_thiscontratosexentosfingreso_oid")
    private ContratosExentosFIngresoOid contratosExentosFIngresoeliminarpthisContratosExentosFIngreso;
    
    @JsonIgnore
    private ContratosExentosFIngreso contratosExentosFIngresoeliminarpthisContratosExentosFIngresoInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkContratosExentosFIngresoeliminarpthisContratosExentosFIngreso();
    }

    @JsonIgnore
    public ContratosExentosFIngresoOid getContratosExentosFIngresoeliminarpthisContratosExentosFIngreso() {
        return this.contratosExentosFIngresoeliminarpthisContratosExentosFIngreso;
    }
    
    public void setContratosExentosFIngresoeliminarpthisContratosExentosFIngreso(ContratosExentosFIngresoOid contratosExentosFIngresoeliminarpthisContratosExentosFIngreso) {
        this.contratosExentosFIngresoeliminarpthisContratosExentosFIngreso = contratosExentosFIngresoeliminarpthisContratosExentosFIngreso;
    }

    @JsonIgnore
    public ContratosExentosFIngreso getContratosExentosFIngresoeliminarpthisContratosExentosFIngresoInstance() {
        return this.contratosExentosFIngresoeliminarpthisContratosExentosFIngresoInstance;
    }
    
    public void setContratosExentosFIngresoeliminarpthisContratosExentosFIngresoInstance(ContratosExentosFIngreso contratosExentosFIngresoeliminarpthisContratosExentosFIngreso) {
        this.contratosExentosFIngresoeliminarpthisContratosExentosFIngresoInstance = contratosExentosFIngresoeliminarpthisContratosExentosFIngreso;
        this.contratosExentosFIngresoeliminarpthisContratosExentosFIngreso = contratosExentosFIngresoeliminarpthisContratosExentosFIngreso != null ? contratosExentosFIngresoeliminarpthisContratosExentosFIngreso.getOid() : null;
    }

    private void checkContratosExentosFIngresoeliminarpthisContratosExentosFIngreso() throws NotNullArgumentException {
        if(this.getContratosExentosFIngresoeliminarpthisContratosExentosFIngresoInstance() == null || this.getContratosExentosFIngresoeliminarpthisContratosExentosFIngresoInstance().isNull()) {
            throw new NotNullArgumentException(ContratosExentosFIngresoConstants.SERV_ID_ELIMINAR, ContratosExentosFIngresoConstants.CLASS_ID, ContratosExentosFIngresoConstants.ARG_ID_ELIMINAR_CONTRATOSEXENTOSFINGRESOELIMINARPTHISCONTRATOSEXENTOSFINGRESO, ContratosExentosFIngresoConstants.SERV_ALIAS_ELIMINAR, ContratosExentosFIngresoConstants.CLASS_ALIAS, ContratosExentosFIngresoConstants.ARG_ALIAS_ELIMINAR_CONTRATOSEXENTOSFINGRESOELIMINARPTHISCONTRATOSEXENTOSFINGRESO);
        }
    }
}
