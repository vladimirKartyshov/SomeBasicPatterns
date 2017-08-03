package decorator;

public class QuotesDecorator extends Decorator{


    public QuotesDecorator(PrinterInterface component) {
        super (component);
    }

    public void print() {
        System.out.print("\"");//добавили ковычку
        super.print();
    }
}
