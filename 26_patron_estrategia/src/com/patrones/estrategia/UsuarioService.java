package com.patrones.estrategia;

import java.util.List;
import java.util.Map;

public class UsuarioService {
    private final List<Usuario> usuarios = List.of(
        new Usuario("Ana", "ana@email.com", "ADMIN"),
        new Usuario("Luis", "luis@email.com", "USER"),
        new Usuario("Carla", "carla@email.com", "USER")
    );
    private final Map<String, BusquedaStrategy> estrategias = Map.of(
        "nombre", new BusquedaPorNombre(),
        "email", new BusquedaPorEmail(),
        "departamento", new BusquedaPorDep()
    );
    public List<Usuario> buscar(String campo, String valor) {
        BusquedaStrategy strategy = estrategias.get(campo.toLowerCase());
        if (strategy == null) {
            throw new IllegalArgumentException("Criterio de búsqueda no válido: " + campo);
        }
        return strategy.buscar(usuarios, valor);
    }
}

