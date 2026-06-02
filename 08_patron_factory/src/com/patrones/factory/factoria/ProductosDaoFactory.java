package com.patrones.factory.factoria;

import com.patrones.factory.dao.ProductosDao;

public interface ProductosDaoFactory {
	ProductosDao crear();
}
