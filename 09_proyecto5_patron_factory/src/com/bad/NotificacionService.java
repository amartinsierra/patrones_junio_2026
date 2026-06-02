package com.bad;

public class NotificacionService {
    public void procesar(String tipo, String mensaje) {
        Notificacion notificacion;

        if ("email".equalsIgnoreCase(tipo)) {
            notificacion = new EmailNotificacion();
        } else if ("sms".equalsIgnoreCase(tipo)) {
            notificacion = new SmsNotificacion();
        } else if ("push".equalsIgnoreCase(tipo)) {
            notificacion = new PushNotificacion();
        } else {
            throw new IllegalArgumentException("Tipo no soportado");
        }

        notificacion.enviar(mensaje);
    }
}
