package com.patrones.comando.implementacion;

import java.util.ArrayList;
import java.util.List;

import com.patrones.comando.interfaz.Command;

public class CommandDispatcher {
    private final List<Command> commands=new ArrayList<>();
    public void addCommand(Command command) {
        commands.add(command);
    }
    public void dispatch() {
        commands.forEach(Command::execute);
    }
}
 