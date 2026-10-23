package com.keralty.integraciones.gestordocumental.buscar.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
    private Documents documents;

    @JsonProperty("documents")
    public Documents getDocuments() { return documents; }
    @JsonProperty("documents")
    public void setDocuments(Documents value) { this.documents = value; }
}
