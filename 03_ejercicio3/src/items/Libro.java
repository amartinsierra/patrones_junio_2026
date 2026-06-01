package items;

public class Libro extends Producto {
	
    public Libro(String nombre, double precioBase, double descuento) {
		super(nombre, precioBase, descuento);
	}

	@Override
    public double calcularPrecioFinal() {
        return getPrecioBase() * (1-getDescuento()/100); 
    }
}
