package com.keralty.ae.viewmodel.asesor.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSAsesorPIUMaestroProductos {

    @JsonProperty("usuario")
    private String dSAsesorPIUMaestroProductosUsuario;

    @JsonProperty("drvnombrecompleto")
    private String dSAsesorPIUMaestroProductosDrvNombreCompleto;

    public DSAsesorPIUMaestroProductos() {
    
    }

    @JsonIgnore
    public String getDSAsesorPIUMaestroProductosUsuario() {
        return this.dSAsesorPIUMaestroProductosUsuario;
    }
    
    public void setDSAsesorPIUMaestroProductosUsuario(String dSAsesorPIUMaestroProductosUsuario) {
        this.dSAsesorPIUMaestroProductosUsuario = dSAsesorPIUMaestroProductosUsuario;
    }

    @JsonIgnore
    public String getDSAsesorPIUMaestroProductosDrvNombreCompleto() {
        return this.dSAsesorPIUMaestroProductosDrvNombreCompleto;
    }
    
    public void setDSAsesorPIUMaestroProductosDrvNombreCompleto(String dSAsesorPIUMaestroProductosDrvNombreCompleto) {
        this.dSAsesorPIUMaestroProductosDrvNombreCompleto = dSAsesorPIUMaestroProductosDrvNombreCompleto;
    }
}
