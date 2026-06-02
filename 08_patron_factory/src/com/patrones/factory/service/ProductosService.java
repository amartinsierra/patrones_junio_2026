package com.patrones.factory.service;

import com.patrones.factory.dao.ProductosDao;

public class ProductosService {
	private ProductosDao productosDao;

	public ProductosService(ProductosDao productosDao) {
		this.productosDao = productosDao;
	}
	//metodos 
}
