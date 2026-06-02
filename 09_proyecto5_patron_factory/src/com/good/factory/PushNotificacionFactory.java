package com.good.factory;

import com.good.notificacion.Notificacion;
import com.good.notificacion.PushNotificacion;

public class PushNotificacionFactory implements NotificacionFactory {
    public Notificacion crearNotificacion() {
        return new PushNotificacion();
    }
}

