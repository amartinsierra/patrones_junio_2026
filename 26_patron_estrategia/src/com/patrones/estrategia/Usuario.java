package com.patrones.estrategia;

public class Usuario {
	private String nombre;
	private String email;
	private String departamento;
	public Usuario(String nombre, String email, String departamento) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.departamento = departamento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
