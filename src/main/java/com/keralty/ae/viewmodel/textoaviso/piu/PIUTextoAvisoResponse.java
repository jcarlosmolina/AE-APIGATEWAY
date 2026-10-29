package com.keralty.ae.viewmodel.textoaviso.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.ae.viewmodel.QueryResponse;
import com.keralty.ae.viewmodel.textoaviso.ds.DSTextoAviso;

public class PIUTextoAvisoResponse extends QueryResponse {

    private List<DSTextoAviso> results;

    public PIUTextoAvisoResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUTextoAvisoResponse(List<DSTextoAviso> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSTextoAviso> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSTextoAviso> results) {
        this.results = results;
    }
}
