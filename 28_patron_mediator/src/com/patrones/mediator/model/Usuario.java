package com.patrones.mediator.model;

import com.patrones.mediator.mediador.ChatMediator;

public abstract class Usuario {
    protected ChatMediator mediador;
    protected String nombre;

    public Usuario(ChatMediator mediador, String nombre) {
        this.mediador = mediador;
        this.nombre = nombre;
    }

    public abstract void enviar(String mensaje);
    public abstract void recibir(String mensaje);
}

