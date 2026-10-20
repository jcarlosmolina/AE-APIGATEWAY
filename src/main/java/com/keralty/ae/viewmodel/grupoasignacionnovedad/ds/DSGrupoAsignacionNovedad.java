package com.keralty.ae.viewmodel.grupoasignacionnovedad.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSGrupoAsignacionNovedad {

    @JsonProperty("causal_novedad_nombre")
    private String dSGrupoAsignacionNovedadCausalDotNovedadDotNombre;

    @JsonProperty("causal_nombre")
    private String dSGrupoAsignacionNovedadCausalDotNombre;

    @JsonProperty("grupousuarios_nombre")
    private String dSGrupoAsignacionNovedadGrupoUsuariosDotNombre;

    public DSGrupoAsignacionNovedad() {
    
    }

    @JsonIgnore
    public String getDSGrupoAsignacionNovedadCausalDotNovedadDotNombre() {
        return this.dSGrupoAsignacionNovedadCausalDotNovedadDotNombre;
    }
    
    public void setDSGrupoAsignacionNovedadCausalDotNovedadDotNombre(String dSGrupoAsignacionNovedadCausalDotNovedadDotNombre) {
        this.dSGrupoAsignacionNovedadCausalDotNovedadDotNombre = dSGrupoAsignacionNovedadCausalDotNovedadDotNombre;
    }

    @JsonIgnore
    public String getDSGrupoAsignacionNovedadCausalDotNombre() {
        return this.dSGrupoAsignacionNovedadCausalDotNombre;
    }
    
    public void setDSGrupoAsignacionNovedadCausalDotNombre(String dSGrupoAsignacionNovedadCausalDotNombre) {
        this.dSGrupoAsignacionNovedadCausalDotNombre = dSGrupoAsignacionNovedadCausalDotNombre;
    }

    @JsonIgnore
    public String getDSGrupoAsignacionNovedadGrupoUsuariosDotNombre() {
        return this.dSGrupoAsignacionNovedadGrupoUsuariosDotNombre;
    }
    
    public void setDSGrupoAsignacionNovedadGrupoUsuariosDotNombre(String dSGrupoAsignacionNovedadGrupoUsuariosDotNombre) {
        this.dSGrupoAsignacionNovedadGrupoUsuariosDotNombre = dSGrupoAsignacionNovedadGrupoUsuariosDotNombre;
    }
}
