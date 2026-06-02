package factory;

import model.Invitado;
import model.Usuario;

public class InvitadoFactory implements Factory {

	@Override
	public Usuario crearUsuario(String nombre, String email) {
		return new Invitado(nombre,email);
	}

}
