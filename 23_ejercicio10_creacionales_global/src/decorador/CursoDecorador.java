package decorador;

import composite.CursoComponente;

public abstract class CursoDecorador implements CursoComponente {
    protected final CursoComponente curso;

    public CursoDecorador(CursoComponente curso) {
        this.curso = curso;
    }

    @Override
    public void mostrar() {
        curso.mostrar();
    }

    @Override
    public double getPrecio() {
        return curso.getPrecio();
    }
}

