package com.patrones.bridge.abstracciones;

import com.patrones.bridge.implementaciones.Modalidad;

public abstract class Formacion {
    protected Modalidad modalidad;
    public Formacion(Modalidad modalidad) {
        this.modalidad = modalidad;
    }
    public abstract void formar();
}

