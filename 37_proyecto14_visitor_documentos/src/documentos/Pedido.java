package documentos;

import visitor.DocumentoVisitor;

public final class Pedido extends Documento {
    public Pedido(String id) { super(id); }
    public void accept(DocumentoVisitor visitor) { visitor.visit(this); }
}