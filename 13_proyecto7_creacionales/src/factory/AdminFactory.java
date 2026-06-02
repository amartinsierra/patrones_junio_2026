package factory;

import model.Admin;
import model.Usuario;

public class AdminFactory implements Factory {
    @Override
    public Usuario crearUsuario(String nombre, String email) {
        var admin=new Admin(nombre, email);
        admin.enviarAvisos();
        admin.convocarSubordinados();
        return admin;
    }
}
