package com.patrones.estado.state;

import com.patrones.estado.context.Pedido;

public class Enviado implements Estado {
    public void pagar(Pedido pedido) {
        System.out.println("❌ No puedes pagar, ya está enviado");
    }
    public void enviar(Pedido pedido) {
        System.out.println("❌ Ya está enviado");
    }
}
