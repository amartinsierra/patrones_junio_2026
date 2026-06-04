package cliente;

import mediador.ChatConcreto;
import memento.DocumentoMemento;
import observer.Usuario;
import originador.Documento;

public class Demo {

	public static void main(String[] args) {
		ChatConcreto chat = new ChatConcreto();
        Documento doc = new Documento();

        Usuario ana = new Usuario("Ana", chat);
        Usuario juan = new Usuario("Juan", chat);

        chat.agregarUsuario(ana);
        chat.agregarUsuario(juan);

        doc.agregarObservador(ana);
        doc.agregarObservador(juan);
        // Observer: usuarios reciben actualización
        doc.escribir("dato1 ");
        doc.escribir("dato2 ");
        // Memento: guardar estado actual
        DocumentoMemento backup = doc.guardar();

        
        doc.escribir("dato3");

        
        // Mediator: mensaje entre usuarios
        ana.enviarMensaje("Cambio el documento");

        // Restaurar documento con Memento
        System.out.println("🔄 Restaurando versión anterior...");
        doc.restaurar(backup);


	}

}
