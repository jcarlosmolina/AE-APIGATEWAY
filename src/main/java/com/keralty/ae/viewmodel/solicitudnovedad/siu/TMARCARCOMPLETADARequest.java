package com.keralty.ae.viewmodel.solicitudnovedad.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.SolicitudNovedadConstants;
import com.keralty.ae.persistence.oid.SolicitudNovedadOid;
import com.keralty.ae.persistence.SolicitudNovedad;

public class TMARCARCOMPLETADARequest {

    @JsonProperty("p_thissolicitudnovedad_oid")
    private SolicitudNovedadOid solicitudNovedadTMARCARCOMPLETADApthisSolicitudNovedad;
    
    @JsonIgnore
    private SolicitudNovedad solicitudNovedadTMARCARCOMPLETADApthisSolicitudNovedadInstance;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkSolicitudNovedadTMARCARCOMPLETADApthisSolicitudNovedad();
    }

    @JsonIgnore
    public SolicitudNovedadOid getSolicitudNovedadTMARCARCOMPLETADApthisSolicitudNovedad() {
        return this.solicitudNovedadTMARCARCOMPLETADApthisSolicitudNovedad;
    }
    
    public void setSolicitudNovedadTMARCARCOMPLETADApthisSolicitudNovedad(SolicitudNovedadOid solicitudNovedadTMARCARCOMPLETADApthisSolicitudNovedad) {
        this.solicitudNovedadTMARCARCOMPLETADApthisSolicitudNovedad = solicitudNovedadTMARCARCOMPLETADApthisSolicitudNovedad;
    }

    @JsonIgnore
    public SolicitudNovedad getSolicitudNovedadTMARCARCOMPLETADApthisSolicitudNovedadInstance() {
        return this.solicitudNovedadTMARCARCOMPLETADApthisSolicitudNovedadInstance;
    }
    
    public void setSolicitudNovedadTMARCARCOMPLETADApthisSolicitudNovedadInstance(SolicitudNovedad solicitudNovedadTMARCARCOMPLETADApthisSolicitudNovedad) {
        this.solicitudNovedadTMARCARCOMPLETADApthisSolicitudNovedadInstance = solicitudNovedadTMARCARCOMPLETADApthisSolicitudNovedad;
        this.solicitudNovedadTMARCARCOMPLETADApthisSolicitudNovedad = solicitudNovedadTMARCARCOMPLETADApthisSolicitudNovedad != null ? solicitudNovedadTMARCARCOMPLETADApthisSolicitudNovedad.getOid() : null;
    }

    private void checkSolicitudNovedadTMARCARCOMPLETADApthisSolicitudNovedad() throws NotNullArgumentException {
        if(this.getSolicitudNovedadTMARCARCOMPLETADApthisSolicitudNovedadInstance() == null || this.getSolicitudNovedadTMARCARCOMPLETADApthisSolicitudNovedadInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudNovedadConstants.SERV_ID_TMARCARCOMPLETADA, SolicitudNovedadConstants.CLASS_ID, SolicitudNovedadConstants.ARG_ID_TMARCARCOMPLETADA_SOLICITUDNOVEDADTMARCARCOMPLETADAPTHISSOLICITUDNOVEDAD, SolicitudNovedadConstants.SERV_ALIAS_TMARCARCOMPLETADA, SolicitudNovedadConstants.CLASS_ALIAS, SolicitudNovedadConstants.ARG_ALIAS_TMARCARCOMPLETADA_SOLICITUDNOVEDADTMARCARCOMPLETADAPTHISSOLICITUDNOVEDAD);
        }
    }

    @JsonIgnore
    public String getPreconditionId() {
        return this.preconditionId;
    }
    
    public void setPreconditionId(String preconditionId) {
        this.preconditionId = preconditionId;
    }
}
