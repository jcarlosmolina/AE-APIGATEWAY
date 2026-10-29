package com.keralty.ae.viewmodel.parentescodom.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSParentescoDomPIU {

    @JsonProperty("parentesco_descripcion")
    private String dSParentescoDomPIUParentescoDotDescripcion;

    @JsonProperty("edadminimaa")
    private Long dSParentescoDomPIUEdadMinimaA;

    @JsonProperty("edadmaximaa")
    private Long dSParentescoDomPIUEdadMaximaA;

    @JsonProperty("edadminimad")
    private Long dSParentescoDomPIUEdadMinimaD;

    @JsonProperty("edadmaximap")
    private Long dSParentescoDomPIUEdadMaximaP;

    public DSParentescoDomPIU() {
    
    }

    @JsonIgnore
    public String getDSParentescoDomPIUParentescoDotDescripcion() {
        return this.dSParentescoDomPIUParentescoDotDescripcion;
    }
    
    public void setDSParentescoDomPIUParentescoDotDescripcion(String dSParentescoDomPIUParentescoDotDescripcion) {
        this.dSParentescoDomPIUParentescoDotDescripcion = dSParentescoDomPIUParentescoDotDescripcion;
    }

    @JsonIgnore
    public Long getDSParentescoDomPIUEdadMinimaA() {
        return this.dSParentescoDomPIUEdadMinimaA;
    }
    
    public void setDSParentescoDomPIUEdadMinimaA(Long dSParentescoDomPIUEdadMinimaA) {
        this.dSParentescoDomPIUEdadMinimaA = dSParentescoDomPIUEdadMinimaA;
    }

    @JsonIgnore
    public Long getDSParentescoDomPIUEdadMaximaA() {
        return this.dSParentescoDomPIUEdadMaximaA;
    }
    
    public void setDSParentescoDomPIUEdadMaximaA(Long dSParentescoDomPIUEdadMaximaA) {
        this.dSParentescoDomPIUEdadMaximaA = dSParentescoDomPIUEdadMaximaA;
    }

    @JsonIgnore
    public Long getDSParentescoDomPIUEdadMinimaD() {
        return this.dSParentescoDomPIUEdadMinimaD;
    }
    
    public void setDSParentescoDomPIUEdadMinimaD(Long dSParentescoDomPIUEdadMinimaD) {
        this.dSParentescoDomPIUEdadMinimaD = dSParentescoDomPIUEdadMinimaD;
    }

    @JsonIgnore
    public Long getDSParentescoDomPIUEdadMaximaP() {
        return this.dSParentescoDomPIUEdadMaximaP;
    }
    
    public void setDSParentescoDomPIUEdadMaximaP(Long dSParentescoDomPIUEdadMaximaP) {
        this.dSParentescoDomPIUEdadMaximaP = dSParentescoDomPIUEdadMaximaP;
    }
}
