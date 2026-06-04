package estados;

import controller.Controlador;

public class EnTierra implements Estado {

	@Override
	public void despegar(Controlador controlador) {
		System.out.println("Despegando!");
		controlador.setEstado(new EnVuelo());

	}

	@Override
	public void aterrizar(Controlador controlador) {
		System.out.println("No puede aterrizar estando en tierra");

	}

	@Override
	public void reconocimiento(Controlador controlador) {
		System.out.println("No puede hacer reconocimiento estando en tierra");

	}

	@Override
	public void regresar(Controlador controlador) {
		System.out.println("No puede regresar estando en tierra");

	}

}
