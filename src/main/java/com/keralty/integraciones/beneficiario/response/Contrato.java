package com.keralty.integraciones.beneficiario.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Contrato {
    private InformacionBeneficiarios informacionBeneficiarios;

    @JsonProperty("informacionBeneficiarios")
    public InformacionBeneficiarios getInformacionBeneficiarios() { return informacionBeneficiarios; }
    @JsonProperty("informacionBeneficiarios")
    public void setInformacionBeneficiarios(InformacionBeneficiarios value) { this.informacionBeneficiarios = value; }
}
