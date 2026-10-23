package com.keralty.integraciones.reactivacioncontratos.consulta;

import com.fasterxml.jackson.annotation.*;

public class RequestConsultaContrato {
    private String codProducto;
    private String codPlan;
    private String numContrato;
    
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
}
