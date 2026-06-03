package com.patrones.estrategia;

import java.util.List;

public class BusquedaPorEmail implements BusquedaStrategy {
    public List<Usuario> buscar(List<Usuario> usuarios, String criterio) {
        return usuarios.stream()
                .filter(u -> u.getEmail().equalsIgnoreCase(criterio))
                .toList();
    }
}

