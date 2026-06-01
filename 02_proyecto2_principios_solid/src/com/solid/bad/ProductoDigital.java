package com.solid.bad;

abstract class ProductoDigital {
    protected String titulo;
    protected double precio;

    public ProductoDigital(String titulo, double precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getTitulo() { return titulo; }
    public double getPrecio() { return precio; }

    // Todos los productos deben implementarlo
    public abstract void reproducirDemo();
}

