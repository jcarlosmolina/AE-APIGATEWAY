package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.viewmodel.ServiceResponse;
import java.util.HashMap;
import java.util.Map;

public class TGINCLUSIONCONTRATOCOREResponse extends ServiceResponse {

    @JsonProperty("pserror")
    private Boolean tGINCLUSIONCONTRATOCOREpsError;

    public TGINCLUSIONCONTRATOCOREResponse() {
        super();
    }

    @JsonIgnore
    public Boolean getTGINCLUSIONCONTRATOCOREpsError() {
        return this.tGINCLUSIONCONTRATOCOREpsError;
    }

    public void setTGINCLUSIONCONTRATOCOREpsError(Boolean tGINCLUSIONCONTRATOCOREpsError) {
        this.tGINCLUSIONCONTRATOCOREpsError = tGINCLUSIONCONTRATOCOREpsError;
    }

    @Override
    public Map<String, Object> buildOutArgs() {
        Map<String, Object> outArgs = new HashMap<>();
        outArgs.put("tGINCLUSIONCONTRATOCOREpsError", tGINCLUSIONCONTRATOCOREpsError);
        return outArgs;
    }
}
