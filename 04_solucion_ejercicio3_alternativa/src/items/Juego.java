package items;

import descuentos.Descuento;

public class Juego extends Producto {
	
    public Juego(String nombre, double precioBase, Descuento descuento) {
		super(nombre, precioBase, descuento);
	}

	@Override
    public double calcularPrecioFinal() {
        return getPrecioBase() * (1-getDescuento().getPorcentaje()/100); // 
    }
}

