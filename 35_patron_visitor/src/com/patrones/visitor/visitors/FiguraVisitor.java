package com.patrones.visitor.visitors;

import com.patrones.visitor.elements.Circulo;
import com.patrones.visitor.elements.Rectangulo;

public interface FiguraVisitor {
    void visit(Circulo c);
    void visit(Rectangulo r);
}
