package facade;

public class Computer {

    Power power = new Power();
    DvdRom dvd = new DvdRom();
    Hdd hdd = new Hdd();

    void copy(){

        power.on();
        dvd.load();
        hdd.copyFromDvd(dvd);
    }
}
