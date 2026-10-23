package com.keralty.integraciones.patient;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CrearActualizarPersonaRequest {
    private String numSolicitud;
    private String codigo;
    private String tipoIdentificacion;
    private String numeroIdentificacion;
    private Date fechaNacimiento;
    private String genero;
    private String estadoCivil;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String codigoMunicioNacimiento;
    private String codigoDepartamentoNacimiento;
    private boolean foreing = false;
    
    private String correoElectronico;
    
    private String direccionResidencia;
    private String municipioResidencia;
    private String departamentoResidencia;
    private String paisResidencia;

    private String direccionCorrespondencia;
    private String municipioCorrespondencia;
    private String departamentoCorrespondencia;
    private String paisCorrespondencia;
    
    private String telefonoFijoResidencia;
    private String telefonoCelularResidencia;

    private String telefonoFijoCorrespondencia;
    private String telefonoCelularCorrespondencia;

    @JsonProperty("numSolicitud")
    public String getNumSolicitud() { return numSolicitud; }
    @JsonProperty("numSolicitud")
    public void setNumSolicitud(String value) { this.numSolicitud = value; }
       
	@JsonProperty("codigo")
    public String getCodigo() { return codigo; }
	@JsonProperty("codigo")
	public void setCodigo(String codigo) { this.codigo = codigo; }
	
	@JsonProperty("tipoIdentificacion")
    public String getTipoIdentificacion() { return tipoIdentificacion; }
    @JsonProperty("tipoIdentificacion")
    public void setTipoIdentificacion(String value) { this.tipoIdentificacion = value; }

    @JsonProperty("numeroIdentificacion")
    public String getNumeroIdentificacion() { return numeroIdentificacion; }
    @JsonProperty("numeroIdentificacion")
    public void setNumeroIdentificacion(String value) { this.numeroIdentificacion = value; }

    @JsonProperty("fechaNacimiento")
    public Date getFechaNacimiento() { return fechaNacimiento; }
    @JsonProperty("fechaNacimiento")
    public void setFechaNacimiento(Date value) { this.fechaNacimiento = value; }

    @JsonProperty("genero")
    public String getGenero() { return genero; }
    @JsonProperty("genero")
    public void setGenero(String value) { this.genero = value; }

    @JsonProperty("estadoCivil")
    public String getEstadoCivil() { return estadoCivil; }
    @JsonProperty("estadoCivil")
    public void setEstadoCivil(String value) { this.estadoCivil = value; }

    @JsonProperty("primerNombre")
    public String getPrimerNombre() { return primerNombre; }
    @JsonProperty("primerNombre")
    public void setPrimerNombre(String value) { this.primerNombre = value; }

    @JsonProperty("segundoNombre")
    public String getSegundoNombre() { return segundoNombre; }
    @JsonProperty("segundoNombre")
    public void setSegundoNombre(String value) { this.segundoNombre = value; }

    @JsonProperty("primerApellido")
    public String getPrimerApellido() { return primerApellido; }
    @JsonProperty("primerApellido")
    public void setPrimerApellido(String value) { this.primerApellido = value; }

    @JsonProperty("segundoApellido")
    public String getSegundoApellido() { return segundoApellido; }
    @JsonProperty("segundoApellido")
    public void setSegundoApellido(String value) { this.segundoApellido = value; }    

    @JsonProperty("codigoMunicioNacimiento")
    public String getCodigoMunicioNacimiento() { return codigoMunicioNacimiento; }
    @JsonProperty("codigoMunicioNacimiento")
    public void setCodigoMunicioNacimiento(String value) { this.codigoMunicioNacimiento = value; }
       
    @JsonProperty("codigoDepartamentoNacimiento")
    public String getCodigoDepartamentoNacimiento() { return codigoDepartamentoNacimiento; }
    @JsonProperty("codigoDepartamentoNacimiento")
	public void setCodigoDepartamentoNacimiento(String codigoDepartamentoNacimiento) { this.codigoDepartamentoNacimiento = codigoDepartamentoNacimiento; }
	
	@JsonProperty("foreing")
    public boolean isForeing() { return foreing; }
    @JsonProperty("foreing")
	public void setForeing(boolean foreing) { this.foreing = foreing; }

    @JsonProperty("correoElectronico")
    public String getCorreoElectronico() { return correoElectronico; }
    @JsonProperty("correoElectronico")
	public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }
	
    @JsonProperty("direccionResidencia")
	public String getDireccionResidencia() { return direccionResidencia; }
    @JsonProperty("direccionResidencia")
	public void setDireccionResidencia(String direccionResidencia) { this.direccionResidencia = direccionResidencia; }
	
    @JsonProperty("municipioResidencia")
	public String getMunicipioResidencia() { return municipioResidencia; }
    @JsonProperty("municipioResidencia")
	public void setMunicipioResidencia(String municipioResidencia) { this.municipioResidencia = municipioResidencia; }
	
    @JsonProperty("departamentoResidencia")
	public String getDepartamentoResidencia() { return departamentoResidencia; }
    @JsonProperty("departamentoResidencia")
	public void setDepartamentoResidencia(String departamentoResidencia) { this.departamentoResidencia = departamentoResidencia; }
	
    @JsonProperty("paisResidencia")
	public String getPaisResidencia() { return paisResidencia; }
    @JsonProperty("paisResidencia")
	public void setPaisResidencia(String paisResidencia) { this.paisResidencia = paisResidencia; }
	
    @JsonProperty("direccionCorrespondencia")
	public String getDireccionCorrespondencia() { return direccionCorrespondencia; }
    @JsonProperty("direccionCorrespondencia")
	public void setDireccionCorrespondencia(String direccionCorrespondencia) { this.direccionCorrespondencia = direccionCorrespondencia; }
	
    @JsonProperty("municipioCorrespondencia")
	public String getMunicipioCorrespondencia() { return municipioCorrespondencia; }
    @JsonProperty("municipioCorrespondencia")
	public void setMunicipioCorrespondencia(String municipioCorrespondencia) { this.municipioCorrespondencia = municipioCorrespondencia; }

    @JsonProperty("departamentoCorrespondencia")
	public String getDepartamentoCorrespondencia() { return departamentoCorrespondencia; }
    @JsonProperty("departamentoCorrespondencia")
	public void setDepartamentoCorrespondencia(String departamentoCorrespondencia) { this.departamentoCorrespondencia = departamentoCorrespondencia; }
	
    @JsonProperty("paisCorrespondencia")
	public String getPaisCorrespondencia() { return paisCorrespondencia; }
    @JsonProperty("paisCorrespondencia")
	public void setPaisCorrespondencia(String paisCorrespondencia) { this.paisCorrespondencia = paisCorrespondencia; }

    @JsonProperty("telefonoFijoResidencia")
    public String getTelefonoFijoResidencia() { return telefonoFijoResidencia; }
    @JsonProperty("telefonoFijoResidencia")
	public void setTelefonoFijoResidencia(String telefonoFijoResidencia) { this.telefonoFijoResidencia = telefonoFijoResidencia; }

    @JsonProperty("telefonoCelularResidencia")
    public String getTelefonoCelularResidencia() { return telefonoCelularResidencia; }
    @JsonProperty("telefonoCelularResidencia")
	public void setTelefonoCelularResidencia(String telefonoCelularResidencia) { this.telefonoCelularResidencia = telefonoCelularResidencia; }

    @JsonProperty("telefonoFijoCorrespondencia")
    public String getTelefonoFijoCorrespondencia() { return telefonoFijoCorrespondencia; }
    @JsonProperty("telefonoFijoCorrespondencia")
	public void setTelefonoFijoCorrespondencia(String telefonoFijoCorrespondencia) { this.telefonoFijoCorrespondencia = telefonoFijoCorrespondencia; }

    @JsonProperty("telefonoCelularCorrespondencia")
    public String getTelefonoCelularCorrespondencia() { return telefonoCelularCorrespondencia; }
    @JsonProperty("telefonoCelularCorrespondencia")
	public void setTelefonoCelularCorrespondencia(String telefonoCelularCorrespondencia) { this.telefonoCelularCorrespondencia = telefonoCelularCorrespondencia; }
}
