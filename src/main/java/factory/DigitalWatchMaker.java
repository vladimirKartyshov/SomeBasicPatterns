package factory;

public class DigitalWatchMaker implements WatchMaker{
    public Watch creatWatch() {
        return new DigitalWatch();
    }
}
