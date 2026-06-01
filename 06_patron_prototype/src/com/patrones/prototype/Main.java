package com.patrones.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Libro l1=new Libro("Java 20", "11111A", "yo mismo",new ArrayList<String>(List.of("Navidad","Black friday")));
		Libro l2=l1.clone();//l2 apunta a un objeto idéntico a l1, 
		//pero son distintos objetos
		l2.setAutor("tu mismo");
		l2.getPromociones().add("Feria libro");
		System.out.println(l1); //Libro [titulo=Java 20, isbn=11111A, autor=yo mismo]

		System.out.println(l2); //Libro [titulo=Java 20, isbn=11111A, autor=tu mismo]


	}

}
