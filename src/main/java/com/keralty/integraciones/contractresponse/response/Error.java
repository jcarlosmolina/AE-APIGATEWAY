package com.keralty.integraciones.contractresponse.response;

import com.fasterxml.jackson.annotation.*;

public class Error {
    private String code;
    private String value;

    public Error(String code, String value) {
    	this.code = code;
    	this.value = value;
	}
    
	@JsonProperty("code")
    public String getCode() { return code; }
    @JsonProperty("code")
    public void setCode(String value) { this.code = value; }

    @JsonProperty("value")
    public String getValue() { return value; }
    @JsonProperty("value")
    public void setValue(String value) { this.value = value; }
}
