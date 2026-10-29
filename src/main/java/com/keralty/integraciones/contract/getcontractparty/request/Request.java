package com.keralty.integraciones.contract.getcontractparty.request;

import com.fasterxml.jackson.annotation.*;

public class Request {
    private String method = "GET";
    private String url;

    @JsonProperty("method")
    public String getMethod() { return method; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }
}
