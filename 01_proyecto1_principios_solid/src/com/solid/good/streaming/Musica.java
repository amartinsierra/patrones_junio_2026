package com.solid.good.streaming;

public class Musica extends Reproductor {

    public Musica(String archivo) { super(archivo); }
    
   

	@Override
    public void reproducir() {
        System.out.println("Reproduciendo música: " + this.getArchivo());
    }
}

