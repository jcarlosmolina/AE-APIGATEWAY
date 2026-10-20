package com.keralty.ae.viewmodel.planes.piu;

import com.keralty.ae.viewmodel.PopulationRequestViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.planes.filter.FPlanVarios;

public class PIUPlanRequest extends PopulationRequestViewModel{

    private FPlanVarios fPlanVarios;
    
    public void setFPlanVarios(FPlanVarios fPlanVarios) {
        this.fPlanVarios = fPlanVarios;
    }
    
    public FPlanVarios getFPlanVarios() {
        return fPlanVarios;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fPlanVarios != null)
            queryRequest.addFilterRequest(fPlanVarios.buildFilterRequest());
        return queryRequest;
    }
}
