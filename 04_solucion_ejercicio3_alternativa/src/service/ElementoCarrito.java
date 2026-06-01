package service;

import envios.Envio;
import items.Producto;

public record ElementoCarrito(Producto producto,Envio envio, int cantidad) {

}
