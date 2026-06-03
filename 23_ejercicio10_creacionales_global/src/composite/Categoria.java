package composite;

import java.util.ArrayList;
import java.util.List;

public class Categoria implements CursoComponente {
    private final String nombre;
    private final List<CursoComponente> elementos = new ArrayList<>();
    public Categoria(String nombre) {
        this.nombre = nombre;
    }
    public void agregar(CursoComponente componente) {
        elementos.add(componente);
    }
    public void eliminar(CursoComponente componente) {
        elementos.remove(componente);
    }
    @Override
    public void mostrar() {
        System.out.println("Categoría: " + nombre);
        for (CursoComponente comp : elementos) {
            comp.mostrar();
        }
    }
    @Override
    public double getPrecio() {
        return elementos.stream().mapToDouble(CursoComponente::getPrecio).sum();
    }
}

