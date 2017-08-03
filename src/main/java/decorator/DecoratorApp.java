package decorator;

public class DecoratorApp {

    public static void main(String[] args) {// описание см в классе decorator

      //  PrinterInterface printer = new Printer("Привет");
        PrinterInterface printer = new QuotesDecorator(new LeftBracketDecorator(new RightBracketDecorator(new Printer("Привет"))));
        printer.print();
    }
}
