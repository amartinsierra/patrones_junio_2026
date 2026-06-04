package visitor;

import documentos.Albaran;
import documentos.Factura;
import documentos.Pedido;

public class ExportadorVisitor implements DocumentoVisitor {

	public void visit(Factura f) { System.out.println("Exportando factura a PDF..."); }
    public void visit(Pedido p) { System.out.println("Exportando pedido a PDF..."); }
    public void visit(Albaran a) { System.out.println("Exportando albarán a PDF..."); }
	
}
