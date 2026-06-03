package com.good.fachada;

import com.good.composite.ComponenteReproducible;
import com.good.composite.ListaReproduccion;
import com.good.composite.Pelicula;
import com.good.composite.Serie;
import com.good.flyweight.Factory;
import com.good.flyweight.Recurso;

public class StreamingFachada {
    public ComponenteReproducible crearPelicula(String titulo, String subt, String aud, boolean premium) {
        Recurso subtitulos = Factory.getRecurso(subt);
        Recurso audio = Factory.getRecurso(aud);
        Pelicula pelicula = new Pelicula(titulo, subtitulos, audio);
        
        return pelicula;
        //***opción por si queremos utilizar proxy
       //return new ProxyPelicula(pelicula, premium);
    }
    public ComponenteReproducible crearSerie(String titulo, int temporada, String subt, String aud) {
        Recurso subtitulos = Factory.getRecurso(subt);
        Recurso audio = Factory.getRecurso(aud);
        if(temporada<1) {
        	throw new RuntimeException("temporada no válida");
        }
        return new Serie(titulo, subtitulos, audio,temporada);
    }

    public ListaReproduccion crearLista(String nombre, ComponenteReproducible... elementos) {
        ListaReproduccion lista = new ListaReproduccion(nombre);
        for (ComponenteReproducible e : elementos) {
            lista.agregar(e);
        }
        return lista;
    }
}
