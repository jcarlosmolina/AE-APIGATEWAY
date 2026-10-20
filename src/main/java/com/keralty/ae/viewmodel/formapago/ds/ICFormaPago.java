package com.keralty.ae.viewmodel.formapago.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICFormaPago {

    @JsonProperty("descripcion")
    private String iCFormaPagoDescripcion;

    public ICFormaPago() {
    
    }

    @JsonIgnore
    public String getICFormaPagoDescripcion() {
        return this.iCFormaPagoDescripcion;
    }
    
    public void setICFormaPagoDescripcion(String iCFormaPagoDescripcion) {
        this.iCFormaPagoDescripcion = iCFormaPagoDescripcion;
    }
}
