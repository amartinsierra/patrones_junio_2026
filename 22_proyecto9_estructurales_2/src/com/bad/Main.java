package com.bad;

public class Main {
	public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("Matrix", "Español", "Inglés");
        Usuario usuario = new Usuario("Ana", true);

        usuario.verPelicula(pelicula1);
    }
	
}
