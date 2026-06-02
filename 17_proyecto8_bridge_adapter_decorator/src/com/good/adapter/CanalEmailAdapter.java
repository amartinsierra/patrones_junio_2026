package com.good.adapter;

import com.good.canales.CanalNotificacion;

public class CanalEmailAdapter implements CanalNotificacion {
    private ProveedorExternoMailChimp mailchimp = new ProveedorExternoMailChimp();

    @Override
    public void enviar(String mensaje) {
    	
        mailchimp.sendMail(mensaje);
        mailchimp.registrarContenido(mensaje);
    }
}

