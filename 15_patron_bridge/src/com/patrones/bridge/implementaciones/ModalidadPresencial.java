package com.patrones.bridge.implementaciones;

public class ModalidadPresencial implements Modalidad {
    @Override
    public void impartir(String nombreFormacion) {
        System.out.println(nombreFormacion + 
        " se imparte de forma presencial en el aula.");
    }
}

