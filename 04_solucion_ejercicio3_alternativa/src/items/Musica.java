package items;

import descuentos.Descuento;

public class Musica extends Producto {
	private String formato;
	
	public Musica(String nombre, double precioBase,Descuento descuento, String formato) {
		super(nombre, precioBase, descuento);
		this.formato = formato;
	}
	@Override
	public double calcularPrecioFinal() {
		int adicional=formato.equalsIgnoreCase("mp4")?10:0;
        return getPrecioBase() * (1-(getDescuento().getPorcentaje()+adicional)/100); // 
	}

}
