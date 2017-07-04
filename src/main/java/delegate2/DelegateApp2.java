package delegate2;

public class DelegateApp2 {
    public static void main(String[] args) {

        Painter painter = new Painter();
        painter.setGraphics(new Circle());
        painter.draw();

        painter.setGraphics(new Square());
        painter.draw();

        painter.setGraphics(new Triangle());
        painter.draw();
    }
}
