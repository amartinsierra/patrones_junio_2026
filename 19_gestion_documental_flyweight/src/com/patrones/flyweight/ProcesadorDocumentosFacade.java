package com.patrones.flyweight;

public class ProcesadorDocumentosFacade {
    public Documento cargarDocumento(String[] palabras) {
        Documento doc = new Documento();
        int i = 1;
        for (String palabra : palabras) {
            doc.agregarPalabra(palabra, "línea " + i++);
        }
        return doc;
    }

    public void imprimirResumen(Documento doc) {
        System.out.println("Documento con " + doc.contarPalabras() + " palabras.");
        System.out.println("Palabras únicas almacenadas: " + PalabraFactory.getNumeroInstancias());
    }
}
