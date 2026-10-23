package com.keralty.integraciones.contractresponse.request;

import java.sql.Date;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Answer {
    private Boolean valueBoolean;
    private String valueString;
    private Date valueDate;

    @JsonProperty("valueBoolean")
    public Boolean getValueBoolean() { return valueBoolean; }
    @JsonProperty("valueBoolean")
    public void setValueBoolean(Boolean value) { this.valueBoolean = value; }

    @JsonProperty("valueString")
    public String getValueString() { return valueString; }
    @JsonProperty("valueString")
    public void setValueString(String value) { this.valueString = value; }

    @JsonProperty("valueDate")
    public Date getValueDate() { return valueDate; }
    @JsonProperty("valueDate")
    public void setValueDate(Date value) { this.valueDate = value; }
}
