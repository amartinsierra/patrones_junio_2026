package com.patrones.factory.main;

import com.patrones.factory.factoria.ProductosDaoFactory;
import com.patrones.factory.factoria.ProductosDaoJpaFactory;
import com.patrones.factory.service.ProductosService;

public class Main {

	public static void main(String[] args) {
		ProductosDaoFactory factory=new ProductosDaoJpaFactory();
		
		ProductosService productosService=new ProductosService(factory.crear());

	}

}
