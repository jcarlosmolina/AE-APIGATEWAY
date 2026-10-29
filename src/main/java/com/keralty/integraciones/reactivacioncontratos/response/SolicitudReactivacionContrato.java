package com.keralty.integraciones.reactivacioncontratos.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SolicitudReactivacionContrato {
    private String tipoIdenContratante;
    private String numIdenContratante;
    private String nombreContratante;
    private String codCausalExclusion;
    private String nomCausalExclusion;
    private String codRespuesta;
    private String desRespuesta;
    private String indActualizacion;
    private Long valorPagar;

    @JsonProperty("tipoIdenContratante")
    public String getTipoIdenContratante() { return tipoIdenContratante; }
    @JsonProperty("tipoIdenContratante")
    public void setTipoIdenContratante(String value) { this.tipoIdenContratante = value; }

    @JsonProperty("numIdenContratante")
    public String getNumIdenContratante() { return numIdenContratante; }
    @JsonProperty("numIdenContratante")
    public void setNumIdenContratante(String value) { this.numIdenContratante = value; }

    @JsonProperty("nombreContratante")
    public String getNombreContratante() { return nombreContratante; }
    @JsonProperty("nombreContratante")
    public void setNombreContratante(String value) { this.nombreContratante = value; }

    @JsonProperty("codCausalExclusion")
    public String getCodCausalExclusion() { return codCausalExclusion; }
    @JsonProperty("codCausalExclusion")
    public void setCodCausalExclusion(String value) { this.codCausalExclusion = value; }

    @JsonProperty("nomCausalExclusion")
    public String getNomCausalExclusion() { return nomCausalExclusion; }
    @JsonProperty("nomCausalExclusion")
    public void setNomCausalExclusion(String value) { this.nomCausalExclusion = value; }

    @JsonProperty("codRespuesta")
    public String getCodRespuesta() { return codRespuesta; }
    @JsonProperty("codRespuesta")
    public void setCodRespuesta(String value) { this.codRespuesta = value; }

    @JsonProperty("desRespuesta")
    public String getDESRespuesta() { return desRespuesta; }
    @JsonProperty("desRespuesta")
    public void setDESRespuesta(String value) { this.desRespuesta = value; }

    @JsonProperty("indActualizacion")
    public String getIndActualizacion() { return indActualizacion; }
    @JsonProperty("indActualizacion")
    public void setIndActualizacion(String value) { this.indActualizacion = value; }

    @JsonProperty("valorPagar")
	public Long getValorPagar() { return valorPagar; }
    @JsonProperty("valorPagar")
	public void setValorPagar(Long valorPagar) { this.valorPagar = valorPagar; }
}
