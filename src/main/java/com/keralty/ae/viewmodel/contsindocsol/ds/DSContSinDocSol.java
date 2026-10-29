package com.keralty.ae.viewmodel.contsindocsol.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSContSinDocSol {

    @JsonProperty("numcontrato")
    private String dSContSinDocSolNumContrato;

    public DSContSinDocSol() {
    
    }

    @JsonIgnore
    public String getDSContSinDocSolNumContrato() {
        return this.dSContSinDocSolNumContrato;
    }
    
    public void setDSContSinDocSolNumContrato(String dSContSinDocSolNumContrato) {
        this.dSContSinDocSolNumContrato = dSContSinDocSolNumContrato;
    }
}
