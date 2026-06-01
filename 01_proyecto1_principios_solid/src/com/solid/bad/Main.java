package com.solid.bad;

public class Main {
	public static void main(String[] args) {
        Reproductor r = new Reproductor();
        r.reproducirMusica("cancion.mp3");
        r.reproducirVideo("pelicula.mp4");
        r.descargarArchivo("cancion.mp3");
        r.procesarPago("Ana", 9.99);
    }

}
