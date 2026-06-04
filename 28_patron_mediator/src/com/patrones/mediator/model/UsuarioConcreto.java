package com.patrones.mediator.model;

import com.patrones.mediator.mediador.ChatMediator;

public class UsuarioConcreto extends Usuario {
    public UsuarioConcreto(ChatMediator mediador, String nombre) {
        super(mediador, nombre);
    }

    public void enviar(String mensaje) {
        System.out.println(this.nombre + " envía: " + mensaje);
        mediador.enviarMensaje(mensaje, this);
    }

    public void recibir(String mensaje) {
        System.out.println(this.nombre + " recibe: " + mensaje);
    }
}
