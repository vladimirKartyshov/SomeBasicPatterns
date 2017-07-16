package flyweight;

public class Point implements Shape{
    public void draw(int x, int y) {
        System.out.println("("+x+", "+y+" paint point");
    }
}
