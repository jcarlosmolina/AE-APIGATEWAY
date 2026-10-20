package com.keralty.ae.viewmodel.institucionmatneo.ds;

import java.sql.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSInstitucionMatNeo {

    @JsonProperty("tarifa_productot_descripcion")
    private String dSInstitucionMatNeoTarifaDotProductoTDotDescripcion;

    @JsonProperty("tarifa_codigo")
    private String dSInstitucionMatNeoTarifaDotCodigo;

    @JsonProperty("codigo")
    private String dSInstitucionMatNeoCodigo;

    @JsonProperty("tipoidentificacion_nombrecorto")
    private String dSInstitucionMatNeoTipoIdentificacionDotNombreCorto;

    @JsonProperty("numidentificacion")
    private String dSInstitucionMatNeoNumIdentificacion;

    @JsonProperty("nombre")
    private String dSInstitucionMatNeoNombre;

    @JsonProperty("paramaternidad")
    private Boolean dSInstitucionMatNeoParaMaternidad;

    @JsonProperty("paraneonatal")
    private Boolean dSInstitucionMatNeoParaNeonatal;

    @JsonProperty("fechainicial")
    private Date dSInstitucionMatNeoFechaInicial;

    @JsonProperty("fechafinal")
    private Date dSInstitucionMatNeoFechaFinal;

    public DSInstitucionMatNeo() {
    
    }

    @JsonIgnore
    public String getDSInstitucionMatNeoTarifaDotProductoTDotDescripcion() {
        return this.dSInstitucionMatNeoTarifaDotProductoTDotDescripcion;
    }
    
    public void setDSInstitucionMatNeoTarifaDotProductoTDotDescripcion(String dSInstitucionMatNeoTarifaDotProductoTDotDescripcion) {
        this.dSInstitucionMatNeoTarifaDotProductoTDotDescripcion = dSInstitucionMatNeoTarifaDotProductoTDotDescripcion;
    }

    @JsonIgnore
    public String getDSInstitucionMatNeoTarifaDotCodigo() {
        return this.dSInstitucionMatNeoTarifaDotCodigo;
    }
    
    public void setDSInstitucionMatNeoTarifaDotCodigo(String dSInstitucionMatNeoTarifaDotCodigo) {
        this.dSInstitucionMatNeoTarifaDotCodigo = dSInstitucionMatNeoTarifaDotCodigo;
    }

    @JsonIgnore
    public String getDSInstitucionMatNeoCodigo() {
        return this.dSInstitucionMatNeoCodigo;
    }
    
    public void setDSInstitucionMatNeoCodigo(String dSInstitucionMatNeoCodigo) {
        this.dSInstitucionMatNeoCodigo = dSInstitucionMatNeoCodigo;
    }

    @JsonIgnore
    public String getDSInstitucionMatNeoTipoIdentificacionDotNombreCorto() {
        return this.dSInstitucionMatNeoTipoIdentificacionDotNombreCorto;
    }
    
    public void setDSInstitucionMatNeoTipoIdentificacionDotNombreCorto(String dSInstitucionMatNeoTipoIdentificacionDotNombreCorto) {
        this.dSInstitucionMatNeoTipoIdentificacionDotNombreCorto = dSInstitucionMatNeoTipoIdentificacionDotNombreCorto;
    }

    @JsonIgnore
    public String getDSInstitucionMatNeoNumIdentificacion() {
        return this.dSInstitucionMatNeoNumIdentificacion;
    }
    
    public void setDSInstitucionMatNeoNumIdentificacion(String dSInstitucionMatNeoNumIdentificacion) {
        this.dSInstitucionMatNeoNumIdentificacion = dSInstitucionMatNeoNumIdentificacion;
    }

    @JsonIgnore
    public String getDSInstitucionMatNeoNombre() {
        return this.dSInstitucionMatNeoNombre;
    }
    
    public void setDSInstitucionMatNeoNombre(String dSInstitucionMatNeoNombre) {
        this.dSInstitucionMatNeoNombre = dSInstitucionMatNeoNombre;
    }

    @JsonIgnore
    public Boolean getDSInstitucionMatNeoParaMaternidad() {
        return this.dSInstitucionMatNeoParaMaternidad;
    }
    
    public void setDSInstitucionMatNeoParaMaternidad(Boolean dSInstitucionMatNeoParaMaternidad) {
        this.dSInstitucionMatNeoParaMaternidad = dSInstitucionMatNeoParaMaternidad;
    }

    @JsonIgnore
    public Boolean getDSInstitucionMatNeoParaNeonatal() {
        return this.dSInstitucionMatNeoParaNeonatal;
    }
    
    public void setDSInstitucionMatNeoParaNeonatal(Boolean dSInstitucionMatNeoParaNeonatal) {
        this.dSInstitucionMatNeoParaNeonatal = dSInstitucionMatNeoParaNeonatal;
    }

    @JsonIgnore
    public Date getDSInstitucionMatNeoFechaInicial() {
        return this.dSInstitucionMatNeoFechaInicial;
    }
    
    public void setDSInstitucionMatNeoFechaInicial(Date dSInstitucionMatNeoFechaInicial) {
        this.dSInstitucionMatNeoFechaInicial = dSInstitucionMatNeoFechaInicial;
    }

    @JsonIgnore
    public Date getDSInstitucionMatNeoFechaFinal() {
        return this.dSInstitucionMatNeoFechaFinal;
    }
    
    public void setDSInstitucionMatNeoFechaFinal(Date dSInstitucionMatNeoFechaFinal) {
        this.dSInstitucionMatNeoFechaFinal = dSInstitucionMatNeoFechaFinal;
    }
}
