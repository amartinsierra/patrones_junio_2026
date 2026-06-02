package com.good.canales;

public class CanalSms implements CanalNotificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("📱 SMS enviado: " + mensaje);
    }
}

