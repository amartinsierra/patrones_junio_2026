package com.patrones.visitor.elements;

import com.patrones.visitor.visitors.FiguraVisitor;

public final class Rectangulo implements Figura {
    public double ancho, alto;
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho; this.alto = alto;
    }

    @Override
    public void accept(FiguraVisitor visitor) {
        visitor.visit(this);
    }
}
