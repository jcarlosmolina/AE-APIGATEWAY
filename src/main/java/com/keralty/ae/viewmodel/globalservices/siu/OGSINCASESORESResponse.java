package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.viewmodel.ServiceResponse;
import java.util.HashMap;
import java.util.Map;

public class OGSINCASESORESResponse extends ServiceResponse {

    @JsonProperty("oamensaje")
    private String oGSINCASESORESoaMensaje;

    public OGSINCASESORESResponse() {
        super();
    }

    @JsonIgnore
    public String getOGSINCASESORESoaMensaje() {
        return this.oGSINCASESORESoaMensaje;
    }

    public void setOGSINCASESORESoaMensaje(String oGSINCASESORESoaMensaje) {
        this.oGSINCASESORESoaMensaje = oGSINCASESORESoaMensaje;
    }

    @Override
    public Map<String, Object> buildOutArgs() {
        Map<String, Object> outArgs = new HashMap<>();
        outArgs.put("oGSINCASESORESoaMensaje", oGSINCASESORESoaMensaje);
        return outArgs;
    }
}
