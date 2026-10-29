package com.keralty.integraciones.patient.createupdatecontact.request;

import com.fasterxml.jackson.annotation.*;

public class CodeName {
    private String code;
    private String name;

    @JsonProperty("code")
    public String getCode() { return code; }
    @JsonProperty("code")
    public void setCode(String value) { this.code = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }
}
