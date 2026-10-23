package com.keralty.integraciones.patient.createupdatequestionnare.request;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class ItemAnswer {
    private Boolean valueBoolean;
    private List<AnswerItem> item;

    @JsonProperty("valueBoolean")
    public Boolean getValueBoolean() { return valueBoolean; }
    @JsonProperty("valueBoolean")
    public void setValueBoolean(Boolean value) { this.valueBoolean = value; }

    @JsonProperty("item")
    public List<AnswerItem> getItem() { return item; }
    @JsonProperty("item")
    public void setItem(List<AnswerItem> value) { this.item = value; }
    
    @JsonIgnore
	public void anyadirRespuesta(Boolean valorBool, String valorString ) {
    	setValueBoolean(valorBool);
    	setItem(new ArrayList<AnswerItem>());
    	
    	AnswerItem item = new AnswerItem();
    	item.anyadirRespuesta(valorString );
    	getItem().add(item);
	}
}
