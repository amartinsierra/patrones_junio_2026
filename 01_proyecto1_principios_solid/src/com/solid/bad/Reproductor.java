package com.solid.bad;

public class Reproductor {
	
	    public void reproducirMusica(String archivo) {
	        System.out.println("Reproduciendo música: " + archivo);
	    }

	    public void reproducirVideo(String archivo) {
	        System.out.println("Reproduciendo video: " + archivo);
	    }

	    // Métodos de descarga metidos aquí (mala práctica)
	    public void descargarArchivo(String archivo) {
	        System.out.println("Descargando archivo: " + archivo);
	    }

	    // Lógica de pago
	    public void procesarPago(String usuario, double cantidad) {
	        System.out.println("Procesando pago de " + cantidad + "€ para " + usuario);
	    }
	    
	    

}
