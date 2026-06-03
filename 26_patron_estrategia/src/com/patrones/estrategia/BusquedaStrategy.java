package com.patrones.estrategia;

import java.util.List;

public interface BusquedaStrategy {
    List<Usuario> buscar(List<Usuario> usuarios, String criterio);
}
