package com.keralty.ae.viewmodel.logcontratocombo.piu;

import com.keralty.ae.viewmodel.PopulationRequestViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.logcontratocombo.filter.FLogContratoCombo;

public class PIULogContratoComboRequest extends PopulationRequestViewModel{

    private FLogContratoCombo fLogContratoCombo;
    
    public void setFLogContratoCombo(FLogContratoCombo fLogContratoCombo) {
        this.fLogContratoCombo = fLogContratoCombo;
    }
    
    public FLogContratoCombo getFLogContratoCombo() {
        return fLogContratoCombo;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fLogContratoCombo != null)
            queryRequest.addFilterRequest(fLogContratoCombo.buildFilterRequest());
        return queryRequest;
    }
}
