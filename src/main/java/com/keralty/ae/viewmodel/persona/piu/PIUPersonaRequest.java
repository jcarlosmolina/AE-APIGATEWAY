package com.keralty.ae.viewmodel.persona.piu;

import com.keralty.ae.viewmodel.PopulationRequestViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.persona.filter.FPersonaVarios;

public class PIUPersonaRequest extends PopulationRequestViewModel{

    private FPersonaVarios fPersonaVarios;
    
    public void setFPersonaVarios(FPersonaVarios fPersonaVarios) {
        this.fPersonaVarios = fPersonaVarios;
    }
    
    public FPersonaVarios getFPersonaVarios() {
        return fPersonaVarios;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fPersonaVarios != null)
            queryRequest.addFilterRequest(fPersonaVarios.buildFilterRequest());
        return queryRequest;
    }
}
