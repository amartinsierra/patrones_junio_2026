package com.patrones.visitor.elements;

import com.patrones.visitor.visitors.FiguraVisitor;

public final class Circulo implements Figura {
    public double radio;
    public Circulo(double radio) { this.radio = radio; }

    @Override
    public void accept(FiguraVisitor visitor) {
        visitor.visit(this);
    }
}
