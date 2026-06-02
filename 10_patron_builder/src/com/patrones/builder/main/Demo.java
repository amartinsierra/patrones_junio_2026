package com.patrones.builder.main;

import com.patrones.builder.Conector;

public class Demo {

	public static void main(String[] args) {
		Conector con=new Conector.ConectorBuilder()
				.modo("abierto")
				.dir("aaaaa")
				.build();

	}

}
