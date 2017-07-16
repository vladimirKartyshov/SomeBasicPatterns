package abstractFactory;

public class RuMouse implements Mouse{
    public void click() {
        System.out.println("Щелчок мышью");
    }

    public void dblclick() {
        System.out.println("Двойной щелчок мышью");
    }

    public void scroll(int direction) {
        if(direction>0){
            System.out.println("Скролим вверх");
        }else if(direction<0){
            System.out.println("Скролим вниз");
        }else
            System.out.println("Не скролим");

    }
}
