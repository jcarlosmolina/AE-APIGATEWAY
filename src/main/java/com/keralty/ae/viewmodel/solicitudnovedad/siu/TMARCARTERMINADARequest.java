package com.keralty.ae.viewmodel.solicitudnovedad.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.SolicitudNovedadConstants;
import com.keralty.ae.persistence.oid.SolicitudNovedadOid;
import com.keralty.ae.persistence.SolicitudNovedad;

public class TMARCARTERMINADARequest {

    @JsonProperty("p_thissolicitudnovedad_oid")
    private SolicitudNovedadOid solicitudNovedadTMARCARTERMINADApthisSolicitudNovedad;
    
    @JsonIgnore
    private SolicitudNovedad solicitudNovedadTMARCARTERMINADApthisSolicitudNovedadInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkSolicitudNovedadTMARCARTERMINADApthisSolicitudNovedad();
    }

    @JsonIgnore
    public SolicitudNovedadOid getSolicitudNovedadTMARCARTERMINADApthisSolicitudNovedad() {
        return this.solicitudNovedadTMARCARTERMINADApthisSolicitudNovedad;
    }
    
    public void setSolicitudNovedadTMARCARTERMINADApthisSolicitudNovedad(SolicitudNovedadOid solicitudNovedadTMARCARTERMINADApthisSolicitudNovedad) {
        this.solicitudNovedadTMARCARTERMINADApthisSolicitudNovedad = solicitudNovedadTMARCARTERMINADApthisSolicitudNovedad;
    }

    @JsonIgnore
    public SolicitudNovedad getSolicitudNovedadTMARCARTERMINADApthisSolicitudNovedadInstance() {
        return this.solicitudNovedadTMARCARTERMINADApthisSolicitudNovedadInstance;
    }
    
    public void setSolicitudNovedadTMARCARTERMINADApthisSolicitudNovedadInstance(SolicitudNovedad solicitudNovedadTMARCARTERMINADApthisSolicitudNovedad) {
        this.solicitudNovedadTMARCARTERMINADApthisSolicitudNovedadInstance = solicitudNovedadTMARCARTERMINADApthisSolicitudNovedad;
        this.solicitudNovedadTMARCARTERMINADApthisSolicitudNovedad = solicitudNovedadTMARCARTERMINADApthisSolicitudNovedad != null ? solicitudNovedadTMARCARTERMINADApthisSolicitudNovedad.getOid() : null;
    }

    private void checkSolicitudNovedadTMARCARTERMINADApthisSolicitudNovedad() throws NotNullArgumentException {
        if(this.getSolicitudNovedadTMARCARTERMINADApthisSolicitudNovedadInstance() == null || this.getSolicitudNovedadTMARCARTERMINADApthisSolicitudNovedadInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudNovedadConstants.SERV_ID_TMARCARTERMINADA, SolicitudNovedadConstants.CLASS_ID, SolicitudNovedadConstants.ARG_ID_TMARCARTERMINADA_SOLICITUDNOVEDADTMARCARTERMINADAPTHISSOLICITUDNOVEDAD, SolicitudNovedadConstants.SERV_ALIAS_TMARCARTERMINADA, SolicitudNovedadConstants.CLASS_ALIAS, SolicitudNovedadConstants.ARG_ALIAS_TMARCARTERMINADA_SOLICITUDNOVEDADTMARCARTERMINADAPTHISSOLICITUDNOVEDAD);
        }
    }
}
