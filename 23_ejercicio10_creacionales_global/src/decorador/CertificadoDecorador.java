package decorador;

import composite.CursoComponente;

public class CertificadoDecorador extends CursoDecorador {
    public CertificadoDecorador(CursoComponente curso) {
        super(curso);
    }

    @Override
    public void mostrar() {
        curso.mostrar();
        System.out.println("  + Incluye certificado");
    }

    @Override
    public double getPrecio() {
        return curso.getPrecio() + 50.0; // coste extra del certificado
    }
}
