package visitados;

import visitantes.FiguraVisitor;

public  class Circulo implements Figura {
    double radio;
    public Circulo(double radio) { this.radio = radio; }

    public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
    public void accept(FiguraVisitor visitor) {
        visitor.visit(this);
    }
}

