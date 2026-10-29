package com.keralty.ae.viewmodel.funcionario.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICAgente {

    @JsonProperty("primernombre")
    private String iCAgentePrimerNombre;

    @JsonProperty("segundonombre")
    private String iCAgenteSegundoNombre;

    @JsonProperty("primerapellido")
    private String iCAgentePrimerApellido;

    @JsonProperty("segundoapellido")
    private String iCAgenteSegundoApellido;

    public ICAgente() {
    
    }

    @JsonIgnore
    public String getICAgentePrimerNombre() {
        return this.iCAgentePrimerNombre;
    }
    
    public void setICAgentePrimerNombre(String iCAgentePrimerNombre) {
        this.iCAgentePrimerNombre = iCAgentePrimerNombre;
    }

    @JsonIgnore
    public String getICAgenteSegundoNombre() {
        return this.iCAgenteSegundoNombre;
    }
    
    public void setICAgenteSegundoNombre(String iCAgenteSegundoNombre) {
        this.iCAgenteSegundoNombre = iCAgenteSegundoNombre;
    }

    @JsonIgnore
    public String getICAgentePrimerApellido() {
        return this.iCAgentePrimerApellido;
    }
    
    public void setICAgentePrimerApellido(String iCAgentePrimerApellido) {
        this.iCAgentePrimerApellido = iCAgentePrimerApellido;
    }

    @JsonIgnore
    public String getICAgenteSegundoApellido() {
        return this.iCAgenteSegundoApellido;
    }
    
    public void setICAgenteSegundoApellido(String iCAgenteSegundoApellido) {
        this.iCAgenteSegundoApellido = iCAgenteSegundoApellido;
    }
}
