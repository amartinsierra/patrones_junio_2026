package com.patrones.flyweight;

public class PalabraConcreta implements Palabra {
    private final String texto; // estado compartido

    public PalabraConcreta(String texto) {
        this.texto = texto;
    }

    @Override
    public void mostrar(String contexto) {
        System.out.println(texto + " (contexto: " + contexto + ")");
    }
}
