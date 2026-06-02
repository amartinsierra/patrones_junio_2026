package singleton;

import model.Usuario;

public class ConexionRemota {
    private static ConexionRemota instancia;
    private ConexionRemota() {      
    }
    public static synchronized ConexionRemota getInstancia() {
        if (instancia == null) {
            instancia = new ConexionRemota();
        }
        return instancia;
    }
    public void enviarUsuario(Usuario usuario) {
    	//tareas para preparar la conexion....
    	usuario.enviar();
       
    }
}

