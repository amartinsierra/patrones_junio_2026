package com.solid.good.streaming;

//reponsabilidad única
public abstract class Reproductor {
	private String archivo;
	public Reproductor(String archivo) {
		this.archivo = archivo;
	}

	public String getArchivo() {
		return archivo;
	}

	public abstract void reproducir();
}
