package com.keralty.ae.viewmodel.grupoasociado.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICGrupoAsociado {

    @JsonProperty("codigolegal")
    private String iCGrupoAsociadoCodigoLegal;

    @JsonProperty("descripcion")
    private String iCGrupoAsociadoDescripcion;

    public ICGrupoAsociado() {
    
    }

    @JsonIgnore
    public String getICGrupoAsociadoCodigoLegal() {
        return this.iCGrupoAsociadoCodigoLegal;
    }
    
    public void setICGrupoAsociadoCodigoLegal(String iCGrupoAsociadoCodigoLegal) {
        this.iCGrupoAsociadoCodigoLegal = iCGrupoAsociadoCodigoLegal;
    }

    @JsonIgnore
    public String getICGrupoAsociadoDescripcion() {
        return this.iCGrupoAsociadoDescripcion;
    }
    
    public void setICGrupoAsociadoDescripcion(String iCGrupoAsociadoDescripcion) {
        this.iCGrupoAsociadoDescripcion = iCGrupoAsociadoDescripcion;
    }
}
