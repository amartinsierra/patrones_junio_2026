package com.patrones.visitor.visitors;

import com.patrones.visitor.elements.Circulo;
import com.patrones.visitor.elements.Rectangulo;

public class AreaVisitor implements FiguraVisitor {
    @Override
    public void visit(Circulo c) {
        double area = Math.PI * Math.pow(c.radio, 2);
        System.out.println("Área del círculo: " + area);
    }

    @Override
    public void visit(Rectangulo r) {
        double area = r.ancho * r.alto;
        System.out.println("Área del rectángulo: " + area);
    }
}

