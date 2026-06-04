package mediador;

import observer.Usuario;

public interface MediadorChat {
    void enviar(Usuario remitente, String mensaje);
    void agregarUsuario(Usuario usuario);
}

