package com.patrones.memento.originador;

import com.patrones.memento.memento.UserProfileSnapshot;

public class UserProfile {
    private String nombre;
    private String preferencia;
    public UserProfile (String nombre, String preferencia) {
        this.nombre = nombre;
        this. preferencia = preferencia;
    }
    public void actualizar(String nombre, String preferencia) {
        this.nombre = nombre;
        this. preferencia = preferencia;
    }
    public UserProfileSnapshot guardarVersion() {
        return new UserProfileSnapshot(nombre, preferencia);
    }
    public void restaurar(UserProfileSnapshot snapshot) {
        this.nombre = snapshot.getNombre();
        this.preferencia= snapshot.getPreferencia();
    }
    @Override
    public String toString() {
        return "UserProfile{" +
                "nombre='" + nombre + '\'' +
                ", preferencia='" + preferencia + '\'' +
                '}';
    }
}
