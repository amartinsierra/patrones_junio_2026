package com.patrones.flyweight;

public class Main {
    public static void main(String[] args) {
        ProcesadorDocumentosFacade procesador = new ProcesadorDocumentosFacade();

        String[] palabras = {"hola", "prueba", "hola", "java", "prueba", "hola"};
        Documento doc = procesador.cargarDocumento(palabras);

        procesador.imprimirResumen(doc);
    }
}

