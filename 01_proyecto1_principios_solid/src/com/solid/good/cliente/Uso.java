package com.solid.good.cliente;

import com.solid.good.streaming.Musica;
import com.solid.good.streaming.Podcast;
import com.solid.good.streaming.Reproductor;
import com.solid.good.utilities.GestorDescargas;

public class Uso {

	public static void main(String[] args) {
		Musica musica=new Musica("micancion.mp3");
		Podcast podcast=new Podcast("npodcast");
		reproducir(musica);
		reproducir(podcast);
		var gestionDescargas=new GestorDescargas();
		gestionDescargas.descargar("Descargando música: "+musica.getArchivo());
	}
	
	static void reproducir(Reproductor reproductor) {
		reproductor.reproducir();
	}

}
