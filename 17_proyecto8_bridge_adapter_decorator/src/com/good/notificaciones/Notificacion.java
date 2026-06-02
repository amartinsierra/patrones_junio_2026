package com.good.notificaciones;

import com.good.canales.CanalNotificacion;

public abstract class Notificacion {
    protected CanalNotificacion canal;

    public Notificacion(CanalNotificacion canal) {
        this.canal = canal;
    }

    public abstract void enviarMensaje(String contenido);
}

