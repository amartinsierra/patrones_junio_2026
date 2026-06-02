package com.patrones.bridge.abstracciones;

import com.patrones.bridge.implementaciones.Modalidad;

public class Master extends Formacion {
    public Master(Modalidad modalidad) {
        super(modalidad);
    }
    @Override
    public void formar() {
        modalidad.impartir("Máster");
    }
}
