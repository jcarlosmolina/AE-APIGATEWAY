package com.keralty.ae.viewmodel.reportesdominio.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.ReportesDominioConstants;
import com.keralty.ae.persistence.oid.ReportesDominioOid;
import com.keralty.ae.persistence.ReportesDominio;

public class GetDummyRequest {

    @JsonProperty("p_thisreportesdominio_oid")
    private ReportesDominioOid reportesDominiogetDummypthisReportesDominio;
    
    @JsonIgnore
    private ReportesDominio reportesDominiogetDummypthisReportesDominioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkReportesDominiogetDummypthisReportesDominio();
    }

    @JsonIgnore
    public ReportesDominioOid getReportesDominiogetDummypthisReportesDominio() {
        return this.reportesDominiogetDummypthisReportesDominio;
    }
    
    public void setReportesDominiogetDummypthisReportesDominio(ReportesDominioOid reportesDominiogetDummypthisReportesDominio) {
        this.reportesDominiogetDummypthisReportesDominio = reportesDominiogetDummypthisReportesDominio;
    }

    @JsonIgnore
    public ReportesDominio getReportesDominiogetDummypthisReportesDominioInstance() {
        return this.reportesDominiogetDummypthisReportesDominioInstance;
    }
    
    public void setReportesDominiogetDummypthisReportesDominioInstance(ReportesDominio reportesDominiogetDummypthisReportesDominio) {
        this.reportesDominiogetDummypthisReportesDominioInstance = reportesDominiogetDummypthisReportesDominio;
        this.reportesDominiogetDummypthisReportesDominio = reportesDominiogetDummypthisReportesDominio != null ? reportesDominiogetDummypthisReportesDominio.getOid() : null;
    }

    private void checkReportesDominiogetDummypthisReportesDominio() throws NotNullArgumentException {
        if(this.getReportesDominiogetDummypthisReportesDominioInstance() == null || this.getReportesDominiogetDummypthisReportesDominioInstance().isNull()) {
            throw new NotNullArgumentException(ReportesDominioConstants.SERV_ID_GETDUMMY, ReportesDominioConstants.CLASS_ID, ReportesDominioConstants.ARG_ID_GETDUMMY_REPORTESDOMINIOGETDUMMYPTHISREPORTESDOMINIO, ReportesDominioConstants.SERV_ALIAS_GETDUMMY, ReportesDominioConstants.CLASS_ALIAS, ReportesDominioConstants.ARG_ALIAS_GETDUMMY_REPORTESDOMINIOGETDUMMYPTHISREPORTESDOMINIO);
        }
    }
}
