package com.good.client;

import com.good.prototype.Student;
import com.good.singleton.GestorStudent;

public class Demo {

	public static void main(String[] args) {
		GestorStudent gestorStudent=GestorStudent.getInstance();
		Student s1=gestorStudent.getClone();
		s1.setName("clon 1");
		Student s2=gestorStudent.getClone();
		s2.getCourse().setDuracion(30);
		s1.showInfo();
		s2.showInfo();
	}

}
