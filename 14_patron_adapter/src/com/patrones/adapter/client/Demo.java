package com.patrones.adapter.client;

import com.patrones.adapter.adaptable.Info;
import com.patrones.adapter.adaptador.Adapter;
import com.patrones.adapter.target.Mensaje;

public class Demo {
	public static void main(String[] args) {
        // Creamos la fábrica
       // MensajeFactory factory = new AdapterFactory();

        // Obtenemos un objeto Mensaje a través del factory method
        Mensaje mensaje = new Adapter(new Info());

        // Usamos el adaptador como si fuera un Mensaje
        mensaje.send("Hola mundo");
        mensaje.send("Patrón Adapter con Factory Method");

    }
}
