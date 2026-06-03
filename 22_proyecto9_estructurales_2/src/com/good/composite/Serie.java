package com.good.composite;

import com.good.flyweight.Recurso;

public class Serie implements ComponenteReproducible {
	private String titulo;
    private Recurso subtitulos;
    private Recurso audio;
    private int temporada;
    

	public Serie(String titulo, Recurso subtitulos, Recurso audio, int temporada) {
		super();
		this.titulo = titulo;
		this.subtitulos = subtitulos;
		this.audio = audio;
		this.temporada = temporada;
	}


	@Override
	public void reproducir() {
		System.out.println("🎬 Reproduciendo la temporada "+temporada+" de la serie " + titulo + " con audio " +
                audio.getData() + " y subtítulos " + subtitulos.getData());

	}

}
