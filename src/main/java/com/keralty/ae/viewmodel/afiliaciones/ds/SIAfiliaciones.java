package com.keralty.ae.viewmodel.afiliaciones.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class SIAfiliaciones {

    @JsonProperty("usuarioldap")
    private String sIAfiliacionesUsuarioLDAP;

    public SIAfiliaciones() {
    
    }

    @JsonIgnore
    public String getSIAfiliacionesUsuarioLDAP() {
        return this.sIAfiliacionesUsuarioLDAP;
    }
    
    public void setSIAfiliacionesUsuarioLDAP(String sIAfiliacionesUsuarioLDAP) {
        this.sIAfiliacionesUsuarioLDAP = sIAfiliacionesUsuarioLDAP;
    }
}
