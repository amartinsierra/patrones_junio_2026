package cliente;

import builder.UsuarioBuilder;
import model.Usuario;
import singleton.ConexionRemota;

public class Main {
    public static void main(String[] args) {
        // Creamos usuarios con Builder + Factory
       envioUsuarios( new UsuarioBuilder()
                .tipo("admin")
                .nombre("Laura")
                .email("laura@empresa.com")
                .build());
        envioUsuarios(new UsuarioBuilder()
                .tipo("operador")
                .nombre("Pepe")
                .build());
        envioUsuarios(new UsuarioBuilder()
                .tipo("invitado")
                .nombre("Marta")
                .email("marta@invitado.com")
                .build());
        
    }
    
    private static void envioUsuarios(Usuario usuario) {
    	ConexionRemota.getInstancia().enviarUsuario(usuario);
    }
}

