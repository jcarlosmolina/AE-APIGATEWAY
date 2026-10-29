package com.keralty.integraciones.reactivacioncontratos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestEliminarSolicitudReactivacionContrato {

	private String codProducto;
	private String codPlan;
	private String numContrato;
	private String indActualizacion = "I";
	
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

	@JsonProperty("indActualizacion")
	public String getIndActualizacion() { return indActualizacion; }
	@JsonProperty("indActualizacion")
	public void setIndActualizacion(String indActualizacion) { this.indActualizacion = indActualizacion; }

	
}
