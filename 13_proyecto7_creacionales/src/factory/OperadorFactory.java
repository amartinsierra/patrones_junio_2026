package factory;

import model.Operador;
import model.Usuario;

public class OperadorFactory implements Factory {

	@Override
	public Usuario crearUsuario(String nombre, String email) {
		var operador=new Operador(nombre,email);
		operador.establecerProtocolo();
		return operador;
	}

}
