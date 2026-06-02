package com.good.factory;

import com.good.notificacion.Notificacion;
import com.good.notificacion.SmsNotificacion;

public class SmsNotificacionFactory implements NotificacionFactory {
    public Notificacion crearNotificacion() {
        return new SmsNotificacion();
    }
}

