package com.keralty.ae.viewmodel.documentonovedad.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSDocumentoNovedadNull {

    @JsonProperty("iddocumento")
    private Long dSDocumentoNovedadNullIdDocumento;

    public DSDocumentoNovedadNull() {
    
    }

    @JsonIgnore
    public Long getDSDocumentoNovedadNullIdDocumento() {
        return this.dSDocumentoNovedadNullIdDocumento;
    }
    
    public void setDSDocumentoNovedadNullIdDocumento(Long dSDocumentoNovedadNullIdDocumento) {
        this.dSDocumentoNovedadNullIdDocumento = dSDocumentoNovedadNullIdDocumento;
    }
}
