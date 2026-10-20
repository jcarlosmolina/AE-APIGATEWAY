package com.keralty.ae.viewmodel.usuariosistemaexterno.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSUsuarioSistemaExterno {

    @JsonProperty("login")
    private String dSUsuarioSistemaExternoLogin;

    @JsonProperty("descripcion")
    private String dSUsuarioSistemaExternoDescripcion;

    public DSUsuarioSistemaExterno() {
    
    }

    @JsonIgnore
    public String getDSUsuarioSistemaExternoLogin() {
        return this.dSUsuarioSistemaExternoLogin;
    }
    
    public void setDSUsuarioSistemaExternoLogin(String dSUsuarioSistemaExternoLogin) {
        this.dSUsuarioSistemaExternoLogin = dSUsuarioSistemaExternoLogin;
    }

    @JsonIgnore
    public String getDSUsuarioSistemaExternoDescripcion() {
        return this.dSUsuarioSistemaExternoDescripcion;
    }
    
    public void setDSUsuarioSistemaExternoDescripcion(String dSUsuarioSistemaExternoDescripcion) {
        this.dSUsuarioSistemaExternoDescripcion = dSUsuarioSistemaExternoDescripcion;
    }
}
