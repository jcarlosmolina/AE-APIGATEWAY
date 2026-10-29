package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.viewmodel.ServiceResponse;
import java.util.HashMap;
import java.util.Map;

public class OGENERARSOLICITUD2Response extends ServiceResponse {

    @JsonProperty("pt_ps_numsolicitud")
    private String oGENERARSOLICITUD2ptpsNumSolicitud;

    @JsonProperty("pt_ps_errorws")
    private String oGENERARSOLICITUD2ptpsErrorWS;

    @JsonProperty("pserror")
    private Boolean oGENERARSOLICITUD2psError;

    public OGENERARSOLICITUD2Response() {
        super();
    }

    @JsonIgnore
    public String getOGENERARSOLICITUD2ptpsNumSolicitud() {
        return this.oGENERARSOLICITUD2ptpsNumSolicitud;
    }

    public void setOGENERARSOLICITUD2ptpsNumSolicitud(String oGENERARSOLICITUD2ptpsNumSolicitud) {
        this.oGENERARSOLICITUD2ptpsNumSolicitud = oGENERARSOLICITUD2ptpsNumSolicitud;
    }

    @JsonIgnore
    public String getOGENERARSOLICITUD2ptpsErrorWS() {
        return this.oGENERARSOLICITUD2ptpsErrorWS;
    }

    public void setOGENERARSOLICITUD2ptpsErrorWS(String oGENERARSOLICITUD2ptpsErrorWS) {
        this.oGENERARSOLICITUD2ptpsErrorWS = oGENERARSOLICITUD2ptpsErrorWS;
    }

    @JsonIgnore
    public Boolean getOGENERARSOLICITUD2psError() {
        return this.oGENERARSOLICITUD2psError;
    }

    public void setOGENERARSOLICITUD2psError(Boolean oGENERARSOLICITUD2psError) {
        this.oGENERARSOLICITUD2psError = oGENERARSOLICITUD2psError;
    }

    @Override
    public Map<String, Object> buildOutArgs() {
        Map<String, Object> outArgs = new HashMap<>();
        outArgs.put("oGENERARSOLICITUD2ptpsNumSolicitud", oGENERARSOLICITUD2ptpsNumSolicitud);
        outArgs.put("oGENERARSOLICITUD2ptpsErrorWS", oGENERARSOLICITUD2ptpsErrorWS);
        outArgs.put("oGENERARSOLICITUD2psError", oGENERARSOLICITUD2psError);
        return outArgs;
    }
}
