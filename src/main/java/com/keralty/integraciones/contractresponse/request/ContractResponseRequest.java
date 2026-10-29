package com.keralty.integraciones.contractresponse.request;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContractResponseRequest {
    private RequestContract contract;
    private List<Coverage> coverage;

    @JsonProperty("contract")
    public RequestContract getContract() { return contract; }
    @JsonProperty("contract")
    public void setContract(RequestContract value) { this.contract = value; }

    @JsonProperty("coverage")
    public List<Coverage> getCoverage() { return coverage; }
    @JsonProperty("coverage")
    public void setCoverage(List<Coverage> value) { this.coverage = value; }

    @JsonIgnore
    public String getNumeroSolicitud() {
    	if (getContract() != null && getContract().getIdentifier() != null) {
    		return getValueEnIdentifierPorTipo(getContract().getIdentifier(), "NUM_SOLICITUD");
    	}
		return null;
	}
    
    @JsonIgnore
    private String getValueEnIdentifierPorTipo(List<Identifier> lista, String tipo) {
    	
    	if (lista != null && tipo != null) {
    		for (Identifier ide : lista) {
    			if (tipo.equalsIgnoreCase(ide.getType())) {
    				return ide.getValue();
    			}
    		}
    	}
    	
    	return null;
    }
	
    @JsonIgnore
    public Boolean getResultadoValidacion() {
		if (getContract() != null && getContract().getAnswer() != null) {
			if ("FALLIDO".equals(getContract().getAnswer())) {
				return Boolean.FALSE;
			} else {
				return Boolean.TRUE;
			}
		}
		
		return null;
	}
    
    @JsonIgnore
	public boolean getRequiereExamenMedico() {
		if (getCoverage() != null) {
			for (Coverage coverage : getCoverage()) {
				if (coverage.getContract() != null) {
					for (ContractElement contractEle : coverage.getContract()) {
//						if (contractEle.getBeneficiaryRemarks() != null) {
//							for (Incident incident : contractEle.getBeneficiaryRemarks()) {
//								incident.getName()
//							}
//						}
						if (contractEle.getTerm() != null) {
							for (Term term : contractEle.getTerm()) {
								if (term.getOffer() != null && "EXAMEN_MEDICO".equalsIgnoreCase(term.getOffer().getText())) {
									if (term.getOffer().getAnswer() != null) {
										for (Answer anw : term.getOffer().getAnswer()) {
											if (anw.getValueBoolean() != null && anw.getValueBoolean()) {
												return true;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return false;
	}

    @JsonIgnore
	public boolean getTienePreexistencias() {
		if (getCoverage() != null) {
			for (Coverage coverage : getCoverage()) {
				if (coverage.getContract() != null) {
					for (ContractElement contractEle : coverage.getContract()) {
						if (contractEle.getTerm() != null) {
							for (Term term : contractEle.getTerm()) {
								if (term.getOffer() != null && "PREEXISTENCIAS".equalsIgnoreCase(term.getOffer().getText())) {
									if (term.getOffer().getAnswer() != null) {
										for (Answer anw : term.getOffer().getAnswer()) {
											if (anw.getValueBoolean() != null && anw.getValueBoolean()) {
												return true;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return false;
	}

    /**
     * Devuelve la lista de errores que contiene la Request
     * @return
     */
    @JsonIgnore
	public List<String> getListaErrores() {
    	
    	List<String> lista = new ArrayList<String>();
    	
    	if (getContract() != null && getContract().getIncidents() != null) {
    		for (Incident err : getContract().getIncidents()) {
				if (err.getName() != null) {
					lista.add(err.getName());
				}
			}    		
    	}
    	
		if (getCoverage() != null) {
			for (Coverage coverage : getCoverage()) {
				if (coverage.getContract() != null) {
					for (ContractElement contractEle : coverage.getContract()) {
						if (contractEle.getBeneficiaryRemarks() != null) {
							for (Incident incident : contractEle.getBeneficiaryRemarks()) {
								if (incident.getName() != null) {
									lista.add(incident.getName());
								}
							}
						}
					}
				}
			}
		}
    	
		return lista;
	}
    
    @JsonIgnore
	public String formarTextoErrores() {
		
		String textoErrores = "";
		
		if (getListaErrores() != null) {
			for (String err: getListaErrores()) {
				textoErrores += err + "\n";
			}
		}
		
		return textoErrores;
	}    
}
