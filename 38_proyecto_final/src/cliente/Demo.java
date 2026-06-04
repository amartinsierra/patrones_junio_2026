package cliente;

import java.util.List;

import builder.Curso;
import composite.Ejercicio;
import composite.Leccion;
import composite.Test;

public class Demo {

	public static void main(String[] args) {
		Curso curso=new Curso.CursoBuilder("Java")
				.nuevoModulo("m1", new Leccion("l1"),new Ejercicio("e1"))
				.nuevoModulo("m2", new Leccion("l2"),new Ejercicio("e2"))
				.nuevoModulo("m3", new Leccion("l1"),new Leccion("l2"),new Leccion("l3"),new Test("t1",List.of("q1","q2")))
				.build();
		curso.showCourse();

	}

}
