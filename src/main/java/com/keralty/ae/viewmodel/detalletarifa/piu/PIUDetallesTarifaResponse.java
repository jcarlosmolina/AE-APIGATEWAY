package com.keralty.ae.viewmodel.detalletarifa.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.ae.viewmodel.QueryResponse;
import com.keralty.ae.viewmodel.detalletarifa.ds.DSDetallesTarifa;

public class PIUDetallesTarifaResponse extends QueryResponse {

    private List<DSDetallesTarifa> results;

    public PIUDetallesTarifaResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUDetallesTarifaResponse(List<DSDetallesTarifa> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSDetallesTarifa> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSDetallesTarifa> results) {
        this.results = results;
    }
}
