package visitor;

import documentos.Albaran;
import documentos.Factura;
import documentos.Pedido;

public class ImpuestosVisitor implements DocumentoVisitor {
    public void visit(Factura f) { System.out.println("Calculando IVA para factura..."); }
    public void visit(Pedido p) { System.out.println("Calculando impuestos del pedido..."); }
    public void visit(Albaran a) { System.out.println("Albarán sin impuestos."); }
}
