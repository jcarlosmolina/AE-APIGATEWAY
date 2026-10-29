package com.keralty.integraciones.reactivacioncontratos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestCrearSolicitudReactivacionContrato {

	private String codProducto;
	private String codPlan;
	private String numContrato;
	private int valorPagar;
	
	
	@JsonProperty("codProducto")
	public String getCodProducto() { return codProducto; }
	@JsonProperty("codProducto")
	public void setCodProducto(String codProducto) { this.codProducto = codProducto; }
	
	@JsonProperty("codPlan")
	public String getCodPlan() { return codPlan; }
	@JsonProperty("codPlan")
	public void setCodPlan(String codPlan) { this.codPlan = codPlan; }
	
	@JsonProperty("numContrato")
	public String getNumContrato() { return numContrato; }
	@JsonProperty("numContrato")
	public void setNumContrato(String numContrato) { this.numContrato = numContrato; }

	@JsonProperty("valorPagar")
	public int getValorPagar() { return valorPagar; }
	@JsonProperty("valorPagar")
	public void setValorPagar(int valorPagar) { this.valorPagar = valorPagar; }
	
	

}
