package PackageStrategy;

public class StrategyApp {

    public static void main(String[] args) {

        //Отличие шабл Состояния от шабл Стратегии в том что в шаб Состояние
        //изминение состояний происходит в самих состояниях, а в шаб Стратегия
        //изменяются состояния в клиентском коде.

        StrategyClient c = new StrategyClient();

        int[]arr0 = {34,52,-3,0,1000};
        c.setStrategy(new classSelectionSort());
        c.executeStrategy(arr0);

        int[]arr1 = {500,2,-5,999,10};
        c.setStrategy(new classBubbleSort());
        c.executeStrategy(arr1);

        int[]arr2 = {5200,5,-555,0,10};
        c.setStrategy(new classInsertingSort());
        c.executeStrategy(arr2);// код не реализован
    }
}
