package abstractFactory;

public class EnMouse implements Mouse{
    public void click() {
        System.out.println("Mouse click");
    }

    public void dblclick() {
        System.out.println("Mouse double click");

    }

    public void scroll(int direction) {
        if(direction>0){
            System.out.println("Scroll up");
        }else if(direction<0){
            System.out.println("Scroll done");
        }else
            System.out.println("No scroling");

    }

    }

