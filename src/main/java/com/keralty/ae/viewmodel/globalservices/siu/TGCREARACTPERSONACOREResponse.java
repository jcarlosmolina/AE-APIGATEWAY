package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.viewmodel.ServiceResponse;
import java.util.HashMap;
import java.util.Map;

public class TGCREARACTPERSONACOREResponse extends ServiceResponse {

    @JsonProperty("pssalida")
    private String tGCREARACTPERSONACOREpsSalida;

    @JsonProperty("pscodigopersona")
    private Long tGCREARACTPERSONACOREpsCodigoPersona;

    public TGCREARACTPERSONACOREResponse() {
        super();
    }

    @JsonIgnore
    public String getTGCREARACTPERSONACOREpsSalida() {
        return this.tGCREARACTPERSONACOREpsSalida;
    }

    public void setTGCREARACTPERSONACOREpsSalida(String tGCREARACTPERSONACOREpsSalida) {
        this.tGCREARACTPERSONACOREpsSalida = tGCREARACTPERSONACOREpsSalida;
    }

    @JsonIgnore
    public Long getTGCREARACTPERSONACOREpsCodigoPersona() {
        return this.tGCREARACTPERSONACOREpsCodigoPersona;
    }

    public void setTGCREARACTPERSONACOREpsCodigoPersona(Long tGCREARACTPERSONACOREpsCodigoPersona) {
        this.tGCREARACTPERSONACOREpsCodigoPersona = tGCREARACTPERSONACOREpsCodigoPersona;
    }

    @Override
    public Map<String, Object> buildOutArgs() {
        Map<String, Object> outArgs = new HashMap<>();
        outArgs.put("tGCREARACTPERSONACOREpsSalida", tGCREARACTPERSONACOREpsSalida);
        outArgs.put("tGCREARACTPERSONACOREpsCodigoPersona", tGCREARACTPERSONACOREpsCodigoPersona);
        return outArgs;
    }
}
