package com.solid.good.utilities;

import com.solid.good.media.Producto;

public class CalculadoraImpuestos {
    private  double iva;
    

    public CalculadoraImpuestos(double iva) {
		super();
		this.iva = iva;
	}


	public double calcularPrecioConImpuestos(Producto p) {
        return p.getPrecio() * (1 + iva/100);
    }
}
