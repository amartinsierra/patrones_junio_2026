package memento;

public class DocumentoMemento {
    private final String contenido;

    public DocumentoMemento(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }
}
