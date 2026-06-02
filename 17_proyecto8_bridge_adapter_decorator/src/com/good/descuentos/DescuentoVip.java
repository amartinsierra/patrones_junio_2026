package com.good.descuentos;

import com.good.pedidos.Pedido;

public class DescuentoVip extends DescuentoDecorador {

	public DescuentoVip(Pedido pedido) {
        super(pedido);
    }

    @Override
    public double getPrecio() {
        return pedido.getPrecio() * 0.9; // 10% menos por ser vip
    }

    @Override
    public String getProducto() {
        return pedido.getProducto()+ " con descuento cliente vip";
    }


}
