package prototype;

public class PrototypeApp {
    public static void main(String[] args) {

        Human original = new Human(45, "Gomer Simpson");
        System.out.println(original);

        Human copy = (Human)original.copy();
        System.out.println(copy);

    }
}
