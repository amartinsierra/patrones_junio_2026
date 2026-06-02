package com.patrones.bridge.abstracciones;

import com.patrones.bridge.implementaciones.Modalidad;

public class Curso extends Formacion {   
    public Curso(Modalidad modalidad) {
        super(modalidad);
    }
    @Override
    public void formar() {
        modalidad.impartir("Curso");
    }
}
