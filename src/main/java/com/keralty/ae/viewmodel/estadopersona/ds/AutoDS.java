package com.keralty.ae.viewmodel.estadopersona.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class AutoDS {

    @JsonProperty("codigo")
    private Long autoDSCodigo;

    @JsonProperty("descripcion")
    private String autoDSDescripcion;

    @JsonProperty("unbeneficiariodistino")
    private Boolean autoDSUnBeneficiarioDistino;

    @JsonProperty("prohibidobeneficiarios")
    private Boolean autoDSProhibidoBeneficiarios;

    @JsonProperty("prohibidocontratante")
    private Boolean autoDSProhibidoContratante;

    @JsonProperty("prohibidotitular")
    private Boolean autoDSProhibidoTitular;

    public AutoDS() {
    
    }

    @JsonIgnore
    public Long getAutoDSCodigo() {
        return this.autoDSCodigo;
    }
    
    public void setAutoDSCodigo(Long autoDSCodigo) {
        this.autoDSCodigo = autoDSCodigo;
    }

    @JsonIgnore
    public String getAutoDSDescripcion() {
        return this.autoDSDescripcion;
    }
    
    public void setAutoDSDescripcion(String autoDSDescripcion) {
        this.autoDSDescripcion = autoDSDescripcion;
    }

    @JsonIgnore
    public Boolean getAutoDSUnBeneficiarioDistino() {
        return this.autoDSUnBeneficiarioDistino;
    }
    
    public void setAutoDSUnBeneficiarioDistino(Boolean autoDSUnBeneficiarioDistino) {
        this.autoDSUnBeneficiarioDistino = autoDSUnBeneficiarioDistino;
    }

    @JsonIgnore
    public Boolean getAutoDSProhibidoBeneficiarios() {
        return this.autoDSProhibidoBeneficiarios;
    }
    
    public void setAutoDSProhibidoBeneficiarios(Boolean autoDSProhibidoBeneficiarios) {
        this.autoDSProhibidoBeneficiarios = autoDSProhibidoBeneficiarios;
    }

    @JsonIgnore
    public Boolean getAutoDSProhibidoContratante() {
        return this.autoDSProhibidoContratante;
    }
    
    public void setAutoDSProhibidoContratante(Boolean autoDSProhibidoContratante) {
        this.autoDSProhibidoContratante = autoDSProhibidoContratante;
    }

    @JsonIgnore
    public Boolean getAutoDSProhibidoTitular() {
        return this.autoDSProhibidoTitular;
    }
    
    public void setAutoDSProhibidoTitular(Boolean autoDSProhibidoTitular) {
        this.autoDSProhibidoTitular = autoDSProhibidoTitular;
    }
}
