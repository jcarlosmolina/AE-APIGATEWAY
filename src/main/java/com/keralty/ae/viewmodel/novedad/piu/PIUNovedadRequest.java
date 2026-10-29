package com.keralty.ae.viewmodel.novedad.piu;

import com.keralty.ae.viewmodel.PopulationRequestViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.novedad.filter.FNovedad;

public class PIUNovedadRequest extends PopulationRequestViewModel{

    private FNovedad fNovedad;
    
    public void setFNovedad(FNovedad fNovedad) {
        this.fNovedad = fNovedad;
    }
    
    public FNovedad getFNovedad() {
        return fNovedad;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fNovedad != null)
            queryRequest.addFilterRequest(fNovedad.buildFilterRequest());
        return queryRequest;
    }
}
