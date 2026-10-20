package com.keralty.ae.viewmodel.afiliaciones.piu;

import com.keralty.ae.viewmodel.PopulationRequestViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.afiliaciones.filter.FAfiliacionesPorNombre;

public class PIUAfiliacionesRequest extends PopulationRequestViewModel{

    private FAfiliacionesPorNombre fAfiliacionesPorNombre;
    
    public void setFAfiliacionesPorNombre(FAfiliacionesPorNombre fAfiliacionesPorNombre) {
        this.fAfiliacionesPorNombre = fAfiliacionesPorNombre;
    }
    
    public FAfiliacionesPorNombre getFAfiliacionesPorNombre() {
        return fAfiliacionesPorNombre;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fAfiliacionesPorNombre != null)
            queryRequest.addFilterRequest(fAfiliacionesPorNombre.buildFilterRequest());
        return queryRequest;
    }
}
