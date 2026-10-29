package com.keralty.ae.viewmodel.paramreporte.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSParamReporte {

    @JsonProperty("titulo")
    private String dSParamReporteTitulo;

    @JsonProperty("esnumerico")
    private Boolean dSParamReporteEsNumerico;

    @JsonProperty("descripcion")
    private String dSParamReporteDescripcion;

    public DSParamReporte() {
    
    }

    @JsonIgnore
    public String getDSParamReporteTitulo() {
        return this.dSParamReporteTitulo;
    }
    
    public void setDSParamReporteTitulo(String dSParamReporteTitulo) {
        this.dSParamReporteTitulo = dSParamReporteTitulo;
    }

    @JsonIgnore
    public Boolean getDSParamReporteEsNumerico() {
        return this.dSParamReporteEsNumerico;
    }
    
    public void setDSParamReporteEsNumerico(Boolean dSParamReporteEsNumerico) {
        this.dSParamReporteEsNumerico = dSParamReporteEsNumerico;
    }

    @JsonIgnore
    public String getDSParamReporteDescripcion() {
        return this.dSParamReporteDescripcion;
    }
    
    public void setDSParamReporteDescripcion(String dSParamReporteDescripcion) {
        this.dSParamReporteDescripcion = dSParamReporteDescripcion;
    }
}
