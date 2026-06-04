package com.patrones.cadena.handler;

public class Nivel2 extends Soporte {
    @Override
    public void manejarTicket(String tipoProblema) {
        if(tipoProblema.equalsIgnoreCase("intermedio")) {
            System.out.println("Nivel 2: Resolviendo problema medio.");
        } else if(siguiente != null) {
            siguiente.manejarTicket(tipoProblema);
        } else {
            System.out.println("Nadie puede resolver este problema.");
        }
    }
}
