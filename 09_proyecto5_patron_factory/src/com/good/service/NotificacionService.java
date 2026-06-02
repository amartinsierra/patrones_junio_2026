package com.good.service;

import com.good.notificacion.Notificacion;

public class NotificacionService {
    private final Notificacion notificacion;
    public NotificacionService(Notificacion notificacion) {
        this.notificacion = notificacion;
    }
    public void procesar(String mensaje) {
        notificacion.enviar(mensaje);
    }
}

