package com.patrones.factory.dao;

import java.util.List;

import com.patrones.factory.model.Producto;

public class ProductosDaoJpa implements ProductosDao {

	@Override
	public Producto save(Producto producto) {
		System.out.println("salvando producto por JPA");
		return null;
	}

	@Override
	public List<Producto> findAll() {
		System.out.println("obteniendo productos por JPA");
		return null;
	}

}
