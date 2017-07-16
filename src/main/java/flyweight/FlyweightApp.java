package flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlyweightApp {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        List<Shape> shapes = new ArrayList<Shape>();

        shapes.add(shapeFactory.getShape("square"));
        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("point"));
        shapes.add(shapeFactory.getShape("square"));
        shapes.add(shapeFactory.getShape("circle"));

        Random rand = new Random();
        for (Shape shape : shapes){
            int x = rand.nextInt(100);//100 означает что координаты генерируются от 0 до 100
            int y = rand.nextInt(100);

            shape.draw(x, y);
        }

    }
}
