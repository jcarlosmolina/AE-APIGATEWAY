package com.keralty.ae.viewmodel.tiponovedad.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSTipoNovedadNull {

    @JsonProperty("codigolegal")
    private String dSTipoNovedadNullCodigoLegal;

    public DSTipoNovedadNull() {
    
    }

    @JsonIgnore
    public String getDSTipoNovedadNullCodigoLegal() {
        return this.dSTipoNovedadNullCodigoLegal;
    }
    
    public void setDSTipoNovedadNullCodigoLegal(String dSTipoNovedadNullCodigoLegal) {
        this.dSTipoNovedadNullCodigoLegal = dSTipoNovedadNullCodigoLegal;
    }
}
