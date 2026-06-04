package com.patrones.estado.context;

import com.patrones.estado.state.Estado;
import com.patrones.estado.state.Nuevo;

public class Pedido {
    private Estado estado;
    public Pedido() {
        this.estado = new Nuevo(); // arranca como nuevo
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public void pagar() {
        estado.pagar(this);
    }
    public void enviar() {
        estado.enviar(this);
    }
}

