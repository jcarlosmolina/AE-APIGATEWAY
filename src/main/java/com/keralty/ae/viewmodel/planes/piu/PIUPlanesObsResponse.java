package com.keralty.ae.viewmodel.planes.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.ae.viewmodel.QueryResponse;
import com.keralty.ae.viewmodel.planes.ds.DSPlanPIU;

public class PIUPlanesObsResponse extends QueryResponse {

    private List<DSPlanPIU> results;

    public PIUPlanesObsResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUPlanesObsResponse(List<DSPlanPIU> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSPlanPIU> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSPlanPIU> results) {
        this.results = results;
    }
}
