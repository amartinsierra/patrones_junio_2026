package estados;

import controller.Controlador;

public class EnVuelo implements Estado {

	@Override
	public void despegar(Controlador controlador) {
		System.out.println("No puede despegar estando en vuelo");

	}

	@Override
	public void aterrizar(Controlador controlador) {
		System.out.println("No puede aterrizar estando en vuelo");

	}

	@Override
	public void reconocimiento(Controlador controlador) {
		System.out.println("Realizando reconocimiento!"); //no cambia de estado

	}

	@Override
	public void regresar(Controlador controlador) {
		System.out.println("Regresando!");
		controlador.setEstado(new Retornando());
	}

}
