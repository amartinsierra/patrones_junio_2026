package com.patrones.factory.dao;

import java.util.List;

import com.patrones.factory.model.Producto;

public class ProductosDaoJdbc implements ProductosDao {

	@Override
	public Producto save(Producto producto) {
		System.out.println("salvando producto por JDBC");
		return null;
	}

	@Override
	public List<Producto> findAll() {
		System.out.println("obteniendo productos por JDBC");
		return null;
	}

}
