package factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import model.Usuario;

public class FactoryRegistry {

	static Map<String,Factory> map;
	static {
		map=new HashMap<>();
		map.put("operador", new OperadorFactory());
		map.put("admin", new AdminFactory());
		map.put("invitado", new InvitadoFactory());
	}
	public static Usuario obtenerUsuario(String tipo, String nombre, String email) {
    		Factory factory=map.get(tipo);
    		return factory.crearUsuario(nombre, email);
    }
}
