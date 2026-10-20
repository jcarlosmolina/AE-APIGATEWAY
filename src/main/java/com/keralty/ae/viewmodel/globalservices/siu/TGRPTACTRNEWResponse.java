package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.viewmodel.ServiceResponse;
import java.util.HashMap;
import java.util.Map;

public class TGRPTACTRNEWResponse extends ServiceResponse {

    @JsonProperty("respuesta")
    private String tGRPTACTRNEWrespuesta;

    public TGRPTACTRNEWResponse() {
        super();
    }

    @JsonIgnore
    public String getTGRPTACTRNEWrespuesta() {
        return this.tGRPTACTRNEWrespuesta;
    }

    public void setTGRPTACTRNEWrespuesta(String tGRPTACTRNEWrespuesta) {
        this.tGRPTACTRNEWrespuesta = tGRPTACTRNEWrespuesta;
    }

    @Override
    public Map<String, Object> buildOutArgs() {
        Map<String, Object> outArgs = new HashMap<>();
        outArgs.put("tGRPTACTRNEWrespuesta", tGRPTACTRNEWrespuesta);
        return outArgs;
    }
}
