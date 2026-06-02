package com.patrones.bridge.client;

import com.patrones.bridge.abstracciones.Curso;
import com.patrones.bridge.abstracciones.Formacion;
import com.patrones.bridge.abstracciones.Master;
import com.patrones.bridge.implementaciones.ModalidadOnline;
import com.patrones.bridge.implementaciones.ModalidadPresencial;

public class Demo {
	public static void main(String[] args) {
        Formacion cursoOnline = new Curso(new ModalidadOnline());
        Formacion masterPresencial = new Master(new ModalidadPresencial());

        cursoOnline.formar();// Curso se imparte completamente online.
        masterPresencial.formar(); // Máster se imparte de forma presencial
                                     // en el aula.
      }

}
