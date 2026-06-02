package com.patrones.decorator.decorado;

import com.patrones.decorator.comun.Ordenador;

public final class OrdenadorEstandar implements Ordenador{
    @Override
    public String getDescripcion() {    
        return "Ordenador con configuración estandar";
    }
    @Override
    public double getPrecio() {
        return 500;
    }
}

