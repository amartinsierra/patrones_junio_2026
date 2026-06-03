package com.patrones.composite;

public class Demo {
	public static void main(String[] args) {
        EmpleadoSimple dev1 = new EmpleadoSimple("Carlos", "Desarrollador");
        EmpleadoSimple dev2 = new EmpleadoSimple("Laura", "Desarrollador");
        EmpleadoSimple rrhh = new EmpleadoSimple("Marta", "Recursos Humanos");

        EmpleadoCompuesto jefeDesarrollo = new EmpleadoCompuesto("Elena", "Jefa de Desarrollo");
        jefeDesarrollo.agregarSubordinado(dev1);
        jefeDesarrollo.agregarSubordinado(dev2);

        EmpleadoCompuesto director = new EmpleadoCompuesto("Ana", "Directora General");
        director.agregarSubordinado(jefeDesarrollo);
        director.agregarSubordinado(rrhh);

        director.mostrarDetalles();
    }
}
