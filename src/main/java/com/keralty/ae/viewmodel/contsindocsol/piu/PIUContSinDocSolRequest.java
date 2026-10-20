package com.keralty.ae.viewmodel.contsindocsol.piu;

import com.keralty.ae.viewmodel.PopulationRequestViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.contsindocsol.filter.FContSinDocSolNumContrato;

public class PIUContSinDocSolRequest extends PopulationRequestViewModel{

    private FContSinDocSolNumContrato fContSinDocSolNumContrato;
    
    public void setFContSinDocSolNumContrato(FContSinDocSolNumContrato fContSinDocSolNumContrato) {
        this.fContSinDocSolNumContrato = fContSinDocSolNumContrato;
    }
    
    public FContSinDocSolNumContrato getFContSinDocSolNumContrato() {
        return fContSinDocSolNumContrato;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fContSinDocSolNumContrato != null)
            queryRequest.addFilterRequest(fContSinDocSolNumContrato.buildFilterRequest());
        return queryRequest;
    }
}
