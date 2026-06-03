package cliente;

import composite.Categoria;
import composite.Curso;
import composite.CursoComponente;
import decorador.CertificadoDecorador;
import decorador.TutoriaDecorador;
import service.FormacionService;

public class Demo {
	public static void main(String[] args) {
		FormacionService formacionService=new FormacionService();
        // Creamos cursos simples
		CursoComponente javaBasico = formacionService.crearCurso("Java Básico", 200,"aula1",10);
        CursoComponente springBoot = formacionService.crearCurso("Spring Boot Avanzado",80,"aula2",15);
        CursoComponente iaIntro = formacionService.crearCurso("Introducción a la IA", 250,"aula1",10);
        CursoComponente cursoConExtras = formacionService.crearCursoCertificado(javaBasico);
        // Creamos subcategorias categorías
        Categoria programacion = formacionService.crearCategoria("Programación",cursoConExtras,springBoot);
       

        Categoria inteligenciaArtificial = formacionService.crearCategoria("Inteligencia Artificial",iaIntro);
       
        //categoria principal
        Categoria formacion = formacionService.crearCategoria("Formación Online",programacion,inteligenciaArtificial);
        
        

        // Mostrar estructura completa
        System.out.println("=== Catálogo de formación ===");
        formacion.mostrar();
        System.out.println("Precio total formación: " + formacion.getPrecio() + "€");

        // Mostrar curso decorado
        System.out.println("\n=== Curso decorado ===");
        cursoConExtras.mostrar();
        System.out.println("Precio final curso decorado: " + cursoConExtras.getPrecio() + "€");
    }

}
