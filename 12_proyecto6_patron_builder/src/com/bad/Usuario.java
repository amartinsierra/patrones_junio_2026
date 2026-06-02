package com.bad;

public class Usuario {
    private final String nombre;
    private final String apellido;
    private final int edad;
    private final String telefono;
    private final String direccion;
    private final String email;

    public Usuario(String nombre, String apellido, int edad,
                   String telefono, String direccion, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
