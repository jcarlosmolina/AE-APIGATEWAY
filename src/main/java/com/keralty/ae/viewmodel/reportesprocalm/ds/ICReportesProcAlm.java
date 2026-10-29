package com.keralty.ae.viewmodel.reportesprocalm.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICReportesProcAlm {

    @JsonProperty("descripcion")
    private String iCReportesProcAlmDescripcion;

    public ICReportesProcAlm() {
    
    }

    @JsonIgnore
    public String getICReportesProcAlmDescripcion() {
        return this.iCReportesProcAlmDescripcion;
    }
    
    public void setICReportesProcAlmDescripcion(String iCReportesProcAlmDescripcion) {
        this.iCReportesProcAlmDescripcion = iCReportesProcAlmDescripcion;
    }
}
