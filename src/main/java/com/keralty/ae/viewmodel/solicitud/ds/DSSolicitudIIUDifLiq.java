package com.keralty.ae.viewmodel.solicitud.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSSolicitudIIUDifLiq {

    @JsonProperty("numradicado")
    private Long dSSolicitudIIUDifLiqNumRadicado;

    @JsonProperty("valorcuota")
    private Double dSSolicitudIIUDifLiqValorCuota;

    @JsonProperty("valorcuotabrutac")
    private Double dSSolicitudIIUDifLiqValorCuotaBrutaC;

    @JsonProperty("drvdifvalorcuotabruta")
    private Double dSSolicitudIIUDifLiqDrvDifValorCuotaBruta;

    public DSSolicitudIIUDifLiq() {
    
    }

    @JsonIgnore
    public Long getDSSolicitudIIUDifLiqNumRadicado() {
        return this.dSSolicitudIIUDifLiqNumRadicado;
    }
    
    public void setDSSolicitudIIUDifLiqNumRadicado(Long dSSolicitudIIUDifLiqNumRadicado) {
        this.dSSolicitudIIUDifLiqNumRadicado = dSSolicitudIIUDifLiqNumRadicado;
    }

    @JsonIgnore
    public Double getDSSolicitudIIUDifLiqValorCuota() {
        return this.dSSolicitudIIUDifLiqValorCuota;
    }
    
    public void setDSSolicitudIIUDifLiqValorCuota(Double dSSolicitudIIUDifLiqValorCuota) {
        this.dSSolicitudIIUDifLiqValorCuota = dSSolicitudIIUDifLiqValorCuota;
    }

    @JsonIgnore
    public Double getDSSolicitudIIUDifLiqValorCuotaBrutaC() {
        return this.dSSolicitudIIUDifLiqValorCuotaBrutaC;
    }
    
    public void setDSSolicitudIIUDifLiqValorCuotaBrutaC(Double dSSolicitudIIUDifLiqValorCuotaBrutaC) {
        this.dSSolicitudIIUDifLiqValorCuotaBrutaC = dSSolicitudIIUDifLiqValorCuotaBrutaC;
    }

    @JsonIgnore
    public Double getDSSolicitudIIUDifLiqDrvDifValorCuotaBruta() {
        return this.dSSolicitudIIUDifLiqDrvDifValorCuotaBruta;
    }
    
    public void setDSSolicitudIIUDifLiqDrvDifValorCuotaBruta(Double dSSolicitudIIUDifLiqDrvDifValorCuotaBruta) {
        this.dSSolicitudIIUDifLiqDrvDifValorCuotaBruta = dSSolicitudIIUDifLiqDrvDifValorCuotaBruta;
    }
}
