package factory;

import model.Usuario;

public interface Factory {
	Usuario crearUsuario(String nombre, String email);
}
