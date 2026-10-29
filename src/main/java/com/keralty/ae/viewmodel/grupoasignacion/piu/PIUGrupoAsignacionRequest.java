package com.keralty.ae.viewmodel.grupoasignacion.piu;

import com.keralty.ae.viewmodel.PopulationRequestViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.grupoasignacion.filter.FGrupoAsignacionPorTipo;

public class PIUGrupoAsignacionRequest extends PopulationRequestViewModel{

    private FGrupoAsignacionPorTipo fGrupoAsignacionPorTipo;
    
    public void setFGrupoAsignacionPorTipo(FGrupoAsignacionPorTipo fGrupoAsignacionPorTipo) {
        this.fGrupoAsignacionPorTipo = fGrupoAsignacionPorTipo;
    }
    
    public FGrupoAsignacionPorTipo getFGrupoAsignacionPorTipo() {
        return fGrupoAsignacionPorTipo;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fGrupoAsignacionPorTipo != null)
            queryRequest.addFilterRequest(fGrupoAsignacionPorTipo.buildFilterRequest());
        return queryRequest;
    }
}
