package com.good.composite;

import com.good.flyweight.Recurso;

public class Pelicula implements ComponenteReproducible {
    private String titulo;
    private Recurso subtitulos;
    private Recurso audio;

    public Pelicula(String titulo, Recurso subtitulos, Recurso audio) {
        this.titulo = titulo;
        this.subtitulos = subtitulos;
        this.audio = audio;
    }

    @Override
    public void reproducir() {
        System.out.println("🎬 Reproduciendo " + titulo + " con audio " +
                audio.getData() + " y subtítulos " + subtitulos.getData());
    }
}

