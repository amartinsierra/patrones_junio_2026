package com.patrones.mediator.mediador;

import java.util.ArrayList;
import java.util.List;

import com.patrones.mediator.model.Usuario;

public class ChatConcreto implements ChatMediator {
    private List<Usuario> usuarios = new ArrayList<>();
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    public void enviarMensaje(String mensaje, Usuario emisor) {
        for (Usuario usuario : usuarios) {
            if (usuario != emisor) {
                usuario.recibir(mensaje);
            }
        }
    }
}
