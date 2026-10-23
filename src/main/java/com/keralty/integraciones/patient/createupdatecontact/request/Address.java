package com.keralty.integraciones.patient.createupdatecontact.request;

import com.fasterxml.jackson.annotation.*;

public class Address {
    private String code;
    private String use;
    private String text;
    private CodeName city;
    private CodeName state;
    private CodeName country;

    @JsonProperty("code")
    public String getCode() { return code; }
    @JsonProperty("code")
    public void setCode(String value) { this.code = value; }

    @JsonProperty("use")
    public String getUse() { return use; }
    @JsonProperty("use")
    public void setUse(String value) { this.use = value; }

    @JsonProperty("text")
    public String getText() { return text; }
    @JsonProperty("text")
    public void setText(String value) { this.text = value; }

    @JsonProperty("city")
    public CodeName getCity() { return city; }
    @JsonProperty("city")
    public void setCity(CodeName value) { this.city = value; }
	
    @JsonProperty("state")
    public CodeName getState() { return state; }
    @JsonProperty("state")
	public void setState(CodeName state) { this.state = state; }
	
    @JsonProperty("country")
	public CodeName getCountry() { return country; }
    @JsonProperty("country")
	public void setCountry(CodeName country) { this.country = country; }
}
