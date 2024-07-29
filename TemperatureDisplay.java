// TemperatureDisplay.java
public class TemperatureDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Temperatura a la distancia  " + temperature);
    }
}