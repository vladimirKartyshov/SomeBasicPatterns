package factory;

public class RomeWatchMaker implements WatchMaker{
    public Watch creatWatch() {
        return new RomeWatch();
    }
}
