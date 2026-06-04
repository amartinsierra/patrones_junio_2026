package estados;

import controller.Controlador;

public interface Estado {
	void despegar(Controlador controlador);
	void aterrizar(Controlador controlador);
	void reconocimiento(Controlador controlador);
	void regresar(Controlador controlador);
	//void handleCommand(String command, Controlador controlador);
}
