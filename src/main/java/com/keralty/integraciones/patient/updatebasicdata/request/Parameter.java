package com.keralty.integraciones.patient.updatebasicdata.request;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class Parameter {
    private String name = "operation";
    private List<Part> part;

    @JsonProperty("name")
    public String getName() { return name; }
//    @JsonProperty("name")
//    public void setName(String value) { this.name = value; }

    @JsonProperty("part")
    public List<Part> getPart() { return part; }
    @JsonProperty("part")
    public void setPart(List<Part> value) { this.part = value; }

	public void addOperationName(String name) {
		
		if (getPart() == null) {
			setPart(new ArrayList<Part>());
		}
		
		// Añadimos los elementos comunes a todos los campos
		// type
		Part part = new Part();
		part.setName(NameEnum.TYPE);
		part.setValueCode("replace");
		getPart().add(part);
		// path
		part = new Part();
		part.setName(NameEnum.PATH);
		part.setValueString("Patient");
		getPart().add(part);
		
		// name, el particular
		part = new Part();
		part.setName(NameEnum.NAME);
		part.setValueString(name);
		getPart().add(part);
		
	}
}
