package com.patrones.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UsoIVAFactory {
    private final Map<String, UsoIVA> cache = new ConcurrentHashMap<>();
    public UsoIVA obtenerUso(String tipo) {
        return cache.computeIfAbsent(tipo, k -> {
            // Simular carga de config externa
            double porcentaje = switch (k) {
                case "superreducido" -> 0.04;
                case "reducido" -> 0.1;
                case "estandar" -> 0.21;
                default -> 0.5;
            };
            return new UsoIVAConcreto(porcentaje);
        });
    }
}
