package com.keralty.ae.viewmodel.usuario.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSUsuarioPIUUsuariosCont {

    @JsonProperty("identificador")
    private Long dSUsuarioPIUUsuariosContIdentificador;

    @JsonProperty("drvidentificacion")
    private String dSUsuarioPIUUsuariosContDrvIdentificacion;

    @JsonProperty("primernombre")
    private String dSUsuarioPIUUsuariosContPrimerNombre;

    @JsonProperty("segundonombre")
    private String dSUsuarioPIUUsuariosContSegundoNombre;

    @JsonProperty("primerapellido")
    private String dSUsuarioPIUUsuariosContPrimerApellido;

    @JsonProperty("segundoapellido")
    private String dSUsuarioPIUUsuariosContSegundoApellido;

    @JsonProperty("parentesco_descripcion")
    private String dSUsuarioPIUUsuariosContParentescoDotDescripcion;

    public DSUsuarioPIUUsuariosCont() {
    
    }

    @JsonIgnore
    public Long getDSUsuarioPIUUsuariosContIdentificador() {
        return this.dSUsuarioPIUUsuariosContIdentificador;
    }
    
    public void setDSUsuarioPIUUsuariosContIdentificador(Long dSUsuarioPIUUsuariosContIdentificador) {
        this.dSUsuarioPIUUsuariosContIdentificador = dSUsuarioPIUUsuariosContIdentificador;
    }

    @JsonIgnore
    public String getDSUsuarioPIUUsuariosContDrvIdentificacion() {
        return this.dSUsuarioPIUUsuariosContDrvIdentificacion;
    }
    
    public void setDSUsuarioPIUUsuariosContDrvIdentificacion(String dSUsuarioPIUUsuariosContDrvIdentificacion) {
        this.dSUsuarioPIUUsuariosContDrvIdentificacion = dSUsuarioPIUUsuariosContDrvIdentificacion;
    }

    @JsonIgnore
    public String getDSUsuarioPIUUsuariosContPrimerNombre() {
        return this.dSUsuarioPIUUsuariosContPrimerNombre;
    }
    
    public void setDSUsuarioPIUUsuariosContPrimerNombre(String dSUsuarioPIUUsuariosContPrimerNombre) {
        this.dSUsuarioPIUUsuariosContPrimerNombre = dSUsuarioPIUUsuariosContPrimerNombre;
    }

    @JsonIgnore
    public String getDSUsuarioPIUUsuariosContSegundoNombre() {
        return this.dSUsuarioPIUUsuariosContSegundoNombre;
    }
    
    public void setDSUsuarioPIUUsuariosContSegundoNombre(String dSUsuarioPIUUsuariosContSegundoNombre) {
        this.dSUsuarioPIUUsuariosContSegundoNombre = dSUsuarioPIUUsuariosContSegundoNombre;
    }

    @JsonIgnore
    public String getDSUsuarioPIUUsuariosContPrimerApellido() {
        return this.dSUsuarioPIUUsuariosContPrimerApellido;
    }
    
    public void setDSUsuarioPIUUsuariosContPrimerApellido(String dSUsuarioPIUUsuariosContPrimerApellido) {
        this.dSUsuarioPIUUsuariosContPrimerApellido = dSUsuarioPIUUsuariosContPrimerApellido;
    }

    @JsonIgnore
    public String getDSUsuarioPIUUsuariosContSegundoApellido() {
        return this.dSUsuarioPIUUsuariosContSegundoApellido;
    }
    
    public void setDSUsuarioPIUUsuariosContSegundoApellido(String dSUsuarioPIUUsuariosContSegundoApellido) {
        this.dSUsuarioPIUUsuariosContSegundoApellido = dSUsuarioPIUUsuariosContSegundoApellido;
    }

    @JsonIgnore
    public String getDSUsuarioPIUUsuariosContParentescoDotDescripcion() {
        return this.dSUsuarioPIUUsuariosContParentescoDotDescripcion;
    }
    
    public void setDSUsuarioPIUUsuariosContParentescoDotDescripcion(String dSUsuarioPIUUsuariosContParentescoDotDescripcion) {
        this.dSUsuarioPIUUsuariosContParentescoDotDescripcion = dSUsuarioPIUUsuariosContParentescoDotDescripcion;
    }
}
