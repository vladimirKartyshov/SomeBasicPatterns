package state;

public class Human {

    private Activity state;

    public void setState(Activity s) {
        this.state = s;
    }
    public void doSomething(){
        state.doSomething(this);
    }
}
