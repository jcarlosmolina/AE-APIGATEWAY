package com.keralty.ae.viewmodel.grupoasociado.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSGrupoAsociadoPIUBusqueda {

    @JsonProperty("codigolegal")
    private String dSGrupoAsociadoPIUBusquedaCodigoLegal;

    @JsonProperty("descripcion")
    private String dSGrupoAsociadoPIUBusquedaDescripcion;

    public DSGrupoAsociadoPIUBusqueda() {
    
    }

    @JsonIgnore
    public String getDSGrupoAsociadoPIUBusquedaCodigoLegal() {
        return this.dSGrupoAsociadoPIUBusquedaCodigoLegal;
    }
    
    public void setDSGrupoAsociadoPIUBusquedaCodigoLegal(String dSGrupoAsociadoPIUBusquedaCodigoLegal) {
        this.dSGrupoAsociadoPIUBusquedaCodigoLegal = dSGrupoAsociadoPIUBusquedaCodigoLegal;
    }

    @JsonIgnore
    public String getDSGrupoAsociadoPIUBusquedaDescripcion() {
        return this.dSGrupoAsociadoPIUBusquedaDescripcion;
    }
    
    public void setDSGrupoAsociadoPIUBusquedaDescripcion(String dSGrupoAsociadoPIUBusquedaDescripcion) {
        this.dSGrupoAsociadoPIUBusquedaDescripcion = dSGrupoAsociadoPIUBusquedaDescripcion;
    }
}
