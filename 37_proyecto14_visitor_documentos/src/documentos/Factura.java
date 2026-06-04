package documentos;

import visitor.DocumentoVisitor;

public final class Factura extends Documento {
    public Factura(String id) { super(id); }
    public void accept(DocumentoVisitor visitor) { visitor.visit(this); }
}