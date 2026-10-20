package com.keralty.ae.viewmodel.periodicidad.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.PeriodicidadConstants;
import com.keralty.ae.persistence.oid.PeriodicidadOid;
import com.keralty.ae.persistence.Periodicidad;

public class EliminarRequest {

    @JsonProperty("p_thisperiodicidad_oid")
    private PeriodicidadOid periodicidadeliminarpthisPeriodicidad;
    
    @JsonIgnore
    private Periodicidad periodicidadeliminarpthisPeriodicidadInstance;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkPeriodicidadeliminarpthisPeriodicidad();
    }

    @JsonIgnore
    public PeriodicidadOid getPeriodicidadeliminarpthisPeriodicidad() {
        return this.periodicidadeliminarpthisPeriodicidad;
    }
    
    public void setPeriodicidadeliminarpthisPeriodicidad(PeriodicidadOid periodicidadeliminarpthisPeriodicidad) {
        this.periodicidadeliminarpthisPeriodicidad = periodicidadeliminarpthisPeriodicidad;
    }

    @JsonIgnore
    public Periodicidad getPeriodicidadeliminarpthisPeriodicidadInstance() {
        return this.periodicidadeliminarpthisPeriodicidadInstance;
    }
    
    public void setPeriodicidadeliminarpthisPeriodicidadInstance(Periodicidad periodicidadeliminarpthisPeriodicidad) {
        this.periodicidadeliminarpthisPeriodicidadInstance = periodicidadeliminarpthisPeriodicidad;
        this.periodicidadeliminarpthisPeriodicidad = periodicidadeliminarpthisPeriodicidad != null ? periodicidadeliminarpthisPeriodicidad.getOid() : null;
    }

    private void checkPeriodicidadeliminarpthisPeriodicidad() throws NotNullArgumentException {
        if(this.getPeriodicidadeliminarpthisPeriodicidadInstance() == null || this.getPeriodicidadeliminarpthisPeriodicidadInstance().isNull()) {
            throw new NotNullArgumentException(PeriodicidadConstants.SERV_ID_ELIMINAR, PeriodicidadConstants.CLASS_ID, PeriodicidadConstants.ARG_ID_ELIMINAR_PERIODICIDADELIMINARPTHISPERIODICIDAD, PeriodicidadConstants.SERV_ALIAS_ELIMINAR, PeriodicidadConstants.CLASS_ALIAS, PeriodicidadConstants.ARG_ALIAS_ELIMINAR_PERIODICIDADELIMINARPTHISPERIODICIDAD);
        }
    }

    @JsonIgnore
    public String getPreconditionId() {
        return this.preconditionId;
    }
    
    public void setPreconditionId(String preconditionId) {
        this.preconditionId = preconditionId;
    }
}
