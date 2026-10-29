package com.keralty.ae.viewmodel.documentonovedad.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.DocumentoNovedadConstants;
import com.keralty.ae.persistence.DocumentoNovedad;
import com.keralty.ae.persistence.oid.DocumentoNovedadOid;

public class CambiarEstadoRequest {

    @JsonProperty("p_thisdocumentonovedad_oid")
    private DocumentoNovedadOid documentoNovedadcambiarEstadopthisDocumentoNovedad;
    
    @JsonIgnore
    private DocumentoNovedad documentoNovedadcambiarEstadopthisDocumentoNovedadInstance;

    @JsonProperty("peestado")
    private Long documentoNovedadcambiarEstadopeEstado;

    public void checkArguments() throws NotNullArgumentException {
        checkDocumentoNovedadcambiarEstadopthisDocumentoNovedad();
        checkDocumentoNovedadcambiarEstadopeEstado();
    }

    @JsonIgnore
    public DocumentoNovedadOid getDocumentoNovedadcambiarEstadopthisDocumentoNovedad() {
        return this.documentoNovedadcambiarEstadopthisDocumentoNovedad;
    }
    
    public void setDocumentoNovedadcambiarEstadopthisDocumentoNovedad(DocumentoNovedadOid documentoNovedadcambiarEstadopthisDocumentoNovedad) {
        this.documentoNovedadcambiarEstadopthisDocumentoNovedad = documentoNovedadcambiarEstadopthisDocumentoNovedad;
    }

    @JsonIgnore
    public DocumentoNovedad getDocumentoNovedadcambiarEstadopthisDocumentoNovedadInstance() {
        return this.documentoNovedadcambiarEstadopthisDocumentoNovedadInstance;
    }
    
    public void setDocumentoNovedadcambiarEstadopthisDocumentoNovedadInstance(DocumentoNovedad documentoNovedadcambiarEstadopthisDocumentoNovedad) {
        this.documentoNovedadcambiarEstadopthisDocumentoNovedadInstance = documentoNovedadcambiarEstadopthisDocumentoNovedad;
        this.documentoNovedadcambiarEstadopthisDocumentoNovedad = documentoNovedadcambiarEstadopthisDocumentoNovedad != null ? documentoNovedadcambiarEstadopthisDocumentoNovedad.getOid() : null;
    }

    private void checkDocumentoNovedadcambiarEstadopthisDocumentoNovedad() throws NotNullArgumentException {
        if(this.getDocumentoNovedadcambiarEstadopthisDocumentoNovedadInstance() == null || this.getDocumentoNovedadcambiarEstadopthisDocumentoNovedadInstance().isNull()) {
            throw new NotNullArgumentException(DocumentoNovedadConstants.SERV_ID_CAMBIARESTADO, DocumentoNovedadConstants.CLASS_ID, DocumentoNovedadConstants.ARG_ID_CAMBIARESTADO_DOCUMENTONOVEDADCAMBIARESTADOPTHISDOCUMENTONOVEDAD, DocumentoNovedadConstants.SERV_ALIAS_CAMBIARESTADO, DocumentoNovedadConstants.CLASS_ALIAS, DocumentoNovedadConstants.ARG_ALIAS_CAMBIARESTADO_DOCUMENTONOVEDADCAMBIARESTADOPTHISDOCUMENTONOVEDAD);
        }
    }

    @JsonIgnore
    public Long getDocumentoNovedadcambiarEstadopeEstado() {
        return this.documentoNovedadcambiarEstadopeEstado;
    }
    
    public void setDocumentoNovedadcambiarEstadopeEstado(Long documentoNovedadcambiarEstadopeEstado) {
        this.documentoNovedadcambiarEstadopeEstado = documentoNovedadcambiarEstadopeEstado;
    }

    private void checkDocumentoNovedadcambiarEstadopeEstado() throws NotNullArgumentException {
        if(this.getDocumentoNovedadcambiarEstadopeEstado() == null) {
            throw new NotNullArgumentException(DocumentoNovedadConstants.SERV_ID_CAMBIARESTADO, DocumentoNovedadConstants.CLASS_ID, DocumentoNovedadConstants.ARG_ID_CAMBIARESTADO_DOCUMENTONOVEDADCAMBIARESTADOPEESTADO, DocumentoNovedadConstants.SERV_ALIAS_CAMBIARESTADO, DocumentoNovedadConstants.CLASS_ALIAS, DocumentoNovedadConstants.ARG_ALIAS_CAMBIARESTADO_DOCUMENTONOVEDADCAMBIARESTADOPEESTADO);
        }
    }
}
