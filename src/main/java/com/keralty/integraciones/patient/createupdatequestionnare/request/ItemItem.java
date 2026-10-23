package com.keralty.integraciones.patient.createupdatequestionnare.request;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ItemItem {
    private String linkID;
    private List<ItemAnswer> answer;

    @JsonProperty("linkId")
    public String getLinkID() { return linkID; }
    @JsonProperty("linkId")
    public void setLinkID(String value) { this.linkID = value; }

    @JsonProperty("answer")
    public List<ItemAnswer> getAnswer() { return answer; }
    @JsonProperty("answer")
    public void setAnswer(List<ItemAnswer> value) { this.answer = value; }
    
    @JsonIgnore
	public void anyadirRespuesta(String numPregunta, Boolean valorBool, String valorString) {
    	setLinkID(numPregunta);
    	setAnswer(new ArrayList<ItemAnswer>());
    	
    	ItemAnswer anwser = new ItemAnswer();
    	anwser.anyadirRespuesta(valorBool, valorString);
    	getAnswer().add(anwser);
	}
}
