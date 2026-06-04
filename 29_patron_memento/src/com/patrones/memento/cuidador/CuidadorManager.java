package com.patrones.memento.cuidador;

import java.util.Stack;

import com.patrones.memento.memento.UserProfileSnapshot;

public class CuidadorManager {
    private final Stack<UserProfileSnapshot> historial = new Stack<>();
    public void guardar(UserProfileSnapshot snapshot) {
        historial.push(snapshot);
    }
    public UserProfileSnapshot deshacer() {
        if (!historial.isEmpty()) {
            return historial.pop();
        }
        return null;
    }
}
