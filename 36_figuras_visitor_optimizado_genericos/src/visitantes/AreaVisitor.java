package visitantes;

import visitados.Circulo;
import visitados.Figura;
import visitados.Rectangulo;

public class AreaVisitor implements FiguraVisitor {
	public void visit(Circulo c) {
        double area = Math.PI * Math.pow(c.getRadio(), 2);
        System.out.println("Área del círculo: " + area);
    }

    public void visit(Rectangulo r) {
        double area = r.getAncho() * r.getAlto();
        System.out.println("Área del rectángulo: " + area);
    }
    
}
