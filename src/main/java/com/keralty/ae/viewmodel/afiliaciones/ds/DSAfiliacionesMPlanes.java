package com.keralty.ae.viewmodel.afiliaciones.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSAfiliacionesMPlanes {

    @JsonProperty("usuarioldap")
    private String dSAfiliacionesMPlanesUsuarioLDAP;

    @JsonProperty("primernombre")
    private String dSAfiliacionesMPlanesPrimerNombre;

    @JsonProperty("segundonombre")
    private String dSAfiliacionesMPlanesSegundoNombre;

    @JsonProperty("primerapellido")
    private String dSAfiliacionesMPlanesPrimerApellido;

    @JsonProperty("segundoapellido")
    private String dSAfiliacionesMPlanesSegundoApellido;

    public DSAfiliacionesMPlanes() {
    
    }

    @JsonIgnore
    public String getDSAfiliacionesMPlanesUsuarioLDAP() {
        return this.dSAfiliacionesMPlanesUsuarioLDAP;
    }
    
    public void setDSAfiliacionesMPlanesUsuarioLDAP(String dSAfiliacionesMPlanesUsuarioLDAP) {
        this.dSAfiliacionesMPlanesUsuarioLDAP = dSAfiliacionesMPlanesUsuarioLDAP;
    }

    @JsonIgnore
    public String getDSAfiliacionesMPlanesPrimerNombre() {
        return this.dSAfiliacionesMPlanesPrimerNombre;
    }
    
    public void setDSAfiliacionesMPlanesPrimerNombre(String dSAfiliacionesMPlanesPrimerNombre) {
        this.dSAfiliacionesMPlanesPrimerNombre = dSAfiliacionesMPlanesPrimerNombre;
    }

    @JsonIgnore
    public String getDSAfiliacionesMPlanesSegundoNombre() {
        return this.dSAfiliacionesMPlanesSegundoNombre;
    }
    
    public void setDSAfiliacionesMPlanesSegundoNombre(String dSAfiliacionesMPlanesSegundoNombre) {
        this.dSAfiliacionesMPlanesSegundoNombre = dSAfiliacionesMPlanesSegundoNombre;
    }

    @JsonIgnore
    public String getDSAfiliacionesMPlanesPrimerApellido() {
        return this.dSAfiliacionesMPlanesPrimerApellido;
    }
    
    public void setDSAfiliacionesMPlanesPrimerApellido(String dSAfiliacionesMPlanesPrimerApellido) {
        this.dSAfiliacionesMPlanesPrimerApellido = dSAfiliacionesMPlanesPrimerApellido;
    }

    @JsonIgnore
    public String getDSAfiliacionesMPlanesSegundoApellido() {
        return this.dSAfiliacionesMPlanesSegundoApellido;
    }
    
    public void setDSAfiliacionesMPlanesSegundoApellido(String dSAfiliacionesMPlanesSegundoApellido) {
        this.dSAfiliacionesMPlanesSegundoApellido = dSAfiliacionesMPlanesSegundoApellido;
    }
}
