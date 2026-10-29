package com.keralty.ae.viewmodel.grupoasignacionnovedad.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.ae.viewmodel.QueryResponse;
import com.keralty.ae.viewmodel.grupoasignacionnovedad.ds.DSGrupoAsignacionNovedad;

public class PIUGrpAsigNovedadDDominioResponse extends QueryResponse {

    private List<DSGrupoAsignacionNovedad> results;

    public PIUGrpAsigNovedadDDominioResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUGrpAsigNovedadDDominioResponse(List<DSGrupoAsignacionNovedad> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSGrupoAsignacionNovedad> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSGrupoAsignacionNovedad> results) {
        this.results = results;
    }
}
