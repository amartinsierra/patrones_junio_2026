package com.patrones.estado.client;

import com.patrones.estado.context.Pedido;

public class Demo {
	public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.enviar(); // ❌ No puedes enviar
        pedido.pagar();  // ✅ Pedido pagado
        pedido.enviar(); // 📦 Pedido enviado
        pedido.pagar();  // ❌ No puedes pagar, ya está enviado
    }
}
