package composite;

public class Leccion implements Componente {
    private String title;

    public Leccion(String title) {
        this.title = title;
    }

    @Override
    public void showInfo() {
        System.out.println("Lesson: " + title);
    }
}
