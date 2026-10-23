package com.keralty.integraciones.beneficiario.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsultarBeneficiarioResponse {
    private ErrorDetalle errorDetalle;
    private List<Contrato> contrato;

    @JsonProperty("errorDetalle")
    public ErrorDetalle getErrorDetalle() { return errorDetalle; }
    @JsonProperty("errorDetalle")
    public void setErrorDetalle(ErrorDetalle value) { this.errorDetalle = value; }

    @JsonProperty("contrato")
    public List<Contrato> getContrato() { return contrato; }
    @JsonProperty("contrato")
    public void setContrato(List<Contrato> value) { this.contrato = value; }

    @JsonIgnore
   public boolean isExito() {
   	 if (getErrorDetalle() != null && getErrorDetalle().getErrorCode() != null &&
   			 "OK".equalsIgnoreCase(getErrorDetalle().getErrorCode())) {
   		 return true;
   	 }
   	 return false;
   }
    
    @JsonIgnore
    public void setError(String textoError) {
    	 if (getErrorDetalle() == null) {
    		 setErrorDetalle(new ErrorDetalle());
    	 }
    	 getErrorDetalle().setErrorCode("NoOK");
    	 getErrorDetalle().setErrorDesc(textoError);
    }

    @JsonIgnore
    public String getMensajeError() {
    	
    	if (getErrorDetalle() != null && 
    			getErrorDetalle().getErrorDesc() != null && !getErrorDetalle().getErrorDesc().isEmpty()) {
    		return getErrorDetalle().getErrorDesc();
    	}
    	return "";
	}
}
