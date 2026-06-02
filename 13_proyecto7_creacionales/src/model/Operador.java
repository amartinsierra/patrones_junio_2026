package model;

import singleton.ConexionRemota;

public class Operador extends Usuario {
	public Operador(String nombre, String email) {
        super(nombre, email);
    }
	@Override
	public String getTipo() {
		return "operador";
	}
	@Override
	public void enviar() {
		System.out.println("Enviado al usuario administrador "+nombre);
	}
	//otros métodos específicos de la clase
	public void establecerProtocolo() {
		
	}
}

