package com.patrones.cadena.handler;

public class Nivel1 extends Soporte {
    @Override
    public void manejarTicket(String tipoProblema) {
        if(tipoProblema.equalsIgnoreCase("basico")) {
            System.out.println("Nivel 1: Resolviendo problema básico.");
        } else if(siguiente != null) {
            siguiente.manejarTicket(tipoProblema);
        } else {
            System.out.println("Nadie puede resolver este problema.");
        }
    }
}

