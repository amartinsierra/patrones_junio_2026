package com.good.notificacion;

public class PushNotificacion implements Notificacion {
    public void enviar(String mensaje) {
        System.out.println("Enviando PUSH: " + mensaje);
    }
}

