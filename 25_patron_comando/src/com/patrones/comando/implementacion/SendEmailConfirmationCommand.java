package com.patrones.comando.implementacion;

import com.patrones.comando.interfaz.Command;

public class SendEmailConfirmationCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Email de confirmación enviado.");
        /*:
        EmailSender.send(…);*/
    }
} 

