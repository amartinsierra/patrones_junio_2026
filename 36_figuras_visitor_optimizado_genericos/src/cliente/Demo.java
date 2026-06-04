package cliente;

import java.util.List;

import visitados.Circulo;
import visitados.Figura;
import visitados.Rectangulo;
import visitantes.AreaVisitor;
import visitantes.DibujarVisitor;
import visitantes.FiguraVisitor;

public class Demo {
	public static void main(String[] args) {
        List<Figura> figuras = List.of(
            new Circulo(5),
            new Rectangulo(4, 6)
        );

        FiguraVisitor areaVisitor = new AreaVisitor();
        FiguraVisitor dibujarVisitor = new DibujarVisitor();

        System.out.println("== Cálculo de áreas ==");
        figuras.forEach(f -> f.accept(areaVisitor));

        System.out.println("\n== Dibujado ==");
        figuras.forEach(f -> f.accept(dibujarVisitor));
    }

}
