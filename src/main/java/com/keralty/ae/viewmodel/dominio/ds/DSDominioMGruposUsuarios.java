package com.keralty.ae.viewmodel.dominio.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSDominioMGruposUsuarios {

    @JsonProperty("productot_descripcion")
    private String dSDominioMGruposUsuariosProductoTDotDescripcion;

    @JsonProperty("plant_nombre")
    private String dSDominioMGruposUsuariosPlanTDotNombre;

    public DSDominioMGruposUsuarios() {
    
    }

    @JsonIgnore
    public String getDSDominioMGruposUsuariosProductoTDotDescripcion() {
        return this.dSDominioMGruposUsuariosProductoTDotDescripcion;
    }
    
    public void setDSDominioMGruposUsuariosProductoTDotDescripcion(String dSDominioMGruposUsuariosProductoTDotDescripcion) {
        this.dSDominioMGruposUsuariosProductoTDotDescripcion = dSDominioMGruposUsuariosProductoTDotDescripcion;
    }

    @JsonIgnore
    public String getDSDominioMGruposUsuariosPlanTDotNombre() {
        return this.dSDominioMGruposUsuariosPlanTDotNombre;
    }
    
    public void setDSDominioMGruposUsuariosPlanTDotNombre(String dSDominioMGruposUsuariosPlanTDotNombre) {
        this.dSDominioMGruposUsuariosPlanTDotNombre = dSDominioMGruposUsuariosPlanTDotNombre;
    }
}
