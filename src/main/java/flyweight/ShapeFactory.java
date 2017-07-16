package flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static final Map<String, Shape> shapes = new HashMap<String, Shape>();

    public Shape getShape(String shapeName){

        Shape shape = shapes.get(shapeName);

        if (shape==null){
            if (shapeName.equals("circle")) {
                shape = new Circle();

            } else if (shapeName.equals("square")) {
                shape = new Square();

            } else if (shapeName.equals("point")) {
                shape = new Point();

            }

            shapes.put(shapeName, shape);

        }

        return shape;
    }

}
