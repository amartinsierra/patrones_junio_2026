package composite;

public class Ejercicio implements Componente {
    private String title;

    public Ejercicio(String title) {
        this.title = title;
    }

    @Override
    public void showInfo() {
        System.out.println("Exercise: " + title);
    }
}

