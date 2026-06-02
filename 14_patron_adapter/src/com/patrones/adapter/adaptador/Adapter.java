package com.patrones.adapter.adaptador;

import com.patrones.adapter.adaptable.Info;
import com.patrones.adapter.target.Mensaje;

public class Adapter implements Mensaje{
    private Info info;
    public Adapter(Info info){
        this.info=info;
    }
    @Override
    public void send(String texto){
        info.save(texto);
        info.register(texto);
    }
}

