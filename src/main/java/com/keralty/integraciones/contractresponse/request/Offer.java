package com.keralty.integraciones.contractresponse.request;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Offer {
    private List<Answer> answer;
    private String text;

    @JsonProperty("answer")
    public List<Answer> getAnswer() { return answer; }
    @JsonProperty("answer")
    public void setAnswer(List<Answer> value) { this.answer = value; }

    @JsonProperty("text")
    public String getText() { return text; }
    @JsonProperty("text")
    public void setText(String value) { this.text = value; }
}
