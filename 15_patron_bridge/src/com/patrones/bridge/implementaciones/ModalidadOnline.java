package com.patrones.bridge.implementaciones;

public class ModalidadOnline implements Modalidad {
    @Override
    public void impartir(String nombreFormacion) {
        System.out.println(nombreFormacion + 
        " se imparte completamente online.");
    }
}
