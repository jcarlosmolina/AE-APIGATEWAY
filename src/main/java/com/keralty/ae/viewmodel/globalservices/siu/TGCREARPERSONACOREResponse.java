package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.viewmodel.ServiceResponse;
import java.util.HashMap;
import java.util.Map;

public class TGCREARPERSONACOREResponse extends ServiceResponse {

    @JsonProperty("pssalida")
    private String tGCREARPERSONACOREpsSalida;

    public TGCREARPERSONACOREResponse() {
        super();
    }

    @JsonIgnore
    public String getTGCREARPERSONACOREpsSalida() {
        return this.tGCREARPERSONACOREpsSalida;
    }

    public void setTGCREARPERSONACOREpsSalida(String tGCREARPERSONACOREpsSalida) {
        this.tGCREARPERSONACOREpsSalida = tGCREARPERSONACOREpsSalida;
    }

    @Override
    public Map<String, Object> buildOutArgs() {
        Map<String, Object> outArgs = new HashMap<>();
        outArgs.put("tGCREARPERSONACOREpsSalida", tGCREARPERSONACOREpsSalida);
        return outArgs;
    }
}
