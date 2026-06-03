package com.patrones.flyweight;

public class FacturacionService {
    private final UsoIVAFactory usoIVAFactory;
    public FacturacionService(UsoIVAFactory usoIVAFactory) {
        this.usoIVAFactory = usoIVAFactory;
    }
    public double calcularTotal(String tipo, double base) {
        UsoIVA uso = usoIVAFactory.obtenerUso(tipo);
        return uso.aplicarIVA(base);
    }
}

