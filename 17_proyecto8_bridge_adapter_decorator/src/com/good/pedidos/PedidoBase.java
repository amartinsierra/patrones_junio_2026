package com.good.pedidos;

public final class PedidoBase implements Pedido {

	private String producto;
    private double precio;

    public PedidoBase(String producto, double precio) {
        this.producto = producto;
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String getProducto() {
        return producto;
    }


}
