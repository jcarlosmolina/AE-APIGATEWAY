package com.keralty.ae.viewmodel.valor.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class AutoDS {

    @JsonProperty("identificador")
    private Long autoDSIdentificador;

    @JsonProperty("valorposible")
    private String autoDSValorPosible;

    public AutoDS() {
    
    }

    @JsonIgnore
    public Long getAutoDSIdentificador() {
        return this.autoDSIdentificador;
    }
    
    public void setAutoDSIdentificador(Long autoDSIdentificador) {
        this.autoDSIdentificador = autoDSIdentificador;
    }

    @JsonIgnore
    public String getAutoDSValorPosible() {
        return this.autoDSValorPosible;
    }
    
    public void setAutoDSValorPosible(String autoDSValorPosible) {
        this.autoDSValorPosible = autoDSValorPosible;
    }
}
