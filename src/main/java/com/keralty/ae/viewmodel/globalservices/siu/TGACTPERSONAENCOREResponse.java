package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.viewmodel.ServiceResponse;
import java.util.HashMap;
import java.util.Map;

public class TGACTPERSONAENCOREResponse extends ServiceResponse {

    @JsonProperty("pssalida")
    private String tGACTPERSONAENCOREpsSalida;

    public TGACTPERSONAENCOREResponse() {
        super();
    }

    @JsonIgnore
    public String getTGACTPERSONAENCOREpsSalida() {
        return this.tGACTPERSONAENCOREpsSalida;
    }

    public void setTGACTPERSONAENCOREpsSalida(String tGACTPERSONAENCOREpsSalida) {
        this.tGACTPERSONAENCOREpsSalida = tGACTPERSONAENCOREpsSalida;
    }

    @Override
    public Map<String, Object> buildOutArgs() {
        Map<String, Object> outArgs = new HashMap<>();
        outArgs.put("tGACTPERSONAENCOREpsSalida", tGACTPERSONAENCOREpsSalida);
        return outArgs;
    }
}
