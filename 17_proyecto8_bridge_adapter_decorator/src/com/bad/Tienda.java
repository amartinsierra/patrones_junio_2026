package com.bad;

public class Tienda {
    public void procesarPedido(Pedido pedido, String tipoNotificacion) {
        double precioFinal = pedido.getPrecio();

        // Aplicar descuento "hardcodeado"
        if (pedido.getProducto().equalsIgnoreCase("Libro")) {
            precioFinal *= 0.9; // 10% descuento en libros
        }

        // Notificación rígida y acoplada
        if (tipoNotificacion.equals("EMAIL")) {
            System.out.println("Enviando EMAIL: Compra de " + pedido.getProducto() + " por " + precioFinal);
        } else if (tipoNotificacion.equals("SMS")) {
            System.out.println("Enviando SMS: Compra de " + pedido.getProducto() + " por " + precioFinal);
        }
    }
}

