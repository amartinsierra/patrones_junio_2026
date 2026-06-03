package service;

import composite.Categoria;
import composite.Curso;
import composite.CursoComponente;
import decorador.CertificadoDecorador;
import decorador.TutoriaDecorador;
import flyweight.Factory;

public class FormacionService {
	public Curso crearCurso(String nombre, double precio,String aula, int capacidad) {
		return new Curso(nombre, precio,Factory.getAula(aula, capacidad));
	}
	public CursoComponente crearCursoTutoria(CursoComponente curso) {
		return new TutoriaDecorador(curso);
	}
	public CursoComponente crearCursoCertificado(CursoComponente curso) {
		return new CertificadoDecorador(curso);
	}
	public Categoria crearCategoria(String nombre, CursoComponente... componentes) {
		Categoria categoria=new Categoria(nombre);
		for(CursoComponente curso:componentes) {
			categoria.agregar(curso);
		}
		return categoria;
	}
}
