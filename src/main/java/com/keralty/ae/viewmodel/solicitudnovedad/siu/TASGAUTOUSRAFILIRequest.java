package com.keralty.ae.viewmodel.solicitudnovedad.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.SolicitudNovedadConstants;
import com.keralty.ae.persistence.Funcionario;
import com.keralty.ae.persistence.oid.FuncionarioOid;
import com.keralty.ae.persistence.oid.SolicitudNovedadOid;
import com.keralty.ae.persistence.SolicitudNovedad;

public class TASGAUTOUSRAFILIRequest {

    @JsonProperty("p_thissolicitudnovedad_oid")
    private SolicitudNovedadOid solicitudNovedadTASGAUTOUSRAFILIpthisSolicitudNovedad;
    
    @JsonIgnore
    private SolicitudNovedad solicitudNovedadTASGAUTOUSRAFILIpthisSolicitudNovedadInstance;

    @JsonProperty("ptfuncionario_oid")
    private FuncionarioOid solicitudNovedadTASGAUTOUSRAFILIptFuncionario;
    
    @JsonIgnore
    private Funcionario solicitudNovedadTASGAUTOUSRAFILIptFuncionarioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkSolicitudNovedadTASGAUTOUSRAFILIpthisSolicitudNovedad();
    }

    @JsonIgnore
    public SolicitudNovedadOid getSolicitudNovedadTASGAUTOUSRAFILIpthisSolicitudNovedad() {
        return this.solicitudNovedadTASGAUTOUSRAFILIpthisSolicitudNovedad;
    }
    
    public void setSolicitudNovedadTASGAUTOUSRAFILIpthisSolicitudNovedad(SolicitudNovedadOid solicitudNovedadTASGAUTOUSRAFILIpthisSolicitudNovedad) {
        this.solicitudNovedadTASGAUTOUSRAFILIpthisSolicitudNovedad = solicitudNovedadTASGAUTOUSRAFILIpthisSolicitudNovedad;
    }

    @JsonIgnore
    public SolicitudNovedad getSolicitudNovedadTASGAUTOUSRAFILIpthisSolicitudNovedadInstance() {
        return this.solicitudNovedadTASGAUTOUSRAFILIpthisSolicitudNovedadInstance;
    }
    
    public void setSolicitudNovedadTASGAUTOUSRAFILIpthisSolicitudNovedadInstance(SolicitudNovedad solicitudNovedadTASGAUTOUSRAFILIpthisSolicitudNovedad) {
        this.solicitudNovedadTASGAUTOUSRAFILIpthisSolicitudNovedadInstance = solicitudNovedadTASGAUTOUSRAFILIpthisSolicitudNovedad;
        this.solicitudNovedadTASGAUTOUSRAFILIpthisSolicitudNovedad = solicitudNovedadTASGAUTOUSRAFILIpthisSolicitudNovedad != null ? solicitudNovedadTASGAUTOUSRAFILIpthisSolicitudNovedad.getOid() : null;
    }

    private void checkSolicitudNovedadTASGAUTOUSRAFILIpthisSolicitudNovedad() throws NotNullArgumentException {
        if(this.getSolicitudNovedadTASGAUTOUSRAFILIpthisSolicitudNovedadInstance() == null || this.getSolicitudNovedadTASGAUTOUSRAFILIpthisSolicitudNovedadInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudNovedadConstants.SERV_ID_TASGAUTOUSRAFILI, SolicitudNovedadConstants.CLASS_ID, SolicitudNovedadConstants.ARG_ID_TASGAUTOUSRAFILI_SOLICITUDNOVEDADTASGAUTOUSRAFILIPTHISSOLICITUDNOVEDAD, SolicitudNovedadConstants.SERV_ALIAS_TASGAUTOUSRAFILI, SolicitudNovedadConstants.CLASS_ALIAS, SolicitudNovedadConstants.ARG_ALIAS_TASGAUTOUSRAFILI_SOLICITUDNOVEDADTASGAUTOUSRAFILIPTHISSOLICITUDNOVEDAD);
        }
    }

    @JsonIgnore
    public FuncionarioOid getSolicitudNovedadTASGAUTOUSRAFILIptFuncionario() {
        return this.solicitudNovedadTASGAUTOUSRAFILIptFuncionario;
    }
    
    public void setSolicitudNovedadTASGAUTOUSRAFILIptFuncionario(FuncionarioOid solicitudNovedadTASGAUTOUSRAFILIptFuncionario) {
        this.solicitudNovedadTASGAUTOUSRAFILIptFuncionario = solicitudNovedadTASGAUTOUSRAFILIptFuncionario;
    }

    @JsonIgnore
    public Funcionario getSolicitudNovedadTASGAUTOUSRAFILIptFuncionarioInstance() {
        return this.solicitudNovedadTASGAUTOUSRAFILIptFuncionarioInstance;
    }
    
    public void setSolicitudNovedadTASGAUTOUSRAFILIptFuncionarioInstance(Funcionario solicitudNovedadTASGAUTOUSRAFILIptFuncionario) {
        this.solicitudNovedadTASGAUTOUSRAFILIptFuncionarioInstance = solicitudNovedadTASGAUTOUSRAFILIptFuncionario;
        this.solicitudNovedadTASGAUTOUSRAFILIptFuncionario = solicitudNovedadTASGAUTOUSRAFILIptFuncionario != null ? solicitudNovedadTASGAUTOUSRAFILIptFuncionario.getOid() : null;
    }
}
