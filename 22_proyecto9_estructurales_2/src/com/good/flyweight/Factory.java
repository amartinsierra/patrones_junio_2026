package com.good.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private static final Map<String, RecursoCompartido> cache = new HashMap<>();

    public static Recurso getRecurso(String data) {
        return cache.computeIfAbsent(data, RecursoCompartido::new);
    }
}

