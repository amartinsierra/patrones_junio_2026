package observer;

public class Revision implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Proceso de revisión: " + message);
    }
}

