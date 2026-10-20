package com.keralty.ae.viewmodel.solicitudnovedad.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSSolNovContratante {

    @JsonProperty("contradrvidentificacion")
    private String dSSolNovContratanteContraDrvIdentificacion;

    @JsonProperty("contradrvnombrecompleto")
    private String dSSolNovContratanteContraDrvNombreCompleto;

    @JsonProperty("contranuevarazonsocial")
    private String dSSolNovContratanteContraNuevaRazonSocial;

    public DSSolNovContratante() {
    
    }

    @JsonIgnore
    public String getDSSolNovContratanteContraDrvIdentificacion() {
        return this.dSSolNovContratanteContraDrvIdentificacion;
    }
    
    public void setDSSolNovContratanteContraDrvIdentificacion(String dSSolNovContratanteContraDrvIdentificacion) {
        this.dSSolNovContratanteContraDrvIdentificacion = dSSolNovContratanteContraDrvIdentificacion;
    }

    @JsonIgnore
    public String getDSSolNovContratanteContraDrvNombreCompleto() {
        return this.dSSolNovContratanteContraDrvNombreCompleto;
    }
    
    public void setDSSolNovContratanteContraDrvNombreCompleto(String dSSolNovContratanteContraDrvNombreCompleto) {
        this.dSSolNovContratanteContraDrvNombreCompleto = dSSolNovContratanteContraDrvNombreCompleto;
    }

    @JsonIgnore
    public String getDSSolNovContratanteContraNuevaRazonSocial() {
        return this.dSSolNovContratanteContraNuevaRazonSocial;
    }
    
    public void setDSSolNovContratanteContraNuevaRazonSocial(String dSSolNovContratanteContraNuevaRazonSocial) {
        this.dSSolNovContratanteContraNuevaRazonSocial = dSSolNovContratanteContraNuevaRazonSocial;
    }
}
