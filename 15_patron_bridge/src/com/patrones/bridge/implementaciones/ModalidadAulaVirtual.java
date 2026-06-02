package com.patrones.bridge.implementaciones;

public class ModalidadAulaVirtual implements Modalidad {
    @Override
    public void impartir(String nombreFormacion) {
        System.out.println(nombreFormacion + 
        " se imparte por aula virtual teams o similar.");
    }
}
