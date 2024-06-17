package com.example.demo.Entity;

public class ClienteEntidad {
	private Long id;
	private String codigoPostal;
    private String primerNombre;
    private String segundoNombre;
    private String apellidoPat;
    private String apellidoMat;
    private String ciudad;
    private String estadoCivil;
    private String sueldo;
	
    
    public ClienteEntidad() {
		super();
	}


	public ClienteEntidad(Long id, String codigoPostal, String primerNombre, String segundoNombre, String apellidoPat,
			String apellidoMat, String ciudad, String estadoCivil, String sueldo) {
		super();
		this.id = id;
		this.codigoPostal = codigoPostal;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.ciudad = ciudad;
		this.estadoCivil = estadoCivil;
		this.sueldo = sueldo;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCodigoPostal() {
		return codigoPostal;
	}


	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}


	public String getPrimerNombre() {
		return primerNombre;
	}


	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}


	public String getSegundoNombre() {
		return segundoNombre;
	}


	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}


	public String getApellidoPat() {
		return apellidoPat;
	}


	public void setApellidoPat(String apellidoPat) {
		this.apellidoPat = apellidoPat;
	}


	public String getApellidoMat() {
		return apellidoMat;
	}


	public void setApellidoMat(String apellidoMat) {
		this.apellidoMat = apellidoMat;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	public String getSueldo() {
		return sueldo;
	}


	public void setSueldo(String sueldo) {
		this.sueldo = sueldo;
	}
    
    
    
}
