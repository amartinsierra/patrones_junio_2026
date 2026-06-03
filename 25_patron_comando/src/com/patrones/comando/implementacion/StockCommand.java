package com.patrones.comando.implementacion;

import com.patrones.comando.interfaz.Command;

public class StockCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Actualziando stock.");
        //:
        // restApi.invoke(….);
    }
}
