package com.solid.good.streaming;

public class Podcast extends Reproductor {
    public Podcast(String archivo) { super(archivo); }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo podcast: " + this.getArchivo());
    }
}

