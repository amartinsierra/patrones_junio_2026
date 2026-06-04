package observer;

import java.util.ArrayList;
import java.util.List;

import composite.Componente;
import composite.Modulo;

public class ObservableModule extends Modulo implements Subject {
    private List<Observer> observers = new ArrayList<>();

    public ObservableModule(String title) {
        super(title);
    }

    @Override
	public void addObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
	public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    @Override
    public void add(Componente component) {
        super.add(component);
        notifyObservers("Added component to module: " + component);
    }

    @Override
    public void remove(Componente component) {
        super.remove(component);
        notifyObservers("Removed component from module: " + component);
    }
}

