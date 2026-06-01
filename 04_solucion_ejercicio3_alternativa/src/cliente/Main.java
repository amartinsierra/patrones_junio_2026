package cliente;

import descuentos.Descuento;
import envios.EnvioCorreo;
import envios.EnvioDigital;
import items.Juego;
import items.Libro;
import items.Musica;
import service.TiendaService;

public class Main {
	public static void main(String[] args) {
		var service=new TiendaService();
		service.agregarCarrito(new Juego("pinball",30,Descuento.NINGUNO), 
                   new EnvioDigital(),2);
		service.agregarCarrito(new Libro("Java 25",45,Descuento.PROMO,true), 
                   new EnvioCorreo(),5);
		service.agregarCarrito(new Musica("Exitos 2000",15,Descuento.VIP,"mp4"), 
                new EnvioDigital(),3);
		service.procesarCarrito();
	}
}

