package observer;

public class AnalyticsSystem implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Analytics received: " + message);
    }
}

