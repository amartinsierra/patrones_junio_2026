package com.patrones.factory.dao;

import java.util.List;

import com.patrones.factory.model.Producto;

public interface ProductosDao {
	Producto save(Producto producto);
	List<Producto> findAll();
}
