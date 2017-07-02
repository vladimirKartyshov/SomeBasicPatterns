package state;


class WeekEnd implements Activity{
    private int count = 0;

    public void doSomething(Human context) {
        if(count < 3){
            System.out.println("Отдыхаем");
            count++;
        }
        else {
            context.setState(new Work());
        }
    }
}
