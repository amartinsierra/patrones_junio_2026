package com.good.prototype;

public class Course implements Cloneable{
	private String nombre;
	private int duracion;
	public Course(String nombre, int duracion) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	@Override
	public String toString() {
		return "Course [nombre=" + nombre + ", duracion=" + duracion + "]";
	}
	@Override
	protected Course clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Course)super.clone();
	}
	
}
