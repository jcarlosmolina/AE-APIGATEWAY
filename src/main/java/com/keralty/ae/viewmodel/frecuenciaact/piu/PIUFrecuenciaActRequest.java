package com.keralty.ae.viewmodel.frecuenciaact.piu;

import com.keralty.ae.viewmodel.PopulationRequestViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.frecuenciaact.filter.FFrecuenciaActVarios;

public class PIUFrecuenciaActRequest extends PopulationRequestViewModel{

    private FFrecuenciaActVarios fFrecuenciaActVarios;
    
    public void setFFrecuenciaActVarios(FFrecuenciaActVarios fFrecuenciaActVarios) {
        this.fFrecuenciaActVarios = fFrecuenciaActVarios;
    }
    
    public FFrecuenciaActVarios getFFrecuenciaActVarios() {
        return fFrecuenciaActVarios;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fFrecuenciaActVarios != null)
            queryRequest.addFilterRequest(fFrecuenciaActVarios.buildFilterRequest());
        return queryRequest;
    }
}
