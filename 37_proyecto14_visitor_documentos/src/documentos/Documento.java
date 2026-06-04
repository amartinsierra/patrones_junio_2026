package documentos;

import visitor.DocumentoVisitor;

public sealed abstract class Documento permits Factura,Pedido,Albaran{
    String id;
    public Documento(String id) { this.id = id; }
    public abstract void accept(DocumentoVisitor visitor);
}