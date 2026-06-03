package service;

import composite.Categoria;
import composite.Curso;
import composite.CursoComponente;
import decorador.CertificadoDecorador;
import decorador.TutoriaDecorador;

public class FormacionService {
	public Curso crearCurso(String nombre, double precio) {
		return new Curso(nombre, precio);
	}
	public CursoComponente crearCursoTutoria(String nombre, double precio) {
		return new TutoriaDecorador(crearCurso(nombre,precio));
	}
	public CursoComponente crearCursoCertificado(String nombre, double precio) {
		return new CertificadoDecorador(crearCurso(nombre,precio));
	}
	public Categoria crearCategoria(String nombre, CursoComponente... componentes) {
		Categoria categoria=new Categoria(nombre);
		for(CursoComponente curso:componentes) {
			categoria.agregar(curso);
		}
		return categoria;
	}
}
