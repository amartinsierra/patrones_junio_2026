package items;

import descuentos.Descuento;

public class Libro extends Producto {
	boolean segundamano;
    public Libro(String nombre, double precioBase, Descuento descuento,boolean segundamano) {
		super(nombre, precioBase, descuento);
		this.segundamano=segundamano;
	}

	@Override
    public double calcularPrecioFinal() {
		int adicional=segundamano?10:0;
        return getPrecioBase() * (1-(getDescuento().getPorcentaje()+adicional)/100); // 
    }
}
