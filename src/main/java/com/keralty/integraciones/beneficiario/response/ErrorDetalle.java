package com.keralty.integraciones.beneficiario.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorDetalle {
    private String errorCode;
    private String errorDesc;

    @JsonProperty("errorCode")
    public String getErrorCode() { return errorCode; }
    @JsonProperty("errorCode")
    public void setErrorCode(String value) { this.errorCode = value; }

    @JsonProperty("errorDesc")
    public String getErrorDesc() { return errorDesc; }
    @JsonProperty("errorDesc")
    public void setErrorDesc(String value) { this.errorDesc = value; }
}
