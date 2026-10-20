package com.keralty.ae.viewmodel.plantillareporte.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICPlantillaReporte {

    @JsonProperty("titulo")
    private String iCPlantillaReporteTitulo;

    public ICPlantillaReporte() {
    
    }

    @JsonIgnore
    public String getICPlantillaReporteTitulo() {
        return this.iCPlantillaReporteTitulo;
    }
    
    public void setICPlantillaReporteTitulo(String iCPlantillaReporteTitulo) {
        this.iCPlantillaReporteTitulo = iCPlantillaReporteTitulo;
    }
}
