package com.good.notificaciones;

import com.good.canales.CanalNotificacion;

public class NotificacionRecordatorio extends Notificacion {
    public NotificacionRecordatorio(CanalNotificacion canal) {
        super(canal);
    }

    @Override
    public void enviarMensaje(String contenido) {
        canal.enviar("Recordatorio de compra: " + contenido);
    }
}

