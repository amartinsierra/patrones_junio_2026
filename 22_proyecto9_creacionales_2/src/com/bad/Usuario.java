package com.bad;

class Usuario {
    private String nombre;
    private boolean premium;

    public Usuario(String nombre, boolean premium) {
        this.nombre = nombre;
        this.premium = premium;
    }

    public void verPelicula(Pelicula pelicula) {
        if (!premium) {
            System.out.println("Acceso denegado: solo usuarios premium pueden ver películas.");
        } else {
            pelicula.reproducir();
        }
    }
}
