package documentos;

import visitor.DocumentoVisitor;

public final class Albaran extends Documento {
    public Albaran(String id) { super(id); }
    public void accept(DocumentoVisitor visitor) { visitor.visit(this); }
}