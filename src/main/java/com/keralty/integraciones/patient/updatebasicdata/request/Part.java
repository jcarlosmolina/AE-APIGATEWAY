package com.keralty.integraciones.patient.updatebasicdata.request;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Part {
    private NameEnum name;
    private String valueCode;
    private String valueString;
    private List<ValueIdentifier> valueIdentifier;
    private List<ValueHumanName> valueHumanName;
    private List<ValueCodeableConcept> valueCodeableConcept;
    private String valueDate;
    private List<ValueAddress> valueAddress;
    private Boolean valueBool;

    @JsonProperty("name")
    public NameEnum getName() { return name; }
    @JsonProperty("name")
    public void setName(NameEnum value) { this.name = value; }

    @JsonProperty("valueCode")
    public String getValueCode() { return valueCode; }
    @JsonProperty("valueCode")
    public void setValueCode(String value) { this.valueCode = value; }

    @JsonProperty("valueString")
    public String getValueString() { return valueString; }
    @JsonProperty("valueString")
    public void setValueString(String value) { this.valueString = value; }

    @JsonProperty("valueIdentifier")
    public List<ValueIdentifier> getValueIdentifier() { return valueIdentifier; }
    @JsonProperty("valueIdentifier")
    public void setValueIdentifier(List<ValueIdentifier> value) { this.valueIdentifier = value; }

    @JsonProperty("valueHumanName")
    public List<ValueHumanName> getValueHumanName() { return valueHumanName; }
    @JsonProperty("valueHumanName")
    public void setValueHumanName(List<ValueHumanName> value) { this.valueHumanName = value; }

    @JsonProperty("valueCodeableConcept")
    public List<ValueCodeableConcept> getValueCodeableConcept() { return valueCodeableConcept; }
    @JsonProperty("valueCodeableConcept")
    public void setValueCodeableConcept(List<ValueCodeableConcept> value) { this.valueCodeableConcept = value; }

    @JsonProperty("valueDate")
    public String getValueDate() { return valueDate; }
    @JsonProperty("valueDate")
    public void setValueDate(String value) { this.valueDate = value; }

    @JsonProperty("valueAddress")
    public List<ValueAddress> getValueAddress() { return valueAddress; }
    @JsonProperty("valueAddress")
    public void setValueAddress(List<ValueAddress> value) { this.valueAddress = value; }
    
    
    @JsonProperty("valueBool")
    public Boolean isValueBool() { return valueBool; }
    @JsonProperty("valueBool")
	public void setValueBool(Boolean valueBool) { this.valueBool = valueBool; }
}
