package com.solid.bad;

class Videojuego extends ProductoDigital {
    public Videojuego(String titulo, double precio) {
        super(titulo, precio);
    }

    @Override
    public void reproducirDemo() {
        System.out.println("Iniciando demo jugable de: " + titulo);
    }
}

