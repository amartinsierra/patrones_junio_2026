package com.good.adapter;

public class ProveedorExternoMailChimp {
    public void sendMail(String contenido) {
        System.out.println("MailChimp: " + contenido);
    }
    public void registrarContenido(String contenido) {
    	System.out.println("Registrando en MailChimp el contenido " + contenido);
    }
}

