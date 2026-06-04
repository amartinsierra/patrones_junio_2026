package visitor;

import documentos.Albaran;
import documentos.Factura;
import documentos.Pedido;

public class ValidadorVisitor implements DocumentoVisitor {
    public void visit(Factura f) { System.out.println("Validando factura..."); }
    public void visit(Pedido p) { System.out.println("Validando pedido..."); }
    public void visit(Albaran a) { System.out.println("Validando albarán..."); }
}
