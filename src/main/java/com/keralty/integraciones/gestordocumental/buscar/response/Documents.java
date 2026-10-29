package com.keralty.integraciones.gestordocumental.buscar.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Documents {
    private List<Document> documents;

    @JsonProperty("documents")
    public List<Document> getDocuments() { return documents; }
    @JsonProperty("documents")
    public void setDocuments(List<Document> value) { this.documents = value; }
}
