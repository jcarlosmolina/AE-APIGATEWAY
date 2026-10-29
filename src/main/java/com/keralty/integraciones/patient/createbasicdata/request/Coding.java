package com.keralty.integraciones.patient.createbasicdata.request;

import com.fasterxml.jackson.annotation.*;

public class Coding {
    private String system;
    private String code;

    @JsonProperty("system")
    public String getSystem() { return system; }
    @JsonProperty("system")
    public void setSystem(String value) { this.system = value; }

    @JsonProperty("code")
    public String getCode() { return code; }
    @JsonProperty("code")
    public void setCode(String value) { this.code = value; }
}
