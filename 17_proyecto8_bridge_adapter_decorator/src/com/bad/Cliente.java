package com.bad;

public class Cliente {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        tienda.procesarPedido(new Pedido("Libro", 100), "EMAIL");
        tienda.procesarPedido(new Pedido("Juego", 60), "SMS");
    }
}

