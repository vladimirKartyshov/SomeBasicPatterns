package facade;

public class Hdd {
    void copyFromDvd(DvdRom dvd){
        if(dvd.hasData()){

            System.out.println("Происходит копирование с диска");
        }
        else {
            System.out.println("Вставьте диск с данными");
        }
    }
}
