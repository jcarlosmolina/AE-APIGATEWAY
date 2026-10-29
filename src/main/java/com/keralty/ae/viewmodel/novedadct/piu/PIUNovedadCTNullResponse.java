package com.keralty.ae.viewmodel.novedadct.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.ae.viewmodel.QueryResponse;
import com.keralty.ae.viewmodel.novedadct.ds.DSNovedadCTNull;

public class PIUNovedadCTNullResponse extends QueryResponse {

    private List<DSNovedadCTNull> results;

    public PIUNovedadCTNullResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUNovedadCTNullResponse(List<DSNovedadCTNull> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSNovedadCTNull> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSNovedadCTNull> results) {
        this.results = results;
    }
}
