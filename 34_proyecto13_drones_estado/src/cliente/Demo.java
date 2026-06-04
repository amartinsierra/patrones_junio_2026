package cliente;

import controller.Controlador;

public class Demo {

	public static void main(String[] args) {
		Controlador controlador=new Controlador();
		controlador.aterrizar();
		controlador.despegar();
		controlador.reconocimiento();
		controlador.aterrizar();
		controlador.regresar();
		controlador.reconocimiento();
		controlador.regresar();
		controlador.aterrizar();
	}

}
