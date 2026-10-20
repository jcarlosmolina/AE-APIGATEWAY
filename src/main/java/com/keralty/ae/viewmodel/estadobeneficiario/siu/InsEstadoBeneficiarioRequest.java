package com.keralty.ae.viewmodel.estadobeneficiario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.EstadoBeneficiarioConstants;
import com.keralty.ae.persistence.EstadoBeneficiario;
import com.keralty.ae.persistence.oid.EstadoBeneficiarioOid;
import com.keralty.ae.persistence.oid.UsuarioNovedadOid;
import com.keralty.ae.persistence.UsuarioNovedad;

public class InsEstadoBeneficiarioRequest {

    @JsonProperty("p_thisestadobeneficiario_oid")
    private EstadoBeneficiarioOid estadoBeneficiarioInsEstadoBeneficiariopthisEstadoBeneficiario;
    
    @JsonIgnore
    private EstadoBeneficiario estadoBeneficiarioInsEstadoBeneficiariopthisEstadoBeneficiarioInstance;

    @JsonProperty("p_evcusuarionovedad_oid")
    private UsuarioNovedadOid estadoBeneficiarioInsEstadoBeneficiariopevcUsuarioNovedad;
    
    @JsonIgnore
    private UsuarioNovedad estadoBeneficiarioInsEstadoBeneficiariopevcUsuarioNovedadInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkEstadoBeneficiarioInsEstadoBeneficiariopthisEstadoBeneficiario();
        checkEstadoBeneficiarioInsEstadoBeneficiariopevcUsuarioNovedad();
    }

    @JsonIgnore
    public EstadoBeneficiarioOid getEstadoBeneficiarioInsEstadoBeneficiariopthisEstadoBeneficiario() {
        return this.estadoBeneficiarioInsEstadoBeneficiariopthisEstadoBeneficiario;
    }
    
    public void setEstadoBeneficiarioInsEstadoBeneficiariopthisEstadoBeneficiario(EstadoBeneficiarioOid estadoBeneficiarioInsEstadoBeneficiariopthisEstadoBeneficiario) {
        this.estadoBeneficiarioInsEstadoBeneficiariopthisEstadoBeneficiario = estadoBeneficiarioInsEstadoBeneficiariopthisEstadoBeneficiario;
    }

    @JsonIgnore
    public EstadoBeneficiario getEstadoBeneficiarioInsEstadoBeneficiariopthisEstadoBeneficiarioInstance() {
        return this.estadoBeneficiarioInsEstadoBeneficiariopthisEstadoBeneficiarioInstance;
    }
    
    public void setEstadoBeneficiarioInsEstadoBeneficiariopthisEstadoBeneficiarioInstance(EstadoBeneficiario estadoBeneficiarioInsEstadoBeneficiariopthisEstadoBeneficiario) {
        this.estadoBeneficiarioInsEstadoBeneficiariopthisEstadoBeneficiarioInstance = estadoBeneficiarioInsEstadoBeneficiariopthisEstadoBeneficiario;
        this.estadoBeneficiarioInsEstadoBeneficiariopthisEstadoBeneficiario = estadoBeneficiarioInsEstadoBeneficiariopthisEstadoBeneficiario != null ? estadoBeneficiarioInsEstadoBeneficiariopthisEstadoBeneficiario.getOid() : null;
    }

    private void checkEstadoBeneficiarioInsEstadoBeneficiariopthisEstadoBeneficiario() throws NotNullArgumentException {
        if(this.getEstadoBeneficiarioInsEstadoBeneficiariopthisEstadoBeneficiarioInstance() == null || this.getEstadoBeneficiarioInsEstadoBeneficiariopthisEstadoBeneficiarioInstance().isNull()) {
            throw new NotNullArgumentException(EstadoBeneficiarioConstants.SERV_ID_INSESTADOBENEFICIARIO, EstadoBeneficiarioConstants.CLASS_ID, EstadoBeneficiarioConstants.ARG_ID_INSESTADOBENEFICIARIO_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOPTHISESTADOBENEFICIARIO, EstadoBeneficiarioConstants.SERV_ALIAS_INSESTADOBENEFICIARIO, EstadoBeneficiarioConstants.CLASS_ALIAS, EstadoBeneficiarioConstants.ARG_ALIAS_INSESTADOBENEFICIARIO_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOPTHISESTADOBENEFICIARIO);
        }
    }

    @JsonIgnore
    public UsuarioNovedadOid getEstadoBeneficiarioInsEstadoBeneficiariopevcUsuarioNovedad() {
        return this.estadoBeneficiarioInsEstadoBeneficiariopevcUsuarioNovedad;
    }
    
    public void setEstadoBeneficiarioInsEstadoBeneficiariopevcUsuarioNovedad(UsuarioNovedadOid estadoBeneficiarioInsEstadoBeneficiariopevcUsuarioNovedad) {
        this.estadoBeneficiarioInsEstadoBeneficiariopevcUsuarioNovedad = estadoBeneficiarioInsEstadoBeneficiariopevcUsuarioNovedad;
    }

    @JsonIgnore
    public UsuarioNovedad getEstadoBeneficiarioInsEstadoBeneficiariopevcUsuarioNovedadInstance() {
        return this.estadoBeneficiarioInsEstadoBeneficiariopevcUsuarioNovedadInstance;
    }
    
    public void setEstadoBeneficiarioInsEstadoBeneficiariopevcUsuarioNovedadInstance(UsuarioNovedad estadoBeneficiarioInsEstadoBeneficiariopevcUsuarioNovedad) {
        this.estadoBeneficiarioInsEstadoBeneficiariopevcUsuarioNovedadInstance = estadoBeneficiarioInsEstadoBeneficiariopevcUsuarioNovedad;
        this.estadoBeneficiarioInsEstadoBeneficiariopevcUsuarioNovedad = estadoBeneficiarioInsEstadoBeneficiariopevcUsuarioNovedad != null ? estadoBeneficiarioInsEstadoBeneficiariopevcUsuarioNovedad.getOid() : null;
    }

    private void checkEstadoBeneficiarioInsEstadoBeneficiariopevcUsuarioNovedad() throws NotNullArgumentException {
        if(this.getEstadoBeneficiarioInsEstadoBeneficiariopevcUsuarioNovedadInstance() == null || this.getEstadoBeneficiarioInsEstadoBeneficiariopevcUsuarioNovedadInstance().isNull()) {
            throw new NotNullArgumentException(EstadoBeneficiarioConstants.SERV_ID_INSESTADOBENEFICIARIO, EstadoBeneficiarioConstants.CLASS_ID, EstadoBeneficiarioConstants.ARG_ID_INSESTADOBENEFICIARIO_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOPEVCUSUARIONOVEDAD, EstadoBeneficiarioConstants.SERV_ALIAS_INSESTADOBENEFICIARIO, EstadoBeneficiarioConstants.CLASS_ALIAS, EstadoBeneficiarioConstants.ARG_ALIAS_INSESTADOBENEFICIARIO_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOPEVCUSUARIONOVEDAD);
        }
    }
}
