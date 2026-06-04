package visitor;

import documentos.Albaran;
import documentos.Factura;
import documentos.Pedido;

public interface DocumentoVisitor {
    void visit(Factura factura);
    void visit(Pedido pedido);
    void visit(Albaran albaran);

}
