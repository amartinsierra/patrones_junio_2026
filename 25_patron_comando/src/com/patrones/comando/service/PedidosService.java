package com.patrones.comando.service;

import com.patrones.comando.implementacion.CommandDispatcher;
import com.patrones.comando.implementacion.CreateOrderCommand;
import com.patrones.comando.implementacion.SendEmailConfirmationCommand;
import com.patrones.comando.implementacion.StockCommand;
import com.patrones.comando.repository.OrderRepository;

public class PedidosService {
    private final CommandDispatcher dispatcher = new CommandDispatcher();
    private final OrderRepository repository= new OrderRepository();
   

    public void crearPedido(String pedidoId) {
        System.out.println("Pedido creado: " + pedidoId);

        // Encapsulamos las operaciones como comandos
        dispatcher.addCommand(new StockCommand());
        dispatcher.addCommand(new CreateOrderCommand(repository));
        dispatcher.addCommand(new SendEmailConfirmationCommand());

        // Ejecutamos los comandos
        dispatcher.dispatch();
    }
}

