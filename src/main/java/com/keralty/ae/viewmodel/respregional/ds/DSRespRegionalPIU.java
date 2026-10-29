package com.keralty.ae.viewmodel.respregional.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSRespRegionalPIU {

    @JsonProperty("usuario")
    private String dSRespRegionalPIUUsuario;

    @JsonProperty("primernombre")
    private String dSRespRegionalPIUPrimerNombre;

    @JsonProperty("segundonombre")
    private String dSRespRegionalPIUSegundoNombre;

    @JsonProperty("primerapellido")
    private String dSRespRegionalPIUPrimerApellido;

    @JsonProperty("segundoapellido")
    private String dSRespRegionalPIUSegundoApellido;

    @JsonProperty("email")
    private String dSRespRegionalPIUEmail;

    @JsonProperty("usuarioldap")
    private String dSRespRegionalPIUUsuarioLDAP;

    @JsonProperty("regional_descripcion")
    private String dSRespRegionalPIURegionalDotDescripcion;

    public DSRespRegionalPIU() {
    
    }

    @JsonIgnore
    public String getDSRespRegionalPIUUsuario() {
        return this.dSRespRegionalPIUUsuario;
    }
    
    public void setDSRespRegionalPIUUsuario(String dSRespRegionalPIUUsuario) {
        this.dSRespRegionalPIUUsuario = dSRespRegionalPIUUsuario;
    }

    @JsonIgnore
    public String getDSRespRegionalPIUPrimerNombre() {
        return this.dSRespRegionalPIUPrimerNombre;
    }
    
    public void setDSRespRegionalPIUPrimerNombre(String dSRespRegionalPIUPrimerNombre) {
        this.dSRespRegionalPIUPrimerNombre = dSRespRegionalPIUPrimerNombre;
    }

    @JsonIgnore
    public String getDSRespRegionalPIUSegundoNombre() {
        return this.dSRespRegionalPIUSegundoNombre;
    }
    
    public void setDSRespRegionalPIUSegundoNombre(String dSRespRegionalPIUSegundoNombre) {
        this.dSRespRegionalPIUSegundoNombre = dSRespRegionalPIUSegundoNombre;
    }

    @JsonIgnore
    public String getDSRespRegionalPIUPrimerApellido() {
        return this.dSRespRegionalPIUPrimerApellido;
    }
    
    public void setDSRespRegionalPIUPrimerApellido(String dSRespRegionalPIUPrimerApellido) {
        this.dSRespRegionalPIUPrimerApellido = dSRespRegionalPIUPrimerApellido;
    }

    @JsonIgnore
    public String getDSRespRegionalPIUSegundoApellido() {
        return this.dSRespRegionalPIUSegundoApellido;
    }
    
    public void setDSRespRegionalPIUSegundoApellido(String dSRespRegionalPIUSegundoApellido) {
        this.dSRespRegionalPIUSegundoApellido = dSRespRegionalPIUSegundoApellido;
    }

    @JsonIgnore
    public String getDSRespRegionalPIUEmail() {
        return this.dSRespRegionalPIUEmail;
    }
    
    public void setDSRespRegionalPIUEmail(String dSRespRegionalPIUEmail) {
        this.dSRespRegionalPIUEmail = dSRespRegionalPIUEmail;
    }

    @JsonIgnore
    public String getDSRespRegionalPIUUsuarioLDAP() {
        return this.dSRespRegionalPIUUsuarioLDAP;
    }
    
    public void setDSRespRegionalPIUUsuarioLDAP(String dSRespRegionalPIUUsuarioLDAP) {
        this.dSRespRegionalPIUUsuarioLDAP = dSRespRegionalPIUUsuarioLDAP;
    }

    @JsonIgnore
    public String getDSRespRegionalPIURegionalDotDescripcion() {
        return this.dSRespRegionalPIURegionalDotDescripcion;
    }
    
    public void setDSRespRegionalPIURegionalDotDescripcion(String dSRespRegionalPIURegionalDotDescripcion) {
        this.dSRespRegionalPIURegionalDotDescripcion = dSRespRegionalPIURegionalDotDescripcion;
    }
}
