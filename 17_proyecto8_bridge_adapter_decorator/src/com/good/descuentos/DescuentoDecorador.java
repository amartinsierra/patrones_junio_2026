package com.good.descuentos;

import com.good.pedidos.Pedido;

public abstract class DescuentoDecorador implements Pedido {

	protected Pedido pedido;

    public DescuentoDecorador(Pedido pedido) {
        this.pedido = pedido;
    }


}
