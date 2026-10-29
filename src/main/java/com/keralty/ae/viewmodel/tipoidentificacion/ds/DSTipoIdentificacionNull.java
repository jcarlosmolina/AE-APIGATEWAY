package com.keralty.ae.viewmodel.tipoidentificacion.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSTipoIdentificacionNull {

    @JsonProperty("codigo")
    private Long dSTipoIdentificacionNullCodigo;

    public DSTipoIdentificacionNull() {
    
    }

    @JsonIgnore
    public Long getDSTipoIdentificacionNullCodigo() {
        return this.dSTipoIdentificacionNullCodigo;
    }
    
    public void setDSTipoIdentificacionNullCodigo(Long dSTipoIdentificacionNullCodigo) {
        this.dSTipoIdentificacionNullCodigo = dSTipoIdentificacionNullCodigo;
    }
}
