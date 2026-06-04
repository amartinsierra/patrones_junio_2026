package com.patrones.observer.client;

import com.patrones.observer.observer.Usuario;
import com.patrones.observer.subject.AvisosSubject;

public class Demo {
	public static void main(String[] args) {
        AvisosSubject avisos = new AvisosSubject ();

        Usuario pru1 = new Usuario("Prueba 1");
        Usuario pru2 = new Usuario("Prueba2");
        avisos.registrar(pru1);
        avisos.registrar(pru2);
        avisos.nuevoAviso ("Patrón Observer en acción");
        avisos.nuevoAviso("Avanzando en el curso");
        avisos.eliminar(pru1);
       //solo reacciona el único usuario que queda registrado
        avisos.nuevoAviso ("Primer usuario  ya no verá este aviso");
    }

}
