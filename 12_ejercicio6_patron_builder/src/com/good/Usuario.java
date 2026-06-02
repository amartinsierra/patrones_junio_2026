package com.good;

public class Usuario {
    private final String nombre;
    private final String apellido;
    private final int edad;
    private final String telefono;
    private final String direccion;
    private final String email;

    

	private Usuario(Builder builder) {
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.edad = builder.edad;
        this.telefono = builder.telefono;
        this.direccion = builder.direccion;
        this.email = builder.email;
    }

    public static class Builder {
        private String nombre;
        private String apellido;
        private int edad;
        private String telefono;
        private String direccion;
        private String email;

        public Builder(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
        }

        public Builder edad(int edad) {
            this.edad = edad<0?1:edad;
            return this;
        }

        public Builder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Builder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Usuario build() {
            return new Usuario(this);
        }
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
