package com.patrones.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PalabraFactory {
    private static final Map<String, Palabra> pool = new HashMap<>();

    public static Palabra getPalabra(String texto) {
        return pool.computeIfAbsent(texto, PalabraConcreta::new);
    }

    public static int getNumeroInstancias() {
        return pool.size();
    }
}
