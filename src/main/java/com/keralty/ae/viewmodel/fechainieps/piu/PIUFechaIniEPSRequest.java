package com.keralty.ae.viewmodel.fechainieps.piu;

import com.keralty.ae.viewmodel.PopulationRequestViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.fechainieps.filter.FFechaIniEPS;

public class PIUFechaIniEPSRequest extends PopulationRequestViewModel{

    private FFechaIniEPS fFechaIniEPS;
    
    public void setFFechaIniEPS(FFechaIniEPS fFechaIniEPS) {
        this.fFechaIniEPS = fFechaIniEPS;
    }
    
    public FFechaIniEPS getFFechaIniEPS() {
        return fFechaIniEPS;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fFechaIniEPS != null)
            queryRequest.addFilterRequest(fFechaIniEPS.buildFilterRequest());
        return queryRequest;
    }
}
