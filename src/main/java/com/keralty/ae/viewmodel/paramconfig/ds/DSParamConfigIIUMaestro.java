package com.keralty.ae.viewmodel.paramconfig.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSParamConfigIIUMaestro {

    @JsonProperty("codigo")
    private String dSParamConfigIIUMaestroCodigo;

    @JsonProperty("descripcion")
    private String dSParamConfigIIUMaestroDescripcion;

    @JsonProperty("valor")
    private String dSParamConfigIIUMaestroValor;

    public DSParamConfigIIUMaestro() {
    
    }

    @JsonIgnore
    public String getDSParamConfigIIUMaestroCodigo() {
        return this.dSParamConfigIIUMaestroCodigo;
    }
    
    public void setDSParamConfigIIUMaestroCodigo(String dSParamConfigIIUMaestroCodigo) {
        this.dSParamConfigIIUMaestroCodigo = dSParamConfigIIUMaestroCodigo;
    }

    @JsonIgnore
    public String getDSParamConfigIIUMaestroDescripcion() {
        return this.dSParamConfigIIUMaestroDescripcion;
    }
    
    public void setDSParamConfigIIUMaestroDescripcion(String dSParamConfigIIUMaestroDescripcion) {
        this.dSParamConfigIIUMaestroDescripcion = dSParamConfigIIUMaestroDescripcion;
    }

    @JsonIgnore
    public String getDSParamConfigIIUMaestroValor() {
        return this.dSParamConfigIIUMaestroValor;
    }
    
    public void setDSParamConfigIIUMaestroValor(String dSParamConfigIIUMaestroValor) {
        this.dSParamConfigIIUMaestroValor = dSParamConfigIIUMaestroValor;
    }
}
