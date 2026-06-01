package com.patrones.singleton;

public class LoggerSingleton {
	// Instancia única
	private static LoggerSingleton logger;
	// Constructor privado para evitar crear instancias desde el exterior
	private LoggerSingleton() {}
	// Crea o devuelve la instancia existente
	public static synchronized LoggerSingleton getInstance() {
		if (logger == null) {
			logger = new LoggerSingleton();
		}
		return logger;
	}
	// Método para registrar mensajes
	public void log(String mensaje) {
		System.out.println("[LOG] " + mensaje);
	}
}
