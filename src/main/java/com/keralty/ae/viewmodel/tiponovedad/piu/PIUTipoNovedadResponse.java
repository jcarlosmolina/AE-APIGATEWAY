package com.keralty.ae.viewmodel.tiponovedad.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.ae.viewmodel.QueryResponse;
import com.keralty.ae.viewmodel.tiponovedad.ds.DSTipoNovedad;

public class PIUTipoNovedadResponse extends QueryResponse {

    private List<DSTipoNovedad> results;

    public PIUTipoNovedadResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUTipoNovedadResponse(List<DSTipoNovedad> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSTipoNovedad> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSTipoNovedad> results) {
        this.results = results;
    }
}
