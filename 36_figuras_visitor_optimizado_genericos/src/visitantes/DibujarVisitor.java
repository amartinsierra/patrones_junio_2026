package visitantes;

import visitados.Circulo;
import visitados.Figura;
import visitados.Rectangulo;

public class DibujarVisitor implements FiguraVisitor {
	public void visit(Circulo c) {
        System.out.println("Dibujando un círculo de radio " + c.getRadio());
    }

    public void visit(Rectangulo r) {
        System.out.println("Dibujando un rectángulo " + r.getAncho() + "x" + r.getAlto());
    }
    
}
