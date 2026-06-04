package com.patrones.cadena.client;

import com.patrones.cadena.handler.Nivel1;
import com.patrones.cadena.handler.Nivel2;
import com.patrones.cadena.handler.Nivel3;
import com.patrones.cadena.handler.Soporte;

public class Demo {
	public static void main(String[] args) {
        // Crear manejadores
        Soporte nivel1 = new Nivel1();
        Soporte nivel2 = new Nivel2();
        Soporte nivel3 = new Nivel3();

        // Configurar cadena
        nivel1.setSiguiente(nivel2);
        nivel2.setSiguiente(nivel3);

        // Enviar solicitudes
        nivel1.manejarTicket("basico");       // Nivel 1 lo resuelve
        nivel1.manejarTicket("intermedio");   // Nivel 2 lo resuelve
        nivel1.manejarTicket("avanzado");     // Nivel 3 lo resuelve
        nivel1.manejarTicket("imposible");    // Nadie lo resuelve
    }

}
