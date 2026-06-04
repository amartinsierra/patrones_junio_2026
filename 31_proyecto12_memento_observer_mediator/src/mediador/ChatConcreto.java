package mediador;

import java.util.ArrayList;
import java.util.List;

import observer.Usuario;

public class ChatConcreto implements MediadorChat {
    private List<Usuario> usuarios = new ArrayList<>();
    @Override
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void enviar(Usuario remitente, String mensaje) {
        for (Usuario u : usuarios) {
            if (u != remitente) {
                System.out.println(remitente.getNombre() + " dice a " + u.getNombre() + ": " + mensaje);
            }
        }
    }
}
