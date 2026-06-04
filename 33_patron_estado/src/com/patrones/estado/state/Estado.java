package com.patrones.estado.state;

import com.patrones.estado.context.Pedido;

public interface Estado {
    void pagar(Pedido pedido);
    void enviar(Pedido pedido);
}

