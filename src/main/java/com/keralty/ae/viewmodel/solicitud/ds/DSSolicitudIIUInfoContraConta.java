package com.keralty.ae.viewmodel.solicitud.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSSolicitudIIUInfoContraConta {

    @JsonProperty("direccion_direccioncompleta")
    private String dSSolicitudIIUInfoContraContaDireccionDotDireccionCompleta;

    @JsonProperty("direccion_departamento_descripcion")
    private String dSSolicitudIIUInfoContraContaDireccionDotDepartamentoDotDescripcion;

    @JsonProperty("direccion_municipio_descripcion")
    private String dSSolicitudIIUInfoContraContaDireccionDotMunicipioDotDescripcion;

    @JsonProperty("contratante_telefonofijo")
    private String dSSolicitudIIUInfoContraContaContratanteDotTelefonoFijo;

    @JsonProperty("contratante_telefonocelular")
    private String dSSolicitudIIUInfoContraContaContratanteDotTelefonoCelular;

    @JsonProperty("contratante_correoelectronico")
    private String dSSolicitudIIUInfoContraContaContratanteDotCorreoElectronico;

    public DSSolicitudIIUInfoContraConta() {
    
    }

    @JsonIgnore
    public String getDSSolicitudIIUInfoContraContaDireccionDotDireccionCompleta() {
        return this.dSSolicitudIIUInfoContraContaDireccionDotDireccionCompleta;
    }
    
    public void setDSSolicitudIIUInfoContraContaDireccionDotDireccionCompleta(String dSSolicitudIIUInfoContraContaDireccionDotDireccionCompleta) {
        this.dSSolicitudIIUInfoContraContaDireccionDotDireccionCompleta = dSSolicitudIIUInfoContraContaDireccionDotDireccionCompleta;
    }

    @JsonIgnore
    public String getDSSolicitudIIUInfoContraContaDireccionDotDepartamentoDotDescripcion() {
        return this.dSSolicitudIIUInfoContraContaDireccionDotDepartamentoDotDescripcion;
    }
    
    public void setDSSolicitudIIUInfoContraContaDireccionDotDepartamentoDotDescripcion(String dSSolicitudIIUInfoContraContaDireccionDotDepartamentoDotDescripcion) {
        this.dSSolicitudIIUInfoContraContaDireccionDotDepartamentoDotDescripcion = dSSolicitudIIUInfoContraContaDireccionDotDepartamentoDotDescripcion;
    }

    @JsonIgnore
    public String getDSSolicitudIIUInfoContraContaDireccionDotMunicipioDotDescripcion() {
        return this.dSSolicitudIIUInfoContraContaDireccionDotMunicipioDotDescripcion;
    }
    
    public void setDSSolicitudIIUInfoContraContaDireccionDotMunicipioDotDescripcion(String dSSolicitudIIUInfoContraContaDireccionDotMunicipioDotDescripcion) {
        this.dSSolicitudIIUInfoContraContaDireccionDotMunicipioDotDescripcion = dSSolicitudIIUInfoContraContaDireccionDotMunicipioDotDescripcion;
    }

    @JsonIgnore
    public String getDSSolicitudIIUInfoContraContaContratanteDotTelefonoFijo() {
        return this.dSSolicitudIIUInfoContraContaContratanteDotTelefonoFijo;
    }
    
    public void setDSSolicitudIIUInfoContraContaContratanteDotTelefonoFijo(String dSSolicitudIIUInfoContraContaContratanteDotTelefonoFijo) {
        this.dSSolicitudIIUInfoContraContaContratanteDotTelefonoFijo = dSSolicitudIIUInfoContraContaContratanteDotTelefonoFijo;
    }

    @JsonIgnore
    public String getDSSolicitudIIUInfoContraContaContratanteDotTelefonoCelular() {
        return this.dSSolicitudIIUInfoContraContaContratanteDotTelefonoCelular;
    }
    
    public void setDSSolicitudIIUInfoContraContaContratanteDotTelefonoCelular(String dSSolicitudIIUInfoContraContaContratanteDotTelefonoCelular) {
        this.dSSolicitudIIUInfoContraContaContratanteDotTelefonoCelular = dSSolicitudIIUInfoContraContaContratanteDotTelefonoCelular;
    }

    @JsonIgnore
    public String getDSSolicitudIIUInfoContraContaContratanteDotCorreoElectronico() {
        return this.dSSolicitudIIUInfoContraContaContratanteDotCorreoElectronico;
    }
    
    public void setDSSolicitudIIUInfoContraContaContratanteDotCorreoElectronico(String dSSolicitudIIUInfoContraContaContratanteDotCorreoElectronico) {
        this.dSSolicitudIIUInfoContraContaContratanteDotCorreoElectronico = dSSolicitudIIUInfoContraContaContratanteDotCorreoElectronico;
    }
}
