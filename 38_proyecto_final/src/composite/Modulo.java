package composite;

import java.util.ArrayList;
import java.util.List;

public class Modulo implements Componente {
    private String title;
    private List<Componente> components = new ArrayList<>();

    public Modulo(String title) {
        this.title = title;
    }

    public void add(Componente component) {
        components.add(component);
    }

    public void remove(Componente component) {
        components.remove(component);
    }

    @Override
    public void showInfo() {
        System.out.println("Module: " + title);
        for (Componente component : components) {
            component.showInfo();
        }
    }
}

