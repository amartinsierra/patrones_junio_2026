package cliente;

import envios.EnvioCorreo;
import envios.EnvioDigital;
import items.Juego;
import items.Libro;
import service.TiendaService;

public class Main {
	public static void main(String[] args) {
		var service=new TiendaService();
		service.agregarCarrito(new Juego("pinball",30,10), 
                   new EnvioDigital(),2);
		service.agregarCarrito(new Libro("Java 25",45,5), 
                   new EnvioCorreo(),5);
		service.procesarCarrito();
	}
}

