package com.patrones.memento.memento;

public class UserProfileSnapshot {
    private final String nombre;
    private final String preferencia;
    public UserProfileSnapshot(String nombre, String preferencia) {
        this.nombre = nombre;
        this.preferencia = preferencia;
    }
    // Getters
    public String getNombre() { return nombre; }
    public String getPreferencia() { return preferencia; }
}
