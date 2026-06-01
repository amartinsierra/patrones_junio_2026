package envios;

import items.Producto;

public class EnvioCorreo implements Envio {
	@Override
	public void enviar(Producto p) {
		System.out.println("Envio de "+p.getNombre()+" por correo ");
	}
}

