package com.bad;

class Pelicula {
    private String titulo;
    private String subtitulos;
    private String audio;

    public Pelicula(String titulo, String subtitulos, String audio) {
        this.titulo = titulo;
        this.subtitulos = subtitulos;
        this.audio = audio;
    }

    public void reproducir() {
        System.out.println("Reproduciendo " + titulo + " con audio " + audio + " y subtítulos " + subtitulos);
    }
}

