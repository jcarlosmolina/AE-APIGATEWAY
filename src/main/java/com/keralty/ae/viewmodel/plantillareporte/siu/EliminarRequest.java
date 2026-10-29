package com.keralty.ae.viewmodel.plantillareporte.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.PlantillaReporteConstants;
import com.keralty.ae.persistence.oid.PlantillaReporteOid;
import com.keralty.ae.persistence.PlantillaReporte;

public class EliminarRequest {

    @JsonProperty("p_thisplantillareporte_oid")
    private PlantillaReporteOid plantillaReporteeliminarpthisPlantillaReporte;
    
    @JsonIgnore
    private PlantillaReporte plantillaReporteeliminarpthisPlantillaReporteInstance;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkPlantillaReporteeliminarpthisPlantillaReporte();
    }

    @JsonIgnore
    public PlantillaReporteOid getPlantillaReporteeliminarpthisPlantillaReporte() {
        return this.plantillaReporteeliminarpthisPlantillaReporte;
    }
    
    public void setPlantillaReporteeliminarpthisPlantillaReporte(PlantillaReporteOid plantillaReporteeliminarpthisPlantillaReporte) {
        this.plantillaReporteeliminarpthisPlantillaReporte = plantillaReporteeliminarpthisPlantillaReporte;
    }

    @JsonIgnore
    public PlantillaReporte getPlantillaReporteeliminarpthisPlantillaReporteInstance() {
        return this.plantillaReporteeliminarpthisPlantillaReporteInstance;
    }
    
    public void setPlantillaReporteeliminarpthisPlantillaReporteInstance(PlantillaReporte plantillaReporteeliminarpthisPlantillaReporte) {
        this.plantillaReporteeliminarpthisPlantillaReporteInstance = plantillaReporteeliminarpthisPlantillaReporte;
        this.plantillaReporteeliminarpthisPlantillaReporte = plantillaReporteeliminarpthisPlantillaReporte != null ? plantillaReporteeliminarpthisPlantillaReporte.getOid() : null;
    }

    private void checkPlantillaReporteeliminarpthisPlantillaReporte() throws NotNullArgumentException {
        if(this.getPlantillaReporteeliminarpthisPlantillaReporteInstance() == null || this.getPlantillaReporteeliminarpthisPlantillaReporteInstance().isNull()) {
            throw new NotNullArgumentException(PlantillaReporteConstants.SERV_ID_ELIMINAR, PlantillaReporteConstants.CLASS_ID, PlantillaReporteConstants.ARG_ID_ELIMINAR_PLANTILLAREPORTEELIMINARPTHISPLANTILLAREPORTE, PlantillaReporteConstants.SERV_ALIAS_ELIMINAR, PlantillaReporteConstants.CLASS_ALIAS, PlantillaReporteConstants.ARG_ALIAS_ELIMINAR_PLANTILLAREPORTEELIMINARPTHISPLANTILLAREPORTE);
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
