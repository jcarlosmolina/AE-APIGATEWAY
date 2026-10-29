package com.keralty.ae.viewmodel.dominio.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSDominioMGrupoAreaMedica {

    @JsonProperty("grupoareamedica_nombre")
    private String dSDominioMGrupoAreaMedicaGrupoAreaMedicaDotNombre;

    @JsonProperty("grupoareamedica_descripcion")
    private String dSDominioMGrupoAreaMedicaGrupoAreaMedicaDotDescripcion;

    public DSDominioMGrupoAreaMedica() {
    
    }

    @JsonIgnore
    public String getDSDominioMGrupoAreaMedicaGrupoAreaMedicaDotNombre() {
        return this.dSDominioMGrupoAreaMedicaGrupoAreaMedicaDotNombre;
    }
    
    public void setDSDominioMGrupoAreaMedicaGrupoAreaMedicaDotNombre(String dSDominioMGrupoAreaMedicaGrupoAreaMedicaDotNombre) {
        this.dSDominioMGrupoAreaMedicaGrupoAreaMedicaDotNombre = dSDominioMGrupoAreaMedicaGrupoAreaMedicaDotNombre;
    }

    @JsonIgnore
    public String getDSDominioMGrupoAreaMedicaGrupoAreaMedicaDotDescripcion() {
        return this.dSDominioMGrupoAreaMedicaGrupoAreaMedicaDotDescripcion;
    }
    
    public void setDSDominioMGrupoAreaMedicaGrupoAreaMedicaDotDescripcion(String dSDominioMGrupoAreaMedicaGrupoAreaMedicaDotDescripcion) {
        this.dSDominioMGrupoAreaMedicaGrupoAreaMedicaDotDescripcion = dSDominioMGrupoAreaMedicaGrupoAreaMedicaDotDescripcion;
    }
}
