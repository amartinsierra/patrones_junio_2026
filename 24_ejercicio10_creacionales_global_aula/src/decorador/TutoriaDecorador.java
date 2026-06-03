package decorador;

import composite.CursoComponente;

public class TutoriaDecorador extends CursoDecorador {
    public TutoriaDecorador(CursoComponente curso) {
        super(curso);
    }

    @Override
    public void mostrar() {
        curso.mostrar();
        System.out.println("  + Incluye tutoría personalizada");
    }

    @Override
    public double getPrecio() {
        return curso.getPrecio() + 100.0; // coste extra de la tutoría
    }
}

