package com.patrones.builder;

public class Conector {
	private final String modo;
    private final int tipo;
    private final String dir;
    private final boolean estado;
    private final String protocolo;

    private Conector(Builder builder) {
        this.modo = builder.modo;
        this.tipo = builder.tipo;
        this.dir = builder.dir;
        this.estado = builder.estado;
        this.protocolo = builder.protocolo;
    }
    public static class Builder {
        private String modo;
        private int tipo;
        private String dir;
        private boolean estado;
        private String protocolo;
        public Builder modo(String modo) {
            this.modo = modo;
            return this;
        }
        public Builder tipo(int tipo) {
            this.tipo = tipo < 0 ? 0 : tipo;
            return this;
        }
        public Builder dir(String dir) {
            this.dir = dir;
            return this;
        }
        public Builder estado(boolean estado) {
            this.estado = estado;
            return this;
        }
        public Builder protocolo(String protocolo) {
            this.protocolo = protocolo;
            return this;
        }
        public Conector build() {
            return new Conector(this); // 👈 Se construye solo al final
        }
    }

}
