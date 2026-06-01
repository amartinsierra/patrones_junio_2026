package com.patrones.singleton.enums;

public enum LoggerSingleton {
	INSTANCE; //se crea una única instancia de forma segura, garantizado por la JVM
	public void log(String msg) {
		System.out.println("[LOG] " + msg);
	}
}
