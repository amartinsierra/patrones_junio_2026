package com.good.composite;

import java.util.ArrayList;
import java.util.List;

public class ListaReproduccion implements ComponenteReproducible {
    private String nombre;
    private List<ComponenteReproducible> elementos = new ArrayList<>();

    public ListaReproduccion(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ComponenteReproducible elemento) {
        elementos.add(elemento);
    }

    @Override
    public void reproducir() {
        System.out.println("📂 Lista: " + nombre);
        for (ComponenteReproducible e : elementos) {
            e.reproducir();
        }
    }
}

