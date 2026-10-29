package com.keralty.ae.viewmodel.tipoinstitucionc.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.ae.viewmodel.QueryResponse;
import com.keralty.ae.viewmodel.tipoinstitucionc.ds.AutoDS;

public class PIUTipoInstitucionResponse extends QueryResponse {

    private List<AutoDS> results;

    public PIUTipoInstitucionResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUTipoInstitucionResponse(List<AutoDS> results) {
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
