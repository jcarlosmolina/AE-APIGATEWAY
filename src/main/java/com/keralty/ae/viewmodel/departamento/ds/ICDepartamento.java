package com.keralty.ae.viewmodel.departamento.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICDepartamento {

    @JsonProperty("descripcion")
    private String iCDepartamentoDescripcion;

    public ICDepartamento() {
    
    }

    @JsonIgnore
    public String getICDepartamentoDescripcion() {
        return this.iCDepartamentoDescripcion;
    }
    
    public void setICDepartamentoDescripcion(String iCDepartamentoDescripcion) {
        this.iCDepartamentoDescripcion = iCDepartamentoDescripcion;
    }
}
