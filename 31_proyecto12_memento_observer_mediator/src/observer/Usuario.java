package observer;

import mediador.MediadorChat;

public class Usuario implements Observador {
    private String nombre;
    private MediadorChat mediador;

    public Usuario(String nombre, MediadorChat mediador) {
        this.nombre = nombre;
        this.mediador = mediador;
    }

    @Override
    public void actualizar(String nuevoContenido) {
        System.out.println(nombre + " ve el nuevo contenido: " + nuevoContenido);
    }

    public void enviarMensaje(String mensaje) {
        mediador.enviar(this, mensaje);
    }

    public String getNombre() {
        return nombre;
    }
}

