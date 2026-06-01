package com.patrones.prototype;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Cloneable{
    private String titulo;
    private String isbn;
    private String autor;
    public List<String> promociones;
    
    public Libro(String titulo, String isbn, String autor, List<String> promociones) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.promociones = promociones;
	}
	//getter setter
    @Override 
    public Libro clone() {
        try {
            //llamada al método clone() heredado de Object
            Libro clon= (Libro)super.clone();
            clon.setPromociones(new ArrayList<>(clon.getPromociones()));
            return clon;
        }catch(CloneNotSupportedException ex) {
            throw new AssertionError();
        }
    }
    public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", promociones=" + promociones + "]";
	}
	public List<String> getPromociones() {
		return promociones;
	}
	public void setPromociones(List<String> promociones) {
		this.promociones = promociones;
	}
	  
	
}

