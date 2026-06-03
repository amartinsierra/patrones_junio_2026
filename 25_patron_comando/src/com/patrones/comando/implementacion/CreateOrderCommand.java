package com.patrones.comando.implementacion;

import com.patrones.comando.interfaz.Command;
import com.patrones.comando.model.Producto;
import com.patrones.comando.repository.OrderRepository;

public class CreateOrderCommand implements Command {
    private final OrderRepository orderRepository;

    public CreateOrderCommand(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    @Override
    public void execute() {
        System.out.println("Pedido creado.");
        // lógica real: 
        orderRepository.save(new Producto());
    }
} 

