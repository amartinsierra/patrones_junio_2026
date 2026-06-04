package com.patrones.visitor.elements;

import com.patrones.visitor.visitors.FiguraVisitor;

public sealed interface Figura permits Circulo,Rectangulo{
    void accept(FiguraVisitor visitor);
}

