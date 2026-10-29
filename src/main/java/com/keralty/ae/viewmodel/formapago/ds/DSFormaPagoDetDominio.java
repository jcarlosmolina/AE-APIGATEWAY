package com.keralty.ae.viewmodel.formapago.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSFormaPagoDetDominio {

    @JsonProperty("codigo")
    private Long dSFormaPagoDetDominioCodigo;

    @JsonProperty("descripcion")
    private String dSFormaPagoDetDominioDescripcion;

    public DSFormaPagoDetDominio() {
    
    }

    @JsonIgnore
    public Long getDSFormaPagoDetDominioCodigo() {
        return this.dSFormaPagoDetDominioCodigo;
    }
    
    public void setDSFormaPagoDetDominioCodigo(Long dSFormaPagoDetDominioCodigo) {
        this.dSFormaPagoDetDominioCodigo = dSFormaPagoDetDominioCodigo;
    }

    @JsonIgnore
    public String getDSFormaPagoDetDominioDescripcion() {
        return this.dSFormaPagoDetDominioDescripcion;
    }
    
    public void setDSFormaPagoDetDominioDescripcion(String dSFormaPagoDetDominioDescripcion) {
        this.dSFormaPagoDetDominioDescripcion = dSFormaPagoDetDominioDescripcion;
    }
}
