package observer;

public class MeteoApp {
    public static void main(String[] args) {

        MeteoStation station = new MeteoStation();

        station.addObserver(new ConsolObserver());

        station.sendMeasurements(25, 760);

    }// не совсем полностью реализован код
}
