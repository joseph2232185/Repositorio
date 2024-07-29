import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private List<Observer> observers;
    private int temperatura;
    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(int temperatura) {
        for (Observer observer : observers) {
            observer.update(temperatura);
        }
    }

    public void setTemperatura(int temperatura) {
        System.out.println("varifica la temperatura a " + temperatura);
        this.temperatura = temperatura;
        notifyObservers(temperatura);
    }
}