package com.solid.good.media;

public class Videojuego extends Producto implements Demo {
    private int calidad;
    public Videojuego(String titulo, double precio, int calidad) {
		super(titulo, precio);
		this.calidad = calidad;
	}
    @Override
    public void reproducirDemo() {
        System.out.println("Iniciando demo jugable de: " + getTitulo()+" en calidad "+calidad);
    }
}

