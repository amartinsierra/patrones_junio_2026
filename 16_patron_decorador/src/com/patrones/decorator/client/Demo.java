package com.patrones.decorator.client;

import com.patrones.decorator.comun.Ordenador;
import com.patrones.decorator.decorado.OrdenadorEstandar;
import com.patrones.decorator.decorador.DecoradorDisco;

public class Demo {
	public static void main(String[] args) {
		Ordenador ordenador=new OrdenadorEstandar();
		System.out.println("Sin decorar "+ordenador.getDescripcion());
		System.out.println("Sin decorar "+ordenador.getPrecio());
		//modifica el componente aplicando un decorador
		ordenador=new DecoradorDisco(ordenador);
		System.out.println("Decorado "+ordenador.getDescripcion());
		System.out.println("Decorado "+ordenador.getPrecio());

	}
}
