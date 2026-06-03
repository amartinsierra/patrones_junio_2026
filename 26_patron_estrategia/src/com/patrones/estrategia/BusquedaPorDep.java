package com.patrones.estrategia;

import java.util.List;

public class BusquedaPorDep implements BusquedaStrategy {
    public List<Usuario> buscar(List<Usuario> usuarios, String criterio) {
        return usuarios.stream()
                .filter(u -> u.getDepartamento().equalsIgnoreCase(criterio))
                .toList();
    }
}

