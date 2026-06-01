package com.solid.good.streaming;

public class Video extends Reproductor {

    public Video(String archivo) { super(archivo); }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo video: " + this.getArchivo());
    }
}

