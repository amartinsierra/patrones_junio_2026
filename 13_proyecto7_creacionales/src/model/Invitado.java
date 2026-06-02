package model;

import singleton.ConexionRemota;

public class Invitado extends Usuario {
	public Invitado(String nombre, String email) {
        super(nombre, email);
    }
	@Override
	public String getTipo() {
		return "invitado";
	}
	@Override
	public void enviar() {
		System.out.println("Enviado al usuario administrador "+nombre);
	}
}
