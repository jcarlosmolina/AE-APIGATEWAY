package com.keralty.ae.viewmodel.solicitudnovedad.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSSolNovContraTipoTitular {

    @JsonProperty("contradrvidentificacion")
    private String dSSolNovContraTipoTitularContraDrvIdentificacion;

    @JsonProperty("contradrvnombrecompleto")
    private String dSSolNovContraTipoTitularContraDrvNombreCompleto;

    public DSSolNovContraTipoTitular() {
    
    }

    @JsonIgnore
    public String getDSSolNovContraTipoTitularContraDrvIdentificacion() {
        return this.dSSolNovContraTipoTitularContraDrvIdentificacion;
    }
    
    public void setDSSolNovContraTipoTitularContraDrvIdentificacion(String dSSolNovContraTipoTitularContraDrvIdentificacion) {
        this.dSSolNovContraTipoTitularContraDrvIdentificacion = dSSolNovContraTipoTitularContraDrvIdentificacion;
    }

    @JsonIgnore
    public String getDSSolNovContraTipoTitularContraDrvNombreCompleto() {
        return this.dSSolNovContraTipoTitularContraDrvNombreCompleto;
    }
    
    public void setDSSolNovContraTipoTitularContraDrvNombreCompleto(String dSSolNovContraTipoTitularContraDrvNombreCompleto) {
        this.dSSolNovContraTipoTitularContraDrvNombreCompleto = dSSolNovContraTipoTitularContraDrvNombreCompleto;
    }
}
