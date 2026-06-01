package com.solid.good.media;

public class Cancion extends Producto {
    private int duracion;

	public Cancion(String titulo, double precio, int duracion) {
		super(titulo, precio);
		this.duracion = duracion;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
    

    
}

