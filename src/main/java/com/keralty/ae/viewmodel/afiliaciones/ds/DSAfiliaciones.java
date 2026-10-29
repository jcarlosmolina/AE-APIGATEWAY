package com.keralty.ae.viewmodel.afiliaciones.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSAfiliaciones {

    @JsonProperty("usuario")
    private String dSAfiliacionesUsuario;

    @JsonProperty("primernombre")
    private String dSAfiliacionesPrimerNombre;

    @JsonProperty("segundonombre")
    private String dSAfiliacionesSegundoNombre;

    @JsonProperty("primerapellido")
    private String dSAfiliacionesPrimerApellido;

    @JsonProperty("segundoapellido")
    private String dSAfiliacionesSegundoApellido;

    public DSAfiliaciones() {
    
    }

    @JsonIgnore
    public String getDSAfiliacionesUsuario() {
        return this.dSAfiliacionesUsuario;
    }
    
    public void setDSAfiliacionesUsuario(String dSAfiliacionesUsuario) {
        this.dSAfiliacionesUsuario = dSAfiliacionesUsuario;
    }

    @JsonIgnore
    public String getDSAfiliacionesPrimerNombre() {
        return this.dSAfiliacionesPrimerNombre;
    }
    
    public void setDSAfiliacionesPrimerNombre(String dSAfiliacionesPrimerNombre) {
        this.dSAfiliacionesPrimerNombre = dSAfiliacionesPrimerNombre;
    }

    @JsonIgnore
    public String getDSAfiliacionesSegundoNombre() {
        return this.dSAfiliacionesSegundoNombre;
    }
    
    public void setDSAfiliacionesSegundoNombre(String dSAfiliacionesSegundoNombre) {
        this.dSAfiliacionesSegundoNombre = dSAfiliacionesSegundoNombre;
    }

    @JsonIgnore
    public String getDSAfiliacionesPrimerApellido() {
        return this.dSAfiliacionesPrimerApellido;
    }
    
    public void setDSAfiliacionesPrimerApellido(String dSAfiliacionesPrimerApellido) {
        this.dSAfiliacionesPrimerApellido = dSAfiliacionesPrimerApellido;
    }

    @JsonIgnore
    public String getDSAfiliacionesSegundoApellido() {
        return this.dSAfiliacionesSegundoApellido;
    }
    
    public void setDSAfiliacionesSegundoApellido(String dSAfiliacionesSegundoApellido) {
        this.dSAfiliacionesSegundoApellido = dSAfiliacionesSegundoApellido;
    }
}
