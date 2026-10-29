package com.keralty.integraciones.contractresponse.response;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class ContractResponseResponse {
    private String status = "RECIBIDO";
    private List<Error> error = new ArrayList<Error>();

    @JsonProperty("status")
    public String getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(String value) { this.status = value; }

    @JsonProperty("error")
    public List<Error> getError() { return error; }
    @JsonProperty("error")
    public void setError(List<Error> value) { this.error = value; }

    
	public void addError(String code, String texto) {
		if (getError() == null) {
			setError(new ArrayList<Error>());
		}
		this.getError().add(new Error(code, texto));
		this.setStatus("ERROR");
	}
	
	public String formarTextoErrores() {
		
		String textoErrores = "";
		
		if (getError() != null) {
			for (Error err: getError()) {
				textoErrores += err.getValue() + "\n";
			}
		}
		
		return textoErrores;
	}	
}
