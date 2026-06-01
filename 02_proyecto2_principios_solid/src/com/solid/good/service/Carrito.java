package com.solid.good.service;

import java.util.ArrayList;
import java.util.List;

import com.solid.good.media.Producto;
import com.solid.good.utilities.CalculadoraImpuestos;
//Responsablidad única y Open/Close
public class Carrito {
	private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void mostrarCarrito() {
        for (Producto p : productos) {
            System.out.println(p.getTitulo() + " - " + p.getPrecio() + "€");
        }
    }

    public double calcularTotal(CalculadoraImpuestos calc) {
        double total = 0;
        for (Producto p : productos) {
            total += calc.calcularPrecioConImpuestos(p);
        }
        return total;
    }

}
