package com.good.factory;

import com.good.notificacion.EmailNotificacion;
import com.good.notificacion.Notificacion;

public class EmailNotificacionFactory implements NotificacionFactory {
    public Notificacion crearNotificacion() {
        return new EmailNotificacion();
    }
}

