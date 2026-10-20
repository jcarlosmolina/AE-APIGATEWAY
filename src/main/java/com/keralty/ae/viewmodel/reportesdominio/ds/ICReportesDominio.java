package com.keralty.ae.viewmodel.reportesdominio.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICReportesDominio {

    @JsonProperty("plantillareporte_titulo")
    private String iCReportesDominioPlantillaReporteDotTitulo;

    public ICReportesDominio() {
    
    }

    @JsonIgnore
    public String getICReportesDominioPlantillaReporteDotTitulo() {
        return this.iCReportesDominioPlantillaReporteDotTitulo;
    }
    
    public void setICReportesDominioPlantillaReporteDotTitulo(String iCReportesDominioPlantillaReporteDotTitulo) {
        this.iCReportesDominioPlantillaReporteDotTitulo = iCReportesDominioPlantillaReporteDotTitulo;
    }
}
