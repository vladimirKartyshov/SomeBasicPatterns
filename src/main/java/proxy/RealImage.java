package proxy;

public class RealImage implements Image{

    String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    public void display() {
        System.out.println("Просмотр" + file);

    }

    void load(){
        System.out.println("Загрузка" + file);
    }
}
