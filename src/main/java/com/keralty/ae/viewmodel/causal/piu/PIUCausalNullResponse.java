package com.keralty.ae.viewmodel.causal.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.ae.viewmodel.QueryResponse;
import com.keralty.ae.viewmodel.causal.ds.DSCausalNull;

public class PIUCausalNullResponse extends QueryResponse {

    private List<DSCausalNull> results;

    public PIUCausalNullResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUCausalNullResponse(List<DSCausalNull> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSCausalNull> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSCausalNull> results) {
        this.results = results;
    }
}
