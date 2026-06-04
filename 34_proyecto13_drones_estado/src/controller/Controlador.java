package controller;

import estados.EnTierra;
import estados.Estado;

public class Controlador {

    private Estado state;

    public Controlador() {
        this.state = new EnTierra(); // estado inicial
    }

    public void setEstado(Estado newState) {
        this.state = newState;
    }

    public void despegar() {
    	state.despegar(this);
    }
	public void aterrizar() {
		state.aterrizar(this);
	}
	public void reconocimiento() {
		state.reconocimiento(this);
	}
	public void regresar() {
		state.regresar(this);
	}
}