package com.patrones.memento.client;

import com.patrones.memento.cuidador.CuidadorManager;
import com.patrones.memento.originador.UserProfile;

public class Demo {
	public static void main(String[] args) {
        UserProfile perfil = new UserProfile("Prueba", "música");
        CuidadorManager versiones = new CuidadorManager();
        System.out.println("Perfil inicial: " + perfil);
        //guarda un Memento con el perfil inicial
        versiones.guardar(perfil.guardarVersion());
        perfil.actualizar("prueba nueva", "deportes");
        System.out.println("Actualizado: " + perfil);
        // Deshacer último cambio
        perfil.restaurar(versiones.deshacer());
        //se verán los datos del estado inicial
        System.out.println("Deshacer : " + perfil);
    }

}
