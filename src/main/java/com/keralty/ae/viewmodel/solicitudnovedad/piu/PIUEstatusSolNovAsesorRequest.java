package com.keralty.ae.viewmodel.solicitudnovedad.piu;

import com.keralty.ae.viewmodel.PopulationRequestViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.solicitudnovedad.filter.FSolicitudNovedadNumFechEsta;

public class PIUEstatusSolNovAsesorRequest extends PopulationRequestViewModel{

    private FSolicitudNovedadNumFechEsta fSolicitudNovedadNumFechEsta;
    
    public void setFSolicitudNovedadNumFechEsta(FSolicitudNovedadNumFechEsta fSolicitudNovedadNumFechEsta) {
        this.fSolicitudNovedadNumFechEsta = fSolicitudNovedadNumFechEsta;
    }
    
    public FSolicitudNovedadNumFechEsta getFSolicitudNovedadNumFechEsta() {
        return fSolicitudNovedadNumFechEsta;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fSolicitudNovedadNumFechEsta != null)
            queryRequest.addFilterRequest(fSolicitudNovedadNumFechEsta.buildFilterRequest());
        return queryRequest;
    }
}
