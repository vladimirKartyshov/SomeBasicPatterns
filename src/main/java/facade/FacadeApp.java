package facade;

public class FacadeApp {
    public static void main(String[] args) {

        Power power = new Power();
        power.on();

        DvdRom dvd = new DvdRom();
        dvd.load();
       // dvd.unload();

        Hdd hdd = new Hdd();
        hdd.copyFromDvd(dvd);
    }
}
