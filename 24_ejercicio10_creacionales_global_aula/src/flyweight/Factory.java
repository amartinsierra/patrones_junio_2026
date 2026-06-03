package flyweight;

import java.util.HashMap;
import java.util.Map;

public class Factory {
	private static final Map<String, Aula> cache = new HashMap<>();

    public static Aula getAula(String nombre,int capacidad) {
        return cache.computeIfAbsent(nombre, n->new AulaConcreta(n,capacidad));
    }
}
