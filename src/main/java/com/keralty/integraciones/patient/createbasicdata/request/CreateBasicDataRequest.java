package com.keralty.integraciones.patient.createbasicdata.request;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateBasicDataRequest {
    private String resourceType = "Patient";
    private List<Identifier> identifier;
    private List<Name> name;
    private String gender;
    private String birthDate;
    private CodingList maritalStatus;
    private List<CreateBasicDataRequestExtension> extension;
    private boolean foreing = false;

    @JsonProperty("resourceType")
    public String getResourceType() { return resourceType; }
    @JsonProperty("resourceType")
    public void setResourceType(String value) { this.resourceType = value; }

    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() { return identifier; }
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> value) { this.identifier = value; }

    @JsonProperty("name")
    public List<Name> getName() { return name; }
    @JsonProperty("name")
    public void setName(List<Name> value) { this.name = value; }

    @JsonProperty("gender")
    public String getGender() { return gender; }
    @JsonProperty("gender")
    public void setGender(String value) { this.gender = value; }

    @JsonProperty("birthDate")
    public String getBirthDate() { return birthDate; }
    @JsonProperty("birthDate")
    public void setBirthDate(String value) { this.birthDate = value; }

    @JsonProperty("maritalStatus")
    public CodingList getMaritalStatus() { return maritalStatus; }
    @JsonProperty("maritalStatus")
    public void setMaritalStatus(CodingList value) { this.maritalStatus = value; }

    @JsonProperty("extension")
    public List<CreateBasicDataRequestExtension> getExtension() { return extension; }
    @JsonProperty("extension")
    public void setExtension(List<CreateBasicDataRequestExtension> value) { this.extension = value; }
    
    
    @JsonProperty("foreing")
    public boolean isForeing() { return foreing; }
    @JsonProperty("foreing")
	public void setForeing(boolean foreing) { this.foreing = foreing; }
	
	
    @JsonIgnore
    public void setIdentificacion(String tipoIdentificacion, String numeroIdentificacion) {
    	setIdentifier(new ArrayList<Identifier>());
    	Identifier ident = new Identifier();
    	ident.setSystem("BH");
    	ident.setValue(numeroIdentificacion);

    	Coding cod = new Coding();
    	cod.setSystem("BH");
    	cod.setCode(tipoIdentificacion);
    	ident.setType(new CodingList() );
    	ident.getType().setCoding(new ArrayList<Coding>());
    	ident.getType().getCoding().add(cod);
    	
    	getIdentifier().add(ident);
    }
    
    /**
     * Asigna los nombres de la persona dentro de la estructura
     * @param primerNombre
     * @param segundoNombre
     * @param primerApellido
     * @param segundoApellido
     */
    @JsonIgnore
	public void setNombres(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
		
		setName(new ArrayList<Name>());
		
		Name nombre = new Name();
		nombre.setFamily(primerApellido);
		
		if (segundoApellido != null && !segundoApellido.isEmpty()) {
			nombre.setExtension(new ArrayList<NameExtension>());
			NameExtension ext = new NameExtension();
			ext.setURL("humanname-mothers-family");
			ext.setValueString(segundoApellido);
			nombre.getExtension().add(ext);
		}
		
		nombre.setGiven(new ArrayList<String>());
		nombre.getGiven().add(primerNombre);
		
		if (segundoNombre != null && !segundoNombre.isEmpty()) {
			nombre.getGiven().add(segundoNombre);
		}
		
		getName().add(nombre);		
	}

    /**
     * Asigna el municipio y el departamento de nacimiento
     * @param codigoMunicioNacimiento
     * @param codigoDepartamentoNacimiento
     */
    @JsonIgnore
	public void setCiudadNacimiento(String codigoMunicioNacimiento, String codigoDepartamentoNacimiento) {
		if (codigoMunicioNacimiento != null && codigoDepartamentoNacimiento != null &&
				!codigoMunicioNacimiento.isEmpty() && !codigoDepartamentoNacimiento.isEmpty()) { 
			setExtension(new ArrayList<CreateBasicDataRequestExtension>());
			CreateBasicDataRequestExtension ext = new CreateBasicDataRequestExtension();
			ext.setURL("http://hl7.org/fhir/StructureDefinition/patient-birthPlace");
			ValueAddress valueAddress = new ValueAddress();
			City city = new City();
			city.setCode(codigoMunicioNacimiento);
			valueAddress.setCity(city);
			city = new City();
			city.setCode(codigoDepartamentoNacimiento);
			valueAddress.setState(city);
			ext.setValueAddress(valueAddress );
			getExtension().add(ext);
		}
	}
	
    /**
     * Asigna el codigo del estado civil
     * @param estadoCivil
     */
    @JsonIgnore
	public void setEstadoCivil(String estadoCivil) {
		setMaritalStatus(new CodingList());
		getMaritalStatus().setCoding(new ArrayList<Coding>());
		
    	Coding cod = new Coding();
    	cod.setSystem("BH/MaritalStatus");
    	cod.setCode(estadoCivil);
		
    	getMaritalStatus().getCoding().add(cod);
	}
}
