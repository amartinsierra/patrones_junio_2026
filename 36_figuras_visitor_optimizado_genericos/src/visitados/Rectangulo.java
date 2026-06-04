package visitados;

import visitantes.FiguraVisitor;

public  class Rectangulo implements Figura {
    double ancho, alto;
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho; this.alto = alto;
    }

    public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	@Override
    public void accept(FiguraVisitor visitor) {
        visitor.visit(this);
    }
}

