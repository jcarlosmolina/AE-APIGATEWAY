package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.GlobalServiceConstants;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.persistence.Solicitud;

public class OGENERARSOLICITUD2Request {

    @JsonProperty("pt_p_solicitudae_oid")
    private SolicitudOid oGENERARSOLICITUD2ptpSolicitudAE;
    
    @JsonIgnore
    private Solicitud oGENERARSOLICITUD2ptpSolicitudAEInstance;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkOGENERARSOLICITUD2ptpSolicitudAE();
    }

    @JsonIgnore
    public SolicitudOid getOGENERARSOLICITUD2ptpSolicitudAE() {
        return this.oGENERARSOLICITUD2ptpSolicitudAE;
    }
    
    public void setOGENERARSOLICITUD2ptpSolicitudAE(SolicitudOid oGENERARSOLICITUD2ptpSolicitudAE) {
        this.oGENERARSOLICITUD2ptpSolicitudAE = oGENERARSOLICITUD2ptpSolicitudAE;
    }

    @JsonIgnore
    public Solicitud getOGENERARSOLICITUD2ptpSolicitudAEInstance() {
        return this.oGENERARSOLICITUD2ptpSolicitudAEInstance;
    }
    
    public void setOGENERARSOLICITUD2ptpSolicitudAEInstance(Solicitud oGENERARSOLICITUD2ptpSolicitudAE) {
        this.oGENERARSOLICITUD2ptpSolicitudAEInstance = oGENERARSOLICITUD2ptpSolicitudAE;
        this.oGENERARSOLICITUD2ptpSolicitudAE = oGENERARSOLICITUD2ptpSolicitudAE != null ? oGENERARSOLICITUD2ptpSolicitudAE.getOid() : null;
    }

    private void checkOGENERARSOLICITUD2ptpSolicitudAE() throws NotNullArgumentException {
        if(this.getOGENERARSOLICITUD2ptpSolicitudAEInstance() == null || this.getOGENERARSOLICITUD2ptpSolicitudAEInstance().isNull()) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_OGENERARSOLICITUD2, GlobalServiceConstants.GS_ARG_ID_OGENERARSOLICITUD2_OGENERARSOLICITUD2PTPSOLICITUDAE, GlobalServiceConstants.G_SERV_ALIAS_OGENERARSOLICITUD2, GlobalServiceConstants.GS_ARG_ALIAS_OGENERARSOLICITUD2_OGENERARSOLICITUD2PTPSOLICITUDAE);
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
