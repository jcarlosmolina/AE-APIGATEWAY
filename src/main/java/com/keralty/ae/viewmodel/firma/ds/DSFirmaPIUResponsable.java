package com.keralty.ae.viewmodel.firma.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSFirmaPIUResponsable {

    @JsonProperty("respregional_usuario")
    private String dSFirmaPIUResponsableRespRegionalDotUsuario;

    @JsonProperty("respregional_primernombre")
    private String dSFirmaPIUResponsableRespRegionalDotPrimerNombre;

    @JsonProperty("respregional_segundonombre")
    private String dSFirmaPIUResponsableRespRegionalDotSegundoNombre;

    @JsonProperty("respregional_primerapellido")
    private String dSFirmaPIUResponsableRespRegionalDotPrimerApellido;

    @JsonProperty("respregional_segundoapellido")
    private String dSFirmaPIUResponsableRespRegionalDotSegundoApellido;

    @JsonProperty("respregional_sucursal_descripcion")
    private String dSFirmaPIUResponsableRespRegionalDotSucursalDotDescripcion;

    @JsonProperty("respregional_sucursal_regional_descripcion")
    private String dSFirmaPIUResponsableRespRegionalDotSucursalDotRegionalDotDescripcion;

    public DSFirmaPIUResponsable() {
    
    }

    @JsonIgnore
    public String getDSFirmaPIUResponsableRespRegionalDotUsuario() {
        return this.dSFirmaPIUResponsableRespRegionalDotUsuario;
    }
    
    public void setDSFirmaPIUResponsableRespRegionalDotUsuario(String dSFirmaPIUResponsableRespRegionalDotUsuario) {
        this.dSFirmaPIUResponsableRespRegionalDotUsuario = dSFirmaPIUResponsableRespRegionalDotUsuario;
    }

    @JsonIgnore
    public String getDSFirmaPIUResponsableRespRegionalDotPrimerNombre() {
        return this.dSFirmaPIUResponsableRespRegionalDotPrimerNombre;
    }
    
    public void setDSFirmaPIUResponsableRespRegionalDotPrimerNombre(String dSFirmaPIUResponsableRespRegionalDotPrimerNombre) {
        this.dSFirmaPIUResponsableRespRegionalDotPrimerNombre = dSFirmaPIUResponsableRespRegionalDotPrimerNombre;
    }

    @JsonIgnore
    public String getDSFirmaPIUResponsableRespRegionalDotSegundoNombre() {
        return this.dSFirmaPIUResponsableRespRegionalDotSegundoNombre;
    }
    
    public void setDSFirmaPIUResponsableRespRegionalDotSegundoNombre(String dSFirmaPIUResponsableRespRegionalDotSegundoNombre) {
        this.dSFirmaPIUResponsableRespRegionalDotSegundoNombre = dSFirmaPIUResponsableRespRegionalDotSegundoNombre;
    }

    @JsonIgnore
    public String getDSFirmaPIUResponsableRespRegionalDotPrimerApellido() {
        return this.dSFirmaPIUResponsableRespRegionalDotPrimerApellido;
    }
    
    public void setDSFirmaPIUResponsableRespRegionalDotPrimerApellido(String dSFirmaPIUResponsableRespRegionalDotPrimerApellido) {
        this.dSFirmaPIUResponsableRespRegionalDotPrimerApellido = dSFirmaPIUResponsableRespRegionalDotPrimerApellido;
    }

    @JsonIgnore
    public String getDSFirmaPIUResponsableRespRegionalDotSegundoApellido() {
        return this.dSFirmaPIUResponsableRespRegionalDotSegundoApellido;
    }
    
    public void setDSFirmaPIUResponsableRespRegionalDotSegundoApellido(String dSFirmaPIUResponsableRespRegionalDotSegundoApellido) {
        this.dSFirmaPIUResponsableRespRegionalDotSegundoApellido = dSFirmaPIUResponsableRespRegionalDotSegundoApellido;
    }

    @JsonIgnore
    public String getDSFirmaPIUResponsableRespRegionalDotSucursalDotDescripcion() {
        return this.dSFirmaPIUResponsableRespRegionalDotSucursalDotDescripcion;
    }
    
    public void setDSFirmaPIUResponsableRespRegionalDotSucursalDotDescripcion(String dSFirmaPIUResponsableRespRegionalDotSucursalDotDescripcion) {
        this.dSFirmaPIUResponsableRespRegionalDotSucursalDotDescripcion = dSFirmaPIUResponsableRespRegionalDotSucursalDotDescripcion;
    }

    @JsonIgnore
    public String getDSFirmaPIUResponsableRespRegionalDotSucursalDotRegionalDotDescripcion() {
        return this.dSFirmaPIUResponsableRespRegionalDotSucursalDotRegionalDotDescripcion;
    }
    
    public void setDSFirmaPIUResponsableRespRegionalDotSucursalDotRegionalDotDescripcion(String dSFirmaPIUResponsableRespRegionalDotSucursalDotRegionalDotDescripcion) {
        this.dSFirmaPIUResponsableRespRegionalDotSucursalDotRegionalDotDescripcion = dSFirmaPIUResponsableRespRegionalDotSucursalDotRegionalDotDescripcion;
    }
}
