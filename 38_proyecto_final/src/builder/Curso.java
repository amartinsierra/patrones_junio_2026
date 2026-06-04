package builder;

import java.util.ArrayList;
import java.util.List;

import composite.Componente;
import service.CursosService;

public class Curso {
    private String name;
    private List<Componente> modules;

    public Curso(String name) {
        this.name = name;
        
    }

    public void showCourse() {
        System.out.println("Course: " + name);
        modules.forEach(Componente::showInfo);
    }
    public static class CursoBuilder{
    	Curso curso;
    	CursosService service=new CursosService();
    	public CursoBuilder(String nombre) {
    		curso=new Curso(nombre);
    		curso.modules=new ArrayList<>();
    	}
    	public CursoBuilder nuevoModulo(String nombre,Componente... components ) {
    		curso.modules.add(service.crearModulo(nombre, components));
    		return this;
    	}
    	public Curso build() {
    		return curso;
    	}
    }
}
