package com.keralty.integraciones.patient.createupdatequestionnare.request;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class AnswerItem {
    private List<Answer> answer;

    @JsonProperty("answer")
    public List<Answer> getAnswer() { return answer; }
    @JsonProperty("answer")
    public void setAnswer(List<Answer> value) { this.answer = value; }
    
    @JsonIgnore
	public void anyadirRespuesta(String valorString) {
    	setAnswer(new ArrayList<Answer>());
    	Answer a = new Answer();
    	a.setValueString(valorString);
    	getAnswer().add(a);
	}
}
