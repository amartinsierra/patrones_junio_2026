package com.patrones.factory.factoria;

import com.patrones.factory.dao.ProductosDao;
import com.patrones.factory.dao.ProductosDaoJpa;

public class ProductosDaoJpaFactory implements ProductosDaoFactory {

	@Override
	public ProductosDao crear() {
		return new ProductosDaoJpa();
	}

}
