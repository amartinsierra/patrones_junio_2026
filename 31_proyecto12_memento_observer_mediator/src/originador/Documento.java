package originador;

import java.util.ArrayList;
import java.util.List;

import memento.DocumentoMemento;
import observer.Observador;

public class Documento implements Subject {
    private String contenido = "";
    private List<Observador> observadores = new ArrayList<>();

    public void escribir(String texto) {
        contenido += texto;
        notificar();
    }

    public DocumentoMemento guardar() {
        return new DocumentoMemento(contenido);
    }

    public void restaurar(DocumentoMemento memento) {
        contenido = memento.getContenido();
        notificar();
    }

    public String getContenido() {
        return contenido;
    }

    @Override
	public void agregarObservador(Observador obs) {
        observadores.add(obs);
    }

    private void notificar() {
        for (Observador obs : observadores) {
            obs.actualizar(contenido);
        }
    }
}

