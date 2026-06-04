package visitados;

import visitantes.FiguraVisitor;

public interface Figura {
	void accept(FiguraVisitor visitor);
}
