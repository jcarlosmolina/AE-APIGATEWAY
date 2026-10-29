package com.keralty.ae.viewmodel.reportesprocalm.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSReportesProcAlm {

    @JsonProperty("descripcion")
    private String dSReportesProcAlmDescripcion;

    @JsonProperty("nombreproc")
    private String dSReportesProcAlmNombreProc;

    @JsonProperty("nombrefichero")
    private String dSReportesProcAlmNombreFichero;

    public DSReportesProcAlm() {
    
    }

    @JsonIgnore
    public String getDSReportesProcAlmDescripcion() {
        return this.dSReportesProcAlmDescripcion;
    }
    
    public void setDSReportesProcAlmDescripcion(String dSReportesProcAlmDescripcion) {
        this.dSReportesProcAlmDescripcion = dSReportesProcAlmDescripcion;
    }

    @JsonIgnore
    public String getDSReportesProcAlmNombreProc() {
        return this.dSReportesProcAlmNombreProc;
    }
    
    public void setDSReportesProcAlmNombreProc(String dSReportesProcAlmNombreProc) {
        this.dSReportesProcAlmNombreProc = dSReportesProcAlmNombreProc;
    }

    @JsonIgnore
    public String getDSReportesProcAlmNombreFichero() {
        return this.dSReportesProcAlmNombreFichero;
    }
    
    public void setDSReportesProcAlmNombreFichero(String dSReportesProcAlmNombreFichero) {
        this.dSReportesProcAlmNombreFichero = dSReportesProcAlmNombreFichero;
    }
}
