package com.keralty.ae.viewmodel.logestadodocnov.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.ae.viewmodel.QueryResponse;
import com.keralty.ae.viewmodel.logestadodocnov.ds.DSLogEstadoDocNov;

public class PIULogEstadoDocNovResponse extends QueryResponse {

    private List<DSLogEstadoDocNov> results;

    public PIULogEstadoDocNovResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIULogEstadoDocNovResponse(List<DSLogEstadoDocNov> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSLogEstadoDocNov> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSLogEstadoDocNov> results) {
        this.results = results;
    }
}
