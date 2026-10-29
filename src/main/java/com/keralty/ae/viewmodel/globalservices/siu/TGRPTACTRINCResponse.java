package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.viewmodel.ServiceResponse;
import java.util.HashMap;
import java.util.Map;

public class TGRPTACTRINCResponse extends ServiceResponse {

    @JsonProperty("respuesta")
    private String tGRPTACTRINCrespuesta;

    public TGRPTACTRINCResponse() {
        super();
    }

    @JsonIgnore
    public String getTGRPTACTRINCrespuesta() {
        return this.tGRPTACTRINCrespuesta;
    }

    public void setTGRPTACTRINCrespuesta(String tGRPTACTRINCrespuesta) {
        this.tGRPTACTRINCrespuesta = tGRPTACTRINCrespuesta;
    }

    @Override
    public Map<String, Object> buildOutArgs() {
        Map<String, Object> outArgs = new HashMap<>();
        outArgs.put("tGRPTACTRINCrespuesta", tGRPTACTRINCrespuesta);
        return outArgs;
    }
}
