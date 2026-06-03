package composite;

import flyweight.Aula;

public class Curso implements CursoComponente {
    private final String nombre;
    private final double precio;
    private Aula aula;
    public Curso(String nombre, double precio,Aula aula) {
        this.nombre = nombre;
        this.precio = precio;
        this.aula=aula;
     }

    @Override
    public void mostrar() {
        System.out.println("Curso: " + nombre + " - Precio: " + precio + "€");
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}

