package com.solid.bad;

class Cancion extends ProductoDigital {
    public Cancion(String titulo, double precio) {
        super(titulo, precio);
    }

    @Override
    public void reproducirDemo() {
        throw new UnsupportedOperationException("No se puede reproducir demo de canción");
    }
}

