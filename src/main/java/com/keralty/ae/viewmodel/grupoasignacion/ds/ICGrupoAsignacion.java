package com.keralty.ae.viewmodel.grupoasignacion.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICGrupoAsignacion {

    @JsonProperty("nombre")
    private String iCGrupoAsignacionNombre;

    public ICGrupoAsignacion() {
    
    }

    @JsonIgnore
    public String getICGrupoAsignacionNombre() {
        return this.iCGrupoAsignacionNombre;
    }
    
    public void setICGrupoAsignacionNombre(String iCGrupoAsignacionNombre) {
        this.iCGrupoAsignacionNombre = iCGrupoAsignacionNombre;
    }
}
