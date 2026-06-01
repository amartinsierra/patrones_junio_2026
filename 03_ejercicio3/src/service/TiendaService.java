package service;

import java.util.ArrayList;
import java.util.List;

import envios.Envio;
import items.Producto;

public class TiendaService {
	private List<ElementoCarrito> carrito=new ArrayList<>();
	public void agregarCarrito(Producto p, Envio e, int cantidad) {
        carrito.add(new ElementoCarrito(p, e, cantidad));
    }
    public void procesarCarrito() {
        carrito.forEach(l -> {
            System.out.println(l.producto().getNombre() + 
                " x" + l.cantidad() + " - " + l.producto().calcularPrecioFinal());
            l.envio().enviar(l.producto());
        });
    }	
}

