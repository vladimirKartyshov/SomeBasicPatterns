package decorator;

public class RightBracketDecorator extends Decorator{


    public RightBracketDecorator(PrinterInterface component) {
        super (component);
    }

    public void print() {
        super.print();
        System.out.print("]");//добавили скобку справа
    }
}
