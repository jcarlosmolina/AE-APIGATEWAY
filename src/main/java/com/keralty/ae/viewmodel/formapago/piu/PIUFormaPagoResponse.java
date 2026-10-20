package com.keralty.ae.viewmodel.formapago.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.ae.viewmodel.QueryResponse;
import com.keralty.ae.viewmodel.formapago.ds.AutoDS;

public class PIUFormaPagoResponse extends QueryResponse {

    private List<AutoDS> results;

    public PIUFormaPagoResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUFormaPagoResponse(List<AutoDS> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<AutoDS> getResults() {
        return this.results;
    }
    
    public void setResults(List<AutoDS> results) {
        this.results = results;
    }
}
