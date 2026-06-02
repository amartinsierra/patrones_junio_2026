package com.good.singleton;

import com.good.prototype.Course;
import com.good.prototype.Student;

public class GestorStudent {
	private static GestorStudent gestor;
	private Student student;
	private GestorStudent() {
		student=new Student("Alumno",new Course("Curso patrones",20),"mañana");
	}
	public static GestorStudent getInstance() {
		if(gestor==null) {
			gestor=new GestorStudent();
		}
		return gestor;
	}
	
	public Student getClone() {
		return student.clone();
	}
	
}
