package service;

import composite.Componente;
import composite.Modulo;
import observer.AnalyticsSystem;
import observer.ObservableModule;

public class CursosService {
	public Modulo crearModulo(String nombre, Componente ... components) {
		ObservableModule modulo=new ObservableModule(nombre);
		modulo.addObserver(new AnalyticsSystem());
		for(Componente component:components) {
			modulo.add(component);
		}
		return modulo;
	}
}
