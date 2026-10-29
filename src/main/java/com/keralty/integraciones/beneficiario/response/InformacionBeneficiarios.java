package com.keralty.integraciones.beneficiario.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InformacionBeneficiarios {
    private String tipoIdentificacionBeneficiario;
    private String numIdentificacionBeneficiario;
    private String nombreBeneficiario;
    private String numUsuario;
    private String codigoTipoUsuario;
    private String tipoUsuario;
    private String parentesco;
    private String fechaInicioVigencia;
    private String fechaFinVigencia;
    private String codigoEstadoBeneficiario;
    private String estadoBeneficiario;
    private String causaExclusion;
    private Boolean indicadorUsuarioCompartido;
    private String codigoLegalEPSActual;
    private String codigoLegalMPAnterior;
    private Boolean indicadorContinuidad;
    private String fechaAntiguedadRealOSI;
    private String fechaAntiguedadBeneficiario;
    private String valoracionMedica;
    private Boolean indicadorDerechoMaternidad;
    private Boolean indicadorBebeGestacion;
    private String codigoUsuarioBancoRepublica;
    private Long valorCuotaInscripcion;
    private Boolean excepcionTarifaMayor;
    private Boolean grupoBasicoFamiliar;

    @JsonProperty("tipoIdentificacionBeneficiario")
    public String getTipoIdentificacionBeneficiario() { return tipoIdentificacionBeneficiario; }
    @JsonProperty("tipoIdentificacionBeneficiario")
    public void setTipoIdentificacionBeneficiario(String value) { this.tipoIdentificacionBeneficiario = value; }

    @JsonProperty("numIdentificacionBeneficiario")
    public String getNumIdentificacionBeneficiario() { return numIdentificacionBeneficiario; }
    @JsonProperty("numIdentificacionBeneficiario")
    public void setNumIdentificacionBeneficiario(String value) { this.numIdentificacionBeneficiario = value; }

    @JsonProperty("nombreBeneficiario")
    public String getNombreBeneficiario() { return nombreBeneficiario; }
    @JsonProperty("nombreBeneficiario")
    public void setNombreBeneficiario(String value) { this.nombreBeneficiario = value; }

    @JsonProperty("numUsuario")
    public String getNumUsuario() { return numUsuario; }
    @JsonProperty("numUsuario")
    public void setNumUsuario(String value) { this.numUsuario = value; }

    @JsonProperty("codigoTipoUsuario")
    public String getCodigoTipoUsuario() { return codigoTipoUsuario; }
    @JsonProperty("codigoTipoUsuario")
    public void setCodigoTipoUsuario(String value) { this.codigoTipoUsuario = value; }

    @JsonProperty("tipoUsuario")
    public String getTipoUsuario() { return tipoUsuario; }
    @JsonProperty("tipoUsuario")
    public void setTipoUsuario(String value) { this.tipoUsuario = value; }

    @JsonProperty("parentesco")
    public String getParentesco() { return parentesco; }
    @JsonProperty("parentesco")
    public void setParentesco(String value) { this.parentesco = value; }

    @JsonProperty("fechaInicioVigencia")
    public String getFechaInicioVigencia() { return fechaInicioVigencia; }
    @JsonProperty("fechaInicioVigencia")
    public void setFechaInicioVigencia(String value) { this.fechaInicioVigencia = value; }

    @JsonProperty("fechaFinVigencia")
    public String getFechaFinVigencia() { return fechaFinVigencia; }
    @JsonProperty("fechaFinVigencia")
    public void setFechaFinVigencia(String value) { this.fechaFinVigencia = value; }

    @JsonProperty("codigoEstadoBeneficiario")
    public String getCodigoEstadoBeneficiario() { return codigoEstadoBeneficiario; }
    @JsonProperty("codigoEstadoBeneficiario")
    public void setCodigoEstadoBeneficiario(String value) { this.codigoEstadoBeneficiario = value; }

    @JsonProperty("estadoBeneficiario")
    public String getEstadoBeneficiario() { return estadoBeneficiario; }
    @JsonProperty("estadoBeneficiario")
    public void setEstadoBeneficiario(String value) { this.estadoBeneficiario = value; }

    @JsonProperty("causaExclusion")
    public String getCausaExclusion() { return causaExclusion; }
    @JsonProperty("causaExclusion")
    public void setCausaExclusion(String value) { this.causaExclusion = value; }

    @JsonProperty("indicadorUsuarioCompartido")
    public Boolean getIndicadorUsuarioCompartido() { return indicadorUsuarioCompartido; }
    @JsonProperty("indicadorUsuarioCompartido")
    public void setIndicadorUsuarioCompartido(Boolean value) { this.indicadorUsuarioCompartido = value; }

    @JsonProperty("codigoLegalEPSActual")
    public String getCodigoLegalEPSActual() { return codigoLegalEPSActual; }
    @JsonProperty("codigoLegalEPSActual")
    public void setCodigoLegalEPSActual(String value) { this.codigoLegalEPSActual = value; }

    @JsonProperty("codigoLegalMPAnterior")
    public String getCodigoLegalMPAnterior() { return codigoLegalMPAnterior; }
    @JsonProperty("codigoLegalMPAnterior")
    public void setCodigoLegalMPAnterior(String value) { this.codigoLegalMPAnterior = value; }

    @JsonProperty("indicadorContinuidad")
    public Boolean getIndicadorContinuidad() { return indicadorContinuidad; }
    @JsonProperty("indicadorContinuidad")
    public void setIndicadorContinuidad(Boolean value) { this.indicadorContinuidad = value; }

    @JsonProperty("fechaAntiguedadRealOsi")
    public String getFechaAntiguedadRealOSI() { return fechaAntiguedadRealOSI; }
    @JsonProperty("fechaAntiguedadRealOsi")
    public void setFechaAntiguedadRealOSI(String value) { this.fechaAntiguedadRealOSI = value; }

    @JsonProperty("fechaAntiguedadBeneficiario")
    public String getFechaAntiguedadBeneficiario() { return fechaAntiguedadBeneficiario; }
    @JsonProperty("fechaAntiguedadBeneficiario")
    public void setFechaAntiguedadBeneficiario(String value) { this.fechaAntiguedadBeneficiario = value; }

    @JsonProperty("valoracionMedica")
    public String getValoracionMedica() { return valoracionMedica; }
    @JsonProperty("valoracionMedica")
    public void setValoracionMedica(String value) { this.valoracionMedica = value; }

    @JsonProperty("indicadorDerechoMaternidad")
    public Boolean getIndicadorDerechoMaternidad() { return indicadorDerechoMaternidad; }
    @JsonProperty("indicadorDerechoMaternidad")
    public void setIndicadorDerechoMaternidad(Boolean value) { this.indicadorDerechoMaternidad = value; }

    @JsonProperty("indicadorBebeGestacion")
    public Boolean getIndicadorBebeGestacion() { return indicadorBebeGestacion; }
    @JsonProperty("indicadorBebeGestacion")
    public void setIndicadorBebeGestacion(Boolean value) { this.indicadorBebeGestacion = value; }

    @JsonProperty("codigoUsuarioBancoRepublica")
    public String getCodigoUsuarioBancoRepublica() { return codigoUsuarioBancoRepublica; }
    @JsonProperty("codigoUsuarioBancoRepublica")
    public void setCodigoUsuarioBancoRepublica(String value) { this.codigoUsuarioBancoRepublica = value; }

    @JsonProperty("valorCuotaInscripcion")
    public Long getValorCuotaInscripcion() { return valorCuotaInscripcion; }
    @JsonProperty("valorCuotaInscripcion")
    public void setValorCuotaInscripcion(Long value) { this.valorCuotaInscripcion = value; }

    @JsonProperty("excepcionTarifaMayor")
    public Boolean getExcepcionTarifaMayor() { return excepcionTarifaMayor; }
    @JsonProperty("excepcionTarifaMayor")
    public void setExcepcionTarifaMayor(Boolean value) { this.excepcionTarifaMayor = value; }

    @JsonProperty("grupoBasicoFamiliar")
    public Boolean getGrupoBasicoFamiliar() { return grupoBasicoFamiliar; }
    @JsonProperty("grupoBasicoFamiliar")
    public void setGrupoBasicoFamiliar(Boolean value) { this.grupoBasicoFamiliar = value; }
}
