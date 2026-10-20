package com.keralty.ae.viewmodel.respregional.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICRespRegionalNomApe {

    @JsonProperty("primernombre")
    private String iCRespRegionalNomApePrimerNombre;

    @JsonProperty("segundonombre")
    private String iCRespRegionalNomApeSegundoNombre;

    @JsonProperty("primerapellido")
    private String iCRespRegionalNomApePrimerApellido;

    @JsonProperty("segundoapellido")
    private String iCRespRegionalNomApeSegundoApellido;

    public ICRespRegionalNomApe() {
    
    }

    @JsonIgnore
    public String getICRespRegionalNomApePrimerNombre() {
        return this.iCRespRegionalNomApePrimerNombre;
    }
    
    public void setICRespRegionalNomApePrimerNombre(String iCRespRegionalNomApePrimerNombre) {
        this.iCRespRegionalNomApePrimerNombre = iCRespRegionalNomApePrimerNombre;
    }

    @JsonIgnore
    public String getICRespRegionalNomApeSegundoNombre() {
        return this.iCRespRegionalNomApeSegundoNombre;
    }
    
    public void setICRespRegionalNomApeSegundoNombre(String iCRespRegionalNomApeSegundoNombre) {
        this.iCRespRegionalNomApeSegundoNombre = iCRespRegionalNomApeSegundoNombre;
    }

    @JsonIgnore
    public String getICRespRegionalNomApePrimerApellido() {
        return this.iCRespRegionalNomApePrimerApellido;
    }
    
    public void setICRespRegionalNomApePrimerApellido(String iCRespRegionalNomApePrimerApellido) {
        this.iCRespRegionalNomApePrimerApellido = iCRespRegionalNomApePrimerApellido;
    }

    @JsonIgnore
    public String getICRespRegionalNomApeSegundoApellido() {
        return this.iCRespRegionalNomApeSegundoApellido;
    }
    
    public void setICRespRegionalNomApeSegundoApellido(String iCRespRegionalNomApeSegundoApellido) {
        this.iCRespRegionalNomApeSegundoApellido = iCRespRegionalNomApeSegundoApellido;
    }
}
