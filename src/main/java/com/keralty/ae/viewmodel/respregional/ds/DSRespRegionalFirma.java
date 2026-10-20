package com.keralty.ae.viewmodel.respregional.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSRespRegionalFirma {

    @JsonProperty("drvnombrecompleto")
    private String dSRespRegionalFirmaDrvNombreCompleto;

    @JsonProperty("firma_imagenfirma")
    private byte[] dSRespRegionalFirmaFirmaDotImagenFirma;

    public DSRespRegionalFirma() {
    
    }

    @JsonIgnore
    public String getDSRespRegionalFirmaDrvNombreCompleto() {
        return this.dSRespRegionalFirmaDrvNombreCompleto;
    }
    
    public void setDSRespRegionalFirmaDrvNombreCompleto(String dSRespRegionalFirmaDrvNombreCompleto) {
        this.dSRespRegionalFirmaDrvNombreCompleto = dSRespRegionalFirmaDrvNombreCompleto;
    }

    @JsonIgnore
    public byte[] getDSRespRegionalFirmaFirmaDotImagenFirma() {
        return this.dSRespRegionalFirmaFirmaDotImagenFirma;
    }
    
    public void setDSRespRegionalFirmaFirmaDotImagenFirma(byte[] dSRespRegionalFirmaFirmaDotImagenFirma) {
        this.dSRespRegionalFirmaFirmaDotImagenFirma = dSRespRegionalFirmaFirmaDotImagenFirma;
    }
}
