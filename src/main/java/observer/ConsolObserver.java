package observer;

public class ConsolObserver implements Observer{
    public void handlEvent(int temp, int presser) {
        System.out.println("Погода изменилась. Температура = " + temp + " Давление равно " + presser + ".");

    }
}
