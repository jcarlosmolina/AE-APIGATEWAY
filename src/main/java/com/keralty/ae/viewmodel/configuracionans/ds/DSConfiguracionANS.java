package com.keralty.ae.viewmodel.configuracionans.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSConfiguracionANS {

    @JsonProperty("tramite")
    private Long dSConfiguracionANSTramite;

    @JsonProperty("dominio_productot_descripcion")
    private String dSConfiguracionANSDominioDotProductoTDotDescripcion;

    @JsonProperty("dominio_plant_nombre")
    private String dSConfiguracionANSDominioDotPlanTDotNombre;

    @JsonProperty("novedad_nombre")
    private String dSConfiguracionANSNovedadDotNombre;

    @JsonProperty("causal_nombre")
    private String dSConfiguracionANSCausalDotNombre;

    @JsonProperty("ansafiliaciones")
    private Long dSConfiguracionANSANSAfiliaciones;

    @JsonProperty("ansareamedica")
    private Long dSConfiguracionANSANSAreaMedica;

    public DSConfiguracionANS() {
    
    }

    @JsonIgnore
    public Long getDSConfiguracionANSTramite() {
        return this.dSConfiguracionANSTramite;
    }
    
    public void setDSConfiguracionANSTramite(Long dSConfiguracionANSTramite) {
        this.dSConfiguracionANSTramite = dSConfiguracionANSTramite;
    }

    @JsonIgnore
    public String getDSConfiguracionANSDominioDotProductoTDotDescripcion() {
        return this.dSConfiguracionANSDominioDotProductoTDotDescripcion;
    }
    
    public void setDSConfiguracionANSDominioDotProductoTDotDescripcion(String dSConfiguracionANSDominioDotProductoTDotDescripcion) {
        this.dSConfiguracionANSDominioDotProductoTDotDescripcion = dSConfiguracionANSDominioDotProductoTDotDescripcion;
    }

    @JsonIgnore
    public String getDSConfiguracionANSDominioDotPlanTDotNombre() {
        return this.dSConfiguracionANSDominioDotPlanTDotNombre;
    }
    
    public void setDSConfiguracionANSDominioDotPlanTDotNombre(String dSConfiguracionANSDominioDotPlanTDotNombre) {
        this.dSConfiguracionANSDominioDotPlanTDotNombre = dSConfiguracionANSDominioDotPlanTDotNombre;
    }

    @JsonIgnore
    public String getDSConfiguracionANSNovedadDotNombre() {
        return this.dSConfiguracionANSNovedadDotNombre;
    }
    
    public void setDSConfiguracionANSNovedadDotNombre(String dSConfiguracionANSNovedadDotNombre) {
        this.dSConfiguracionANSNovedadDotNombre = dSConfiguracionANSNovedadDotNombre;
    }

    @JsonIgnore
    public String getDSConfiguracionANSCausalDotNombre() {
        return this.dSConfiguracionANSCausalDotNombre;
    }
    
    public void setDSConfiguracionANSCausalDotNombre(String dSConfiguracionANSCausalDotNombre) {
        this.dSConfiguracionANSCausalDotNombre = dSConfiguracionANSCausalDotNombre;
    }

    @JsonIgnore
    public Long getDSConfiguracionANSANSAfiliaciones() {
        return this.dSConfiguracionANSANSAfiliaciones;
    }
    
    public void setDSConfiguracionANSANSAfiliaciones(Long dSConfiguracionANSANSAfiliaciones) {
        this.dSConfiguracionANSANSAfiliaciones = dSConfiguracionANSANSAfiliaciones;
    }

    @JsonIgnore
    public Long getDSConfiguracionANSANSAreaMedica() {
        return this.dSConfiguracionANSANSAreaMedica;
    }
    
    public void setDSConfiguracionANSANSAreaMedica(Long dSConfiguracionANSANSAreaMedica) {
        this.dSConfiguracionANSANSAreaMedica = dSConfiguracionANSANSAreaMedica;
    }
}
