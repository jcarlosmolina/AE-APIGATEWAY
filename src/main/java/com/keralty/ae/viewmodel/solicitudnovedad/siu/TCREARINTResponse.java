package com.keralty.ae.viewmodel.solicitudnovedad.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.persistence.oid.SolicitudNovedadOid;
import com.keralty.ae.persistence.SolicitudNovedad;
import com.keralty.ae.viewmodel.ServiceResponse;
import java.util.HashMap;
import java.util.Map;

public class TCREARINTResponse extends ServiceResponse {


    @JsonProperty("oasolicitud")
    private SolicitudNovedadOid solicitudNovedadTCREARINToaSolicitud;
    
    @JsonIgnore
    private SolicitudNovedad solicitudNovedadTCREARINToaSolicitudInstance;

    public TCREARINTResponse() {
        super();
    }

    @JsonIgnore
    public SolicitudNovedadOid getSolicitudNovedadTCREARINToaSolicitud() {
        return this.solicitudNovedadTCREARINToaSolicitud;
    }
    
    public void setSolicitudNovedadTCREARINToaSolicitud(SolicitudNovedadOid solicitudNovedadTCREARINToaSolicitud) {
        this.solicitudNovedadTCREARINToaSolicitud = solicitudNovedadTCREARINToaSolicitud;
    }
    @JsonIgnore
    public SolicitudNovedad getSolicitudNovedadTCREARINToaSolicitudInstance() {
        return this.solicitudNovedadTCREARINToaSolicitudInstance;
    }
    
    public void setSolicitudNovedadTCREARINToaSolicitudInstance(SolicitudNovedad solicitudNovedadTCREARINToaSolicitud) {
        if (solicitudNovedadTCREARINToaSolicitud != null && !solicitudNovedadTCREARINToaSolicitud.isNull()) {
            this.solicitudNovedadTCREARINToaSolicitud = solicitudNovedadTCREARINToaSolicitud.getOid();
            this.solicitudNovedadTCREARINToaSolicitudInstance = solicitudNovedadTCREARINToaSolicitud;
        } else {
            this.solicitudNovedadTCREARINToaSolicitud = null;
            this.solicitudNovedadTCREARINToaSolicitudInstance = null;
        }
    }

    @Override
    public Map<String, Object> buildOutArgs() {
        Map<String, Object> outArgs = new HashMap<>();
        outArgs.put("solicitudNovedadTCREARINToaSolicitud", solicitudNovedadTCREARINToaSolicitud);
        return outArgs;
    }
}
