package com.patrones.flyweight;

public class Demo {

	public static void main(String[] args) {
		var facturacionService=new FacturacionService(new UsoIVAFactory());
		System.out.println("reducido: "+facturacionService.calcularTotal("reducido", 25));
		System.out.println("estandar: "+facturacionService.calcularTotal("estandar", 100));
		System.out.println("reducido: "+facturacionService.calcularTotal("reducido", 79));
		System.out.println("estandar: "+facturacionService.calcularTotal("estandar", 50));

	}

}
