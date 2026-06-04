package com.patrones.mediator.mediador;

import com.patrones.mediator.model.Usuario;

public interface ChatMediator {
	void enviarMensaje(String mensaje, Usuario emisor);
    void registrarUsuario(Usuario usuario);

}
