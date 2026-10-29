package com.keralty.ae.viewmodel.funcionario.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSFuncionarioDReportes {

    @JsonProperty("usuarioldap")
    private String dSFuncionarioDReportesUsuarioLDAP;

    @JsonProperty("primernombre")
    private String dSFuncionarioDReportesPrimerNombre;

    @JsonProperty("segundonombre")
    private String dSFuncionarioDReportesSegundoNombre;

    @JsonProperty("primerapellido")
    private String dSFuncionarioDReportesPrimerApellido;

    @JsonProperty("segundoapellido")
    private String dSFuncionarioDReportesSegundoApellido;

    public DSFuncionarioDReportes() {
    
    }

    @JsonIgnore
    public String getDSFuncionarioDReportesUsuarioLDAP() {
        return this.dSFuncionarioDReportesUsuarioLDAP;
    }
    
    public void setDSFuncionarioDReportesUsuarioLDAP(String dSFuncionarioDReportesUsuarioLDAP) {
        this.dSFuncionarioDReportesUsuarioLDAP = dSFuncionarioDReportesUsuarioLDAP;
    }

    @JsonIgnore
    public String getDSFuncionarioDReportesPrimerNombre() {
        return this.dSFuncionarioDReportesPrimerNombre;
    }
    
    public void setDSFuncionarioDReportesPrimerNombre(String dSFuncionarioDReportesPrimerNombre) {
        this.dSFuncionarioDReportesPrimerNombre = dSFuncionarioDReportesPrimerNombre;
    }

    @JsonIgnore
    public String getDSFuncionarioDReportesSegundoNombre() {
        return this.dSFuncionarioDReportesSegundoNombre;
    }
    
    public void setDSFuncionarioDReportesSegundoNombre(String dSFuncionarioDReportesSegundoNombre) {
        this.dSFuncionarioDReportesSegundoNombre = dSFuncionarioDReportesSegundoNombre;
    }

    @JsonIgnore
    public String getDSFuncionarioDReportesPrimerApellido() {
        return this.dSFuncionarioDReportesPrimerApellido;
    }
    
    public void setDSFuncionarioDReportesPrimerApellido(String dSFuncionarioDReportesPrimerApellido) {
        this.dSFuncionarioDReportesPrimerApellido = dSFuncionarioDReportesPrimerApellido;
    }

    @JsonIgnore
    public String getDSFuncionarioDReportesSegundoApellido() {
        return this.dSFuncionarioDReportesSegundoApellido;
    }
    
    public void setDSFuncionarioDReportesSegundoApellido(String dSFuncionarioDReportesSegundoApellido) {
        this.dSFuncionarioDReportesSegundoApellido = dSFuncionarioDReportesSegundoApellido;
    }
}
