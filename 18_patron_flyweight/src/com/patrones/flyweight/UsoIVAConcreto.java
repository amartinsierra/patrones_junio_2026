package com.patrones.flyweight;

public class UsoIVAConcreto implements UsoIVA {
    private final double porcentaje;
    public UsoIVAConcreto(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    @Override
    public double aplicarIVA(double baseImponible) {
        return baseImponible*porcentaje;
    }
}

