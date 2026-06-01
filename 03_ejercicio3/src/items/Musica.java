package items;

public class Musica extends Producto {

	public Musica(String nombre, double precioBase, double descuento) {
		super(nombre, precioBase, descuento);
	}

	@Override
    public double calcularPrecioFinal() {
        return getPrecioBase() * (1-getDescuento()/100); 
    }

}
