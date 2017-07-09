package factory;


public class FactoryMethodApp {
    public static void main(String[] args) {

        WatchMaker maker = getMakerByName("Digital");

        Watch watch = maker.creatWatch();
        watch.showTime();
    }
    public static WatchMaker getMakerByName(String maker){
        if(maker.equals("Digital"))
            return new DigitalWatchMaker();
        else if(maker.equals("Rome"))
            return new RomeWatchMaker();
        throw new   RuntimeException("Не поддерживается производственная линия часов" + maker);
    }
}
