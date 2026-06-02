package com.patrones.factory.factoria;

import com.patrones.factory.dao.ProductosDao;
import com.patrones.factory.dao.ProductosDaoJdbc;

public class ProductosDaoJdbcFactory implements ProductosDaoFactory {

	@Override
	public ProductosDao crear() {
		return new ProductosDaoJdbc();
	}

}
