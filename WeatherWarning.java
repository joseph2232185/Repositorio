public class WeatherWarning implements Observer {
    private static final int advertencia =45 ;

    @Override
    public void update(int temperatura) {
        if (temperatura > advertencia) {
            System.out.println("¡Advertencia! Alta temperatura " + temperatura);
        }
    }
}