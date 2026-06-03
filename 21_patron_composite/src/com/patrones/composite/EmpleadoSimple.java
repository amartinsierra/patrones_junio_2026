package com.patrones.composite;

public class EmpleadoSimple implements Empleado {
    private final String nombre;
    private final String cargo;
    public EmpleadoSimple(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getCargo() {
        return cargo;
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("- " + cargo + ": " + nombre);
    }
}

