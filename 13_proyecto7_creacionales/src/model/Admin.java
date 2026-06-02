package model;

import singleton.ConexionRemota;

public class Admin extends Usuario {
	public Admin(String nombre, String email) {
        super(nombre, email);
    }
	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "admin";
	}
	@Override
	public void enviar() {
		System.out.println("Enviado al usuario administrador "+nombre);
	}
	//otros métodos específicos de la clase
	public void enviarAvisos() {
		
	}
	public void convocarSubordinados() {
		
	}
}
