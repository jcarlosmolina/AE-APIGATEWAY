package com.keralty.ae.viewmodel.contratocombo.piu;

import com.keralty.ae.viewmodel.PopulationRequestViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.contratocombo.filter.FContratoComboPorNumero;

public class PIUContratoComboRequest extends PopulationRequestViewModel{

    private FContratoComboPorNumero fContratoComboPorNumero;
    
    public void setFContratoComboPorNumero(FContratoComboPorNumero fContratoComboPorNumero) {
        this.fContratoComboPorNumero = fContratoComboPorNumero;
    }
    
    public FContratoComboPorNumero getFContratoComboPorNumero() {
        return fContratoComboPorNumero;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fContratoComboPorNumero != null)
            queryRequest.addFilterRequest(fContratoComboPorNumero.buildFilterRequest());
        return queryRequest;
    }
}
