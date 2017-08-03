package decorator;

public class LeftBracketDecorator extends Decorator{


    public LeftBracketDecorator(PrinterInterface component) {
        super (component);
    }

    public void print() {
        System.out.print("[");//добавили скобку слева
        super.print();
    }
}
