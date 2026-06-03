package com.good.flyweight;

public class RecursoCompartido implements Recurso {
    private String data;

    public RecursoCompartido(String data) {
        this.data = data;
    }

    @Override
	public String getData() {
        return data;
    }
}

