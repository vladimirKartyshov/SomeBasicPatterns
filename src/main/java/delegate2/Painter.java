package delegate2;

public class Painter {

    Graphics graphics;

    public void setGraphics(Graphics g) {
       this.graphics = g;
    }
    void draw(){
        graphics.draw();
    }
}
