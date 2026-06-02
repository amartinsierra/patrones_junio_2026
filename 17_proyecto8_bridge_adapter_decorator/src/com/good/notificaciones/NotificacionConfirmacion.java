package com.good.notificaciones;

import com.good.canales.CanalNotificacion;

public class NotificacionConfirmacion extends Notificacion {
    public NotificacionConfirmacion(CanalNotificacion canal) {
        super(canal);
    }

    @Override
    public void enviarMensaje(String contenido) {
        canal.enviar("Confirmación de compra: " + contenido);
    }
}

