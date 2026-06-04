package com.patrones.mediator.client;

import com.patrones.mediator.mediador.ChatConcreto;
import com.patrones.mediator.mediador.ChatMediator;
import com.patrones.mediator.model.Usuario;
import com.patrones.mediator.model.UsuarioConcreto;

public class Demo {
	public static void main(String[] args) {
        ChatMediator chat = new ChatConcreto();
        Usuario u1 = new UsuarioConcreto(chat, "Ana");
        Usuario u2 = new UsuarioConcreto(chat, "Luis");
        Usuario u3 = new UsuarioConcreto(chat, "Carlos");
        chat.registrarUsuario(u1);
        chat.registrarUsuario(u2);
        chat.registrarUsuario(u3);

        u1.enviar("Hola a todos");
    }

}
