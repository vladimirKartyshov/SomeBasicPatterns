package observer;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observed{

    int temperature;
    int pressure;

    List<Observer> observers = new ArrayList<Observer>();

    public void sendMeasurements(int t, int p){// метод который меняет состояние
        temperature =  t;                      //   и вызывает notyfyObservers()
        pressure = p;
        notyfyObservers();
    }


    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notyfyObservers() {

        for (Observer o : observers){
            o.handlEvent(temperature, pressure);
        }
    }
}
