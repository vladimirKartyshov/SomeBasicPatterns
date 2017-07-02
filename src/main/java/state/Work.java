package state;

public class Work implements Activity {

    public void doSomething(Human context) {
        System.out.println("Работаем");
        context.setState(new WeekEnd());
    }

}
