package com.keralty.ae.viewmodel.tipoiva.ds;

import java.sql.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSTipoIVAPIU {

    @JsonProperty("productot_descripcion")
    private String dSTipoIVAPIUProductoTDotDescripcion;

    @JsonProperty("plant_nombre")
    private String dSTipoIVAPIUPlanTDotNombre;

    @JsonProperty("descripcion")
    private String dSTipoIVAPIUDescripcion;

    @JsonProperty("fechainicio")
    private Date dSTipoIVAPIUFechaInicio;

    @JsonProperty("fechafin")
    private Date dSTipoIVAPIUFechaFin;

    @JsonProperty("porcentaje")
    private Double dSTipoIVAPIUPorcentaje;

    public DSTipoIVAPIU() {
    
    }

    @JsonIgnore
    public String getDSTipoIVAPIUProductoTDotDescripcion() {
        return this.dSTipoIVAPIUProductoTDotDescripcion;
    }
    
    public void setDSTipoIVAPIUProductoTDotDescripcion(String dSTipoIVAPIUProductoTDotDescripcion) {
        this.dSTipoIVAPIUProductoTDotDescripcion = dSTipoIVAPIUProductoTDotDescripcion;
    }

    @JsonIgnore
    public String getDSTipoIVAPIUPlanTDotNombre() {
        return this.dSTipoIVAPIUPlanTDotNombre;
    }
    
    public void setDSTipoIVAPIUPlanTDotNombre(String dSTipoIVAPIUPlanTDotNombre) {
        this.dSTipoIVAPIUPlanTDotNombre = dSTipoIVAPIUPlanTDotNombre;
    }

    @JsonIgnore
    public String getDSTipoIVAPIUDescripcion() {
        return this.dSTipoIVAPIUDescripcion;
    }
    
    public void setDSTipoIVAPIUDescripcion(String dSTipoIVAPIUDescripcion) {
        this.dSTipoIVAPIUDescripcion = dSTipoIVAPIUDescripcion;
    }

    @JsonIgnore
    public Date getDSTipoIVAPIUFechaInicio() {
        return this.dSTipoIVAPIUFechaInicio;
    }
    
    public void setDSTipoIVAPIUFechaInicio(Date dSTipoIVAPIUFechaInicio) {
        this.dSTipoIVAPIUFechaInicio = dSTipoIVAPIUFechaInicio;
    }

    @JsonIgnore
    public Date getDSTipoIVAPIUFechaFin() {
        return this.dSTipoIVAPIUFechaFin;
    }
    
    public void setDSTipoIVAPIUFechaFin(Date dSTipoIVAPIUFechaFin) {
        this.dSTipoIVAPIUFechaFin = dSTipoIVAPIUFechaFin;
    }

    @JsonIgnore
    public Double getDSTipoIVAPIUPorcentaje() {
        return this.dSTipoIVAPIUPorcentaje;
    }
    
    public void setDSTipoIVAPIUPorcentaje(Double dSTipoIVAPIUPorcentaje) {
        this.dSTipoIVAPIUPorcentaje = dSTipoIVAPIUPorcentaje;
    }
}
