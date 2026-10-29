package com.keralty.ae.viewmodel.dominio.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSDominioMGrupoAsesores {

    @JsonProperty("grupoasesores_id")
    private Long dSDominioMGrupoAsesoresGrupoAsesoresDotId;

    @JsonProperty("grupoasesores_nombre")
    private String dSDominioMGrupoAsesoresGrupoAsesoresDotNombre;

    @JsonProperty("grupoasesores_descripcion")
    private String dSDominioMGrupoAsesoresGrupoAsesoresDotDescripcion;

    public DSDominioMGrupoAsesores() {
    
    }

    @JsonIgnore
    public Long getDSDominioMGrupoAsesoresGrupoAsesoresDotId() {
        return this.dSDominioMGrupoAsesoresGrupoAsesoresDotId;
    }
    
    public void setDSDominioMGrupoAsesoresGrupoAsesoresDotId(Long dSDominioMGrupoAsesoresGrupoAsesoresDotId) {
        this.dSDominioMGrupoAsesoresGrupoAsesoresDotId = dSDominioMGrupoAsesoresGrupoAsesoresDotId;
    }

    @JsonIgnore
    public String getDSDominioMGrupoAsesoresGrupoAsesoresDotNombre() {
        return this.dSDominioMGrupoAsesoresGrupoAsesoresDotNombre;
    }
    
    public void setDSDominioMGrupoAsesoresGrupoAsesoresDotNombre(String dSDominioMGrupoAsesoresGrupoAsesoresDotNombre) {
        this.dSDominioMGrupoAsesoresGrupoAsesoresDotNombre = dSDominioMGrupoAsesoresGrupoAsesoresDotNombre;
    }

    @JsonIgnore
    public String getDSDominioMGrupoAsesoresGrupoAsesoresDotDescripcion() {
        return this.dSDominioMGrupoAsesoresGrupoAsesoresDotDescripcion;
    }
    
    public void setDSDominioMGrupoAsesoresGrupoAsesoresDotDescripcion(String dSDominioMGrupoAsesoresGrupoAsesoresDotDescripcion) {
        this.dSDominioMGrupoAsesoresGrupoAsesoresDotDescripcion = dSDominioMGrupoAsesoresGrupoAsesoresDotDescripcion;
    }
}
