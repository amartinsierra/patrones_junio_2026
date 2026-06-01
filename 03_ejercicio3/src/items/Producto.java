package items;

public abstract class Producto {
    private String nombre;
    private double precioBase;
    private double descuento;
    
    public Producto(String nombre, double precioBase, double descuento) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.descuento = descuento;
	}

	public double getDescuento() {
		return descuento;
	}

	public String getNombre() { return nombre; }
	public double getPrecioBase() {return precioBase;}

    // OCP: cada tipo de producto define su propio cálculo de precio final
    public abstract double calcularPrecioFinal();
}

