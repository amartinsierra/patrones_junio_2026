package composite;

public class Curso implements CursoComponente {
    private final String nombre;
    private final double precio;
 
    public Curso(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
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

