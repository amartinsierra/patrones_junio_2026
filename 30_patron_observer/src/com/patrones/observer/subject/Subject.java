package com.patrones.observer.subject;

import com.patrones.observer.observer.Observer;

public interface Subject {
    void registrar(Observer o);
    void eliminar(Observer o);
    
}

