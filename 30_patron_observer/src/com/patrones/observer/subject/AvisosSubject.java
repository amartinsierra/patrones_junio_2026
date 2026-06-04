package com.patrones.observer.subject;

import java.util.ArrayList;
import java.util.List;

import com.patrones.observer.observer.Observer;

public class AvisosSubject implements Subject {
    private final List<Observer> suscriptores = new ArrayList<>();
    @Override
    public void registrar(Observer o) {
        suscriptores.add(o);
    }
    @Override
    public void eliminar(Observer o) {
        suscriptores.remove(o);
    }
    
    public void notificar(String mensaje) {
        for (Observer o : suscriptores) {
            o.recibir(mensaje);
        }
    }
    public void nuevoAviso(String aviso) {
        System.out.println("Nuevo aviso: " + aviso);
        notificar(aviso);
    }
}
