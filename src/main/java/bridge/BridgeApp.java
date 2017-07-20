package bridge;

public class BridgeApp {

    public static void main(String[] args) {

        Car c = new Hatchback(new Kia());
        c.showDetails();

    }
}
