package com.keralty.ae.viewmodel.plantillareporte.piu;

import com.keralty.ae.viewmodel.PopulationRequestViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.plantillareporte.filter.FPlantillaReporte;

public class PIUPlantillaReporteRequest extends PopulationRequestViewModel{

    private FPlantillaReporte fPlantillaReporte;
    
    public void setFPlantillaReporte(FPlantillaReporte fPlantillaReporte) {
        this.fPlantillaReporte = fPlantillaReporte;
    }
    
    public FPlantillaReporte getFPlantillaReporte() {
        return fPlantillaReporte;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fPlantillaReporte != null)
            queryRequest.addFilterRequest(fPlantillaReporte.buildFilterRequest());
        return queryRequest;
    }
}
