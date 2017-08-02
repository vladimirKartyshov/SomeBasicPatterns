package singleton;

public class R implements Runnable{

    public void run() {
        Singelton.getInstance();
    }
}
