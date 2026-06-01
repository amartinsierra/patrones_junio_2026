package items;

public class Juego extends Producto {
	
    public Juego(String nombre, double precioBase, double descuento) {
		super(nombre, precioBase, descuento);
	}

	@Override
    public double calcularPrecioFinal() {
        return getPrecioBase() * (1-getDescuento()/100); // 
    }
}

